package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class BlockingObservableLatest<T> implements Iterable<T> {

    public static final class BlockingObservableLatestIterator<T> extends DisposableObserver<Notification<T>> implements Iterator<T> {

        /* renamed from: c */
        public Notification<T> f61343c;

        /* renamed from: d */
        public final Semaphore f61344d = new Semaphore(0);

        /* renamed from: e */
        public final AtomicReference<Notification<T>> f61345e = new AtomicReference<>();

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification<T> notification = this.f61343c;
            if (notification != null && notification.m31359d()) {
                throw ExceptionHelper.m31821e(this.f61343c.m31356a());
            }
            if (this.f61343c == null) {
                try {
                    this.f61344d.acquire();
                    Notification<T> andSet = this.f61345e.getAndSet(null);
                    this.f61343c = andSet;
                    if (andSet.m31359d()) {
                        throw ExceptionHelper.m31821e(andSet.m31356a());
                    }
                } catch (InterruptedException e2) {
                    DisposableHelper.m31409a(this.f62817b);
                    this.f61343c = new Notification<>(NotificationLite.m31832e(e2));
                    throw ExceptionHelper.m31821e(e2);
                }
            }
            return this.f61343c.m31360e();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T m31357b = this.f61343c.m31357b();
            this.f61343c = null;
            return m31357b;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            RxJavaPlugins.m31848b(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f61345e.getAndSet((Notification) obj) == null) {
                this.f61344d.release();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        new BlockingObservableLatestIterator();
        Objects.requireNonNull((Object) null, "source is null");
        throw null;
    }
}
