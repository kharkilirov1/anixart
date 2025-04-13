package io.reactivex.internal.operators.flowable;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {

    public static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {

        /* renamed from: i */
        public final Callable<U> f59883i;

        /* renamed from: j */
        public final long f59884j;

        /* renamed from: k */
        public final TimeUnit f59885k;

        /* renamed from: l */
        public final int f59886l;

        /* renamed from: m */
        public final boolean f59887m;

        /* renamed from: n */
        public final Scheduler.Worker f59888n;

        /* renamed from: o */
        public U f59889o;

        /* renamed from: p */
        public Disposable f59890p;

        /* renamed from: q */
        public Subscription f59891q;

        /* renamed from: r */
        public long f59892r;

        /* renamed from: s */
        public long f59893s;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean mo31456a(Subscriber subscriber, Object obj) {
            subscriber.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f62746f) {
                return;
            }
            this.f62746f = true;
            mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59891q, subscription)) {
                this.f59891q = subscription;
                try {
                    U call = this.f59883i.call();
                    Objects.requireNonNull(call, "The supplied buffer is null");
                    this.f59889o = call;
                    this.f62744d.mo31352d(this);
                    Scheduler.Worker worker = this.f59888n;
                    long j2 = this.f59884j;
                    this.f59890p = worker.mo31384d(this, j2, j2, this.f59885k);
                    subscription.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59888n.mo31379f();
                    subscription.cancel();
                    EmptySubscription.m31792b(th, this.f62744d);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            synchronized (this) {
                this.f59889o = null;
            }
            this.f59891q.cancel();
            this.f59888n.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f59889o;
                this.f59889o = null;
            }
            this.f62745e.offer(u);
            this.f62747g = true;
            if (m31780b()) {
                QueueDrainHelper.m31844d(this.f62745e, this.f62744d, false, this, this);
            }
            this.f59888n.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            synchronized (this) {
                this.f59889o = null;
            }
            this.f62744d.onError(th);
            this.f59888n.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f59889o;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.f59886l) {
                    return;
                }
                this.f59889o = null;
                this.f59892r++;
                if (this.f59887m) {
                    this.f59890p.mo31379f();
                }
                m31783g(u, false, this);
                try {
                    U call = this.f59883i.call();
                    Objects.requireNonNull(call, "The supplied buffer is null");
                    U u2 = call;
                    synchronized (this) {
                        this.f59889o = u2;
                        this.f59893s++;
                    }
                    if (this.f59887m) {
                        Scheduler.Worker worker = this.f59888n;
                        long j2 = this.f59884j;
                        this.f59890p = worker.mo31384d(this, j2, j2, this.f59885k);
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    cancel();
                    this.f62744d.onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U call = this.f59883i.call();
                Objects.requireNonNull(call, "The supplied buffer is null");
                U u = call;
                synchronized (this) {
                    U u2 = this.f59889o;
                    if (u2 != null && this.f59892r == this.f59893s) {
                        this.f59889o = u;
                        m31783g(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                cancel();
                this.f62744d.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59888n.mo31380s();
        }
    }

    public static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable, Disposable {

        /* renamed from: i */
        public final Callable<U> f59894i;

        /* renamed from: j */
        public final long f59895j;

        /* renamed from: k */
        public final TimeUnit f59896k;

        /* renamed from: l */
        public final Scheduler f59897l;

        /* renamed from: m */
        public Subscription f59898m;

        /* renamed from: n */
        public U f59899n;

        /* renamed from: o */
        public final AtomicReference<Disposable> f59900o;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean mo31456a(Subscriber subscriber, Object obj) {
            this.f62744d.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62746f = true;
            this.f59898m.cancel();
            DisposableHelper.m31409a(this.f59900o);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59898m, subscription)) {
                this.f59898m = subscription;
                try {
                    U call = this.f59894i.call();
                    Objects.requireNonNull(call, "The supplied buffer is null");
                    this.f59899n = call;
                    this.f62744d.mo31352d(this);
                    if (this.f62746f) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    Scheduler scheduler = this.f59897l;
                    long j2 = this.f59895j;
                    Disposable mo31378e = scheduler.mo31378e(this, j2, j2, this.f59896k);
                    if (this.f59900o.compareAndSet(null, mo31378e)) {
                        return;
                    }
                    mo31378e.mo31379f();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    cancel();
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
            DisposableHelper.m31409a(this.f59900o);
            synchronized (this) {
                U u = this.f59899n;
                if (u == null) {
                    return;
                }
                this.f59899n = null;
                this.f62745e.offer(u);
                this.f62747g = true;
                if (m31780b()) {
                    QueueDrainHelper.m31844d(this.f62745e, this.f62744d, false, null, this);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f59900o);
            synchronized (this) {
                this.f59899n = null;
            }
            this.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                U u = this.f59899n;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U call = this.f59894i.call();
                Objects.requireNonNull(call, "The supplied buffer is null");
                U u = call;
                synchronized (this) {
                    U u2 = this.f59899n;
                    if (u2 == null) {
                        return;
                    }
                    this.f59899n = u;
                    m31782e(u2, false, this);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                cancel();
                this.f62744d.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59900o.get() == DisposableHelper.DISPOSED;
        }
    }

    public static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements Subscription, Runnable {

        /* renamed from: i */
        public final Callable<U> f59901i;

        /* renamed from: j */
        public final long f59902j;

        /* renamed from: k */
        public final long f59903k;

        /* renamed from: l */
        public final TimeUnit f59904l;

        /* renamed from: m */
        public final Scheduler.Worker f59905m;

        /* renamed from: n */
        public final List<U> f59906n;

        /* renamed from: o */
        public Subscription f59907o;

        public final class RemoveFromBuffer implements Runnable {

            /* renamed from: b */
            public final U f59908b;

            public RemoveFromBuffer(U u) {
                this.f59908b = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    BufferSkipBoundedSubscriber.this.f59906n.remove(this.f59908b);
                }
                BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = BufferSkipBoundedSubscriber.this;
                bufferSkipBoundedSubscriber.m31783g(this.f59908b, false, bufferSkipBoundedSubscriber.f59905m);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        /* renamed from: a */
        public boolean mo31456a(Subscriber subscriber, Object obj) {
            subscriber.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62746f = true;
            this.f59907o.cancel();
            this.f59905m.mo31379f();
            synchronized (this) {
                this.f59906n.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59907o, subscription)) {
                this.f59907o = subscription;
                try {
                    U call = this.f59901i.call();
                    Objects.requireNonNull(call, "The supplied buffer is null");
                    U u = call;
                    this.f59906n.add(u);
                    this.f62744d.mo31352d(this);
                    subscription.request(Long.MAX_VALUE);
                    Scheduler.Worker worker = this.f59905m;
                    long j2 = this.f59903k;
                    worker.mo31384d(this, j2, j2, this.f59904l);
                    this.f59905m.mo31383c(new RemoveFromBuffer(u), this.f59902j, this.f59904l);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f59905m.mo31379f();
                    subscription.cancel();
                    EmptySubscription.m31792b(th, this.f62744d);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f59906n);
                this.f59906n.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f62745e.offer((Collection) it.next());
            }
            this.f62747g = true;
            if (m31780b()) {
                QueueDrainHelper.m31844d(this.f62745e, this.f62744d, false, this.f59905m, this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62747g = true;
            this.f59905m.mo31379f();
            synchronized (this) {
                this.f59906n.clear();
            }
            this.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            synchronized (this) {
                Iterator<U> it = this.f59906n.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62746f) {
                return;
            }
            try {
                U call = this.f59901i.call();
                Objects.requireNonNull(call, "The supplied buffer is null");
                U u = call;
                synchronized (this) {
                    if (this.f62746f) {
                        return;
                    }
                    this.f59906n.add(u);
                    this.f59905m.mo31383c(new RemoveFromBuffer(u), this.f59902j, this.f59904l);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                cancel();
                this.f62744d.onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        throw null;
    }
}
