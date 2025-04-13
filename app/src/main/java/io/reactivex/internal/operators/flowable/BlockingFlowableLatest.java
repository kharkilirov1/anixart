package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Notification;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class BlockingFlowableLatest<T> implements Iterable<T> {

    public static final class LatestSubscriberIterator<T> extends DisposableSubscriber<Notification<T>> implements Iterator<T> {

        /* renamed from: c */
        public final Semaphore f59791c = new Semaphore(0);

        /* renamed from: d */
        public final AtomicReference<Notification<T>> f59792d = new AtomicReference<>();

        /* renamed from: e */
        public Notification<T> f59793e;

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification<T> notification = this.f59793e;
            if (notification != null && notification.m31359d()) {
                throw ExceptionHelper.m31821e(this.f59793e.m31356a());
            }
            Notification<T> notification2 = this.f59793e;
            if ((notification2 == null || notification2.m31360e()) && this.f59793e == null) {
                try {
                    this.f59791c.acquire();
                    Notification<T> andSet = this.f59792d.getAndSet(null);
                    this.f59793e = andSet;
                    if (andSet.m31359d()) {
                        throw ExceptionHelper.m31821e(andSet.m31356a());
                    }
                } catch (InterruptedException e2) {
                    SubscriptionHelper.m31797a(this.f62988b);
                    this.f59793e = new Notification<>(NotificationLite.m31832e(e2));
                    throw ExceptionHelper.m31821e(e2);
                }
            }
            return this.f59793e.m31360e();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.f59793e.m31360e()) {
                throw new NoSuchElementException();
            }
            T m31357b = this.f59793e.m31357b();
            this.f59793e = null;
            return m31357b;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            RxJavaPlugins.m31848b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (this.f59792d.getAndSet((Notification) obj) == null) {
                this.f59791c.release();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        LatestSubscriberIterator latestSubscriberIterator = new LatestSubscriberIterator();
        new FlowableMaterialize(Flowable.m31348a(null)).m31349b(latestSubscriberIterator);
        return latestSubscriberIterator;
    }
}
