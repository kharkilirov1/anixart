package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {

    public static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: i */
        public static final SwitchMapInnerObserver f61225i = new SwitchMapInnerObserver(null);

        /* renamed from: b */
        public final CompletableObserver f61226b;

        /* renamed from: d */
        public final boolean f61228d;

        /* renamed from: g */
        public volatile boolean f61231g;

        /* renamed from: h */
        public Subscription f61232h;

        /* renamed from: c */
        public final Function<? super T, ? extends CompletableSource> f61227c = null;

        /* renamed from: e */
        public final AtomicThrowable f61229e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicReference<SwitchMapInnerObserver> f61230f = new AtomicReference<>();

        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final SwitchMapCompletableObserver<?> f61233b;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.f61233b = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.f61233b;
                if (switchMapCompletableObserver.f61230f.compareAndSet(this, null) && switchMapCompletableObserver.f61231g) {
                    Throwable m31818b = ExceptionHelper.m31818b(switchMapCompletableObserver.f61229e);
                    if (m31818b == null) {
                        switchMapCompletableObserver.f61226b.onComplete();
                    } else {
                        switchMapCompletableObserver.f61226b.onError(m31818b);
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.f61233b;
                if (!switchMapCompletableObserver.f61230f.compareAndSet(this, null) || !ExceptionHelper.m31817a(switchMapCompletableObserver.f61229e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (switchMapCompletableObserver.f61228d) {
                    if (switchMapCompletableObserver.f61231g) {
                        switchMapCompletableObserver.f61226b.onError(ExceptionHelper.m31818b(switchMapCompletableObserver.f61229e));
                        return;
                    }
                    return;
                }
                switchMapCompletableObserver.mo31379f();
                Throwable m31818b = ExceptionHelper.m31818b(switchMapCompletableObserver.f61229e);
                if (m31818b != ExceptionHelper.f62793a) {
                    switchMapCompletableObserver.f61226b.onError(m31818b);
                }
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f61226b = completableObserver;
            this.f61228d = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f61232h, subscription)) {
                this.f61232h = subscription;
                this.f61226b.mo31347a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61232h.cancel();
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f61230f;
            SwitchMapInnerObserver switchMapInnerObserver = f61225i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.m31409a(andSet);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61231g = true;
            if (this.f61230f.get() == null) {
                Throwable m31818b = ExceptionHelper.m31818b(this.f61229e);
                if (m31818b == null) {
                    this.f61226b.onComplete();
                } else {
                    this.f61226b.onError(m31818b);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61229e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61228d) {
                onComplete();
                return;
            }
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f61230f;
            SwitchMapInnerObserver switchMapInnerObserver = f61225i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet != null && andSet != switchMapInnerObserver) {
                DisposableHelper.m31409a(andSet);
            }
            Throwable m31818b = ExceptionHelper.m31818b(this.f61229e);
            if (m31818b != ExceptionHelper.f62793a) {
                this.f61226b.onError(m31818b);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                CompletableSource apply = this.f61227c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = apply;
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.f61230f.get();
                    if (switchMapInnerObserver == f61225i) {
                        return;
                    }
                } while (!this.f61230f.compareAndSet(switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    DisposableHelper.m31409a(switchMapInnerObserver);
                }
                completableSource.mo31345b(switchMapInnerObserver2);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61232h.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61230f.get() == f61225i;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new SwitchMapCompletableObserver(completableObserver, null, false);
        throw null;
    }
}
