package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableRefCount<T> extends Flowable<T> {

    /* renamed from: c */
    public RefConnection f60483c;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* renamed from: b */
        public final FlowableRefCount<?> f60484b;

        /* renamed from: c */
        public long f60485c;

        /* renamed from: d */
        public boolean f60486d;

        public RefConnection(FlowableRefCount<?> flowableRefCount) {
            this.f60484b = flowableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.m31411c(this, disposable);
            synchronized (this.f60484b) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60484b.m31556h(this);
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60487b;

        /* renamed from: c */
        public final FlowableRefCount<T> f60488c;

        /* renamed from: d */
        public final RefConnection f60489d;

        /* renamed from: e */
        public Subscription f60490e;

        public RefCountSubscriber(Subscriber<? super T> subscriber, FlowableRefCount<T> flowableRefCount, RefConnection refConnection) {
            this.f60487b = subscriber;
            this.f60488c = flowableRefCount;
            this.f60489d = refConnection;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60490e.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount<T> flowableRefCount = this.f60488c;
                RefConnection refConnection = this.f60489d;
                synchronized (flowableRefCount) {
                    RefConnection refConnection2 = flowableRefCount.f60483c;
                    if (refConnection2 != null && refConnection2 == refConnection) {
                        long j2 = refConnection.f60485c - 1;
                        refConnection.f60485c = j2;
                        if (j2 == 0 && refConnection.f60486d) {
                            flowableRefCount.m31556h(refConnection);
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60490e, subscription)) {
                this.f60490e = subscription;
                this.f60487b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f60488c.m31555e(this.f60489d);
                this.f60487b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60488c.m31555e(this.f60489d);
                this.f60487b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60487b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60490e.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        RefConnection refConnection;
        synchronized (this) {
            refConnection = this.f60483c;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.f60483c = refConnection;
            }
            long j2 = refConnection.f60485c;
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            long j3 = j2 + 1;
            refConnection.f60485c = j3;
            if (!refConnection.f60486d && j3 == 0) {
                refConnection.f60486d = true;
            }
        }
        new RefCountSubscriber(subscriber, this, refConnection);
        throw null;
    }

    /* renamed from: e */
    public void m31555e(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f60483c;
            if (refConnection2 != null && refConnection2 == refConnection) {
                this.f60483c = null;
                Objects.requireNonNull(refConnection);
            }
            long j2 = refConnection.f60485c - 1;
            refConnection.f60485c = j2;
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        }
    }

    /* renamed from: h */
    public void m31556h(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.f60485c == 0 && refConnection == this.f60483c) {
                this.f60483c = null;
                refConnection.get();
                DisposableHelper.m31409a(refConnection);
            }
        }
    }
}
