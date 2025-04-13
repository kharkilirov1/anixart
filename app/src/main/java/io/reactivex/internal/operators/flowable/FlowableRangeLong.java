package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableRangeLong extends Flowable<Long> {

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {

        /* renamed from: b */
        public final long f60467b;

        /* renamed from: c */
        public long f60468c;

        /* renamed from: d */
        public volatile boolean f60469d;

        public BaseRangeSubscription(long j2, long j3) {
            this.f60468c = j2;
            this.f60467b = j3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public final int mo31420F(int i2) {
            return i2 & 1;
        }

        /* renamed from: a */
        public abstract void mo31553a();

        /* renamed from: b */
        public abstract void mo31554b(long j2);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f60469d = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f60468c = this.f60467b;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f60468c == this.f60467b;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Object poll() throws Exception {
            long j2 = this.f60468c;
            if (j2 == this.f60467b) {
                return null;
            }
            this.f60468c = 1 + j2;
            return Long.valueOf(j2);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.m31803h(j2) && BackpressureHelper.m31808a(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    mo31553a();
                } else {
                    mo31554b(j2);
                }
            }
        }
    }

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {

        /* renamed from: e */
        public final ConditionalSubscriber<? super Long> f60470e;

        public RangeConditionalSubscription(ConditionalSubscriber<? super Long> conditionalSubscriber, long j2, long j3) {
            super(j2, j3);
            this.f60470e = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* renamed from: a */
        public void mo31553a() {
            long j2 = this.f60467b;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.f60470e;
            for (long j3 = this.f60468c; j3 != j2; j3++) {
                if (this.f60469d) {
                    return;
                }
                conditionalSubscriber.mo31428E(Long.valueOf(j3));
            }
            if (this.f60469d) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            r12.f60468c = r2;
            r13 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31554b(long r13) {
            /*
                r12 = this;
                long r0 = r12.f60467b
                long r2 = r12.f60468c
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super java.lang.Long> r4 = r12.f60470e
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 == 0) goto L25
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L25
                boolean r9 = r12.f60469d
                if (r9 == 0) goto L16
                return
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                boolean r9 = r4.mo31428E(r9)
                r10 = 1
                if (r9 == 0) goto L23
                long r7 = r7 + r10
            L23:
                long r2 = r2 + r10
                goto L9
            L25:
                int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r13 != 0) goto L31
                boolean r13 = r12.f60469d
                if (r13 != 0) goto L30
                r4.onComplete()
            L30:
                return
            L31:
                long r13 = r12.get()
                int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r9 != 0) goto L9
                r12.f60468c = r2
                long r13 = -r7
                long r13 = r12.addAndGet(r13)
                int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeConditionalSubscription.mo31554b(long):void");
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {

        /* renamed from: e */
        public final Subscriber<? super Long> f60471e;

        public RangeSubscription(Subscriber<? super Long> subscriber, long j2, long j3) {
            super(j2, j3);
            this.f60471e = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* renamed from: a */
        public void mo31553a() {
            long j2 = this.f60467b;
            Subscriber<? super Long> subscriber = this.f60471e;
            for (long j3 = this.f60468c; j3 != j2; j3++) {
                if (this.f60469d) {
                    return;
                }
                subscriber.onNext(Long.valueOf(j3));
            }
            if (this.f60469d) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            r11.f60468c = r2;
            r12 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31554b(long r12) {
            /*
                r11 = this;
                long r0 = r11.f60467b
                long r2 = r11.f60468c
                org.reactivestreams.Subscriber<? super java.lang.Long> r4 = r11.f60471e
                r5 = 0
            L8:
                r7 = r5
            L9:
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 == 0) goto L22
                int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r9 == 0) goto L22
                boolean r9 = r11.f60469d
                if (r9 == 0) goto L16
                return
            L16:
                java.lang.Long r9 = java.lang.Long.valueOf(r2)
                r4.onNext(r9)
                r9 = 1
                long r7 = r7 + r9
                long r2 = r2 + r9
                goto L9
            L22:
                int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r12 != 0) goto L2e
                boolean r12 = r11.f60469d
                if (r12 != 0) goto L2d
                r4.onComplete()
            L2d:
                return
            L2e:
                long r12 = r11.get()
                int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
                if (r9 != 0) goto L9
                r11.f60468c = r2
                long r12 = -r7
                long r12 = r11.addAndGet(r12)
                int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r7 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableRangeLong.RangeSubscription.mo31554b(long):void");
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Long> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.mo31352d(new RangeConditionalSubscription((ConditionalSubscriber) subscriber, 0L, 0L));
        } else {
            subscriber.mo31352d(new RangeSubscription(subscriber, 0L, 0L));
        }
    }
}
