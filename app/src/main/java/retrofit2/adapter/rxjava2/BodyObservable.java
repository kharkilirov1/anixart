package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class BodyObservable<T> extends Observable<T> {

    /* renamed from: b */
    public final Observable<Response<T>> f69592b;

    public static class BodyObserver<R> implements Observer<Response<R>> {

        /* renamed from: b */
        public final Observer<? super R> f69593b;

        /* renamed from: c */
        public boolean f69594c;

        public BodyObserver(Observer<? super R> observer) {
            this.f69593b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            this.f69593b.mo31373a(disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f69594c) {
                return;
            }
            this.f69593b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.f69594c) {
                this.f69593b.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.m31848b(assertionError);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Response response = (Response) obj;
            if (response.m35033a()) {
                this.f69593b.onNext(response.f69563b);
                return;
            }
            this.f69594c = true;
            HttpException httpException = new HttpException(response);
            try {
                this.f69593b.onError(httpException);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(new CompositeException(httpException, th));
            }
        }
    }

    public BodyObservable(Observable<Response<T>> observable) {
        this.f69592b = observable;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f69592b.mo31364c(new BodyObserver(observer));
    }
}
