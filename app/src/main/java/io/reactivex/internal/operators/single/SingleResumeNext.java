package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleResumeNext<T> extends Single<T> {

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62548b;

        /* renamed from: c */
        public final Function<? super Throwable, ? extends SingleSource<? extends T>> f62549c = null;

        public ResumeMainSingleObserver(SingleObserver<? super T> singleObserver, Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
            this.f62548b = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f62548b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            try {
                SingleSource<? extends T> apply = this.f62549c.apply(th);
                Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                apply.mo31385b(new ResumeSingleObserver(this, this.f62548b));
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f62548b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62548b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        new ResumeMainSingleObserver(singleObserver, null);
        throw null;
    }
}
