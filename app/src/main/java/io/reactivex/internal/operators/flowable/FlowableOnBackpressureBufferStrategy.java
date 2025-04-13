package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 */
    public static /* synthetic */ class C65121 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60399a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f60399a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60399a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60400b;

        /* renamed from: e */
        public final long f60403e;

        /* renamed from: h */
        public Subscription f60406h;

        /* renamed from: i */
        public volatile boolean f60407i;

        /* renamed from: j */
        public volatile boolean f60408j;

        /* renamed from: k */
        public Throwable f60409k;

        /* renamed from: c */
        public final Action f60401c = null;

        /* renamed from: d */
        public final BackpressureOverflowStrategy f60402d = null;

        /* renamed from: f */
        public final AtomicLong f60404f = new AtomicLong();

        /* renamed from: g */
        public final Deque<T> f60405g = new ArrayDeque();

        public OnBackpressureBufferStrategySubscriber(Subscriber<? super T> subscriber, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j2) {
            this.f60400b = subscriber;
            this.f60403e = j2;
        }

        /* renamed from: a */
        public void m31541a(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        /* renamed from: b */
        public void m31542b() {
            boolean isEmpty;
            T poll;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.f60405g;
            Subscriber<? super T> subscriber = this.f60400b;
            int i2 = 1;
            do {
                long j2 = this.f60404f.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.f60407i) {
                        m31541a(deque);
                        return;
                    }
                    boolean z = this.f60408j;
                    synchronized (deque) {
                        poll = deque.poll();
                    }
                    boolean z2 = poll == null;
                    if (z) {
                        Throwable th = this.f60409k;
                        if (th != null) {
                            m31541a(deque);
                            subscriber.onError(th);
                            return;
                        } else if (z2) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(poll);
                    j3++;
                }
                if (j3 == j2) {
                    if (this.f60407i) {
                        m31541a(deque);
                        return;
                    }
                    boolean z3 = this.f60408j;
                    synchronized (deque) {
                        isEmpty = deque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.f60409k;
                        if (th2 != null) {
                            m31541a(deque);
                            subscriber.onError(th2);
                            return;
                        } else if (isEmpty) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j3 != 0) {
                    BackpressureHelper.m31812e(this.f60404f, j3);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60407i = true;
            this.f60406h.cancel();
            if (getAndIncrement() == 0) {
                m31541a(this.f60405g);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60406h, subscription)) {
                this.f60406h = subscription;
                this.f60400b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60408j = true;
            m31542b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60408j) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60409k = th;
            this.f60408j = true;
            m31542b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.f60408j) {
                return;
            }
            Deque<T> deque = this.f60405g;
            synchronized (deque) {
                z = false;
                z2 = true;
                if (deque.size() == this.f60403e) {
                    int ordinal = this.f60402d.ordinal();
                    if (ordinal == 1) {
                        deque.poll();
                        deque.offer(t);
                    } else if (ordinal == 2) {
                        deque.pollLast();
                        deque.offer(t);
                    }
                    z = true;
                } else {
                    deque.offer(t);
                }
                z2 = false;
            }
            if (!z) {
                if (!z2) {
                    m31542b();
                    return;
                } else {
                    this.f60406h.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            Action action = this.f60401c;
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f60406h.cancel();
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60404f, j2);
                m31542b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new OnBackpressureBufferStrategySubscriber(subscriber, null, null, 0L));
    }
}
