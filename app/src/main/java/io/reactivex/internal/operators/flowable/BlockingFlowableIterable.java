package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class BlockingFlowableIterable<T> implements Iterable<T> {

    public static final class BlockingFlowableIterator<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Iterator<T>, Runnable, Disposable {

        /* renamed from: b */
        public final SpscArrayQueue<T> f59783b;

        /* renamed from: c */
        public final long f59784c;

        /* renamed from: d */
        public final long f59785d;

        /* renamed from: e */
        public final Lock f59786e;

        /* renamed from: f */
        public final Condition f59787f;

        /* renamed from: g */
        public long f59788g;

        /* renamed from: h */
        public volatile boolean f59789h;

        /* renamed from: i */
        public Throwable f59790i;

        public BlockingFlowableIterator(int i2) {
            this.f59783b = new SpscArrayQueue<>(i2);
            this.f59784c = i2;
            this.f59785d = i2 - (i2 >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f59786e = reentrantLock;
            this.f59787f = reentrantLock.newCondition();
        }

        /* renamed from: a */
        public void m31452a() {
            this.f59786e.lock();
            try {
                this.f59787f.signalAll();
            } finally {
                this.f59786e.unlock();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, this.f59784c);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (true) {
                boolean z = this.f59789h;
                boolean isEmpty = this.f59783b.isEmpty();
                if (z) {
                    Throwable th = this.f59790i;
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
                this.f59786e.lock();
                while (!this.f59789h && this.f59783b.isEmpty()) {
                    try {
                        try {
                            this.f59787f.await();
                        } catch (InterruptedException e2) {
                            SubscriptionHelper.m31797a(this);
                            m31452a();
                            throw ExceptionHelper.m31821e(e2);
                        }
                    } finally {
                        this.f59786e.unlock();
                    }
                }
            }
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T poll = this.f59783b.poll();
            long j2 = this.f59788g + 1;
            if (j2 == this.f59785d) {
                this.f59788g = 0L;
                get().request(j2);
            } else {
                this.f59788g = j2;
            }
            return poll;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59789h = true;
            m31452a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f59790i = th;
            this.f59789h = true;
            m31452a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59783b.offer(t)) {
                m31452a();
                return;
            }
            SubscriptionHelper.m31797a(this);
            this.f59790i = new MissingBackpressureException("Queue full?!");
            this.f59789h = true;
            m31452a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            SubscriptionHelper.m31797a(this);
            m31452a();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        new BlockingFlowableIterator(0);
        throw null;
    }
}
