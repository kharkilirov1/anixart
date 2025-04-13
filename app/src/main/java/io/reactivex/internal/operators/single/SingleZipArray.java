package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleZipArray<T, R> extends Single<R> {

    public final class SingletonArrayFunc implements Function<T, R> {

        /* renamed from: b */
        public final /* synthetic */ SingleZipArray f62577b;

        @Override // io.reactivex.functions.Function
        public R apply(T t) throws Exception {
            Objects.requireNonNull(this.f62577b);
            throw null;
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final SingleObserver<? super R> f62578b;

        /* renamed from: c */
        public final Function<? super Object[], ? extends R> f62579c;

        /* renamed from: d */
        public final ZipSingleObserver<T>[] f62580d;

        /* renamed from: e */
        public final Object[] f62581e;

        /* renamed from: a */
        public void m31762a(Throwable th, int i2) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            ZipSingleObserver<T>[] zipSingleObserverArr = this.f62580d;
            int length = zipSingleObserverArr.length;
            for (int i3 = 0; i3 < i2; i3++) {
                DisposableHelper.m31409a(zipSingleObserverArr[i3]);
            }
            while (true) {
                i2++;
                if (i2 >= length) {
                    this.f62578b.onError(th);
                    return;
                }
                DisposableHelper.m31409a(zipSingleObserverArr[i2]);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> zipSingleObserver : this.f62580d) {
                    DisposableHelper.m31409a(zipSingleObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() <= 0;
        }
    }

    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

        /* renamed from: b */
        public final ZipCoordinator<T, ?> f62582b;

        /* renamed from: c */
        public final int f62583c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62582b.m31762a(th, this.f62583c);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            ZipCoordinator<T, ?> zipCoordinator = this.f62582b;
            zipCoordinator.f62581e[this.f62583c] = t;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object apply = zipCoordinator.f62579c.apply(zipCoordinator.f62581e);
                    Objects.requireNonNull(apply, "The zipper returned a null value");
                    zipCoordinator.f62578b.onSuccess(apply);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    zipCoordinator.f62578b.onError(th);
                }
            }
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super R> singleObserver) {
        throw null;
    }
}
