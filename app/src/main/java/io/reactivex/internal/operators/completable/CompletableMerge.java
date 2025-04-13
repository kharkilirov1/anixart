package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class CompletableMerge extends Completable {

    public static final class CompletableMergeSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59730b;

        /* renamed from: c */
        public final int f59731c;

        /* renamed from: d */
        public final boolean f59732d;

        /* renamed from: g */
        public Subscription f59735g;

        /* renamed from: f */
        public final CompositeDisposable f59734f = new CompositeDisposable();

        /* renamed from: e */
        public final AtomicThrowable f59733e = new AtomicThrowable();

        public final class MergeInnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public MergeInnerObserver() {
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
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                completableMergeSubscriber.f59734f.mo31394c(this);
                if (completableMergeSubscriber.decrementAndGet() != 0) {
                    if (completableMergeSubscriber.f59731c != Integer.MAX_VALUE) {
                        completableMergeSubscriber.f59735g.request(1L);
                    }
                } else {
                    Throwable th = completableMergeSubscriber.f59733e.get();
                    if (th != null) {
                        completableMergeSubscriber.f59730b.onError(th);
                    } else {
                        completableMergeSubscriber.f59730b.onComplete();
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                CompletableMergeSubscriber completableMergeSubscriber = CompletableMergeSubscriber.this;
                completableMergeSubscriber.f59734f.mo31394c(this);
                if (!completableMergeSubscriber.f59732d) {
                    completableMergeSubscriber.f59735g.cancel();
                    completableMergeSubscriber.f59734f.mo31379f();
                    if (!ExceptionHelper.m31817a(completableMergeSubscriber.f59733e, th)) {
                        RxJavaPlugins.m31848b(th);
                        return;
                    } else {
                        if (completableMergeSubscriber.getAndSet(0) > 0) {
                            completableMergeSubscriber.f59730b.onError(ExceptionHelper.m31818b(completableMergeSubscriber.f59733e));
                            return;
                        }
                        return;
                    }
                }
                if (!ExceptionHelper.m31817a(completableMergeSubscriber.f59733e, th)) {
                    RxJavaPlugins.m31848b(th);
                } else if (completableMergeSubscriber.decrementAndGet() == 0) {
                    completableMergeSubscriber.f59730b.onError(ExceptionHelper.m31818b(completableMergeSubscriber.f59733e));
                } else if (completableMergeSubscriber.f59731c != Integer.MAX_VALUE) {
                    completableMergeSubscriber.f59735g.request(1L);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public CompletableMergeSubscriber(CompletableObserver completableObserver, int i2, boolean z) {
            this.f59730b = completableObserver;
            this.f59731c = i2;
            this.f59732d = z;
            lazySet(1);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59735g, subscription)) {
                this.f59735g = subscription;
                this.f59730b.mo31347a(this);
                int i2 = this.f59731c;
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
            this.f59735g.cancel();
            this.f59734f.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (decrementAndGet() == 0) {
                if (this.f59733e.get() != null) {
                    this.f59730b.onError(ExceptionHelper.m31818b(this.f59733e));
                } else {
                    this.f59730b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59732d) {
                if (!ExceptionHelper.m31817a(this.f59733e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                } else {
                    if (decrementAndGet() == 0) {
                        this.f59730b.onError(ExceptionHelper.m31818b(this.f59733e));
                        return;
                    }
                    return;
                }
            }
            this.f59734f.mo31379f();
            if (!ExceptionHelper.m31817a(this.f59733e, th)) {
                RxJavaPlugins.m31848b(th);
            } else if (getAndSet(0) > 0) {
                this.f59730b.onError(ExceptionHelper.m31818b(this.f59733e));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            getAndIncrement();
            MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
            this.f59734f.mo31393b(mergeInnerObserver);
            ((CompletableSource) obj).mo31345b(mergeInnerObserver);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59734f.f59605c;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new CompletableMergeSubscriber(completableObserver, 0, false);
        throw null;
    }
}
