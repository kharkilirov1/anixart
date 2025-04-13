package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes3.dex */
public final class CompletableToObservable<T> extends Observable<T> {

    public static final class ObserverCompletableObserver extends BasicQueueDisposable<Void> implements CompletableObserver {

        /* renamed from: b */
        public final Observer<?> f59774b;

        /* renamed from: c */
        public Disposable f59775c;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return i2 & 2;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f59775c, disposable)) {
                this.f59775c = disposable;
                this.f59774b.mo31373a(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59775c.mo31379f();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59774b.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59774b.onError(th);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* bridge */ /* synthetic */ Object poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59775c.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        throw null;
    }
}
