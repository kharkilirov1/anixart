package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableDematerialize<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class DematerializeObserver<T, R> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61585b;

        /* renamed from: c */
        public final Function<? super T, ? extends Notification<R>> f61586c = null;

        /* renamed from: d */
        public boolean f61587d;

        /* renamed from: e */
        public Disposable f61588e;

        public DematerializeObserver(Observer<? super R> observer, Function<? super T, ? extends Notification<R>> function) {
            this.f61585b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61588e, disposable)) {
                this.f61588e = disposable;
                this.f61585b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61588e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61587d) {
                return;
            }
            this.f61587d = true;
            this.f61585b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61587d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61587d = true;
                this.f61585b.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61587d) {
                if (t instanceof Notification) {
                    Notification notification = (Notification) t;
                    if (notification.m31359d()) {
                        RxJavaPlugins.m31848b(notification.m31356a());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification<R> apply = this.f61586c.apply(t);
                Objects.requireNonNull(apply, "The selector returned a null Notification");
                Notification<R> notification2 = apply;
                if (notification2.m31359d()) {
                    this.f61588e.mo31379f();
                    onError(notification2.m31356a());
                } else if (!notification2.m31358c()) {
                    this.f61585b.onNext(notification2.m31357b());
                } else {
                    this.f61588e.mo31379f();
                    onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61588e.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61588e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        this.f61337b.mo31364c(new DematerializeObserver(observer, null));
    }
}
