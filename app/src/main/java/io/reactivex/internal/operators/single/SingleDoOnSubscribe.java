package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {

    /* renamed from: b */
    public final SingleSource<T> f62486b;

    /* renamed from: c */
    public final Consumer<? super Disposable> f62487c;

    public static final class DoOnSubscribeSingleObserver<T> implements SingleObserver<T> {

        /* renamed from: b */
        public final SingleObserver<? super T> f62488b;

        /* renamed from: c */
        public final Consumer<? super Disposable> f62489c;

        /* renamed from: d */
        public boolean f62490d;

        public DoOnSubscribeSingleObserver(SingleObserver<? super T> singleObserver, Consumer<? super Disposable> consumer) {
            this.f62488b = singleObserver;
            this.f62489c = consumer;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            try {
                this.f62489c.accept(disposable);
                this.f62488b.mo31388a(disposable);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62490d = true;
                disposable.mo31379f();
                EmptyDisposable.m31419h(th, this.f62488b);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            if (this.f62490d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62488b.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            if (this.f62490d) {
                return;
            }
            this.f62488b.onSuccess(t);
        }
    }

    public SingleDoOnSubscribe(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f62486b = singleSource;
        this.f62487c = consumer;
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        this.f62486b.mo31385b(new DoOnSubscribeSingleObserver(singleObserver, this.f62487c));
    }
}
