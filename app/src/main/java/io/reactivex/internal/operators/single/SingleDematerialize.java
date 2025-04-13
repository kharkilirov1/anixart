package io.reactivex.internal.operators.single;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;

@Experimental
/* loaded from: classes3.dex */
public final class SingleDematerialize<T, R> extends Maybe<R> {

    public static final class DematerializeObserver<T, R> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super R> f62464b;

        /* renamed from: c */
        public final Function<? super T, Notification<R>> f62465c;

        /* renamed from: d */
        public Disposable f62466d;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62466d, disposable)) {
                this.f62466d = disposable;
                this.f62464b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62466d.mo31379f();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62464b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                Notification<R> apply = this.f62465c.apply(t);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                Notification<R> notification = apply;
                if (notification.m31360e()) {
                    this.f62464b.onSuccess(notification.m31357b());
                } else if (notification.m31358c()) {
                    this.f62464b.onComplete();
                } else {
                    this.f62464b.onError(notification.m31356a());
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62464b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62466d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super R> maybeObserver) {
        throw null;
    }
}
