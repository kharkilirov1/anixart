package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super R> f60186b;

        /* renamed from: d */
        public final int f60188d;

        /* renamed from: e */
        public final int f60189e;

        /* renamed from: g */
        public Subscription f60191g;

        /* renamed from: h */
        public SimpleQueue<T> f60192h;

        /* renamed from: i */
        public volatile boolean f60193i;

        /* renamed from: j */
        public volatile boolean f60194j;

        /* renamed from: l */
        public Iterator<? extends R> f60196l;

        /* renamed from: m */
        public int f60197m;

        /* renamed from: n */
        public int f60198n;

        /* renamed from: c */
        public final Function<? super T, ? extends Iterable<? extends R>> f60187c = null;

        /* renamed from: k */
        public final AtomicReference<Throwable> f60195k = new AtomicReference<>();

        /* renamed from: f */
        public final AtomicLong f60190f = new AtomicLong();

        public FlattenIterableSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function, int i2) {
            this.f60186b = subscriber;
            this.f60188d = i2;
            this.f60189e = i2 - (i2 >> 2);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return ((i2 & 1) == 0 || this.f60198n != 1) ? 0 : 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
        
            if (r13 != r9) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
        
            r5 = r18.f60193i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
        
            if (r3.isEmpty() == false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
        
            if (r6 != null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
        
            r15 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
        
            if (m31504f(r5, r15, r2, r3) == false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
        
            r15 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
        
            if (r13 == 0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
        
            if (r9 == Long.MAX_VALUE) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x011a, code lost:
        
            r18.f60190f.addAndGet(-r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
        
            if (r6 != null) goto L69;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31503c() {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.m31503c():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60194j) {
                return;
            }
            this.f60194j = true;
            this.f60191g.cancel();
            if (getAndIncrement() == 0) {
                this.f60192h.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f60196l = null;
            this.f60192h.clear();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60191g, subscription)) {
                this.f60191g = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f60198n = mo31420F;
                        this.f60192h = queueSubscription;
                        this.f60193i = true;
                        this.f60186b.mo31352d(this);
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60198n = mo31420F;
                        this.f60192h = queueSubscription;
                        this.f60186b.mo31352d(this);
                        subscription.request(this.f60188d);
                        return;
                    }
                }
                this.f60192h = new SpscArrayQueue(this.f60188d);
                this.f60186b.mo31352d(this);
                subscription.request(this.f60188d);
            }
        }

        /* renamed from: f */
        public boolean m31504f(boolean z, boolean z2, Subscriber<?> subscriber, SimpleQueue<?> simpleQueue) {
            if (this.f60194j) {
                this.f60196l = null;
                simpleQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f60195k.get() == null) {
                if (!z2) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            Throwable m31818b = ExceptionHelper.m31818b(this.f60195k);
            this.f60196l = null;
            simpleQueue.clear();
            subscriber.onError(m31818b);
            return true;
        }

        /* renamed from: h */
        public void m31505h(boolean z) {
            if (z) {
                int i2 = this.f60197m + 1;
                if (i2 != this.f60189e) {
                    this.f60197m = i2;
                } else {
                    this.f60197m = 0;
                    this.f60191g.request(i2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f60196l == null && this.f60192h.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60193i) {
                return;
            }
            this.f60193i = true;
            m31503c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60193i || !ExceptionHelper.m31817a(this.f60195k, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60193i = true;
                m31503c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60193i) {
                return;
            }
            if (this.f60198n != 0 || this.f60192h.offer(t)) {
                m31503c();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f60196l;
            while (true) {
                if (it == null) {
                    T poll = this.f60192h.poll();
                    if (poll != null) {
                        it = this.f60187c.apply(poll).iterator();
                        if (it.hasNext()) {
                            this.f60196l = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f60196l = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60190f, j2);
                m31503c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        Flowable<T> flowable = this.f59782c;
        if (!(flowable instanceof Callable)) {
            flowable.m31349b(new FlattenIterableSubscriber(subscriber, null, 0));
            return;
        }
        try {
            if (((Callable) flowable).call() == null) {
                subscriber.mo31352d(emptySubscription);
                subscriber.onComplete();
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                subscriber.mo31352d(emptySubscription);
                subscriber.onError(th);
            }
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            subscriber.mo31352d(emptySubscription);
            subscriber.onError(th2);
        }
    }
}
