package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Notification;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* loaded from: classes3.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {

    public static final class NextIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public final NextSubscriber<T> f59797b;

        /* renamed from: d */
        public T f59799d;

        /* renamed from: g */
        public Throwable f59802g;

        /* renamed from: h */
        public boolean f59803h;

        /* renamed from: e */
        public boolean f59800e = true;

        /* renamed from: f */
        public boolean f59801f = true;

        /* renamed from: c */
        public final Publisher<? extends T> f59798c = null;

        public NextIterator(Publisher<? extends T> publisher, NextSubscriber<T> nextSubscriber) {
            this.f59797b = nextSubscriber;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            boolean z;
            Throwable th = this.f59802g;
            if (th != null) {
                throw ExceptionHelper.m31821e(th);
            }
            if (!this.f59800e) {
                return false;
            }
            if (this.f59801f) {
                try {
                    if (!this.f59803h) {
                        this.f59803h = true;
                        this.f59797b.f59805d.set(1);
                        new FlowableMaterialize(Flowable.m31348a(this.f59798c)).m31349b(this.f59797b);
                    }
                    NextSubscriber<T> nextSubscriber = this.f59797b;
                    nextSubscriber.f59805d.set(1);
                    Notification<T> take = nextSubscriber.f59804c.take();
                    if (take.m31360e()) {
                        this.f59801f = false;
                        this.f59799d = take.m31357b();
                        z = true;
                    } else {
                        this.f59800e = false;
                        if (!take.m31358c()) {
                            if (!take.m31359d()) {
                                throw new IllegalStateException("Should not reach here");
                            }
                            Throwable m31356a = take.m31356a();
                            this.f59802g = m31356a;
                            throw ExceptionHelper.m31821e(m31356a);
                        }
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                } catch (InterruptedException e2) {
                    SubscriptionHelper.m31797a(this.f59797b.f62988b);
                    this.f59802g = e2;
                    throw ExceptionHelper.m31821e(e2);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.f59802g;
            if (th != null) {
                throw ExceptionHelper.m31821e(th);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f59801f = true;
            return this.f59799d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public static final class NextSubscriber<T> extends DisposableSubscriber<Notification<T>> {

        /* renamed from: c */
        public final BlockingQueue<Notification<T>> f59804c = new ArrayBlockingQueue(1);

        /* renamed from: d */
        public final AtomicInteger f59805d = new AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            RxJavaPlugins.m31848b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Notification<T> notification = (Notification) obj;
            if (this.f59805d.getAndSet(0) == 1 || !notification.m31360e()) {
                while (!this.f59804c.offer(notification)) {
                    Notification<T> poll = this.f59804c.poll();
                    if (poll != null && !poll.m31360e()) {
                        notification = poll;
                    }
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new NextIterator(null, new NextSubscriber());
    }
}
