package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableMergeWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61809b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f61810c = new AtomicReference<>();

        /* renamed from: d */
        public final OtherObserver f61811d = new OtherObserver(this);

        /* renamed from: e */
        public final AtomicThrowable f61812e = new AtomicThrowable();

        /* renamed from: f */
        public volatile boolean f61813f;

        /* renamed from: g */
        public volatile boolean f61814g;

        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final MergeWithObserver<?> f61815b;

            public OtherObserver(MergeWithObserver<?> mergeWithObserver) {
                this.f61815b = mergeWithObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                MergeWithObserver<?> mergeWithObserver = this.f61815b;
                mergeWithObserver.f61814g = true;
                if (mergeWithObserver.f61813f) {
                    HalfSerializer.m31822a(mergeWithObserver.f61809b, mergeWithObserver, mergeWithObserver.f61812e);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                MergeWithObserver<?> mergeWithObserver = this.f61815b;
                DisposableHelper.m31409a(mergeWithObserver.f61810c);
                HalfSerializer.m31824c(mergeWithObserver.f61809b, th, mergeWithObserver, mergeWithObserver.f61812e);
            }
        }

        public MergeWithObserver(Observer<? super T> observer) {
            this.f61809b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f61810c, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61810c);
            DisposableHelper.m31409a(this.f61811d);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61813f = true;
            if (this.f61814g) {
                HalfSerializer.m31822a(this.f61809b, this, this.f61812e);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f61810c);
            HalfSerializer.m31824c(this.f61809b, th, this, this.f61812e);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            HalfSerializer.m31826e(this.f61809b, t, this, this.f61812e);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61810c.get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.mo31373a(mergeWithObserver);
        this.f61337b.mo31364c(mergeWithObserver);
        throw null;
    }
}
