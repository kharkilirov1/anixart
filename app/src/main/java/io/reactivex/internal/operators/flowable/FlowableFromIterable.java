package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {

    /* renamed from: c */
    public final Iterable<? extends T> f60204c;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {

        /* renamed from: b */
        public Iterator<? extends T> f60205b;

        /* renamed from: c */
        public volatile boolean f60206c;

        /* renamed from: d */
        public boolean f60207d;

        public BaseRangeSubscription(Iterator<? extends T> it) {
            this.f60205b = it;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public final int mo31420F(int i2) {
            return i2 & 1;
        }

        /* renamed from: a */
        public abstract void mo31509a();

        /* renamed from: b */
        public abstract void mo31510b(long j2);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f60206c = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f60205b = null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f60205b;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<? extends T> it = this.f60205b;
            if (it == null) {
                return null;
            }
            if (!this.f60207d) {
                this.f60207d = true;
            } else if (!it.hasNext()) {
                return null;
            }
            T next = this.f60205b.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            if (SubscriptionHelper.m31803h(j2) && BackpressureHelper.m31808a(this, j2) == 0) {
                if (j2 == Long.MAX_VALUE) {
                    mo31509a();
                } else {
                    mo31510b(j2);
                }
            }
        }
    }

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {

        /* renamed from: e */
        public final ConditionalSubscriber<? super T> f60208e;

        public IteratorConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.f60208e = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* renamed from: a */
        public void mo31509a() {
            Iterator<? extends T> it = this.f60205b;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f60208e;
            while (!this.f60206c) {
                try {
                    T next = it.next();
                    if (this.f60206c) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.mo31428E(next);
                    if (this.f60206c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f60206c) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31510b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f60205b
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1 = r8.f60208e
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L53
                boolean r6 = r8.f60206c
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
                boolean r7 = r8.f60206c
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                boolean r6 = r1.mo31428E(r6)
                boolean r7 = r8.f60206c
                if (r7 == 0) goto L2f
                return
            L2f:
                boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
                if (r7 != 0) goto L3d
                boolean r9 = r8.f60206c
                if (r9 != 0) goto L3c
                r1.onComplete()
            L3c:
                return
            L3d:
                if (r6 == 0) goto L7
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L43:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r9)
                r1.onError(r9)
                return
            L4b:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r9)
                r1.onError(r9)
                return
            L53:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorConditionalSubscription.mo31510b(long):void");
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {

        /* renamed from: e */
        public final Subscriber<? super T> f60209e;

        public IteratorSubscription(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
            super(it);
            this.f60209e = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* renamed from: a */
        public void mo31509a() {
            Iterator<? extends T> it = this.f60205b;
            Subscriber<? super T> subscriber = this.f60209e;
            while (!this.f60206c) {
                try {
                    T next = it.next();
                    if (this.f60206c) {
                        return;
                    }
                    if (next == null) {
                        subscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    subscriber.onNext(next);
                    if (this.f60206c) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f60206c) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        subscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    subscriber.onError(th2);
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
        
            r9 = addAndGet(-r4);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31510b(long r9) {
            /*
                r8 = this;
                java.util.Iterator<? extends T> r0 = r8.f60205b
                org.reactivestreams.Subscriber<? super T> r1 = r8.f60209e
                r2 = 0
            L6:
                r4 = r2
            L7:
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto L50
                boolean r6 = r8.f60206c
                if (r6 == 0) goto L10
                return
            L10:
                java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
                boolean r7 = r8.f60206c
                if (r7 == 0) goto L19
                return
            L19:
                if (r6 != 0) goto L26
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "Iterator.next() returned a null value"
                r9.<init>(r10)
                r1.onError(r9)
                return
            L26:
                r1.onNext(r6)
                boolean r6 = r8.f60206c
                if (r6 == 0) goto L2e
                return
            L2e:
                boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
                if (r6 != 0) goto L3c
                boolean r9 = r8.f60206c
                if (r9 != 0) goto L3b
                r1.onComplete()
            L3b:
                return
            L3c:
                r6 = 1
                long r4 = r4 + r6
                goto L7
            L40:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r9)
                r1.onError(r9)
                return
            L48:
                r9 = move-exception
                io.reactivex.exceptions.Exceptions.m31402a(r9)
                r1.onError(r9)
                return
            L50:
                long r9 = r8.get()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L7
                long r9 = -r4
                long r9 = r8.addAndGet(r9)
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 != 0) goto L6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFromIterable.IteratorSubscription.mo31510b(long):void");
        }
    }

    /* renamed from: e */
    public static <T> void m31508e(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        try {
            if (!it.hasNext()) {
                subscriber.mo31352d(emptySubscription);
                subscriber.onComplete();
            } else if (subscriber instanceof ConditionalSubscriber) {
                subscriber.mo31352d(new IteratorConditionalSubscription((ConditionalSubscriber) subscriber, it));
            } else {
                subscriber.mo31352d(new IteratorSubscription(subscriber, it));
            }
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(emptySubscription);
            subscriber.onError(th);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        try {
            m31508e(subscriber, this.f60204c.iterator());
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
