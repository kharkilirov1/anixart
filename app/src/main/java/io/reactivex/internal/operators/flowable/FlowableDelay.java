package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60040b;

        /* renamed from: c */
        public final long f60041c;

        /* renamed from: d */
        public final TimeUnit f60042d;

        /* renamed from: e */
        public final Scheduler.Worker f60043e;

        /* renamed from: f */
        public final boolean f60044f;

        /* renamed from: g */
        public Subscription f60045g;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.f60040b.onComplete();
                } finally {
                    DelaySubscriber.this.f60043e.mo31379f();
                }
            }
        }

        public final class OnError implements Runnable {

            /* renamed from: b */
            public final Throwable f60047b;

            public OnError(Throwable th) {
                this.f60047b = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.f60040b.onError(this.f60047b);
                } finally {
                    DelaySubscriber.this.f60043e.mo31379f();
                }
            }
        }

        public final class OnNext implements Runnable {

            /* renamed from: b */
            public final T f60049b;

            public OnNext(T t) {
                this.f60049b = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.f60040b.onNext(this.f60049b);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60045g.cancel();
            this.f60043e.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60045g, subscription)) {
                this.f60045g = subscription;
                this.f60040b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60043e.mo31383c(new OnComplete(), this.f60041c, this.f60042d);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60043e.mo31383c(new OnError(th), this.f60044f ? this.f60041c : 0L, this.f60042d);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60043e.mo31383c(new OnNext(t), this.f60041c, this.f60042d);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60045g.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
