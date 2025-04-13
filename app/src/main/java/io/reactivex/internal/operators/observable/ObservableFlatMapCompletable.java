package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableFlatMapCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f61659b;

        /* renamed from: e */
        public final boolean f61662e;

        /* renamed from: g */
        public Disposable f61664g;

        /* renamed from: h */
        public volatile boolean f61665h;

        /* renamed from: d */
        public final Function<? super T, ? extends CompletableSource> f61661d = null;

        /* renamed from: c */
        public final AtomicThrowable f61660c = new AtomicThrowable();

        /* renamed from: f */
        public final CompositeDisposable f61663f = new CompositeDisposable();

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
                flatMapCompletableMainObserver.f61663f.mo31394c(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.f61663f.mo31394c(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public FlatMapCompletableMainObserver(Observer<? super T> observer, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f61659b = observer;
            this.f61662e = z;
            lazySet(1);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return i2 & 2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61664g, disposable)) {
                this.f61664g = disposable;
                this.f61659b.mo31373a(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61665h = true;
            this.f61664g.mo31379f();
            this.f61663f.mo31379f();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable m31818b = ExceptionHelper.m31818b(this.f61660c);
                if (m31818b != null) {
                    this.f61659b.onError(m31818b);
                } else {
                    this.f61659b.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61660c, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61662e) {
                if (decrementAndGet() == 0) {
                    this.f61659b.onError(ExceptionHelper.m31818b(this.f61660c));
                    return;
                }
                return;
            }
            mo31379f();
            if (getAndSet(0) > 0) {
                this.f61659b.onError(ExceptionHelper.m31818b(this.f61660c));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                CompletableSource apply = this.f61661d.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = apply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f61665h || !this.f61663f.mo31393b(innerObserver)) {
                    return;
                }
                completableSource.mo31345b(innerObserver);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61664g.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61664g.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new FlatMapCompletableMainObserver(observer, null, false));
    }
}
