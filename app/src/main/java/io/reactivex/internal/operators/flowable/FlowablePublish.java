package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {

    public static final class FlowablePublisher<T> implements Publisher<T> {
        @Override // org.reactivestreams.Publisher
        /* renamed from: g */
        public void mo31351g(Subscriber<? super T> subscriber) {
            subscriber.mo31352d(new InnerSubscriber(subscriber));
            throw null;
        }
    }

    public static final class InnerSubscriber<T> extends AtomicLong implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60432b;

        /* renamed from: c */
        public long f60433c;

        public InnerSubscriber(Subscriber<? super T> subscriber) {
            this.f60432b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (get() != Long.MIN_VALUE) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31809b(this, j2);
            }
        }
    }

    public static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* renamed from: i */
        public static final InnerSubscriber[] f60434i = new InnerSubscriber[0];

        /* renamed from: j */
        public static final InnerSubscriber[] f60435j = new InnerSubscriber[0];

        /* renamed from: b */
        public final AtomicReference<PublishSubscriber<T>> f60436b;

        /* renamed from: c */
        public final int f60437c;

        /* renamed from: d */
        public final AtomicReference<InnerSubscriber<T>[]> f60438d;

        /* renamed from: e */
        public final AtomicReference<Subscription> f60439e;

        /* renamed from: f */
        public volatile Object f60440f;

        /* renamed from: g */
        public int f60441g;

        /* renamed from: h */
        public volatile SimpleQueue<T> f60442h;

        /* renamed from: a */
        public boolean m31545a(Object obj, boolean z) {
            int i2 = 0;
            if (obj != null) {
                if (!NotificationLite.m31834h(obj)) {
                    Throwable m31833f = NotificationLite.m31833f(obj);
                    this.f60436b.compareAndSet(this, null);
                    InnerSubscriber<T>[] andSet = this.f60438d.getAndSet(f60435j);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i2 < length) {
                            andSet[i2].f60432b.onError(m31833f);
                            i2++;
                        }
                    } else {
                        RxJavaPlugins.m31848b(m31833f);
                    }
                    return true;
                }
                if (z) {
                    this.f60436b.compareAndSet(this, null);
                    InnerSubscriber<T>[] andSet2 = this.f60438d.getAndSet(f60435j);
                    int length2 = andSet2.length;
                    while (i2 < length2) {
                        andSet2[i2].f60432b.onComplete();
                        i2++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x011b, code lost:
        
            if (r11 == 0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        
            if (r25.f60441g == 1) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
        
            r25.f60439e.get().request(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012e, code lost:
        
            r4 = r0;
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
        
            if (r11 == 0) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
        
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
        
            if (r25.f60441g == 1) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0139, code lost:
        
            r25.f60439e.get().request(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
        
            if (r14 == 0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x014c, code lost:
        
            if (r8 != false) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0014, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0145, code lost:
        
            r3 = 1;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31546b() {
            /*
                Method dump skipped, instructions count: 353
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.m31546b():void");
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this.f60439e, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f60441g = mo31420F;
                        this.f60442h = queueSubscription;
                        this.f60440f = NotificationLite.COMPLETE;
                        m31546b();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60441g = mo31420F;
                        this.f60442h = queueSubscription;
                        subscription.request(this.f60437c);
                        return;
                    }
                }
                this.f60442h = new SpscArrayQueue(this.f60437c);
                subscription.request(this.f60437c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            InnerSubscriber<T>[] innerSubscriberArr = this.f60438d.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = f60435j;
            if (innerSubscriberArr == innerSubscriberArr2 || this.f60438d.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            this.f60436b.compareAndSet(this, null);
            SubscriptionHelper.m31797a(this.f60439e);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60440f == null) {
                this.f60440f = NotificationLite.COMPLETE;
                m31546b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60440f != null) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60440f = NotificationLite.m31832e(th);
                m31546b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60441g != 0 || this.f60442h.offer(t)) {
                m31546b();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60438d.get() == f60435j;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
