package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class BlockingObservableNext<T> implements Iterable<T> {

    public static final class NextIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public final NextObserver<T> f61349b;

        /* renamed from: d */
        public T f61351d;

        /* renamed from: g */
        public Throwable f61354g;

        /* renamed from: h */
        public boolean f61355h;

        /* renamed from: e */
        public boolean f61352e = true;

        /* renamed from: f */
        public boolean f61353f = true;

        /* renamed from: c */
        public final ObservableSource<T> f61350c = null;

        public NextIterator(ObservableSource<T> observableSource, NextObserver<T> nextObserver) {
            this.f61349b = nextObserver;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z;
            Throwable th = this.f61354g;
            if (th != null) {
                throw ExceptionHelper.m31821e(th);
            }
            if (!this.f61352e) {
                return false;
            }
            if (this.f61353f) {
                if (!this.f61355h) {
                    this.f61355h = true;
                    this.f61349b.f61357d.set(1);
                    new ObservableMaterialize(this.f61350c).mo31364c(this.f61349b);
                }
                try {
                    NextObserver<T> nextObserver = this.f61349b;
                    nextObserver.f61357d.set(1);
                    Notification<T> take = nextObserver.f61356c.take();
                    if (take.m31360e()) {
                        this.f61353f = false;
                        this.f61351d = take.m31357b();
                        z = true;
                    } else {
                        this.f61352e = false;
                        if (!take.m31358c()) {
                            Throwable m31356a = take.m31356a();
                            this.f61354g = m31356a;
                            throw ExceptionHelper.m31821e(m31356a);
                        }
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                } catch (InterruptedException e2) {
                    DisposableHelper.m31409a(this.f61349b.f62817b);
                    this.f61354g = e2;
                    throw ExceptionHelper.m31821e(e2);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f61354g;
            if (th != null) {
                throw ExceptionHelper.m31821e(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f61353f = true;
            return this.f61351d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public static final class NextObserver<T> extends DisposableObserver<Notification<T>> {

        /* renamed from: c */
        public final BlockingQueue<Notification<T>> f61356c = new ArrayBlockingQueue(1);

        /* renamed from: d */
        public final AtomicInteger f61357d = new AtomicInteger();

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            RxJavaPlugins.m31848b(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Notification<T> notification = (Notification) obj;
            if (this.f61357d.getAndSet(0) == 1 || !notification.m31360e()) {
                while (!this.f61356c.offer(notification)) {
                    Notification<T> poll = this.f61356c.poll();
                    if (poll != null && !poll.m31360e()) {
                        notification = poll;
                    }
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new NextIterator(null, new NextObserver());
    }
}
