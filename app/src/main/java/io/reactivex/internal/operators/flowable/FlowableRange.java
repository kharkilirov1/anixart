package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableRange extends Flowable<Integer> {

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {

        /* renamed from: b */
        public final int f60462b;

        /* renamed from: c */
        public int f60463c;

        /* renamed from: d */
        public volatile boolean f60464d;

        public BaseRangeSubscription(int i2, int i3) {
            this.f60463c = i2;
            this.f60462b = i3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public final int mo31420F(int i2) {
            return i2 & 1;
        }

        /* renamed from: a */
        public abstract void mo31551a();

        /* renamed from: b */
        public abstract void mo31552b(long j2);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f60464d = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f60463c = this.f60462b;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f60463c == this.f60462b;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Object poll() throws Exception {
            int i2 = this.f60463c;
            if (i2 == this.f60462b) {
                return null;
            }
            this.f60463c = i2 + 1;
            return Integer.valueOf(i2);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.m31803h(j2) && BackpressureHelper.m31808a(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    mo31551a();
                } else {
                    mo31552b(j2);
                }
            }
        }
    }

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {

        /* renamed from: e */
        public final ConditionalSubscriber<? super Integer> f60465e;

        public RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i2, int i3) {
            super(i2, i3);
            this.f60465e = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* renamed from: a */
        public void mo31551a() {
            int i2 = this.f60462b;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.f60465e;
            for (int i3 = this.f60463c; i3 != i2; i3++) {
                if (this.f60464d) {
                    return;
                }
                conditionalSubscriber.mo31428E(Integer.valueOf(i3));
            }
            if (this.f60464d) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r9.f60463c = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31552b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f60462b
                int r1 = r9.f60463c
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Integer> r2 = r9.f60465e
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L24
                if (r1 == r0) goto L24
                boolean r7 = r9.f60464d
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                boolean r7 = r2.mo31428E(r7)
                if (r7 == 0) goto L21
                r7 = 1
                long r5 = r5 + r7
            L21:
                int r1 = r1 + 1
                goto L9
            L24:
                if (r1 != r0) goto L2e
                boolean r10 = r9.f60464d
                if (r10 != 0) goto L2d
                r2.onComplete()
            L2d:
                return
            L2e:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f60463c = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRange.RangeConditionalSubscription.mo31552b(long):void");
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {

        /* renamed from: e */
        public final Subscriber<? super Integer> f60466e;

        public RangeSubscription(Subscriber<? super Integer> subscriber, int i2, int i3) {
            super(i2, i3);
            this.f60466e = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* renamed from: a */
        public void mo31551a() {
            int i2 = this.f60462b;
            Subscriber<? super Integer> subscriber = this.f60466e;
            for (int i3 = this.f60463c; i3 != i2; i3++) {
                if (this.f60464d) {
                    return;
                }
                subscriber.onNext(Integer.valueOf(i3));
            }
            if (this.f60464d) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            r9.f60463c = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31552b(long r10) {
            /*
                r9 = this;
                int r0 = r9.f60462b
                int r1 = r9.f60463c
                org.reactivestreams.Subscriber<? super java.lang.Integer> r2 = r9.f60466e
                r3 = 0
            L8:
                r5 = r3
            L9:
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 == 0) goto L21
                if (r1 == r0) goto L21
                boolean r7 = r9.f60464d
                if (r7 == 0) goto L14
                return
            L14:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                r2.onNext(r7)
                r7 = 1
                long r5 = r5 + r7
                int r1 = r1 + 1
                goto L9
            L21:
                if (r1 != r0) goto L2b
                boolean r10 = r9.f60464d
                if (r10 != 0) goto L2a
                r2.onComplete()
            L2a:
                return
            L2b:
                long r10 = r9.get()
                int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r7 != 0) goto L9
                r9.f60463c = r1
                long r10 = -r5
                long r10 = r9.addAndGet(r10)
                int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRange.RangeSubscription.mo31552b(long):void");
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Integer> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.mo31352d(new RangeConditionalSubscription((ConditionalSubscriber) subscriber, 0, 0));
        } else {
            subscriber.mo31352d(new RangeSubscription(subscriber, 0, 0));
        }
    }
}
