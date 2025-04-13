package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60629b;

        /* renamed from: c */
        public final long f60630c;

        /* renamed from: f */
        public final SpscLinkedArrayQueue<Object> f60633f;

        /* renamed from: g */
        public final boolean f60634g;

        /* renamed from: h */
        public Subscription f60635h;

        /* renamed from: j */
        public volatile boolean f60637j;

        /* renamed from: k */
        public volatile boolean f60638k;

        /* renamed from: l */
        public Throwable f60639l;

        /* renamed from: i */
        public final AtomicLong f60636i = new AtomicLong();

        /* renamed from: d */
        public final TimeUnit f60631d = null;

        /* renamed from: e */
        public final Scheduler f60632e = null;

        public SkipLastTimedSubscriber(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2, boolean z) {
            this.f60629b = subscriber;
            this.f60630c = j2;
            this.f60633f = new SpscLinkedArrayQueue<>(i2);
            this.f60634g = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31586a() {
            /*
                r24 = this;
                r0 = r24
                int r1 = r24.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                org.reactivestreams.Subscriber<? super T> r1 = r0.f60629b
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r0.f60633f
                boolean r3 = r0.f60634g
                java.util.concurrent.TimeUnit r4 = r0.f60631d
                io.reactivex.Scheduler r5 = r0.f60632e
                long r6 = r0.f60630c
                r9 = 1
            L16:
                java.util.concurrent.atomic.AtomicLong r10 = r0.f60636i
                long r10 = r10.get()
                r14 = 0
            L1e:
                int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r16 == 0) goto L8a
                boolean r8 = r0.f60638k
                java.lang.Object r17 = r2.peek()
                java.lang.Long r17 = (java.lang.Long) r17
                r18 = 0
                if (r17 != 0) goto L31
                r19 = 1
                goto L33
            L31:
                r19 = 0
            L33:
                long r20 = r5.mo31375b(r4)
                if (r19 != 0) goto L45
                long r22 = r17.longValue()
                long r20 = r20 - r6
                int r17 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
                if (r17 <= 0) goto L45
                r19 = 1
            L45:
                boolean r12 = r0.f60637j
                if (r12 == 0) goto L51
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r8 = r0.f60633f
                r8.clear()
            L4e:
                r18 = 1
                goto L76
            L51:
                if (r8 == 0) goto L76
                if (r3 == 0) goto L63
                if (r19 == 0) goto L76
                java.lang.Throwable r8 = r0.f60639l
                if (r8 == 0) goto L5f
                r1.onError(r8)
                goto L4e
            L5f:
                r1.onComplete()
                goto L4e
            L63:
                java.lang.Throwable r8 = r0.f60639l
                if (r8 == 0) goto L70
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r12 = r0.f60633f
                r12.clear()
                r1.onError(r8)
                goto L4e
            L70:
                if (r19 == 0) goto L76
                r1.onComplete()
                goto L4e
            L76:
                if (r18 == 0) goto L79
                return
            L79:
                if (r19 == 0) goto L7c
                goto L8a
            L7c:
                r2.poll()
                java.lang.Object r8 = r2.poll()
                r1.onNext(r8)
                r12 = 1
                long r14 = r14 + r12
                goto L1e
            L8a:
                r10 = 0
                int r8 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r8 == 0) goto L95
                java.util.concurrent.atomic.AtomicLong r8 = r0.f60636i
                io.reactivex.internal.util.BackpressureHelper.m31812e(r8, r14)
            L95:
                int r8 = -r9
                int r9 = r0.addAndGet(r8)
                if (r9 != 0) goto L16
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSkipLastTimed.SkipLastTimedSubscriber.m31586a():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60637j) {
                return;
            }
            this.f60637j = true;
            this.f60635h.cancel();
            if (getAndIncrement() == 0) {
                this.f60633f.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60635h, subscription)) {
                this.f60635h = subscription;
                this.f60629b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60638k = true;
            m31586a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60639l = th;
            this.f60638k = true;
            m31586a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60633f.m31765c(Long.valueOf(this.f60632e.mo31375b(this.f60631d)), t);
            m31586a();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60636i, j2);
                m31586a();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SkipLastTimedSubscriber(subscriber, 0L, null, null, 0, false));
    }
}
