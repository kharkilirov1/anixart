package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {

        /* renamed from: b */
        public final ConditionalSubscriber<? super T> f60074b;

        /* renamed from: c */
        public final Action f60075c = null;

        /* renamed from: d */
        public Subscription f60076d;

        /* renamed from: e */
        public QueueSubscription<T> f60077e;

        /* renamed from: f */
        public boolean f60078f;

        public DoFinallyConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.f60074b = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            return this.f60074b.mo31428E(t);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            QueueSubscription<T> queueSubscription = this.f60077e;
            if (queueSubscription == null || (i2 & 4) != 0) {
                return 0;
            }
            int mo31420F = queueSubscription.mo31420F(i2);
            if (mo31420F != 0) {
                this.f60078f = mo31420F == 1;
            }
            return mo31420F;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60076d.cancel();
            m31486f();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f60077e.clear();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60076d, subscription)) {
                this.f60076d = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f60077e = (QueueSubscription) subscription;
                }
                this.f60074b.mo31352d(this);
            }
        }

        /* renamed from: f */
        public void m31486f() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f60075c.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f60077e.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60074b.onComplete();
            m31486f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60074b.onError(th);
            m31486f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60074b.onNext(t);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f60077e.poll();
            if (poll == null && this.f60078f) {
                m31486f();
            }
            return poll;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60076d.request(j2);
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60079b;

        /* renamed from: c */
        public final Action f60080c = null;

        /* renamed from: d */
        public Subscription f60081d;

        /* renamed from: e */
        public QueueSubscription<T> f60082e;

        /* renamed from: f */
        public boolean f60083f;

        public DoFinallySubscriber(Subscriber<? super T> subscriber, Action action) {
            this.f60079b = subscriber;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            QueueSubscription<T> queueSubscription = this.f60082e;
            if (queueSubscription == null || (i2 & 4) != 0) {
                return 0;
            }
            int mo31420F = queueSubscription.mo31420F(i2);
            if (mo31420F != 0) {
                this.f60083f = mo31420F == 1;
            }
            return mo31420F;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60081d.cancel();
            m31487f();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f60082e.clear();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60081d, subscription)) {
                this.f60081d = subscription;
                if (subscription instanceof QueueSubscription) {
                    this.f60082e = (QueueSubscription) subscription;
                }
                this.f60079b.mo31352d(this);
            }
        }

        /* renamed from: f */
        public void m31487f() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f60080c.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f60082e.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60079b.onComplete();
            m31487f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60079b.onError(th);
            m31487f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60079b.onNext(t);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f60082e.poll();
            if (poll == null && this.f60083f) {
                m31487f();
            }
            return poll;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60081d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f59782c.m31349b(new DoFinallyConditionalSubscriber((ConditionalSubscriber) subscriber, null));
        } else {
            this.f59782c.m31349b(new DoFinallySubscriber(subscriber, null));
        }
    }
}
