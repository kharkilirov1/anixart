package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {

    public static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final CompletableObserver f60153b;

        /* renamed from: e */
        public final boolean f60156e;

        /* renamed from: g */
        public final int f60158g;

        /* renamed from: h */
        public Subscription f60159h;

        /* renamed from: i */
        public volatile boolean f60160i;

        /* renamed from: d */
        public final Function<? super T, ? extends CompletableSource> f60155d = null;

        /* renamed from: c */
        public final AtomicThrowable f60154c = new AtomicThrowable();

        /* renamed from: f */
        public final CompositeDisposable f60157f = new CompositeDisposable();

        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public InnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                DisposableHelper.m31409a(this);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.f60157f.mo31394c(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.f60157f.mo31394c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public FlatMapCompletableMainSubscriber(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z, int i2) {
            this.f60153b = completableObserver;
            this.f60156e = z;
            this.f60158g = i2;
            lazySet(1);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60159h, subscription)) {
                this.f60159h = subscription;
                this.f60153b.mo31347a(this);
                int i2 = this.f60158g;
                if (i2 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60160i = true;
            this.f60159h.cancel();
            this.f60157f.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f60158g != Integer.MAX_VALUE) {
                    this.f60159h.request(1L);
                }
            } else {
                Throwable m31818b = ExceptionHelper.m31818b(this.f60154c);
                if (m31818b != null) {
                    this.f60153b.onError(m31818b);
                } else {
                    this.f60153b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f60154c, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f60156e) {
                mo31379f();
                if (getAndSet(0) > 0) {
                    this.f60153b.onError(ExceptionHelper.m31818b(this.f60154c));
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f60153b.onError(ExceptionHelper.m31818b(this.f60154c));
            } else if (this.f60158g != Integer.MAX_VALUE) {
                this.f60159h.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                CompletableSource apply = this.f60155d.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = apply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f60160i || !this.f60157f.mo31393b(innerObserver)) {
                    return;
                }
                completableSource.mo31345b(innerObserver);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60159h.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60157f.f59605c;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new FlatMapCompletableMainSubscriber(completableObserver, null, false, 0);
        throw null;
    }
}
