package io.reactivex.internal.operators.single;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleFlatMapCompletable<T> extends Completable {

    public static final class FlatMapCompletableObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, CompletableObserver, Disposable {

        /* renamed from: b */
        public final CompletableObserver f62504b;

        /* renamed from: c */
        public final Function<? super T, ? extends CompletableSource> f62505c = null;

        public FlatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function) {
            this.f62504b = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31411c(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f62504b.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62504b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                CompletableSource apply = this.f62505c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = apply;
                if (mo31380s()) {
                    return;
                }
                completableSource.mo31345b(this);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62504b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        completableObserver.mo31347a(new FlatMapCompletableObserver(completableObserver, null));
        throw null;
    }
}
