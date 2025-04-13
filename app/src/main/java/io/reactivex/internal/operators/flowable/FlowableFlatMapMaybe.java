package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableFlatMapMaybe<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f60162b;

        /* renamed from: c */
        public final boolean f60163c;

        /* renamed from: d */
        public final int f60164d;

        /* renamed from: k */
        public Subscription f60171k;

        /* renamed from: l */
        public volatile boolean f60172l;

        /* renamed from: i */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f60169i = null;

        /* renamed from: e */
        public final AtomicLong f60165e = new AtomicLong();

        /* renamed from: f */
        public final CompositeDisposable f60166f = new CompositeDisposable();

        /* renamed from: h */
        public final AtomicThrowable f60168h = new AtomicThrowable();

        /* renamed from: g */
        public final AtomicInteger f60167g = new AtomicInteger(1);

        /* renamed from: j */
        public final AtomicReference<SpscLinkedArrayQueue<R>> f60170j = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            public InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                DisposableHelper.m31409a(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.f60166f.mo31394c(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeSubscriber.f60167g.decrementAndGet() == 0;
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueue = flatMapMaybeSubscriber.f60170j.get();
                        if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                            Throwable m31818b = ExceptionHelper.m31818b(flatMapMaybeSubscriber.f60168h);
                            if (m31818b != null) {
                                flatMapMaybeSubscriber.f60162b.onError(m31818b);
                                return;
                            } else {
                                flatMapMaybeSubscriber.f60162b.onComplete();
                                return;
                            }
                        }
                        if (flatMapMaybeSubscriber.f60164d != Integer.MAX_VALUE) {
                            flatMapMaybeSubscriber.f60171k.request(1L);
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapMaybeSubscriber.m31497c();
                        return;
                    }
                }
                flatMapMaybeSubscriber.f60167g.decrementAndGet();
                if (flatMapMaybeSubscriber.f60164d != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.f60171k.request(1L);
                }
                flatMapMaybeSubscriber.m31496b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.f60166f.mo31394c(this);
                if (!ExceptionHelper.m31817a(flatMapMaybeSubscriber.f60168h, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!flatMapMaybeSubscriber.f60163c) {
                    flatMapMaybeSubscriber.f60171k.cancel();
                    flatMapMaybeSubscriber.f60166f.mo31379f();
                } else if (flatMapMaybeSubscriber.f60164d != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.f60171k.request(1L);
                }
                flatMapMaybeSubscriber.f60167g.decrementAndGet();
                flatMapMaybeSubscriber.m31496b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.f60166f.mo31394c(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeSubscriber.f60167g.decrementAndGet() == 0;
                        if (flatMapMaybeSubscriber.f60165e.get() != 0) {
                            flatMapMaybeSubscriber.f60162b.onNext(r);
                            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = flatMapMaybeSubscriber.f60170j.get();
                            if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                Throwable m31818b = ExceptionHelper.m31818b(flatMapMaybeSubscriber.f60168h);
                                if (m31818b != null) {
                                    flatMapMaybeSubscriber.f60162b.onError(m31818b);
                                    return;
                                } else {
                                    flatMapMaybeSubscriber.f60162b.onComplete();
                                    return;
                                }
                            }
                            BackpressureHelper.m31812e(flatMapMaybeSubscriber.f60165e, 1L);
                            if (flatMapMaybeSubscriber.f60164d != Integer.MAX_VALUE) {
                                flatMapMaybeSubscriber.f60171k.request(1L);
                            }
                        } else {
                            SpscLinkedArrayQueue<R> m31498e = flatMapMaybeSubscriber.m31498e();
                            synchronized (m31498e) {
                                m31498e.offer(r);
                            }
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapMaybeSubscriber.m31497c();
                    }
                }
                SpscLinkedArrayQueue<R> m31498e2 = flatMapMaybeSubscriber.m31498e();
                synchronized (m31498e2) {
                    m31498e2.offer(r);
                }
                flatMapMaybeSubscriber.f60167g.decrementAndGet();
                if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                    return;
                }
                flatMapMaybeSubscriber.m31497c();
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public FlatMapMaybeSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i2) {
            this.f60162b = subscriber;
            this.f60163c = z;
            this.f60164d = i2;
        }

        /* renamed from: a */
        public void m31495a() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.f60170j.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        /* renamed from: b */
        public void m31496b() {
            if (getAndIncrement() == 0) {
                m31497c();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        
            if (r10 != r6) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        
            if (r17.f60172l == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        
            if (r17.f60163c != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
        
            if (r17.f60168h.get() == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
        
            r2 = io.reactivex.internal.util.ExceptionHelper.m31818b(r17.f60168h);
            m31495a();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
        
            if (r2.get() != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
        
            if (r7 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
        
            if (r7.isEmpty() == false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
        
            if (r6 == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
        
            if (r12 == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
        
            r2 = io.reactivex.internal.util.ExceptionHelper.m31818b(r17.f60168h);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00be, code lost:
        
            if (r2 == null) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
        
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
        
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00a4, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
        
            m31495a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0080, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
        
            if (r10 == 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.m31812e(r17.f60165e, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
        
            if (r17.f60164d == Integer.MAX_VALUE) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
        
            r17.f60171k.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
        
            r5 = addAndGet(-r5);
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31497c() {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.m31497c():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60172l = true;
            this.f60171k.cancel();
            this.f60166f.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60171k, subscription)) {
                this.f60171k = subscription;
                this.f60162b.mo31352d(this);
                int i2 = this.f60164d;
                if (i2 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i2);
                }
            }
        }

        /* renamed from: e */
        public SpscLinkedArrayQueue<R> m31498e() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.f60170j.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.f59569b);
            } while (!this.f60170j.compareAndSet(null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60167g.decrementAndGet();
            m31496b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60167g.decrementAndGet();
            if (!ExceptionHelper.m31817a(this.f60168h, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f60163c) {
                this.f60166f.mo31379f();
            }
            m31496b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                MaybeSource<? extends R> apply = this.f60169i.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = apply;
                this.f60167g.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f60172l || !this.f60166f.mo31393b(innerObserver)) {
                    return;
                }
                maybeSource.mo31353b(innerObserver);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60171k.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60165e, j2);
                m31496b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        this.f59782c.m31349b(new FlatMapMaybeSubscriber(subscriber, null, false, 0));
    }
}
