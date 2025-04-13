package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.StreamListener;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
abstract class RetriableStream<ReqT> implements ClientStream {

    /* renamed from: A */
    public static Random f58973A;

    /* renamed from: x */
    @VisibleForTesting
    public static final Metadata.Key<String> f58974x;

    /* renamed from: y */
    @VisibleForTesting
    public static final Metadata.Key<String> f58975y;

    /* renamed from: z */
    public static final Status f58976z;

    /* renamed from: a */
    public final MethodDescriptor<ReqT, ?> f58977a;

    /* renamed from: b */
    public final Executor f58978b;

    /* renamed from: c */
    public final Executor f58979c;

    /* renamed from: d */
    public final ScheduledExecutorService f58980d;

    /* renamed from: e */
    public final Metadata f58981e;

    /* renamed from: f */
    @Nullable
    public final RetryPolicy f58982f;

    /* renamed from: g */
    @Nullable
    public final HedgingPolicy f58983g;

    /* renamed from: h */
    public final boolean f58984h;

    /* renamed from: i */
    public final Object f58985i;

    /* renamed from: j */
    public final ChannelBufferMeter f58986j;

    /* renamed from: k */
    public final long f58987k;

    /* renamed from: l */
    public final long f58988l;

    /* renamed from: m */
    @Nullable
    public final Throttle f58989m;

    /* renamed from: n */
    @GuardedBy
    public final InsightBuilder f58990n;

    /* renamed from: o */
    public volatile State f58991o;

    /* renamed from: p */
    public final AtomicBoolean f58992p;

    /* renamed from: q */
    @GuardedBy
    public long f58993q;

    /* renamed from: r */
    public ClientStreamListener f58994r;

    /* renamed from: s */
    @GuardedBy
    public FutureCanceller f58995s;

    /* renamed from: t */
    @GuardedBy
    public FutureCanceller f58996t;

    /* renamed from: u */
    public long f58997u;

    /* renamed from: v */
    public Status f58998v;

    /* renamed from: w */
    public boolean f58999w;

