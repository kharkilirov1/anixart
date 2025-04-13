package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelJoin<T> extends Flowable<T> {

    public static final class JoinInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final JoinSubscriptionBase<T> f62363b;

        /* renamed from: c */
        public final int f62364c;

        /* renamed from: d */
        public final int f62365d;

        /* renamed from: e */
        public long f62366e;

        /* renamed from: f */
        public volatile SimplePlainQueue<T> f62367f;

        /* renamed from: a */
        public SimplePlainQueue<T> m31743a() {
            SimplePlainQueue<T> simplePlainQueue = this.f62367f;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.f62364c);
            this.f62367f = spscArrayQueue;
            return spscArrayQueue;
        }

        /* renamed from: b */
        public void m31744b(long j2) {
            long j3 = this.f62366e + j2;
            if (j3 < this.f62365d) {
                this.f62366e = j3;
            } else {
                this.f62366e = 0L;
                get().request(j3);
            }
        }

        /* renamed from: c */
        public void m31745c() {
            long j2 = this.f62366e + 1;
            if (j2 != this.f62365d) {
                this.f62366e = j2;
            } else {
                this.f62366e = 0L;
                get().request(j2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, this.f62364c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62363b.mo31747d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62363b.mo31748e(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f62363b.mo31749f(this, t);
        }
    }

    public static final class JoinSubscription<T> extends JoinSubscriptionBase<T> {
        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: c */
        public void mo31746c() {
            if (getAndIncrement() != 0) {
                return;
            }
            m31750g();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: d */
        public void mo31747d() {
            this.f62373g.decrementAndGet();
            mo31746c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: e */
        public void mo31748e(Throwable th) {
            if (this.f62370d.compareAndSet(null, th)) {
                m31751a();
                mo31746c();
            } else if (th != this.f62370d.get()) {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: f */
        public void mo31749f(JoinInnerSubscriber<T> joinInnerSubscriber, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f62371e.get() != 0) {
                    this.f62368b.onNext(t);
                    if (this.f62371e.get() != Long.MAX_VALUE) {
                        this.f62371e.decrementAndGet();
                    }
                    joinInnerSubscriber.m31744b(1L);
                } else if (!joinInnerSubscriber.m31743a().offer(t)) {
                    m31751a();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Queue full?!");
                    if (this.f62370d.compareAndSet(null, missingBackpressureException)) {
                        this.f62368b.onError(missingBackpressureException);
                        return;
                    } else {
                        RxJavaPlugins.m31848b(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!joinInnerSubscriber.m31743a().offer(t)) {
                m31751a();
                mo31748e(new MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m31750g();
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x005d, code lost:
        
            if (r13 == false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x005f, code lost:
        
            if (r15 == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0061, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0064, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0065, code lost:
        
            if (r15 == false) goto L87;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31750g() {
            /*
                Method dump skipped, instructions count: 208
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscription.m31750g():void");
        }
    }

    public static abstract class JoinSubscriptionBase<T> extends AtomicInteger implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62368b;

        /* renamed from: c */
        public final JoinInnerSubscriber<T>[] f62369c;

        /* renamed from: d */
        public final AtomicThrowable f62370d;

        /* renamed from: e */
        public final AtomicLong f62371e;

        /* renamed from: f */
        public volatile boolean f62372f;

        /* renamed from: g */
        public final AtomicInteger f62373g;

        /* renamed from: a */
        public void m31751a() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.f62369c) {
                SubscriptionHelper.m31797a(joinInnerSubscriber);
            }
        }

        /* renamed from: b */
        public void m31752b() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.f62369c) {
                joinInnerSubscriber.f62367f = null;
            }
        }

        /* renamed from: c */
        public abstract void mo31746c();

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f62372f) {
                return;
            }
            this.f62372f = true;
            m31751a();
            if (getAndIncrement() == 0) {
                m31752b();
            }
        }

        /* renamed from: d */
        public abstract void mo31747d();

        /* renamed from: e */
        public abstract void mo31748e(Throwable th);

        /* renamed from: f */
        public abstract void mo31749f(JoinInnerSubscriber<T> joinInnerSubscriber, T t);

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f62371e, j2);
                mo31746c();
            }
        }
    }

    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: c */
        public void mo31746c() {
            if (getAndIncrement() != 0) {
                return;
            }
            m31753g();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: d */
        public void mo31747d() {
            this.f62373g.decrementAndGet();
            mo31746c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: e */
        public void mo31748e(Throwable th) {
            ExceptionHelper.m31817a(this.f62370d, th);
            this.f62373g.decrementAndGet();
            mo31746c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        /* renamed from: f */
        public void mo31749f(JoinInnerSubscriber<T> joinInnerSubscriber, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f62371e.get() != 0) {
                    this.f62368b.onNext(t);
                    if (this.f62371e.get() != Long.MAX_VALUE) {
                        this.f62371e.decrementAndGet();
                    }
                    joinInnerSubscriber.m31744b(1L);
                } else if (!joinInnerSubscriber.m31743a().offer(t)) {
                    SubscriptionHelper.m31797a(joinInnerSubscriber);
                    ExceptionHelper.m31817a(this.f62370d, new MissingBackpressureException("Queue full?!"));
                    this.f62373g.decrementAndGet();
                    m31753g();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!joinInnerSubscriber.m31743a().offer(t) && SubscriptionHelper.m31797a(joinInnerSubscriber)) {
                    ExceptionHelper.m31817a(this.f62370d, new MissingBackpressureException("Queue full?!"));
                    this.f62373g.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m31753g();
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
        
            if (r13 == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x004d, code lost:
        
            if (r15 == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0057, code lost:
        
            if (r18.f62370d.get() == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0059, code lost:
        
            r3.onError(io.reactivex.internal.util.ExceptionHelper.m31818b(r18.f62370d));
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0063, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0066, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0067, code lost:
        
            if (r15 == false) goto L82;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31753g() {
            /*
                Method dump skipped, instructions count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionDelayError.m31753g():void");
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
