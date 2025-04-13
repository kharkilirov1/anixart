package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends Completable implements FuseToObservable<T> {

    public static final class FlatMapCompletableMainObserver<T> extends AtomicInteger implements Disposable, Observer<T> {

        /* renamed from: b */
        public final CompletableObserver f61667b;

        /* renamed from: e */
        public final boolean f61670e;

        /* renamed from: g */
        public Disposable f61672g;

        /* renamed from: h */
        public volatile boolean f61673h;

        /* renamed from: d */
        public final Function<? super T, ? extends CompletableSource> f61669d = null;

        /* renamed from: c */
        public final AtomicThrowable f61668c = new AtomicThrowable();

        /* renamed from: f */
        public final CompositeDisposable f61671f = new CompositeDisposable();

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
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.f61671f.mo31394c(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.f61671f.mo31394c(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public FlatMapCompletableMainObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f61667b = completableObserver;
            this.f61670e = z;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61672g, disposable)) {
                this.f61672g = disposable;
                this.f61667b.mo31347a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61673h = true;
            this.f61672g.mo31379f();
            this.f61671f.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable m31818b = ExceptionHelper.m31818b(this.f61668c);
                if (m31818b != null) {
                    this.f61667b.onError(m31818b);
                } else {
                    this.f61667b.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61668c, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61670e) {
                if (decrementAndGet() == 0) {
                    this.f61667b.onError(ExceptionHelper.m31818b(this.f61668c));
                    return;
                }
                return;
            }
            mo31379f();
            if (getAndSet(0) > 0) {
                this.f61667b.onError(ExceptionHelper.m31818b(this.f61668c));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                CompletableSource apply = this.f61669d.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = apply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f61673h || !this.f61671f.mo31393b(innerObserver)) {
                    return;
                }
                completableSource.mo31345b(innerObserver);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61672g.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61672g.mo31380s();
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new FlatMapCompletableMainObserver(completableObserver, null, false);
        throw null;
    }
}
