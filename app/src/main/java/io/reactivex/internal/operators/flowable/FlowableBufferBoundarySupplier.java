package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {

        /* renamed from: c */
        public final BufferBoundarySupplierSubscriber<T, U, B> f59870c;

        /* renamed from: d */
        public boolean f59871d;

        public BufferBoundarySubscriber(BufferBoundarySupplierSubscriber<T, U, B> bufferBoundarySupplierSubscriber) {
            this.f59870c = bufferBoundarySupplierSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59871d) {
                return;
            }
            this.f59871d = true;
            this.f59870c.m31457l();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59871d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59871d = true;
            BufferBoundarySupplierSubscriber<T, U, B> bufferBoundarySupplierSubscriber = this.f59870c;
            bufferBoundarySupplierSubscriber.cancel();
            bufferBoundarySupplierSubscriber.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            if (this.f59871d) {
                return;
            }
            this.f59871d = true;
            SubscriptionHelper.m31797a(this.f62988b);
            this.f59870c.m31457l();
        }
    }

    public static final class BufferBoundarySupplierSubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements Subscription, Disposable {

        /* renamed from: i */
        public final Callable<U> f59872i;

        /* renamed from: j */
        public final Callable<? extends Publisher<B>> f59873j;

        /* renamed from: k */
        public Subscription f59874k;

        /* renamed from: l */
        public final AtomicReference<Disposable> f59875l;

        /* renamed from: m */
        public U f59876m;

        public BufferBoundarySupplierSubscriber(Subscriber<? super U> subscriber, Callable<U> callable, Callable<? extends Publisher<B>> callable2) {
            super(subscriber, new MpscLinkedQueue());
            this.f59875l = new AtomicReference<>();
            this.f59872i = null;
            this.f59873j = null;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean mo31456a(Subscriber subscriber, Object obj) {
            this.f62744d.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f62746f) {
                return;
            }
            this.f62746f = true;
            this.f59874k.cancel();
            DisposableHelper.m31409a(this.f59875l);
            if (m31780b()) {
                this.f62745e.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59874k, subscription)) {
                this.f59874k = subscription;
                Subscriber<? super V> subscriber = this.f62744d;
                try {
                    U call = this.f59872i.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    this.f59876m = call;
                    try {
                        Publisher<B> call2 = this.f59873j.call();
                        Objects.requireNonNull(call2, "The boundary publisher supplied is null");
                        Publisher<B> publisher = call2;
                        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                        this.f59875l.set(bufferBoundarySubscriber);
                        subscriber.mo31352d(this);
                        if (this.f62746f) {
                            return;
                        }
                        subscription.request(Long.MAX_VALUE);
                        publisher.mo31351g(bufferBoundarySubscriber);
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f62746f = true;
                        subscription.cancel();
                        EmptySubscription.m31792b(th, subscriber);
                    }
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    this.f62746f = true;
                    subscription.cancel();
                    EmptySubscription.m31792b(th2, subscriber);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59874k.cancel();
            DisposableHelper.m31409a(this.f59875l);
        }

        /* renamed from: l */
        public void m31457l() {
            try {
                U call = this.f59872i.call();
                Objects.requireNonNull(call, "The buffer supplied is null");
                U u = call;
                try {
                    Publisher<B> call2 = this.f59873j.call();
                    Objects.requireNonNull(call2, "The boundary publisher supplied is null");
                    Publisher<B> publisher = call2;
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    if (DisposableHelper.m31411c(this.f59875l, bufferBoundarySubscriber)) {
                        synchronized (this) {
                            U u2 = this.f59876m;
                            if (u2 == null) {
                                return;
                            }
                            this.f59876m = u;
                            publisher.mo31351g(bufferBoundarySubscriber);
                            m31782e(u2, false, this);
                        }
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f62746f = true;
                    this.f59874k.cancel();
                    this.f62744d.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                cancel();
                this.f62744d.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            synchronized (this) {
                U u = this.f59876m;
                if (u == null) {
                    return;
                }
                this.f59876m = null;
                this.f62745e.offer(u);
                this.f62747g = true;
                if (m31780b()) {
                    QueueDrainHelper.m31844d(this.f62745e, this.f62744d, false, this, this);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            cancel();
            this.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f59876m;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59875l.get() == DisposableHelper.DISPOSED;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        this.f59782c.m31349b(new BufferBoundarySupplierSubscriber(new SerializedSubscriber(subscriber), null, null));
    }
}
