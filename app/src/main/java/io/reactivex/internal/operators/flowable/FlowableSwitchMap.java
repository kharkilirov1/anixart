package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {

        /* renamed from: b */
        public final SwitchMapSubscriber<T, R> f60664b;

        /* renamed from: c */
        public final long f60665c;

        /* renamed from: d */
        public final int f60666d;

        /* renamed from: e */
        public volatile SimpleQueue<R> f60667e;

        /* renamed from: f */
        public volatile boolean f60668f;

        /* renamed from: g */
        public int f60669g;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j2, int i2) {
            this.f60664b = switchMapSubscriber;
            this.f60665c = j2;
            this.f60666d = i2;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f60669g = mo31420F;
                        this.f60667e = queueSubscription;
                        this.f60668f = true;
                        this.f60664b.m31589b();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60669g = mo31420F;
                        this.f60667e = queueSubscription;
                        subscription.request(this.f60666d);
                        return;
                    }
                }
                this.f60667e = new SpscArrayQueue(this.f60666d);
                subscription.request(this.f60666d);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.f60664b;
            if (this.f60665c == switchMapSubscriber.f60681l) {
                this.f60668f = true;
                switchMapSubscriber.m31589b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.f60664b;
            if (this.f60665c != switchMapSubscriber.f60681l || !ExceptionHelper.m31817a(switchMapSubscriber.f60676g, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!switchMapSubscriber.f60674e) {
                switchMapSubscriber.f60678i.cancel();
            }
            this.f60668f = true;
            switchMapSubscriber.m31589b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.f60664b;
            if (this.f60665c == switchMapSubscriber.f60681l) {
                if (this.f60669g != 0 || this.f60667e.offer(r)) {
                    switchMapSubscriber.m31589b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: m */
        public static final SwitchMapInnerSubscriber<Object, Object> f60670m;

        /* renamed from: b */
        public final Subscriber<? super R> f60671b;

        /* renamed from: d */
        public final int f60673d;

        /* renamed from: e */
        public final boolean f60674e;

        /* renamed from: f */
        public volatile boolean f60675f;

        /* renamed from: h */
        public volatile boolean f60677h;

        /* renamed from: i */
        public Subscription f60678i;

        /* renamed from: l */
        public volatile long f60681l;

        /* renamed from: j */
        public final AtomicReference<SwitchMapInnerSubscriber<T, R>> f60679j = new AtomicReference<>();

        /* renamed from: k */
        public final AtomicLong f60680k = new AtomicLong();

        /* renamed from: c */
        public final Function<? super T, ? extends Publisher<? extends R>> f60672c = null;

        /* renamed from: g */
        public final AtomicThrowable f60676g = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            f60670m = switchMapInnerSubscriber;
            SubscriptionHelper.m31797a(switchMapInnerSubscriber);
        }

        public SwitchMapSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i2, boolean z) {
            this.f60671b = subscriber;
            this.f60673d = i2;
            this.f60674e = z;
        }

        /* renamed from: a */
        public void m31588a() {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.f60679j.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber3 = f60670m;
            if (switchMapInnerSubscriber2 == switchMapInnerSubscriber3 || (switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.f60679j.getAndSet(switchMapInnerSubscriber3)) == switchMapInnerSubscriber3 || switchMapInnerSubscriber == null) {
                return;
            }
            SubscriptionHelper.m31797a(switchMapInnerSubscriber);
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
        
            r14 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x011d, code lost:
        
            if (r12 == 0) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0121, code lost:
        
            if (r17.f60677h != false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x012a, code lost:
        
            if (r8 == Long.MAX_VALUE) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x012c, code lost:
        
            r17.f60680k.addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0132, code lost:
        
            r6.get().request(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x013b, code lost:
        
            if (r14 == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x000c, code lost:
        
            continue;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31589b() {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber.m31589b():void");
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60677h) {
                return;
            }
            this.f60677h = true;
            this.f60678i.cancel();
            m31588a();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60678i, subscription)) {
                this.f60678i = subscription;
                this.f60671b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60675f) {
                return;
            }
            this.f60675f = true;
            m31589b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60675f || !ExceptionHelper.m31817a(this.f60676g, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f60674e) {
                m31588a();
            }
            this.f60675f = true;
            m31589b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.f60675f) {
                return;
            }
            long j2 = this.f60681l + 1;
            this.f60681l = j2;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.f60679j.get();
            if (switchMapInnerSubscriber2 != null) {
                SubscriptionHelper.m31797a(switchMapInnerSubscriber2);
            }
            try {
                Publisher<? extends R> apply = this.f60672c.apply(t);
                Objects.requireNonNull(apply, "The publisher returned is null");
                Publisher<? extends R> publisher = apply;
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber<>(this, j2, this.f60673d);
                do {
                    switchMapInnerSubscriber = this.f60679j.get();
                    if (switchMapInnerSubscriber == f60670m) {
                        return;
                    }
                } while (!this.f60679j.compareAndSet(switchMapInnerSubscriber, switchMapInnerSubscriber3));
                publisher.mo31351g(switchMapInnerSubscriber3);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60678i.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60680k, j2);
                if (this.f60681l == 0) {
                    this.f60678i.request(Long.MAX_VALUE);
                } else {
                    m31589b();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.m31578a(this.f59782c, subscriber, null)) {
            return;
        }
        this.f59782c.m31349b(new SwitchMapSubscriber(subscriber, null, 0, false));
    }
}
