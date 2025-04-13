package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class MaybeFilterSingle<T> extends Maybe<T> {

    public static final class FilterMaybeObserver<T> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61032b;

        /* renamed from: c */
        public final Predicate<? super T> f61033c;

        /* renamed from: d */
        public Disposable f61034d;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61034d, disposable)) {
                this.f61034d = disposable;
                this.f61032b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            Disposable disposable = this.f61034d;
            this.f61034d = DisposableHelper.DISPOSED;
            disposable.mo31379f();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f61032b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                if (this.f61033c.mo31407b(t)) {
                    this.f61032b.onSuccess(t);
                } else {
                    this.f61032b.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61032b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61034d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
