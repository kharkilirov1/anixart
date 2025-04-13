package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeZipArray<T, R> extends Maybe<R> {

    public final class SingletonArrayFunc implements Function<T, R> {

        /* renamed from: b */
        public final /* synthetic */ MaybeZipArray f61166b;

        @Override // io.reactivex.functions.Function
        public R apply(T t) throws Exception {
            Objects.requireNonNull(this.f61166b);
            throw null;
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super R> f61167b;

        /* renamed from: c */
        public final Function<? super Object[], ? extends R> f61168c;

        /* renamed from: d */
        public final ZipMaybeObserver<T>[] f61169d;

        /* renamed from: e */
        public final Object[] f61170e;

        /* renamed from: a */
        public void m31629a(int i2) {
            ZipMaybeObserver<T>[] zipMaybeObserverArr = this.f61169d;
            int length = zipMaybeObserverArr.length;
            for (int i3 = 0; i3 < i2; i3++) {
                DisposableHelper.m31409a(zipMaybeObserverArr[i3]);
            }
            while (true) {
                i2++;
                if (i2 >= length) {
                    return;
                } else {
                    DisposableHelper.m31409a(zipMaybeObserverArr[i2]);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver<T> zipMaybeObserver : this.f61169d) {
                    DisposableHelper.m31409a(zipMaybeObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() <= 0;
        }
    }

    public static final class ZipMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* renamed from: b */
        public final ZipCoordinator<T, ?> f61171b;

        /* renamed from: c */
        public final int f61172c;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            ZipCoordinator<T, ?> zipCoordinator = this.f61171b;
            int i2 = this.f61172c;
            if (zipCoordinator.getAndSet(0) > 0) {
                zipCoordinator.m31629a(i2);
                zipCoordinator.f61167b.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            ZipCoordinator<T, ?> zipCoordinator = this.f61171b;
            int i2 = this.f61172c;
            if (zipCoordinator.getAndSet(0) <= 0) {
                RxJavaPlugins.m31848b(th);
            } else {
                zipCoordinator.m31629a(i2);
                zipCoordinator.f61167b.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            ZipCoordinator<T, ?> zipCoordinator = this.f61171b;
            zipCoordinator.f61170e[this.f61172c] = t;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object apply = zipCoordinator.f61168c.apply(zipCoordinator.f61170e);
                    Objects.requireNonNull(apply, "The zipper returned a null value");
                    zipCoordinator.f61167b.onSuccess(apply);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    zipCoordinator.f61167b.onError(th);
                }
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super R> maybeObserver) {
        throw null;
    }
}
