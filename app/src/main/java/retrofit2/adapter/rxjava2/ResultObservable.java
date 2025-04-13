package retrofit2.adapter.rxjava2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class ResultObservable<T> extends Observable<Result<T>> {

    /* renamed from: b */
    public final Observable<Response<T>> f69603b;

    public static class ResultObserver<R> implements Observer<Response<R>> {

        /* renamed from: b */
        public final Observer<? super Result<R>> f69604b;

        public ResultObserver(Observer<? super Result<R>> observer) {
            this.f69604b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            this.f69604b.mo31373a(disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f69604b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            try {
                Observer<? super Result<R>> observer = this.f69604b;
                Objects.requireNonNull(th, "error == null");
                observer.onNext(new Result(null, th));
                this.f69604b.onComplete();
            } catch (Throwable th2) {
                try {
                    this.f69604b.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.m31402a(th3);
                    RxJavaPlugins.m31848b(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Response response = (Response) obj;
            Observer<? super Result<R>> observer = this.f69604b;
            Objects.requireNonNull(response, "response == null");
            observer.onNext(new Result(response, null));
        }
    }

    public ResultObservable(Observable<Response<T>> observable) {
        this.f69603b = observable;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Result<T>> observer) {
        this.f69603b.mo31364c(new ResultObserver(observer));
    }
}
