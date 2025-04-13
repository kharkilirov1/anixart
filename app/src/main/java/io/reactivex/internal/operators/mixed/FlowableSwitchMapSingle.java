package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
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
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {

    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: l */
        public static final SwitchMapSingleObserver<Object> f61247l = new SwitchMapSingleObserver<>(null);

        /* renamed from: b */
        public final Subscriber<? super R> f61248b;

        /* renamed from: d */
        public final boolean f61250d;

        /* renamed from: h */
        public Subscription f61254h;

        /* renamed from: i */
        public volatile boolean f61255i;

        /* renamed from: j */
        public volatile boolean f61256j;

        /* renamed from: k */
        public long f61257k;

        /* renamed from: c */
        public final Function<? super T, ? extends SingleSource<? extends R>> f61249c = null;

        /* renamed from: e */
        public final AtomicThrowable f61251e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicLong f61252f = new AtomicLong();

        /* renamed from: g */
        public final AtomicReference<SwitchMapSingleObserver<R>> f61253g = new AtomicReference<>();

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* renamed from: b */
            public final SwitchMapSingleSubscriber<?, R> f61258b;

            /* renamed from: c */
            public volatile R f61259c;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.f61258b = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber = this.f61258b;
                if (!switchMapSingleSubscriber.f61253g.compareAndSet(this, null) || !ExceptionHelper.m31817a(switchMapSingleSubscriber.f61251e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!switchMapSingleSubscriber.f61250d) {
                    switchMapSingleSubscriber.f61254h.cancel();
                    switchMapSingleSubscriber.m31635a();
                }
                switchMapSingleSubscriber.m31636b();
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.f61259c = r;
                this.f61258b.m31636b();
            }
        }

        public SwitchMapSingleSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.f61248b = subscriber;
            this.f61250d = z;
        }

        /* renamed from: a */
        public void m31635a() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f61253g;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = f61247l;
            SwitchMapSingleObserver<Object> switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.m31409a(switchMapSingleObserver2);
        }

        /* renamed from: b */
        public void m31636b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f61248b;
            AtomicThrowable atomicThrowable = this.f61251e;
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.f61253g;
            AtomicLong atomicLong = this.f61252f;
            long j2 = this.f61257k;
            int i2 = 1;
            while (!this.f61256j) {
                if (atomicThrowable.get() != null && !this.f61250d) {
                    subscriber.onError(ExceptionHelper.m31818b(atomicThrowable));
                    return;
                }
                boolean z = this.f61255i;
                SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
                if (z && z2) {
                    Throwable m31818b = ExceptionHelper.m31818b(atomicThrowable);
                    if (m31818b != null) {
                        subscriber.onError(m31818b);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (z2 || switchMapSingleObserver.f61259c == null || j2 == atomicLong.get()) {
                    this.f61257k = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    atomicReference.compareAndSet(switchMapSingleObserver, null);
                    subscriber.onNext(switchMapSingleObserver.f61259c);
                    j2++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f61256j = true;
            this.f61254h.cancel();
            m31635a();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f61254h, subscription)) {
                this.f61254h = subscription;
                this.f61248b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61255i = true;
            m31636b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61251e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f61250d) {
                m31635a();
            }
            this.f61255i = true;
            m31636b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.f61253g.get();
            if (switchMapSingleObserver2 != null) {
                DisposableHelper.m31409a(switchMapSingleObserver2);
            }
            try {
                SingleSource<? extends R> apply = this.f61249c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = apply;
                SwitchMapSingleObserver<R> switchMapSingleObserver3 = new SwitchMapSingleObserver<>(this);
                do {
                    switchMapSingleObserver = this.f61253g.get();
                    if (switchMapSingleObserver == f61247l) {
                        return;
                    }
                } while (!this.f61253g.compareAndSet(switchMapSingleObserver, switchMapSingleObserver3));
                singleSource.mo31385b(switchMapSingleObserver3);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61254h.cancel();
                this.f61253g.getAndSet(f61247l);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f61252f, j2);
            m31636b();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new SwitchMapSingleSubscriber(subscriber, null, false);
        throw null;
    }
}
