package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class FlowableFromArray<T> extends Flowable<T> {

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {

        /* renamed from: e */
        public final ConditionalSubscriber<? super T> f60199e;

        public ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(null);
            this.f60199e = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* renamed from: a */
        public void mo31506a() {
            T[] tArr = this.f60201b;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f60199e;
            for (int i2 = this.f60202c; i2 != length; i2++) {
                if (this.f60203d) {
                    return;
                }
                T t = tArr[i2];
                if (t == null) {
                    conditionalSubscriber.onError(new NullPointerException(C0000a.m8e("The element at index ", i2, " is null")));
                    return;
                }
                conditionalSubscriber.mo31428E(t);
            }
            if (this.f60203d) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        
            r10.f60202c = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31507b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f60201b
                int r1 = r0.length
                int r2 = r10.f60202c
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r3 = r10.f60199e
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L36
                if (r2 == r1) goto L36
                boolean r8 = r10.f60203d
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L2a
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "The element at index "
                java.lang.String r0 = " is null"
                java.lang.String r12 = p000a.C0000a.m8e(r12, r2, r0)
                r11.<init>(r12)
                r3.onError(r11)
                return
            L2a:
                boolean r8 = r3.mo31428E(r8)
                if (r8 == 0) goto L33
                r8 = 1
                long r6 = r6 + r8
            L33:
                int r2 = r2 + 1
                goto La
            L36:
                if (r2 != r1) goto L40
                boolean r11 = r10.f60203d
                if (r11 != 0) goto L3f
                r3.onComplete()
            L3f:
                return
            L40:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f60202c = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromArray.ArrayConditionalSubscription.mo31507b(long):void");
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {

        /* renamed from: e */
        public final Subscriber<? super T> f60200e;

        public ArraySubscription(Subscriber<? super T> subscriber, T[] tArr) {
            super(null);
            this.f60200e = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* renamed from: a */
        public void mo31506a() {
            T[] tArr = this.f60201b;
            int length = tArr.length;
            Subscriber<? super T> subscriber = this.f60200e;
            for (int i2 = this.f60202c; i2 != length; i2++) {
                if (this.f60203d) {
                    return;
                }
                T t = tArr[i2];
                if (t == null) {
                    subscriber.onError(new NullPointerException(C0000a.m8e("The element at index ", i2, " is null")));
                    return;
                }
                subscriber.onNext(t);
            }
            if (this.f60203d) {
                return;
            }
            subscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        
            r10.f60202c = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31507b(long r11) {
            /*
                r10 = this;
                T[] r0 = r10.f60201b
                int r1 = r0.length
                int r2 = r10.f60202c
                org.reactivestreams.Subscriber<? super T> r3 = r10.f60200e
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 == 0) goto L33
                if (r2 == r1) goto L33
                boolean r8 = r10.f60203d
                if (r8 == 0) goto L15
                return
            L15:
                r8 = r0[r2]
                if (r8 != 0) goto L2a
                java.lang.NullPointerException r11 = new java.lang.NullPointerException
                java.lang.String r12 = "The element at index "
                java.lang.String r0 = " is null"
                java.lang.String r12 = p000a.C0000a.m8e(r12, r2, r0)
                r11.<init>(r12)
                r3.onError(r11)
                return
            L2a:
                r3.onNext(r8)
                r8 = 1
                long r6 = r6 + r8
                int r2 = r2 + 1
                goto La
            L33:
                if (r2 != r1) goto L3d
                boolean r11 = r10.f60203d
                if (r11 != 0) goto L3c
                r3.onComplete()
            L3c:
                return
            L3d:
                long r11 = r10.get()
                int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f60202c = r2
                long r11 = -r6
                long r11 = r10.addAndGet(r11)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromArray.ArraySubscription.mo31507b(long):void");
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {

        /* renamed from: b */
        public final T[] f60201b;

        /* renamed from: c */
        public int f60202c;

        /* renamed from: d */
        public volatile boolean f60203d;

        public BaseArraySubscription(T[] tArr) {
            this.f60201b = tArr;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public final int mo31420F(int i2) {
            return i2 & 1;
        }

        /* renamed from: a */
        public abstract void mo31506a();

        /* renamed from: b */
        public abstract void mo31507b(long j2);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f60203d = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f60202c = this.f60201b.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f60202c == this.f60201b.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i2 = this.f60202c;
            T[] tArr = this.f60201b;
            if (i2 == tArr.length) {
                return null;
            }
            this.f60202c = i2 + 1;
            T t = tArr[i2];
            Objects.requireNonNull(t, "array element is null");
            return t;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.m31803h(j2) && BackpressureHelper.m31808a(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    mo31506a();
                } else {
                    mo31507b(j2);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.mo31352d(new ArrayConditionalSubscription((ConditionalSubscriber) subscriber, null));
        } else {
            subscriber.mo31352d(new ArraySubscription(subscriber, null));
        }
    }
}
