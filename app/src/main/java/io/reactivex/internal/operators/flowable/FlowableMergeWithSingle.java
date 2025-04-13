package io.reactivex.internal.operators.flowable;

import android.R;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
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
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60351b;

        /* renamed from: c */
        public final AtomicReference<Subscription> f60352c = new AtomicReference<>();

        /* renamed from: d */
        public final OtherObserver<T> f60353d = new OtherObserver<>(this);

        /* renamed from: e */
        public final AtomicThrowable f60354e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicLong f60355f = new AtomicLong();

        /* renamed from: g */
        public final int f60356g;

        /* renamed from: h */
        public final int f60357h;

        /* renamed from: i */
        public volatile SimplePlainQueue<T> f60358i;

        /* renamed from: j */
        public T f60359j;

        /* renamed from: k */
        public volatile boolean f60360k;

        /* renamed from: l */
        public volatile boolean f60361l;

        /* renamed from: m */
        public volatile int f60362m;

        /* renamed from: n */
        public long f60363n;

        /* renamed from: o */
        public int f60364o;

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* renamed from: b */
            public final MergeWithObserver<T> f60365b;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.f60365b = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                MergeWithObserver<T> mergeWithObserver = this.f60365b;
                if (!ExceptionHelper.m31817a(mergeWithObserver.f60354e, th)) {
                    RxJavaPlugins.m31848b(th);
                } else {
                    SubscriptionHelper.m31797a(mergeWithObserver.f60352c);
                    mergeWithObserver.m31532a();
                }
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                MergeWithObserver<T> mergeWithObserver = this.f60365b;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    long j2 = mergeWithObserver.f60363n;
                    if (mergeWithObserver.f60355f.get() != j2) {
                        mergeWithObserver.f60363n = j2 + 1;
                        mergeWithObserver.f60351b.onNext(t);
                        mergeWithObserver.f60362m = 2;
                    } else {
                        mergeWithObserver.f60359j = t;
                        mergeWithObserver.f60362m = 1;
                        if (mergeWithObserver.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    mergeWithObserver.f60359j = t;
                    mergeWithObserver.f60362m = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.m31533b();
            }
        }

        public MergeWithObserver(Subscriber<? super T> subscriber) {
            this.f60351b = subscriber;
            int i2 = Flowable.f59569b;
            this.f60356g = i2;
            this.f60357h = i2 - (i2 >> 2);
        }

        /* renamed from: a */
        public void m31532a() {
            if (getAndIncrement() == 0) {
                m31533b();
            }
        }

        /* renamed from: b */
        public void m31533b() {
            Subscriber<? super T> subscriber = this.f60351b;
            long j2 = this.f60363n;
            int i2 = this.f60364o;
            int i3 = this.f60357h;
            int i4 = 1;
            int i5 = 1;
            while (true) {
                long j3 = this.f60355f.get();
                while (j2 != j3) {
                    if (this.f60360k) {
                        this.f60359j = null;
                        this.f60358i = null;
                        return;
                    }
                    if (this.f60354e.get() != null) {
                        this.f60359j = null;
                        this.f60358i = null;
                        subscriber.onError(ExceptionHelper.m31818b(this.f60354e));
                        return;
                    }
                    int i6 = this.f60362m;
                    if (i6 == i4) {
                        T t = this.f60359j;
                        this.f60359j = null;
                        this.f60362m = 2;
                        subscriber.onNext(t);
                        j2++;
                    } else {
                        boolean z = this.f60361l;
                        SimplePlainQueue<T> simplePlainQueue = this.f60358i;
                        R.attr poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z2 = poll == null;
                        if (z && z2 && i6 == 2) {
                            this.f60358i = null;
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
                                this.f60352c.get().request(i3);
                                i2 = 0;
                            }
                            i4 = 1;
                        }
                    }
                }
                if (j2 == j3) {
                    if (this.f60360k) {
                        this.f60359j = null;
                        this.f60358i = null;
                        return;
                    }
                    if (this.f60354e.get() != null) {
                        this.f60359j = null;
                        this.f60358i = null;
                        subscriber.onError(ExceptionHelper.m31818b(this.f60354e));
                        return;
                    }
                    boolean z3 = this.f60361l;
                    SimplePlainQueue<T> simplePlainQueue2 = this.f60358i;
                    boolean z4 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z3 && z4 && this.f60362m == 2) {
                        this.f60358i = null;
                        subscriber.onComplete();
                        return;
                    }
                }
                this.f60363n = j2;
                this.f60364o = i2;
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
            this.f60360k = true;
            SubscriptionHelper.m31797a(this.f60352c);
            DisposableHelper.m31409a(this.f60353d);
            if (getAndIncrement() == 0) {
                this.f60358i = null;
                this.f60359j = null;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this.f60352c, subscription, this.f60356g);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60361l = true;
            m31532a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f60354e, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                SubscriptionHelper.m31797a(this.f60352c);
                m31532a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j2 = this.f60363n;
                if (this.f60355f.get() != j2) {
                    SimplePlainQueue<T> simplePlainQueue = this.f60358i;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.f60363n = j2 + 1;
                        this.f60351b.onNext(t);
                        int i2 = this.f60364o + 1;
                        if (i2 == this.f60357h) {
                            this.f60364o = 0;
                            this.f60352c.get().request(i2);
                        } else {
                            this.f60364o = i2;
                        }
                    } else {
                        simplePlainQueue.offer(t);
                    }
                } else {
                    SpscArrayQueue spscArrayQueue = this.f60358i;
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new SpscArrayQueue(Flowable.f59569b);
                        this.f60358i = spscArrayQueue;
                    }
                    spscArrayQueue.offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscArrayQueue spscArrayQueue2 = this.f60358i;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(Flowable.f59569b);
                    this.f60358i = spscArrayQueue2;
                }
                spscArrayQueue2.offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m31533b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f60355f, j2);
            m31532a();
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
