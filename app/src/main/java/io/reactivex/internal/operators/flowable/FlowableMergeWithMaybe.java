package io.reactivex.internal.operators.flowable;

import android.R;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableMergeWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60336b;

        /* renamed from: c */
        public final AtomicReference<Subscription> f60337c = new AtomicReference<>();

        /* renamed from: d */
        public final OtherObserver<T> f60338d = new OtherObserver<>(this);

        /* renamed from: e */
        public final AtomicThrowable f60339e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicLong f60340f = new AtomicLong();

        /* renamed from: g */
        public final int f60341g;

        /* renamed from: h */
        public final int f60342h;

        /* renamed from: i */
        public volatile SimplePlainQueue<T> f60343i;

        /* renamed from: j */
        public T f60344j;

        /* renamed from: k */
        public volatile boolean f60345k;

        /* renamed from: l */
        public volatile boolean f60346l;

        /* renamed from: m */
        public volatile int f60347m;

        /* renamed from: n */
        public long f60348n;

        /* renamed from: o */
        public int f60349o;

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

            /* renamed from: b */
            public final MergeWithObserver<T> f60350b;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f60350b = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                MergeWithObserver<T> mergeWithObserver = this.f60350b;
                mergeWithObserver.f60347m = 2;
                mergeWithObserver.m31530a();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                MergeWithObserver<T> mergeWithObserver = this.f60350b;
                if (!ExceptionHelper.m31817a(mergeWithObserver.f60339e, th)) {
                    RxJavaPlugins.m31848b(th);
                } else {
                    SubscriptionHelper.m31797a(mergeWithObserver.f60337c);
                    mergeWithObserver.m31530a();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t) {
                MergeWithObserver<T> mergeWithObserver = this.f60350b;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    long j2 = mergeWithObserver.f60348n;
                    if (mergeWithObserver.f60340f.get() != j2) {
                        mergeWithObserver.f60348n = j2 + 1;
                        mergeWithObserver.f60336b.onNext(t);
                        mergeWithObserver.f60347m = 2;
                    } else {
                        mergeWithObserver.f60344j = t;
                        mergeWithObserver.f60347m = 1;
                        if (mergeWithObserver.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    mergeWithObserver.f60344j = t;
                    mergeWithObserver.f60347m = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m31531b();
            }
        }

        public MergeWithObserver(Subscriber<? super T> subscriber) {
            this.f60336b = subscriber;
            int i2 = Flowable.f59569b;
            this.f60341g = i2;
            this.f60342h = i2 - (i2 >> 2);
        }

        /* renamed from: a */
        public void m31530a() {
            if (getAndIncrement() == 0) {
                m31531b();
            }
        }

        /* renamed from: b */
        public void m31531b() {
            Subscriber<? super T> subscriber = this.f60336b;
            long j2 = this.f60348n;
            int i2 = this.f60349o;
            int i3 = this.f60342h;
            int i4 = 1;
            int i5 = 1;
            while (true) {
                long j3 = this.f60340f.get();
                while (j2 != j3) {
                    if (this.f60345k) {
                        this.f60344j = null;
                        this.f60343i = null;
                        return;
                    }
                    if (this.f60339e.get() != null) {
                        this.f60344j = null;
                        this.f60343i = null;
                        subscriber.onError(ExceptionHelper.m31818b(this.f60339e));
                        return;
                    }
                    int i6 = this.f60347m;
                    if (i6 == i4) {
                        T t = this.f60344j;
                        this.f60344j = null;
                        this.f60347m = 2;
                        subscriber.onNext(t);
                        j2++;
                    } else {
                        boolean z = this.f60346l;
                        SimplePlainQueue<T> simplePlainQueue = this.f60343i;
                        R.attr poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z2 = poll == null;
                        if (z && z2 && i6 == 2) {
                            this.f60343i = null;
                            subscriber.onComplete();
                            return;
                        } else {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                            i2++;
                            if (i2 == i3) {
                                this.f60337c.get().request(i3);
                                i2 = 0;
                            }
                            i4 = 1;
                        }
                    }
                }
                if (j2 == j3) {
                    if (this.f60345k) {
                        this.f60344j = null;
                        this.f60343i = null;
                        return;
                    }
                    if (this.f60339e.get() != null) {
                        this.f60344j = null;
                        this.f60343i = null;
                        subscriber.onError(ExceptionHelper.m31818b(this.f60339e));
                        return;
                    }
                    boolean z3 = this.f60346l;
                    SimplePlainQueue<T> simplePlainQueue2 = this.f60343i;
                    boolean z4 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z3 && z4 && this.f60347m == 2) {
                        this.f60343i = null;
                        subscriber.onComplete();
                        return;
                    }
                }
                this.f60348n = j2;
                this.f60349o = i2;
                i5 = addAndGet(-i5);
                if (i5 == 0) {
                    return;
                } else {
                    i4 = 1;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60345k = true;
            SubscriptionHelper.m31797a(this.f60337c);
            DisposableHelper.m31409a(this.f60338d);
            if (getAndIncrement() == 0) {
                this.f60343i = null;
                this.f60344j = null;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this.f60337c, subscription, this.f60341g);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60346l = true;
            m31530a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f60339e, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                SubscriptionHelper.m31797a(this.f60337c);
                m31530a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j2 = this.f60348n;
                if (this.f60340f.get() != j2) {
                    SimplePlainQueue<T> simplePlainQueue = this.f60343i;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.f60348n = j2 + 1;
                        this.f60336b.onNext(t);
                        int i2 = this.f60349o + 1;
                        if (i2 == this.f60342h) {
                            this.f60349o = 0;
                            this.f60337c.get().request(i2);
                        } else {
                            this.f60349o = i2;
                        }
                    } else {
                        simplePlainQueue.offer(t);
                    }
                } else {
                    SpscArrayQueue spscArrayQueue = this.f60343i;
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new SpscArrayQueue(Flowable.f59569b);
                        this.f60343i = spscArrayQueue;
                    }
                    spscArrayQueue.offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscArrayQueue spscArrayQueue2 = this.f60343i;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(Flowable.f59569b);
                    this.f60343i = spscArrayQueue2;
                }
                spscArrayQueue2.offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m31531b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f60340f, j2);
            m31530a();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(subscriber);
        subscriber.mo31352d(mergeWithObserver);
        this.f59782c.m31349b(mergeWithObserver);
        throw null;
    }
}
