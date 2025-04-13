package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class SingleEquals<T> extends Single<Boolean> {

    public static class InnerObserver<T> implements SingleObserver<T> {

        /* renamed from: b */
        public final int f62495b;

        /* renamed from: c */
        public final CompositeDisposable f62496c;

        /* renamed from: d */
        public final Object[] f62497d;

        /* renamed from: e */
        public final SingleObserver<? super Boolean> f62498e;

        /* renamed from: f */
        public final AtomicInteger f62499f;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            this.f62496c.mo31393b(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            int i2;
            do {
                i2 = this.f62499f.get();
                if (i2 >= 2) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
            } while (!this.f62499f.compareAndSet(i2, 2));
            this.f62496c.mo31379f();
            this.f62498e.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62497d[this.f62495b] = t;
            if (this.f62499f.incrementAndGet() == 2) {
                SingleObserver<? super Boolean> singleObserver = this.f62498e;
                Object[] objArr = this.f62497d;
                singleObserver.onSuccess(Boolean.valueOf(ObjectHelper.m31426b(objArr[0], objArr[1])));
            }
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        new AtomicInteger();
        singleObserver.mo31388a(new CompositeDisposable());
        throw null;
    }
}
