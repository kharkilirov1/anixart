package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeEqualSingle<T> extends Single<Boolean> {

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Boolean> f61023b;

        /* renamed from: c */
        public final EqualObserver<T> f61024c;

        /* renamed from: d */
        public final EqualObserver<T> f61025d;

        /* renamed from: e */
        public final BiPredicate<? super T, ? super T> f61026e;

        public EqualCoordinator(SingleObserver<? super Boolean> singleObserver, BiPredicate<? super T, ? super T> biPredicate) {
            super(2);
            this.f61023b = singleObserver;
            this.f61026e = null;
            this.f61024c = new EqualObserver<>(this);
            this.f61025d = new EqualObserver<>(this);
        }

        /* renamed from: a */
        public void m31618a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f61024c.f61028c;
                Object obj2 = this.f61025d.f61028c;
                if (obj == null || obj2 == null) {
                    this.f61023b.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    this.f61023b.onSuccess(Boolean.valueOf(this.f61026e.mo31404a(obj, obj2)));
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f61023b.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61024c);
            DisposableHelper.m31409a(this.f61025d);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61024c.get());
        }
    }

    public static final class EqualObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* renamed from: b */
        public final EqualCoordinator<T> f61027b;

        /* renamed from: c */
        public Object f61028c;

        public EqualObserver(EqualCoordinator<T> equalCoordinator) {
            this.f61027b = equalCoordinator;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61027b.m31618a();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            EqualCoordinator<T> equalCoordinator = this.f61027b;
            if (equalCoordinator.getAndSet(0) <= 0) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            EqualObserver<T> equalObserver = equalCoordinator.f61024c;
            if (this == equalObserver) {
                DisposableHelper.m31409a(equalCoordinator.f61025d);
            } else {
                DisposableHelper.m31409a(equalObserver);
            }
            equalCoordinator.f61023b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61028c = t;
            this.f61027b.m31618a();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        singleObserver.mo31388a(new EqualCoordinator(singleObserver, null));
        throw null;
    }
}
