package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableCreate<T> extends Observable<T> {

    public static final class CreateEmitter<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61544b;

        public CreateEmitter(Observer<? super T> observer) {
            this.f61544b = observer;
        }

        /* renamed from: a */
        public void m31659a(Throwable th) {
            boolean z;
            if (mo31380s()) {
                z = false;
            } else {
                try {
                    this.f61544b.onError(th);
                    DisposableHelper.m31409a(this);
                    z = true;
                } catch (Throwable th2) {
                    DisposableHelper.m31409a(this);
                    throw th2;
                }
            }
            if (z) {
                return;
            }
            RxJavaPlugins.m31848b(th);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (mo31380s()) {
                return;
            }
            this.f61544b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", CreateEmitter.class.getSimpleName(), super.toString());
        }
    }

    public static final class SerializedEmitter<T> extends AtomicInteger implements ObservableEmitter<T> {
        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            throw null;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        CreateEmitter createEmitter = new CreateEmitter(observer);
        observer.mo31373a(createEmitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            createEmitter.m31659a(th);
        }
    }
}
