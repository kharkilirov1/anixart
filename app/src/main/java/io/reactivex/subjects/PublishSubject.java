package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class PublishSubject<T> extends Subject<T> {

    /* renamed from: d */
    public static final PublishDisposable[] f62954d = new PublishDisposable[0];

    /* renamed from: e */
    public static final PublishDisposable[] f62955e = new PublishDisposable[0];

    /* renamed from: b */
    public final AtomicReference<PublishDisposable<T>[]> f62956b = new AtomicReference<>(f62955e);

    /* renamed from: c */
    public Throwable f62957c;

    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62958b;

        /* renamed from: c */
        public final PublishSubject<T> f62959c;

        public PublishDisposable(Observer<? super T> observer, PublishSubject<T> publishSubject) {
            this.f62958b = observer;
            this.f62959c = publishSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (compareAndSet(false, true)) {
                this.f62959c.m31867p(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get();
        }
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (this.f62956b.get() == f62954d) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        boolean z;
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(observer, this);
        observer.mo31373a(publishDisposable);
        while (true) {
            PublishDisposable<T>[] publishDisposableArr = this.f62956b.get();
            z = false;
            if (publishDisposableArr == f62954d) {
                break;
            }
            int length = publishDisposableArr.length;
            PublishDisposable<T>[] publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
            if (this.f62956b.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (publishDisposable.get()) {
                m31867p(publishDisposable);
            }
        } else {
            Throwable th = this.f62957c;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.f62956b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f62954d;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.f62956b.getAndSet(publishDisposableArr2)) {
            if (!publishDisposable.get()) {
                publishDisposable.f62958b.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.f62956b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f62954d;
        if (publishDisposableArr == publishDisposableArr2) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62957c = th;
        for (PublishDisposable<T> publishDisposable : this.f62956b.getAndSet(publishDisposableArr2)) {
            if (publishDisposable.get()) {
                RxJavaPlugins.m31848b(th);
            } else {
                publishDisposable.f62958b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.f62956b.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.f62958b.onNext(t);
            }
        }
    }

    /* renamed from: p */
    public void m31867p(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f62956b.get();
            if (publishDisposableArr == f62954d || publishDisposableArr == f62955e) {
                return;
            }
            int length = publishDisposableArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (publishDisposableArr[i2] == publishDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = f62955e;
            } else {
                PublishDisposable<T>[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i2);
                System.arraycopy(publishDisposableArr, i2 + 1, publishDisposableArr3, i2, (length - i2) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!this.f62956b.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }
}
