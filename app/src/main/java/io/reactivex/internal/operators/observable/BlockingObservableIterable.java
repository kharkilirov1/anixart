package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {

    public static final class BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {

        /* renamed from: b */
        public final SpscLinkedArrayQueue<T> f61338b;

        /* renamed from: c */
        public final Lock f61339c;

        /* renamed from: d */
        public final Condition f61340d;

        /* renamed from: e */
        public volatile boolean f61341e;

        /* renamed from: f */
        public Throwable f61342f;

        public BlockingObservableIterator(int i2) {
            this.f61338b = new SpscLinkedArrayQueue<>(i2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f61339c = reentrantLock;
            this.f61340d = reentrantLock.newCondition();
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        /* renamed from: b */
        public void m31647b() {
            this.f61339c.lock();
            try {
                this.f61340d.signalAll();
            } finally {
                this.f61339c.unlock();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z = this.f61341e;
                boolean isEmpty = this.f61338b.isEmpty();
                if (z) {
                    Throwable th = this.f61342f;
                    if (th != null) {
                        throw ExceptionHelper.m31821e(th);
                    }
                    if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                try {
                    this.f61339c.lock();
                    while (!this.f61341e && this.f61338b.isEmpty()) {
                        try {
                            this.f61340d.await();
                        } finally {
                        }
                    }
                    this.f61339c.unlock();
                } catch (InterruptedException e2) {
                    DisposableHelper.m31409a(this);
                    m31647b();
                    throw ExceptionHelper.m31821e(e2);
                }
            }
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.f61338b.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61341e = true;
            m31647b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61342f = th;
            this.f61341e = true;
            m31647b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61338b.offer(t);
            m31647b();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        new BlockingObservableIterator(0);
        throw null;
    }
}
