package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class CallExecuteObservable<T> extends Observable<Response<T>> {

    /* renamed from: b */
    public final Call<T> f69600b;

    public static final class CallDisposable implements Disposable {

        /* renamed from: b */
        public final Call<?> f69601b;

        /* renamed from: c */
        public volatile boolean f69602c;

        public CallDisposable(Call<?> call) {
            this.f69601b = call;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f69602c = true;
            this.f69601b.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f69602c;
        }
    }

    public CallExecuteObservable(Call<T> call) {
        this.f69600b = call;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Response<T>> observer) {
        boolean z;
        Call<T> clone = this.f69600b.clone();
        CallDisposable callDisposable = new CallDisposable(clone);
        observer.mo31373a(callDisposable);
        if (callDisposable.f69602c) {
            return;
        }
        try {
            Response<T> execute = clone.execute();
            if (!callDisposable.f69602c) {
                observer.onNext(execute);
            }
            if (callDisposable.f69602c) {
                return;
            }
            try {
                observer.onComplete();
            } catch (Throwable th) {
                th = th;
                z = true;
                Exceptions.m31402a(th);
                if (z) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (callDisposable.f69602c) {
                    return;
                }
                try {
                    observer.onError(th);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    RxJavaPlugins.m31848b(new CompositeException(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
