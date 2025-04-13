package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferBoundarySubscriber<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {

        /* renamed from: c */
        public final BufferExactBoundarySubscriber<T, U, B> f59877c;

        public BufferBoundarySubscriber(BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber) {
            this.f59877c = bufferExactBoundarySubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59877c.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber = this.f59877c;
            bufferExactBoundarySubscriber.cancel();
            bufferExactBoundarySubscriber.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber = this.f59877c;
            Objects.requireNonNull(bufferExactBoundarySubscriber);
            try {
                U call = bufferExactBoundarySubscriber.f59878i.call();
                Objects.requireNonNull(call, "The buffer supplied is null");
                U u = call;
                synchronized (bufferExactBoundarySubscriber) {
                    U u2 = bufferExactBoundarySubscriber.f59882m;
                    if (u2 != null) {
                        bufferExactBoundarySubscriber.f59882m = u;
                        bufferExactBoundarySubscriber.m31782e(u2, false, bufferExactBoundarySubscriber);
                    }
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                bufferExactBoundarySubscriber.cancel();
                bufferExactBoundarySubscriber.f62744d.onError(th);
            }
        }
    }

    public static final class BufferExactBoundarySubscriber<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements Subscription, Disposable {

        /* renamed from: i */
        public final Callable<U> f59878i;

        /* renamed from: j */
        public final Publisher<B> f59879j;

        /* renamed from: k */
        public Subscription f59880k;

        /* renamed from: l */
        public Disposable f59881l;

        /* renamed from: m */
        public U f59882m;

        public BufferExactBoundarySubscriber(Subscriber<? super U> subscriber, Callable<U> callable, Publisher<B> publisher) {
            super(subscriber, new MpscLinkedQueue());
            this.f59878i = null;
            this.f59879j = null;
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
            this.f59881l.mo31379f();
            this.f59880k.cancel();
            if (m31780b()) {
                this.f62745e.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59880k, subscription)) {
                this.f59880k = subscription;
                try {
                    U call = this.f59878i.call();
                    Objects.requireNonNull(call, "The buffer supplied is null");
                    this.f59882m = call;
                    BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(this);
                    this.f59881l = bufferBoundarySubscriber;
                    this.f62744d.mo31352d(this);
                    if (this.f62746f) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    this.f59879j.mo31351g(bufferBoundarySubscriber);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f62746f = true;
                    subscription.cancel();
                    EmptySubscription.m31792b(th, this.f62744d);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            synchronized (this) {
                U u = this.f59882m;
                if (u == null) {
                    return;
                }
                this.f59882m = null;
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
                U u = this.f59882m;
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
            return this.f62746f;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        this.f59782c.m31349b(new BufferExactBoundarySubscriber(new SerializedSubscriber(subscriber), null, null));
    }
}
