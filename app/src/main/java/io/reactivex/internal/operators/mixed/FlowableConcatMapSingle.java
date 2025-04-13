package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {

    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f61209b;

        /* renamed from: d */
        public final int f61211d;

        /* renamed from: h */
        public final SimplePlainQueue<T> f61215h;

        /* renamed from: j */
        public Subscription f61217j;

        /* renamed from: k */
        public volatile boolean f61218k;

        /* renamed from: l */
        public volatile boolean f61219l;

        /* renamed from: m */
        public long f61220m;

        /* renamed from: n */
        public int f61221n;

        /* renamed from: o */
        public R f61222o;

        /* renamed from: p */
        public volatile int f61223p;

        /* renamed from: c */
        public final Function<? super T, ? extends SingleSource<? extends R>> f61210c = null;

        /* renamed from: i */
        public final ErrorMode f61216i = null;

        /* renamed from: e */
        public final AtomicLong f61212e = new AtomicLong();

        /* renamed from: f */
        public final AtomicThrowable f61213f = new AtomicThrowable();

        /* renamed from: g */
        public final ConcatMapSingleObserver<R> f61214g = new ConcatMapSingleObserver<>(this);

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* renamed from: b */
            public final ConcatMapSingleSubscriber<?, R> f61224b;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.f61224b = concatMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber = this.f61224b;
                if (!ExceptionHelper.m31817a(concatMapSingleSubscriber.f61213f, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (concatMapSingleSubscriber.f61216i != ErrorMode.END) {
                    concatMapSingleSubscriber.f61217j.cancel();
                }
                concatMapSingleSubscriber.f61223p = 0;
                concatMapSingleSubscriber.m31632a();
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber = this.f61224b;
                concatMapSingleSubscriber.f61222o = r;
                concatMapSingleSubscriber.f61223p = 2;
                concatMapSingleSubscriber.m31632a();
            }
        }

        public ConcatMapSingleSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, int i2, ErrorMode errorMode) {
            this.f61209b = subscriber;
            this.f61211d = i2;
            this.f61215h = new SpscArrayQueue(i2);
        }

        /* renamed from: a */
        public void m31632a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f61209b;
            ErrorMode errorMode = this.f61216i;
            SimplePlainQueue<T> simplePlainQueue = this.f61215h;
            AtomicThrowable atomicThrowable = this.f61213f;
            AtomicLong atomicLong = this.f61212e;
            int i2 = this.f61211d;
            int i3 = i2 - (i2 >> 1);
            int i4 = 1;
            while (true) {
                if (this.f61219l) {
                    simplePlainQueue.clear();
                    this.f61222o = null;
                } else {
                    int i5 = this.f61223p;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i5 != 0))) {
                        if (i5 == 0) {
                            boolean z = this.f61218k;
                            T poll = simplePlainQueue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                                if (m31818b == null) {
                                    subscriber.onComplete();
                                    return;
                                } else {
                                    subscriber.onError(m31818b);
                                    return;
                                }
                            }
                            if (!z2) {
                                int i6 = this.f61221n + 1;
                                if (i6 == i3) {
                                    this.f61221n = 0;
                                    this.f61217j.request(i3);
                                } else {
                                    this.f61221n = i6;
                                }
                                try {
                                    SingleSource<? extends R> apply = this.f61210c.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                    SingleSource<? extends R> singleSource = apply;
                                    this.f61223p = 1;
                                    singleSource.mo31385b(this.f61214g);
                                } catch (Throwable th) {
                                    Exceptions.m31402a(th);
                                    this.f61217j.cancel();
                                    simplePlainQueue.clear();
                                    ExceptionHelper.m31817a(atomicThrowable, th);
                                    subscriber.onError(ExceptionHelper.m31818b(atomicThrowable));
                                    return;
                                }
                            }
                        } else if (i5 == 2) {
                            long j2 = this.f61220m;
                            if (j2 != atomicLong.get()) {
                                R r = this.f61222o;
                                this.f61222o = null;
                                subscriber.onNext(r);
                                this.f61220m = j2 + 1;
                                this.f61223p = 0;
                            }
                        }
                    }
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.f61222o = null;
            subscriber.onError(ExceptionHelper.m31818b(atomicThrowable));
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f61219l = true;
            this.f61217j.cancel();
            DisposableHelper.m31409a(this.f61214g);
            if (getAndIncrement() == 0) {
                this.f61215h.clear();
                this.f61222o = null;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f61217j, subscription)) {
                this.f61217j = subscription;
                this.f61209b.mo31352d(this);
                subscription.request(this.f61211d);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61218k = true;
            m31632a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61213f, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61216i == ErrorMode.IMMEDIATE) {
                DisposableHelper.m31409a(this.f61214g);
            }
            this.f61218k = true;
            m31632a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f61215h.offer(t)) {
                m31632a();
            } else {
                this.f61217j.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f61212e, j2);
            m31632a();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new ConcatMapSingleSubscriber(subscriber, null, 0, null);
        throw null;
    }
}
