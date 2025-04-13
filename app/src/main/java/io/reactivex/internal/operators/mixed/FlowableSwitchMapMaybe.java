package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
public final class FlowableSwitchMapMaybe<T, R> extends Flowable<R> {

    public static final class SwitchMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: l */
        public static final SwitchMapMaybeObserver<Object> f61234l = new SwitchMapMaybeObserver<>(null);

        /* renamed from: b */
        public final Subscriber<? super R> f61235b;

        /* renamed from: d */
        public final boolean f61237d;

        /* renamed from: h */
        public Subscription f61241h;

        /* renamed from: i */
        public volatile boolean f61242i;

        /* renamed from: j */
        public volatile boolean f61243j;

        /* renamed from: k */
        public long f61244k;

        /* renamed from: c */
        public final Function<? super T, ? extends MaybeSource<? extends R>> f61236c = null;

        /* renamed from: e */
        public final AtomicThrowable f61238e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicLong f61239f = new AtomicLong();

        /* renamed from: g */
        public final AtomicReference<SwitchMapMaybeObserver<R>> f61240g = new AtomicReference<>();

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {

            /* renamed from: b */
            public final SwitchMapMaybeSubscriber<?, R> f61245b;

            /* renamed from: c */
            public volatile R f61246c;

            public SwitchMapMaybeObserver(SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber) {
                this.f61245b = switchMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            /* renamed from: a */
            public void mo31355a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber = this.f61245b;
                if (switchMapMaybeSubscriber.f61240g.compareAndSet(this, null)) {
                    switchMapMaybeSubscriber.m31634b();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                SwitchMapMaybeSubscriber<?, R> switchMapMaybeSubscriber = this.f61245b;
                if (!switchMapMaybeSubscriber.f61240g.compareAndSet(this, null) || !ExceptionHelper.m31817a(switchMapMaybeSubscriber.f61238e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (!switchMapMaybeSubscriber.f61237d) {
                    switchMapMaybeSubscriber.f61241h.cancel();
                    switchMapMaybeSubscriber.m31633a();
                }
                switchMapMaybeSubscriber.m31634b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                this.f61246c = r;
                this.f61245b.m31634b();
            }
        }

        public SwitchMapMaybeSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.f61235b = subscriber;
            this.f61237d = z;
        }

        /* renamed from: a */
        public void m31633a() {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f61240g;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = f61234l;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver2 = (SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            DisposableHelper.m31409a(switchMapMaybeObserver2);
        }

        /* renamed from: b */
        public void m31634b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f61235b;
            AtomicThrowable atomicThrowable = this.f61238e;
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.f61240g;
            AtomicLong atomicLong = this.f61239f;
            long j2 = this.f61244k;
            int i2 = 1;
            while (!this.f61243j) {
                if (atomicThrowable.get() != null && !this.f61237d) {
                    subscriber.onError(ExceptionHelper.m31818b(atomicThrowable));
                    return;
                }
                boolean z = this.f61242i;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                boolean z2 = switchMapMaybeObserver == null;
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
                if (z2 || switchMapMaybeObserver.f61246c == null || j2 == atomicLong.get()) {
                    this.f61244k = j2;
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    atomicReference.compareAndSet(switchMapMaybeObserver, null);
                    subscriber.onNext(switchMapMaybeObserver.f61246c);
                    j2++;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f61243j = true;
            this.f61241h.cancel();
            m31633a();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f61241h, subscription)) {
                this.f61241h = subscription;
                this.f61235b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61242i = true;
            m31634b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61238e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f61237d) {
                m31633a();
            }
            this.f61242i = true;
            m31634b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.f61240g.get();
            if (switchMapMaybeObserver2 != null) {
                DisposableHelper.m31409a(switchMapMaybeObserver2);
            }
            try {
                MaybeSource<? extends R> apply = this.f61236c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = apply;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = new SwitchMapMaybeObserver<>(this);
                do {
                    switchMapMaybeObserver = this.f61240g.get();
                    if (switchMapMaybeObserver == f61234l) {
                        return;
                    }
                } while (!this.f61240g.compareAndSet(switchMapMaybeObserver, switchMapMaybeObserver3));
                maybeSource.mo31353b(switchMapMaybeObserver3);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61241h.cancel();
                this.f61240g.getAndSet(f61234l);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            BackpressureHelper.m31808a(this.f61239f, j2);
            m31634b();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new SwitchMapMaybeSubscriber(subscriber, null, false);
        throw null;
    }
}
