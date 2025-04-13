package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {

    public static final class ConcatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f61193b;

        /* renamed from: d */
        public final int f61195d;

        /* renamed from: h */
        public final SimplePlainQueue<T> f61199h;

        /* renamed from: j */
        public Subscription f61201j;

        /* renamed from: k */
        public volatile boolean f61202k;

        /* renamed from: l */
        public volatile boolean f61203l;

        /* renamed from: m */
        public long f61204m;

        /* renamed from: n */
        public int f61205n;

        /* renamed from: o */
        public R f61206o;

        /* renamed from: p */
        public volatile int f61207p;

        /* renamed from: c */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f61194c = null;

        /* renamed from: i */
        public final ErrorMode f61200i = null;

        /* renamed from: e */
        public final AtomicLong f61196e = new AtomicLong();

        /* renamed from: f */
        public final AtomicThrowable f61197f = new AtomicThrowable();

        /* renamed from: g */
        public final ConcatMapMaybeObserver<R> f61198g = new ConcatMapMaybeObserver<>(this);

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* renamed from: b */
            public final ConcatMapMaybeSubscriber<?, R> f61208b;

            public ConcatMapMaybeObserver(ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber) {
                this.f61208b = concatMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber = this.f61208b;
                concatMapMaybeSubscriber.f61207p = 0;
                concatMapMaybeSubscriber.m31631a();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber = this.f61208b;
                if (!ExceptionHelper.m31817a(concatMapMaybeSubscriber.f61197f, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (concatMapMaybeSubscriber.f61200i != ErrorMode.END) {
                    concatMapMaybeSubscriber.f61201j.cancel();
                }
                concatMapMaybeSubscriber.f61207p = 0;
                concatMapMaybeSubscriber.m31631a();
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber = this.f61208b;
                concatMapMaybeSubscriber.f61206o = r;
                concatMapMaybeSubscriber.f61207p = 2;
                concatMapMaybeSubscriber.m31631a();
            }
        }

        public ConcatMapMaybeSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, int i2, ErrorMode errorMode) {
            this.f61193b = subscriber;
            this.f61195d = i2;
            this.f61199h = new SpscArrayQueue(i2);
        }

        /* renamed from: a */
        public void m31631a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f61193b;
            ErrorMode errorMode = this.f61200i;
            SimplePlainQueue<T> simplePlainQueue = this.f61199h;
            AtomicThrowable atomicThrowable = this.f61197f;
            AtomicLong atomicLong = this.f61196e;
            int i2 = this.f61195d;
            int i3 = i2 - (i2 >> 1);
            int i4 = 1;
            while (true) {
                if (this.f61203l) {
                    simplePlainQueue.clear();
                    this.f61206o = null;
                } else {
                    int i5 = this.f61207p;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i5 != 0))) {
                        if (i5 == 0) {
                            boolean z = this.f61202k;
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
                                int i6 = this.f61205n + 1;
                                if (i6 == i3) {
                                    this.f61205n = 0;
                                    this.f61201j.request(i3);
                                } else {
                                    this.f61205n = i6;
                                }
                                try {
                                    MaybeSource<? extends R> apply = this.f61194c.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                                    MaybeSource<? extends R> maybeSource = apply;
                                    this.f61207p = 1;
                                    maybeSource.mo31353b(this.f61198g);
                                } catch (Throwable th) {
                                    Exceptions.m31402a(th);
                                    this.f61201j.cancel();
                                    simplePlainQueue.clear();
                                    ExceptionHelper.m31817a(atomicThrowable, th);
                                    subscriber.onError(ExceptionHelper.m31818b(atomicThrowable));
                                    return;
                                }
                            }
                        } else if (i5 == 2) {
                            long j2 = this.f61204m;
                            if (j2 != atomicLong.get()) {
                                R r = this.f61206o;
                                this.f61206o = null;
                                subscriber.onNext(r);
                                this.f61204m = j2 + 1;
                                this.f61207p = 0;
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
            this.f61206o = null;
            subscriber.onError(ExceptionHelper.m31818b(atomicThrowable));
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f61203l = true;
            this.f61201j.cancel();
            DisposableHelper.m31409a(this.f61198g);
            if (getAndIncrement() == 0) {
                this.f61199h.clear();
                this.f61206o = null;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f61201j, subscription)) {
                this.f61201j = subscription;
                this.f61193b.mo31352d(this);
                subscription.request(this.f61195d);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61202k = true;
            m31631a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61197f, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61200i == ErrorMode.IMMEDIATE) {
                DisposableHelper.m31409a(this.f61198g);
            }
            this.f61202k = true;
            m31631a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f61199h.offer(t)) {
                m31631a();
            } else {
                this.f61201j.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f61196e, j2);
            m31631a();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new ConcatMapMaybeSubscriber(subscriber, null, 0, null);
        throw null;
    }
}
