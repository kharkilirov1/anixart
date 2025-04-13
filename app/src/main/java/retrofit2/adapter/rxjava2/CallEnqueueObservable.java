package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class CallEnqueueObservable<T> extends Observable<Response<T>> {

    /* renamed from: b */
    public final Call<T> f69595b;

    public static final class CallCallback<T> implements Disposable, Callback<T> {

        /* renamed from: b */
        public final Call<?> f69596b;

        /* renamed from: c */
        public final Observer<? super Response<T>> f69597c;

        /* renamed from: d */
        public volatile boolean f69598d;

        /* renamed from: e */
        public boolean f69599e = false;

        public CallCallback(Call<?> call, Observer<? super Response<T>> observer) {
            this.f69596b = call;
            this.f69597c = observer;
        }

        @Override // retrofit2.Callback
        /* renamed from: a */
        public void mo35016a(Call<T> call, Throwable th) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.f69597c.onError(th);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                RxJavaPlugins.m31848b(new CompositeException(th, th2));
            }
        }

        @Override // retrofit2.Callback
        /* renamed from: b */
        public void mo35017b(Call<T> call, Response<T> response) {
            if (this.f69598d) {
                return;
            }
            try {
                this.f69597c.onNext(response);
                if (this.f69598d) {
                    return;
                }
                this.f69599e = true;
                this.f69597c.onComplete();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                if (this.f69599e) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (this.f69598d) {
                    return;
                }
                try {
                    this.f69597c.onError(th);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    RxJavaPlugins.m31848b(new CompositeException(th, th2));
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f69598d = true;
            this.f69596b.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f69598d;
        }
    }

    public CallEnqueueObservable(Call<T> call) {
        this.f69595b = call;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Response<T>> observer) {
        Call<T> clone = this.f69595b.clone();
        CallCallback callCallback = new CallCallback(clone, observer);
        observer.mo31373a(callCallback);
        if (callCallback.f69598d) {
            return;
        }
        clone.mo35010o0(callCallback);
    }
}