    /* renamed from: io.grpc.internal.RetriableStream$1 */
    public class C64481 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw new StatusRuntimeException(Status.m30943d(th).m30947g("Uncaught exception in the SynchronizationContext. Re-thrown."));
        }
    }

    public interface BufferEntry {
        /* renamed from: a */
        void mo31165a(Substream substream);
    }

    public class BufferSizeTracer extends ClientStreamTracer {

        /* renamed from: a */
        public final Substream f59020a;

        /* renamed from: b */
        @GuardedBy
        public long f59021b;

        public BufferSizeTracer(Substream substream) {
            this.f59020a = substream;
        }

        @Override // io.grpc.StreamTracer
        /* renamed from: h */
        public void mo30957h(long j2) {
            if (RetriableStream.this.f58991o.f59038f != null) {
                return;
            }
            synchronized (RetriableStream.this.f58985i) {
                if (RetriableStream.this.f58991o.f59038f == null) {
                    Substream substream = this.f59020a;
                    if (!substream.f59061b) {
                        long j3 = this.f59021b + j2;
                        this.f59021b = j3;
                        RetriableStream retriableStream = RetriableStream.this;
                        long j4 = retriableStream.f58993q;
                        if (j3 <= j4) {
                            return;
                        }
                        if (j3 > retriableStream.f58987k) {
                            substream.f59062c = true;
                        } else {
                            long addAndGet = retriableStream.f58986j.f59023a.addAndGet(j3 - j4);
                            RetriableStream retriableStream2 = RetriableStream.this;
                            retriableStream2.f58993q = this.f59021b;
                            if (addAndGet > retriableStream2.f58988l) {
                                this.f59020a.f59062c = true;
                            }
                        }
                        Substream substream2 = this.f59020a;
                        Runnable m31161w = substream2.f59062c ? RetriableStream.this.m31161w(substream2) : null;
                        if (m31161w != null) {
                            m31161w.run();
                        }
                    }
                }
            }
        }
    }

    public static final class ChannelBufferMeter {

        /* renamed from: a */
        public final AtomicLong f59023a = new AtomicLong();
    }

    public static final class FutureCanceller {

        /* renamed from: a */
        public final Object f59024a;

        /* renamed from: b */
        @GuardedBy
        public Future<?> f59025b;

        /* renamed from: c */
        @GuardedBy
        public boolean f59026c;

        public FutureCanceller(Object obj) {
            this.f59024a = obj;
        }

        @CheckForNull
        @GuardedBy
        /* renamed from: a */
        public Future<?> m31166a() {
            this.f59026c = true;
            return this.f59025b;
        }

        /* renamed from: b */
        public void m31167b(Future<?> future) {
            synchronized (this.f59024a) {
                if (!this.f59026c) {
                    this.f59025b = future;
                }
            }
        }
    }

    public static final class HedgingPlan {
    }

    public final class HedgingRunnable implements Runnable {

        /* renamed from: b */
        public final FutureCanceller f59027b;

        public HedgingRunnable(FutureCanceller futureCanceller) {
            this.f59027b = futureCanceller;
        }

        @Override // java.lang.Runnable
        public void run() {
            RetriableStream.this.f58978b.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.HedgingRunnable.1
                /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
                
                    if (r6 != false) goto L16;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r8 = this;
                        io.grpc.internal.RetriableStream$HedgingRunnable r0 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r0 = io.grpc.internal.RetriableStream.this
                        io.grpc.internal.RetriableStream$State r1 = r0.f58991o
                        int r1 = r1.f59037e
                        r2 = 0
                        io.grpc.internal.RetriableStream$Substream r0 = r0.m31162x(r1, r2)
                        io.grpc.internal.RetriableStream$HedgingRunnable r1 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r1 = io.grpc.internal.RetriableStream.this
                        java.lang.Object r1 = r1.f58985i
                        monitor-enter(r1)
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$FutureCanceller r4 = r3.f59027b     // Catch: java.lang.Throwable -> L9f
                        boolean r4 = r4.f59026c     // Catch: java.lang.Throwable -> L9f
                        r5 = 0
                        r6 = 1
                        if (r4 == 0) goto L20
                        r2 = 1
                        goto L6c
                    L20:
                        io.grpc.internal.RetriableStream r3 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$State r4 = r3.f58991o     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$State r4 = r4.m31168a(r0)     // Catch: java.lang.Throwable -> L9f
                        r3.f58991o = r4     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream r3 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$State r4 = r3.f58991o     // Catch: java.lang.Throwable -> L9f
                        boolean r3 = r3.m31159B(r4)     // Catch: java.lang.Throwable -> L9f
                        if (r3 == 0) goto L5a
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream r3 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$Throttle r3 = r3.f58989m     // Catch: java.lang.Throwable -> L9f
                        if (r3 == 0) goto L4c
                        java.util.concurrent.atomic.AtomicInteger r4 = r3.f59067d     // Catch: java.lang.Throwable -> L9f
                        int r4 = r4.get()     // Catch: java.lang.Throwable -> L9f
                        int r3 = r3.f59065b     // Catch: java.lang.Throwable -> L9f
                        if (r4 <= r3) goto L49
                        goto L4a
                    L49:
                        r6 = 0
                    L4a:
                        if (r6 == 0) goto L5a
                    L4c:
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream r3 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$FutureCanceller r5 = new io.grpc.internal.RetriableStream$FutureCanceller     // Catch: java.lang.Throwable -> L9f
                        java.lang.Object r4 = r3.f58985i     // Catch: java.lang.Throwable -> L9f
                        r5.<init>(r4)     // Catch: java.lang.Throwable -> L9f
                        r3.f58996t = r5     // Catch: java.lang.Throwable -> L9f
                        goto L6c
                    L5a:
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream r3 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$State r4 = r3.f58991o     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$State r4 = r4.m31169b()     // Catch: java.lang.Throwable -> L9f
                        r3.f58991o = r4     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = io.grpc.internal.RetriableStream.HedgingRunnable.this     // Catch: java.lang.Throwable -> L9f
                        io.grpc.internal.RetriableStream r3 = io.grpc.internal.RetriableStream.this     // Catch: java.lang.Throwable -> L9f
                        r3.f58996t = r5     // Catch: java.lang.Throwable -> L9f
                    L6c:
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L9f
                        if (r2 == 0) goto L7d
                        io.grpc.internal.ClientStream r0 = r0.f59060a
                        io.grpc.Status r1 = io.grpc.Status.f58279f
                        java.lang.String r2 = "Unneeded hedging"
                        io.grpc.Status r1 = r1.m30947g(r2)
                        r0.mo30978a(r1)
                        return
                    L7d:
                        if (r5 == 0) goto L97
                        io.grpc.internal.RetriableStream$HedgingRunnable r1 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r1 = io.grpc.internal.RetriableStream.this
                        java.util.concurrent.ScheduledExecutorService r2 = r1.f58980d
                        io.grpc.internal.RetriableStream$HedgingRunnable r3 = new io.grpc.internal.RetriableStream$HedgingRunnable
                        r3.<init>(r5)
                        io.grpc.internal.HedgingPolicy r1 = r1.f58983g
                        long r6 = r1.f58708b
                        java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                        java.util.concurrent.ScheduledFuture r1 = r2.schedule(r3, r6, r1)
                        r5.m31167b(r1)
                    L97:
                        io.grpc.internal.RetriableStream$HedgingRunnable r1 = io.grpc.internal.RetriableStream.HedgingRunnable.this
                        io.grpc.internal.RetriableStream r1 = io.grpc.internal.RetriableStream.this
                        r1.m31164z(r0)
                        return
                    L9f:
                        r0 = move-exception
                        monitor-exit(r1)     // Catch: java.lang.Throwable -> L9f
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.RetriableStream.HedgingRunnable.RunnableC64521.run():void");
                }
            });
        }
    }

    public static final class RetryPlan {

        /* renamed from: a */
        public final boolean f59030a;

        /* renamed from: b */
        public final long f59031b;

        public RetryPlan(boolean z, long j2) {
            this.f59030a = z;
            this.f59031b = j2;
        }
    }

    public class StartEntry implements BufferEntry {
        public StartEntry() {
        }

        @Override // io.grpc.internal.RetriableStream.BufferEntry
        /* renamed from: a */
        public void mo31165a(Substream substream) {
            substream.f59060a.mo30976q(new Sublistener(substream));
        }
    }

    public static final class State {

        /* renamed from: a */
        public final boolean f59033a;

        /* renamed from: b */
        @Nullable
        public final List<BufferEntry> f59034b;

        /* renamed from: c */
        public final Collection<Substream> f59035c;

        /* renamed from: d */
        public final Collection<Substream> f59036d;

        /* renamed from: e */
        public final int f59037e;

        /* renamed from: f */
        @Nullable
        public final Substream f59038f;

        /* renamed from: g */
        public final boolean f59039g;

        /* renamed from: h */
        public final boolean f59040h;

        public State(@Nullable List<BufferEntry> list, Collection<Substream> collection, Collection<Substream> collection2, @Nullable Substream substream, boolean z, boolean z2, boolean z3, int i2) {
            this.f59034b = list;
            Preconditions.m11187k(collection, "drainedSubstreams");
            this.f59035c = collection;
            this.f59038f = substream;
            this.f59036d = collection2;
            this.f59039g = z;
            this.f59033a = z2;
            this.f59040h = z3;
            this.f59037e = i2;
            Preconditions.m11192p(!z2 || list == null, "passThrough should imply buffer is null");
            Preconditions.m11192p((z2 && substream == null) ? false : true, "passThrough should imply winningSubstream != null");
            Preconditions.m11192p(!z2 || (collection.size() == 1 && collection.contains(substream)) || (collection.size() == 0 && substream.f59061b), "passThrough should imply winningSubstream is drained");
            Preconditions.m11192p((z && substream == null) ? false : true, "cancelled should imply committed");
        }

        @CheckReturnValue
        /* renamed from: a */
        public State m31168a(Substream substream) {
            Collection unmodifiableCollection;
            Preconditions.m11192p(!this.f59040h, "hedging frozen");
            Preconditions.m11192p(this.f59038f == null, "already committed");
            if (this.f59036d == null) {
                unmodifiableCollection = Collections.singleton(substream);
            } else {
                ArrayList arrayList = new ArrayList(this.f59036d);
                arrayList.add(substream);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new State(this.f59034b, this.f59035c, unmodifiableCollection, this.f59038f, this.f59039g, this.f59033a, this.f59040h, this.f59037e + 1);
        }

        @CheckReturnValue
        /* renamed from: b */
        public State m31169b() {
            return this.f59040h ? this : new State(this.f59034b, this.f59035c, this.f59036d, this.f59038f, this.f59039g, this.f59033a, true, this.f59037e);
        }

        @CheckReturnValue
        /* renamed from: c */
        public State m31170c(Substream substream) {
            ArrayList arrayList = new ArrayList(this.f59036d);
            arrayList.remove(substream);
            return new State(this.f59034b, this.f59035c, Collections.unmodifiableCollection(arrayList), this.f59038f, this.f59039g, this.f59033a, this.f59040h, this.f59037e);
        }

        @CheckReturnValue
        /* renamed from: d */
        public State m31171d(Substream substream, Substream substream2) {
            ArrayList arrayList = new ArrayList(this.f59036d);
            arrayList.remove(substream);
            arrayList.add(substream2);
            return new State(this.f59034b, this.f59035c, Collections.unmodifiableCollection(arrayList), this.f59038f, this.f59039g, this.f59033a, this.f59040h, this.f59037e);
        }

        @CheckReturnValue
        /* renamed from: e */
        public State m31172e(Substream substream) {
            substream.f59061b = true;
            if (!this.f59035c.contains(substream)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f59035c);
            arrayList.remove(substream);
            return new State(this.f59034b, Collections.unmodifiableCollection(arrayList), this.f59036d, this.f59038f, this.f59039g, this.f59033a, this.f59040h, this.f59037e);
        }

        @CheckReturnValue
        /* renamed from: f */
        public State m31173f(Substream substream) {
            Collection unmodifiableCollection;
            Preconditions.m11192p(!this.f59033a, "Already passThrough");
            if (substream.f59061b) {
                unmodifiableCollection = this.f59035c;
            } else if (this.f59035c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(substream);
            } else {
                ArrayList arrayList = new ArrayList(this.f59035c);
                arrayList.add(substream);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            Substream substream2 = this.f59038f;
            boolean z = substream2 != null;
            List<BufferEntry> list = this.f59034b;
            if (z) {
                Preconditions.m11192p(substream2 == substream, "Another RPC attempt has already committed");
                list = null;
            }
            return new State(list, collection, this.f59036d, this.f59038f, this.f59039g, z, this.f59040h, this.f59037e);
        }
    }

    public final class Sublistener implements ClientStreamListener {

        /* renamed from: a */
        public final Substream f59041a;

        public Sublistener(Substream substream) {
            this.f59041a = substream;
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: a */
        public void mo31052a(final StreamListener.MessageProducer messageProducer) {
            State state = RetriableStream.this.f58991o;
            Preconditions.m11192p(state.f59038f != null, "Headers should be received prior to messages.");
            if (state.f59038f != this.f59041a) {
                return;
            }
            RetriableStream.this.f58979c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.5
                @Override // java.lang.Runnable
                public void run() {
                    RetriableStream.this.f58994r.mo31052a(messageProducer);
                }
            });
        }

        @Override // io.grpc.internal.ClientStreamListener
        /* renamed from: d */
        public void mo31053d(final Metadata metadata) {
            int i2;
            int i3;
            RetriableStream.m31156t(RetriableStream.this, this.f59041a);
            if (RetriableStream.this.f58991o.f59038f == this.f59041a) {
                Throttle throttle = RetriableStream.this.f58989m;
                if (throttle != null) {
                    do {
                        i2 = throttle.f59067d.get();
                        i3 = throttle.f59064a;
                        if (i2 == i3) {
                            break;
                        }
                    } while (!throttle.f59067d.compareAndSet(i2, Math.min(throttle.f59066c + i2, i3)));
                }
                RetriableStream.this.f58979c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RetriableStream.this.f58994r.mo31053d(metadata);
                    }
                });
            }
        }

        @Override // io.grpc.internal.StreamListener
        /* renamed from: e */
        public void mo31054e() {
            if (RetriableStream.this.mo30979b()) {
                RetriableStream.this.f58979c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.6
                    @Override // java.lang.Runnable
                    public void run() {
                        RetriableStream retriableStream = RetriableStream.this;
                        if (retriableStream.f58999w) {
                            return;
                        }
                        retriableStream.f58994r.mo31054e();
                    }
                });
            }
        }

        @Override // io.grpc.internal.ClientStreamListener
        /* renamed from: f */
        public void mo31055f(final Status status, final ClientStreamListener.RpcProgress rpcProgress, final Metadata metadata) {
            RetryPlan retryPlan;
            long nanos;
            RetriableStream retriableStream;
            FutureCanceller futureCanceller;
            Runnable m31161w;
            synchronized (RetriableStream.this.f58985i) {
                RetriableStream retriableStream2 = RetriableStream.this;
                retriableStream2.f58991o = retriableStream2.f58991o.m31172e(this.f59041a);
                RetriableStream.this.f58990n.m31115a(status.f58291a);
            }
            Substream substream = this.f59041a;
            if (substream.f59062c) {
                RetriableStream.m31156t(RetriableStream.this, substream);
                if (RetriableStream.this.f58991o.f59038f == this.f59041a) {
                    RetriableStream.this.f58979c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.2
                        @Override // java.lang.Runnable
                        public void run() {
                            RetriableStream retriableStream3 = RetriableStream.this;
                            retriableStream3.f58999w = true;
                            retriableStream3.f58994r.mo31055f(status, rpcProgress, metadata);
                        }
                    });
                    return;
                }
                return;
            }
            if (RetriableStream.this.f58991o.f59038f == null) {
                boolean z = false;
                if (rpcProgress == ClientStreamListener.RpcProgress.REFUSED && RetriableStream.this.f58992p.compareAndSet(false, true)) {
                    final Substream m31162x = RetriableStream.this.m31162x(this.f59041a.f59063d, true);
                    RetriableStream retriableStream3 = RetriableStream.this;
                    if (retriableStream3.f58984h) {
                        synchronized (retriableStream3.f58985i) {
                            RetriableStream retriableStream4 = RetriableStream.this;
                            retriableStream4.f58991o = retriableStream4.f58991o.m31171d(this.f59041a, m31162x);
                            RetriableStream retriableStream5 = RetriableStream.this;
                            if (!retriableStream5.m31159B(retriableStream5.f58991o) && RetriableStream.this.f58991o.f59036d.size() == 1) {
                                z = true;
                            }
                        }
                        if (z) {
                            RetriableStream.m31156t(RetriableStream.this, m31162x);
                        }
                    } else {
                        RetryPolicy retryPolicy = retriableStream3.f58982f;
                        if ((retryPolicy == null || retryPolicy.f59068a == 1) && (m31161w = retriableStream3.m31161w(m31162x)) != null) {
                            m31161w.run();
                        }
                    }
                    RetriableStream.this.f58978b.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.3
                        @Override // java.lang.Runnable
                        public void run() {
                            RetriableStream retriableStream6 = RetriableStream.this;
                            Substream substream2 = m31162x;
                            Metadata.Key<String> key = RetriableStream.f58974x;
                            retriableStream6.m31164z(substream2);
                        }
                    });
                    return;
                }
                if (rpcProgress == ClientStreamListener.RpcProgress.DROPPED) {
                    RetriableStream retriableStream6 = RetriableStream.this;
                    if (retriableStream6.f58984h) {
                        retriableStream6.m31158A();
                    }
                } else {
                    RetriableStream.this.f58992p.set(true);
                    RetriableStream retriableStream7 = RetriableStream.this;
                    if (retriableStream7.f58984h) {
                        Integer m31174g = m31174g(metadata);
                        boolean z2 = !RetriableStream.this.f58983g.f58709c.contains(status.f58291a);
                        boolean z3 = (RetriableStream.this.f58989m == null || (z2 && (m31174g == null || m31174g.intValue() >= 0))) ? false : !RetriableStream.this.f58989m.m31175a();
                        if (!z2 && !z3) {
                            z = true;
                        }
                        if (z) {
                            RetriableStream.m31157v(RetriableStream.this, m31174g);
                        }
                        synchronized (RetriableStream.this.f58985i) {
                            RetriableStream retriableStream8 = RetriableStream.this;
                            retriableStream8.f58991o = retriableStream8.f58991o.m31170c(this.f59041a);
                            if (z) {
                                RetriableStream retriableStream9 = RetriableStream.this;
                                if (retriableStream9.m31159B(retriableStream9.f58991o) || !RetriableStream.this.f58991o.f59036d.isEmpty()) {
                                    return;
                                }
                            }
                        }
                    } else {
                        RetryPolicy retryPolicy2 = retriableStream7.f58982f;
                        long j2 = 0;
                        if (retryPolicy2 == null) {
                            retryPlan = new RetryPlan(false, 0L);
                        } else {
                            boolean contains = retryPolicy2.f59073f.contains(status.f58291a);
                            Integer m31174g2 = m31174g(metadata);
                            boolean z4 = (RetriableStream.this.f58989m == null || (!contains && (m31174g2 == null || m31174g2.intValue() >= 0))) ? false : !RetriableStream.this.f58989m.m31175a();
                            if (RetriableStream.this.f58982f.f59068a > this.f59041a.f59063d + 1 && !z4) {
                                if (m31174g2 == null) {
                                    if (contains) {
                                        nanos = (long) (RetriableStream.f58973A.nextDouble() * r7.f58997u);
                                        RetriableStream retriableStream10 = RetriableStream.this;
                                        double d = retriableStream10.f58997u;
                                        RetryPolicy retryPolicy3 = retriableStream10.f58982f;
                                        retriableStream10.f58997u = Math.min((long) (d * retryPolicy3.f59071d), retryPolicy3.f59070c);
                                        j2 = nanos;
                                        z = true;
                                    }
                                } else if (m31174g2.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(m31174g2.intValue());
                                    RetriableStream retriableStream11 = RetriableStream.this;
                                    retriableStream11.f58997u = retriableStream11.f58982f.f59069b;
                                    j2 = nanos;
                                    z = true;
                                }
                            }
                            retryPlan = new RetryPlan(z, j2);
                        }
                        if (retryPlan.f59030a) {
                            synchronized (RetriableStream.this.f58985i) {
                                retriableStream = RetriableStream.this;
                                futureCanceller = new FutureCanceller(retriableStream.f58985i);
                                retriableStream.f58995s = futureCanceller;
                            }
                            futureCanceller.m31167b(retriableStream.f58980d.schedule(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.1RetryBackoffRunnable
                                @Override // java.lang.Runnable
                                public void run() {
                                    RetriableStream.this.f58978b.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.1RetryBackoffRunnable.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            Sublistener sublistener = Sublistener.this;
                                            RetriableStream retriableStream12 = RetriableStream.this;
                                            int i2 = sublistener.f59041a.f59063d + 1;
                                            Metadata.Key<String> key = RetriableStream.f58974x;
                                            RetriableStream.this.m31164z(retriableStream12.m31162x(i2, false));
                                        }
                                    });
                                }
                            }, retryPlan.f59031b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                }
            }
            RetriableStream.m31156t(RetriableStream.this, this.f59041a);
            if (RetriableStream.this.f58991o.f59038f == this.f59041a) {
                RetriableStream.this.f58979c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.Sublistener.4
                    @Override // java.lang.Runnable
                    public void run() {
                        RetriableStream retriableStream12 = RetriableStream.this;
                        retriableStream12.f58999w = true;
                        retriableStream12.f58994r.mo31055f(status, rpcProgress, metadata);
                    }
                });
            }
        }

        @Nullable
        /* renamed from: g */
        public final Integer m31174g(Metadata metadata) {
            String str = (String) metadata.m30899d(RetriableStream.f58975y);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    public static final class Substream {

        /* renamed from: a */
        public ClientStream f59060a;

        /* renamed from: b */
        public boolean f59061b;

        /* renamed from: c */
        public boolean f59062c;

        /* renamed from: d */
        public final int f59063d;

        public Substream(int i2) {
            this.f59063d = i2;
        }
    }

    public static final class Throttle {

        /* renamed from: a */
        public final int f59064a;

        /* renamed from: b */
        public final int f59065b;

        /* renamed from: c */
        public final int f59066c;

        /* renamed from: d */
        public final AtomicInteger f59067d;

        @VisibleForTesting
        /* renamed from: a */
        public boolean m31175a() {
            int i2;
            int i3;
            do {
                i2 = this.f59067d.get();
                if (i2 == 0) {
                    return false;
                }
                i3 = i2 - 1000;
            } while (!this.f59067d.compareAndSet(i2, Math.max(i3, 0)));
            return i3 > this.f59065b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Throttle)) {
                return false;
            }
            Throttle throttle = (Throttle) obj;
            return this.f59064a == throttle.f59064a && this.f59066c == throttle.f59066c;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f59064a), Integer.valueOf(this.f59066c)});
        }
    }

    static {
        Metadata.AsciiMarshaller<String> asciiMarshaller = Metadata.f58205d;
        f58974x = Metadata.Key.m30914a("grpc-previous-rpc-attempts", asciiMarshaller);
        f58975y = Metadata.Key.m30914a("grpc-retry-pushback-ms", asciiMarshaller);
        f58976z = Status.f58279f.m30947g("Stream thrown away because RetriableStream committed");
        f58973A = new Random();
    }

    /* renamed from: t */
    public static void m31156t(RetriableStream retriableStream, Substream substream) {
        Runnable m31161w = retriableStream.m31161w(substream);
        if (m31161w != null) {
            m31161w.run();
        }
    }

    /* renamed from: v */
    public static void m31157v(RetriableStream retriableStream, Integer num) {
        Objects.requireNonNull(retriableStream);
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            retriableStream.m31158A();
            return;
        }
        synchronized (retriableStream.f58985i) {
            FutureCanceller futureCanceller = retriableStream.f58996t;
            if (futureCanceller != null) {
                Future<?> m31166a = futureCanceller.m31166a();
                FutureCanceller futureCanceller2 = new FutureCanceller(retriableStream.f58985i);
                retriableStream.f58996t = futureCanceller2;
                if (m31166a != null) {
                    m31166a.cancel(false);
                }
                futureCanceller2.m31167b(retriableStream.f58980d.schedule(new HedgingRunnable(futureCanceller2), num.intValue(), TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: A */
    public final void m31158A() {
        Future<?> future;
        synchronized (this.f58985i) {
            FutureCanceller futureCanceller = this.f58996t;
            future = null;
            if (futureCanceller != null) {
                Future<?> m31166a = futureCanceller.m31166a();
                this.f58996t = null;
                future = m31166a;
            }
            this.f58991o = this.f58991o.m31169b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @GuardedBy
    /* renamed from: B */
    public final boolean m31159B(State state) {
        return state.f59038f == null && state.f59037e < this.f58983g.f58707a && !state.f59040h;
    }

    /* renamed from: C */
    public abstract ClientStream mo31138C(Metadata metadata, ClientStreamTracer.Factory factory, int i2, boolean z);

    /* renamed from: D */
    public abstract void mo31139D();

    @CheckReturnValue
    @Nullable
    /* renamed from: E */
    public abstract Status mo31140E();

    /* renamed from: F */
    public final void m31160F(final ReqT reqt) {
        State state = this.f58991o;
        if (state.f59033a) {
            state.f59038f.f59060a.mo30990r(this.f58977a.f58224d.mo30925b(reqt));
        } else {
            m31163y(new BufferEntry() { // from class: io.grpc.internal.RetriableStream.1SendMessageEntry
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.grpc.internal.RetriableStream.BufferEntry
                /* renamed from: a */
                public void mo31165a(Substream substream) {
                    substream.f59060a.mo30990r(RetriableStream.this.f58977a.m30922c(reqt));
                }
            });
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: a */
    public final void mo30978a(final Status status) {
        Substream substream = new Substream(0);
        substream.f59060a = new NoopClientStream();
        Runnable m31161w = m31161w(substream);
        if (m31161w != null) {
            m31161w.run();
            this.f58979c.execute(new Runnable() { // from class: io.grpc.internal.RetriableStream.4
                @Override // java.lang.Runnable
                public void run() {
                    RetriableStream retriableStream = RetriableStream.this;
                    retriableStream.f58999w = true;
                    retriableStream.f58994r.mo31055f(status, ClientStreamListener.RpcProgress.PROCESSED, new Metadata());
                }
            });
            return;
        }
        Substream substream2 = null;
        synchronized (this.f58985i) {
            if (this.f58991o.f59035c.contains(this.f58991o.f59038f)) {
                substream2 = this.f58991o.f59038f;
            } else {
                this.f58998v = status;
            }
            State state = this.f58991o;
            this.f58991o = new State(state.f59034b, state.f59035c, state.f59036d, state.f59038f, true, state.f59033a, state.f59040h, state.f59037e);
        }
        if (substream2 != null) {
            substream2.f59060a.mo30978a(status);
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: b */
    public final boolean mo30979b() {
        Iterator<Substream> it = this.f58991o.f59035c.iterator();
        while (it.hasNext()) {
            if (it.next().f59060a.mo30979b()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: c */
    public final void mo30980c(final boolean z) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1MessageCompressionEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30980c(z);
            }
        });
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: e */
    public final void mo30981e(final Compressor compressor) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1CompressorEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30981e(compressor);
            }
        });
    }

    @Override // io.grpc.internal.Stream
    public final void flush() {
        State state = this.f58991o;
        if (state.f59033a) {
            state.f59038f.f59060a.flush();
        } else {
            m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1FlushEntry
                @Override // io.grpc.internal.RetriableStream.BufferEntry
                /* renamed from: a */
                public void mo31165a(Substream substream) {
                    substream.f59060a.flush();
                }
            });
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: g */
    public final void mo30982g(final int i2) {
        State state = this.f58991o;
        if (state.f59033a) {
            state.f59038f.f59060a.mo30982g(i2);
        } else {
            m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1RequestEntry
                @Override // io.grpc.internal.RetriableStream.BufferEntry
                /* renamed from: a */
                public void mo31165a(Substream substream) {
                    substream.f59060a.mo30982g(i2);
                }
            });
        }
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: h */
    public final void mo30983h(final int i2) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1MaxInboundMessageSizeEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30983h(i2);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: i */
    public final void mo30984i(final int i2) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1MaxOutboundMessageSizeEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30984i(i2);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: k */
    public final void mo30985k(final DecompressorRegistry decompressorRegistry) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1DecompressorRegistryEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30985k(decompressorRegistry);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: m */
    public final void mo30986m(final String str) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1AuthorityEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30986m(str);
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: n */
    public void mo30987n(InsightBuilder insightBuilder) {
        State state;
        synchronized (this.f58985i) {
            insightBuilder.m31116b("closed", this.f58990n);
            state = this.f58991o;
        }
        if (state.f59038f != null) {
            InsightBuilder insightBuilder2 = new InsightBuilder();
            state.f59038f.f59060a.mo30987n(insightBuilder2);
            insightBuilder.m31116b("committed", insightBuilder2);
            return;
        }
        InsightBuilder insightBuilder3 = new InsightBuilder();
        for (Substream substream : state.f59035c) {
            InsightBuilder insightBuilder4 = new InsightBuilder();
            substream.f59060a.mo30987n(insightBuilder4);
            insightBuilder3.f58728a.add(String.valueOf(insightBuilder4));
        }
        insightBuilder.m31116b("open", insightBuilder3);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: o */
    public final void mo30988o() {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1HalfCloseEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30988o();
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: p */
    public final void mo30989p(final Deadline deadline) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1DeadlineEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30989p(deadline);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if ((r3.f59067d.get() > r3.f59065b) != false) goto L22;
     */
    @Override // io.grpc.internal.ClientStream
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo30976q(io.grpc.internal.ClientStreamListener r7) {
        /*
            r6 = this;
            r6.f58994r = r7
            io.grpc.Status r7 = r6.mo31140E()
            if (r7 == 0) goto Lc
            r6.mo30978a(r7)
            return
        Lc:
            java.lang.Object r7 = r6.f58985i
            monitor-enter(r7)
            io.grpc.internal.RetriableStream$State r0 = r6.f58991o     // Catch: java.lang.Throwable -> L72
            java.util.List<io.grpc.internal.RetriableStream$BufferEntry> r0 = r0.f59034b     // Catch: java.lang.Throwable -> L72
            io.grpc.internal.RetriableStream$StartEntry r1 = new io.grpc.internal.RetriableStream$StartEntry     // Catch: java.lang.Throwable -> L72
            r1.<init>()     // Catch: java.lang.Throwable -> L72
            r0.add(r1)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            r7 = 0
            io.grpc.internal.RetriableStream$Substream r0 = r6.m31162x(r7, r7)
            boolean r1 = r6.f58984h
            if (r1 == 0) goto L6e
            r1 = 0
            java.lang.Object r2 = r6.f58985i
            monitor-enter(r2)
            io.grpc.internal.RetriableStream$State r3 = r6.f58991o     // Catch: java.lang.Throwable -> L6b
            io.grpc.internal.RetriableStream$State r3 = r3.m31168a(r0)     // Catch: java.lang.Throwable -> L6b
            r6.f58991o = r3     // Catch: java.lang.Throwable -> L6b
            io.grpc.internal.RetriableStream$State r3 = r6.f58991o     // Catch: java.lang.Throwable -> L6b
            boolean r3 = r6.m31159B(r3)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L53
            io.grpc.internal.RetriableStream$Throttle r3 = r6.f58989m     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L4a
            java.util.concurrent.atomic.AtomicInteger r4 = r3.f59067d     // Catch: java.lang.Throwable -> L6b
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L6b
            int r3 = r3.f59065b     // Catch: java.lang.Throwable -> L6b
            if (r4 <= r3) goto L48
            r7 = 1
        L48:
            if (r7 == 0) goto L53
        L4a:
            io.grpc.internal.RetriableStream$FutureCanceller r1 = new io.grpc.internal.RetriableStream$FutureCanceller     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = r6.f58985i     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            r6.f58996t = r1     // Catch: java.lang.Throwable -> L6b
        L53:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6e
            java.util.concurrent.ScheduledExecutorService r7 = r6.f58980d
            io.grpc.internal.RetriableStream$HedgingRunnable r2 = new io.grpc.internal.RetriableStream$HedgingRunnable
            r2.<init>(r1)
            io.grpc.internal.HedgingPolicy r3 = r6.f58983g
            long r3 = r3.f58708b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r2, r3, r5)
            r1.m31167b(r7)
            goto L6e
        L6b:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
            throw r7
        L6e:
            r6.m31164z(r0)
            return
        L72:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L72
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.RetriableStream.mo30976q(io.grpc.internal.ClientStreamListener):void");
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: r */
    public final void mo30990r(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: s */
    public void mo30991s() {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1OptimizeDirectEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30991s();
            }
        });
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: u */
    public final void mo30993u(final boolean z) {
        m31163y(new BufferEntry(this) { // from class: io.grpc.internal.RetriableStream.1FullStreamDecompressionEntry
            @Override // io.grpc.internal.RetriableStream.BufferEntry
            /* renamed from: a */
            public void mo31165a(Substream substream) {
                substream.f59060a.mo30993u(z);
            }
        });
    }

    @CheckReturnValue
    @Nullable
    /* renamed from: w */
    public final Runnable m31161w(final Substream substream) {
        List<BufferEntry> list;
        Collection emptyList;
        final Future<?> future;
        final Future<?> future2;
        synchronized (this.f58985i) {
            if (this.f58991o.f59038f != null) {
                return null;
            }
            final Collection<Substream> collection = this.f58991o.f59035c;
            State state = this.f58991o;
            boolean z = false;
            Preconditions.m11192p(state.f59038f == null, "Already committed");
            List<BufferEntry> list2 = state.f59034b;
            if (state.f59035c.contains(substream)) {
                list = null;
                emptyList = Collections.singleton(substream);
                z = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
            }
            this.f58991o = new State(list, emptyList, state.f59036d, substream, state.f59039g, z, state.f59040h, state.f59037e);
            this.f58986j.f59023a.addAndGet(-this.f58993q);
            FutureCanceller futureCanceller = this.f58995s;
            if (futureCanceller != null) {
                Future<?> m31166a = futureCanceller.m31166a();
                this.f58995s = null;
                future = m31166a;
            } else {
                future = null;
            }
            FutureCanceller futureCanceller2 = this.f58996t;
            if (futureCanceller2 != null) {
                Future<?> m31166a2 = futureCanceller2.m31166a();
                this.f58996t = null;
                future2 = m31166a2;
            } else {
                future2 = null;
            }
            return new Runnable() { // from class: io.grpc.internal.RetriableStream.1CommitTask
                @Override // java.lang.Runnable
                public void run() {
                    for (Substream substream2 : collection) {
                        if (substream2 != substream) {
                            substream2.f59060a.mo30978a(RetriableStream.f58976z);
                        }
                    }
                    Future future3 = future;
                    if (future3 != null) {
                        future3.cancel(false);
                    }
                    Future future4 = future2;
                    if (future4 != null) {
                        future4.cancel(false);
                    }
                    RetriableStream.this.mo31139D();
                }
            };
        }
    }

    /* renamed from: x */
    public final Substream m31162x(int i2, boolean z) {
        Substream substream = new Substream(i2);
        final BufferSizeTracer bufferSizeTracer = new BufferSizeTracer(substream);
        ClientStreamTracer.Factory factory = new ClientStreamTracer.Factory(this) { // from class: io.grpc.internal.RetriableStream.2
            @Override // io.grpc.ClientStreamTracer.Factory
            /* renamed from: a */
            public ClientStreamTracer mo30823a(ClientStreamTracer.StreamInfo streamInfo, Metadata metadata) {
                return bufferSizeTracer;
            }
        };
        Metadata metadata = this.f58981e;
        Metadata metadata2 = new Metadata();
        metadata2.m30901f(metadata);
        if (i2 > 0) {
            metadata2.m30903h(f58974x, String.valueOf(i2));
        }
        substream.f59060a = mo31138C(metadata2, factory, i2, z);
        return substream;
    }

    /* renamed from: y */
    public final void m31163y(BufferEntry bufferEntry) {
        Collection<Substream> collection;
        synchronized (this.f58985i) {
            if (!this.f58991o.f59033a) {
                this.f58991o.f59034b.add(bufferEntry);
            }
            collection = this.f58991o.f59035c;
        }
        Iterator<Substream> it = collection.iterator();
        while (it.hasNext()) {
            bufferEntry.mo31165a(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r8.f58979c.execute(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r0 = r9.f59060a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8.f58991o.f59038f != r9) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r9 = r8.f58998v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r0.mo30978a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        r9 = io.grpc.internal.RetriableStream.f58976z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r2.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        r4 = (io.grpc.internal.RetriableStream.BufferEntry) r2.next();
        r4.mo31165a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if ((r4 instanceof io.grpc.internal.RetriableStream.StartEntry) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        r4 = r8.f58991o;
        r5 = r4.f59038f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        if (r5 == r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        if (r4.f59039g == false) goto L70;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31164z(io.grpc.internal.RetriableStream.Substream r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = 0
        L4:
            java.lang.Object r4 = r8.f58985i
            monitor-enter(r4)
            io.grpc.internal.RetriableStream$State r5 = r8.f58991o     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto L19
            io.grpc.internal.RetriableStream$Substream r6 = r5.f59038f     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L13
            if (r6 == r9) goto L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            goto L35
        L13:
            boolean r6 = r5.f59039g     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L19
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            goto L35
        L19:
            java.util.List<io.grpc.internal.RetriableStream$BufferEntry> r6 = r5.f59034b     // Catch: java.lang.Throwable -> La5
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La5
            if (r2 != r6) goto L4e
            io.grpc.internal.RetriableStream$State r0 = r5.m31173f(r9)     // Catch: java.lang.Throwable -> La5
            r8.f58991o = r0     // Catch: java.lang.Throwable -> La5
            boolean r0 = r8.mo30979b()     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L2f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            return
        L2f:
            io.grpc.internal.RetriableStream$3 r0 = new io.grpc.internal.RetriableStream$3     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
        L35:
            if (r0 == 0) goto L3d
            java.util.concurrent.Executor r9 = r8.f58979c
            r9.execute(r0)
            return
        L3d:
            io.grpc.internal.ClientStream r0 = r9.f59060a
            io.grpc.internal.RetriableStream$State r1 = r8.f58991o
            io.grpc.internal.RetriableStream$Substream r1 = r1.f59038f
            if (r1 != r9) goto L48
            io.grpc.Status r9 = r8.f58998v
            goto L4a
        L48:
            io.grpc.Status r9 = io.grpc.internal.RetriableStream.f58976z
        L4a:
            r0.mo30978a(r9)
            return
        L4e:
            boolean r6 = r9.f59061b     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L54
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            return
        L54:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.RetriableStream$BufferEntry> r7 = r5.f59034b     // Catch: java.lang.Throwable -> La5
            int r7 = r7.size()     // Catch: java.lang.Throwable -> La5
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto L6e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            java.util.List<io.grpc.internal.RetriableStream$BufferEntry> r5 = r5.f59034b     // Catch: java.lang.Throwable -> La5
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La5
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La5
            goto L7a
        L6e:
            r3.clear()     // Catch: java.lang.Throwable -> La5
            java.util.List<io.grpc.internal.RetriableStream$BufferEntry> r5 = r5.f59034b     // Catch: java.lang.Throwable -> La5
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La5
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La5
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r2 = r3.iterator()
        L7f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La2
            java.lang.Object r4 = r2.next()
            io.grpc.internal.RetriableStream$BufferEntry r4 = (io.grpc.internal.RetriableStream.BufferEntry) r4
            r4.mo31165a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.RetriableStream.StartEntry
            if (r4 == 0) goto L93
            r1 = 1
        L93:
            if (r1 == 0) goto L7f
            io.grpc.internal.RetriableStream$State r4 = r8.f58991o
            io.grpc.internal.RetriableStream$Substream r5 = r4.f59038f
            if (r5 == 0) goto L9e
            if (r5 == r9) goto L9e
            goto La2
        L9e:
            boolean r4 = r4.f59039g
            if (r4 == 0) goto L7f
        La2:
            r2 = r6
            goto L4
        La5:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La5
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.RetriableStream.m31164z(io.grpc.internal.RetriableStream$Substream):void");
    }
}
