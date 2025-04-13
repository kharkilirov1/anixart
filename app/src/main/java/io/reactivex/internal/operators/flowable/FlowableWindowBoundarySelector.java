package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends AbstractFlowableWithUpstream<T, Flowable<T>> {

    public static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends DisposableSubscriber<V> {

        /* renamed from: c */
        public final WindowBoundaryMainSubscriber<T, ?, V> f60846c;

        /* renamed from: d */
        public final UnicastProcessor<T> f60847d;

        /* renamed from: e */
        public boolean f60848e;

        public OperatorWindowBoundaryCloseSubscriber(WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, UnicastProcessor<T> unicastProcessor) {
            this.f60846c = windowBoundaryMainSubscriber;
            this.f60847d = unicastProcessor;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60848e) {
                return;
            }
            this.f60848e = true;
            WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber = this.f60846c;
            windowBoundaryMainSubscriber.f60853l.mo31394c(this);
            windowBoundaryMainSubscriber.f62745e.offer(new WindowOperation(this.f60847d, null));
            if (windowBoundaryMainSubscriber.m31780b()) {
                windowBoundaryMainSubscriber.m31601l();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60848e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60848e = true;
            WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber = this.f60846c;
            windowBoundaryMainSubscriber.f60854m.cancel();
            windowBoundaryMainSubscriber.f60853l.mo31379f();
            DisposableHelper.m31409a(windowBoundaryMainSubscriber.f60855n);
            windowBoundaryMainSubscriber.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(V v) {
            SubscriptionHelper.m31797a(this.f62988b);
            onComplete();
        }
    }

    public static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends DisposableSubscriber<B> {

        /* renamed from: c */
        public final WindowBoundaryMainSubscriber<T, B, ?> f60849c;

        public OperatorWindowBoundaryOpenSubscriber(WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.f60849c = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60849c.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber = this.f60849c;
            windowBoundaryMainSubscriber.f60854m.cancel();
            windowBoundaryMainSubscriber.f60853l.mo31379f();
            DisposableHelper.m31409a(windowBoundaryMainSubscriber.f60855n);
            windowBoundaryMainSubscriber.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber = this.f60849c;
            windowBoundaryMainSubscriber.f62745e.offer(new WindowOperation(null, b));
            if (windowBoundaryMainSubscriber.m31780b()) {
                windowBoundaryMainSubscriber.m31601l();
            }
        }
    }

    public static final class WindowBoundaryMainSubscriber<T, B, V> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements Subscription {

        /* renamed from: i */
        public final Publisher<B> f60850i;

        /* renamed from: j */
        public final Function<? super B, ? extends Publisher<V>> f60851j;

        /* renamed from: k */
        public final int f60852k;

        /* renamed from: l */
        public final CompositeDisposable f60853l;

        /* renamed from: m */
        public Subscription f60854m;

        /* renamed from: n */
        public final AtomicReference<Disposable> f60855n;

        /* renamed from: o */
        public final List<UnicastProcessor<T>> f60856o;

        /* renamed from: p */
        public final AtomicLong f60857p;

        /* renamed from: q */
        public final AtomicBoolean f60858q;

        public WindowBoundaryMainSubscriber(Subscriber<? super Flowable<T>> subscriber, Publisher<B> publisher, Function<? super B, ? extends Publisher<V>> function, int i2) {
            super(subscriber, new MpscLinkedQueue());
            this.f60855n = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f60857p = atomicLong;
            this.f60858q = new AtomicBoolean();
            this.f60850i = null;
            this.f60851j = null;
            this.f60852k = i2;
            this.f60853l = new CompositeDisposable();
            this.f60856o = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60858q.compareAndSet(false, true)) {
                DisposableHelper.m31409a(this.f60855n);
                if (this.f60857p.decrementAndGet() == 0) {
                    this.f60854m.cancel();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60854m, subscription)) {
                this.f60854m = subscription;
                this.f62744d.mo31352d(this);
                if (this.f60858q.get()) {
                    return;
                }
                OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new OperatorWindowBoundaryOpenSubscriber(this);
                if (this.f60855n.compareAndSet(null, operatorWindowBoundaryOpenSubscriber)) {
                    subscription.request(Long.MAX_VALUE);
                    this.f60850i.mo31351g(operatorWindowBoundaryOpenSubscriber);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public void m31601l() {
            SimpleQueue simpleQueue = this.f62745e;
            Subscriber<? super V> subscriber = this.f62744d;
            List<UnicastProcessor<T>> list = this.f60856o;
            int i2 = 1;
            while (true) {
                boolean z = this.f62747g;
                Object poll = simpleQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    this.f60853l.mo31379f();
                    DisposableHelper.m31409a(this.f60855n);
                    Throwable th = this.f62748h;
                    if (th != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z2) {
                    i2 = m31784h(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (poll instanceof WindowOperation) {
                    WindowOperation windowOperation = (WindowOperation) poll;
                    UnicastProcessor<T> unicastProcessor = windowOperation.f60859a;
                    if (unicastProcessor != null) {
                        if (list.remove(unicastProcessor)) {
                            windowOperation.f60859a.onComplete();
                            if (this.f60857p.decrementAndGet() == 0) {
                                this.f60853l.mo31379f();
                                DisposableHelper.m31409a(this.f60855n);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f60858q.get()) {
                        UnicastProcessor<T> m31856i = UnicastProcessor.m31856i(this.f60852k);
                        long m31786j = m31786j();
                        if (m31786j != 0) {
                            list.add(m31856i);
                            subscriber.onNext(m31856i);
                            if (m31786j != Long.MAX_VALUE) {
                                m31785i(1L);
                            }
                            try {
                                Publisher<V> apply = this.f60851j.apply(windowOperation.f60860b);
                                Objects.requireNonNull(apply, "The publisher supplied is null");
                                Publisher<V> publisher = apply;
                                OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new OperatorWindowBoundaryCloseSubscriber(this, m31856i);
                                if (this.f60853l.mo31393b(operatorWindowBoundaryCloseSubscriber)) {
                                    this.f60857p.getAndIncrement();
                                    publisher.mo31351g(operatorWindowBoundaryCloseSubscriber);
                                }
                            } catch (Throwable th2) {
                                cancel();
                                subscriber.onError(th2);
                            }
                        } else {
                            cancel();
                            subscriber.onError(new MissingBackpressureException("Could not deliver new window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62747g) {
                return;
            }
            this.f62747g = true;
            if (m31780b()) {
                m31601l();
            }
            if (this.f60857p.decrementAndGet() == 0) {
                this.f60853l.mo31379f();
            }
            this.f62744d.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62747g) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62748h = th;
            this.f62747g = true;
            if (m31780b()) {
                m31601l();
            }
            if (this.f60857p.decrementAndGet() == 0) {
                this.f60853l.mo31379f();
            }
            this.f62744d.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62747g) {
                return;
            }
            if (m31781c()) {
                Iterator<UnicastProcessor<T>> it = this.f60856o.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (m31784h(-1) == 0) {
                    return;
                }
            } else {
                this.f62745e.offer(t);
                if (!m31780b()) {
                    return;
                }
            }
            m31601l();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            m31787k(j2);
        }
    }

    public static final class WindowOperation<T, B> {

        /* renamed from: a */
        public final UnicastProcessor<T> f60859a;

        /* renamed from: b */
        public final B f60860b;

        public WindowOperation(UnicastProcessor<T> unicastProcessor, B b) {
            this.f60859a = unicastProcessor;
            this.f60860b = b;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Flowable<T>> subscriber) {
        this.f59782c.m31349b(new WindowBoundaryMainSubscriber(new SerializedSubscriber(subscriber), null, null, 0));
    }
}
