package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class MaybeFilter<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class FilterMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61029b;

        /* renamed from: c */
        public final Predicate<? super T> f61030c;

        /* renamed from: d */
        public Disposable f61031d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61031d, disposable)) {
                this.f61031d = disposable;
                this.f61029b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            Disposable disposable = this.f61031d;
            this.f61031d = DisposableHelper.DISPOSED;
            disposable.mo31379f();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61029b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61029b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                if (this.f61030c.mo31407b(t)) {
                    this.f61029b.onSuccess(t);
                } else {
                    this.f61029b.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61029b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61031d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
