package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableResumeNext extends Completable {

    public static final class ResumeNextObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59755b;

        /* renamed from: c */
        public final Function<? super Throwable, ? extends CompletableSource> f59756c = null;

        /* renamed from: d */
        public boolean f59757d;

        public ResumeNextObserver(CompletableObserver completableObserver, Function<? super Throwable, ? extends CompletableSource> function) {
            this.f59755b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            DisposableHelper.m31411c(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59755b.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            if (this.f59757d) {
                this.f59755b.onError(th);
                return;
            }
            this.f59757d = true;
            try {
                CompletableSource apply = this.f59756c.apply(th);
                Objects.requireNonNull(apply, "The errorMapper returned a null CompletableSource");
                apply.mo31345b(this);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f59755b.onError(new CompositeException(th, th2));
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
        completableObserver.mo31347a(new ResumeNextObserver(completableObserver, null));
        throw null;
    }
}
