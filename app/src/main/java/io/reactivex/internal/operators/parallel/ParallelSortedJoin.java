package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelSortedJoin<T> extends Flowable<T> {

    public static final class SortedJoinInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<List<T>> {

        /* renamed from: b */
        public final SortedJoinSubscription<T> f62424b;

        /* renamed from: c */
        public final int f62425c;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SortedJoinSubscription<T> sortedJoinSubscription = this.f62424b;
            if (sortedJoinSubscription.f62434j.compareAndSet(null, th)) {
                sortedJoinSubscription.m31757b();
            } else if (th != sortedJoinSubscription.f62434j.get()) {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            SortedJoinSubscription<T> sortedJoinSubscription = this.f62424b;
            int i2 = this.f62425c;
            sortedJoinSubscription.f62428d[i2] = (List) obj;
            if (sortedJoinSubscription.f62433i.decrementAndGet() == 0) {
                sortedJoinSubscription.m31757b();
            }
        }
    }

    public static final class SortedJoinSubscription<T> extends AtomicInteger implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62426b;

        /* renamed from: c */
        public final SortedJoinInnerSubscriber<T>[] f62427c;

        /* renamed from: d */
        public final List<T>[] f62428d;

        /* renamed from: e */
        public final int[] f62429e;

        /* renamed from: f */
        public final Comparator<? super T> f62430f;

        /* renamed from: g */
        public final AtomicLong f62431g;

        /* renamed from: h */
        public volatile boolean f62432h;

        /* renamed from: i */
        public final AtomicInteger f62433i;

        /* renamed from: j */
        public final AtomicReference<Throwable> f62434j;

        /* renamed from: a */
        public void m31756a() {
            for (SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.f62427c) {
                SubscriptionHelper.m31797a(sortedJoinInnerSubscriber);
            }
        }

        /* renamed from: b */
        public void m31757b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f62426b;
            List<T>[] listArr = this.f62428d;
            int[] iArr = this.f62429e;
            int length = iArr.length;
            int i2 = 1;
            while (true) {
                long j2 = this.f62431g.get();
                long j3 = 0;
                while (j3 != j2) {
                    if (this.f62432h) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th = this.f62434j.get();
                    if (th != null) {
                        m31756a();
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onError(th);
                        return;
                    }
                    int i3 = -1;
                    T t = null;
                    for (int i4 = 0; i4 < length; i4++) {
                        List<T> list = listArr[i4];
                        int i5 = iArr[i4];
                        if (list.size() != i5) {
                            if (t == null) {
                                t = list.get(i5);
                            } else {
                                T t2 = list.get(i5);
                                try {
                                    if (this.f62430f.compare(t, t2) > 0) {
                                        t = t2;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.m31402a(th2);
                                    m31756a();
                                    Arrays.fill(listArr, (Object) null);
                                    if (!this.f62434j.compareAndSet(null, th2)) {
                                        RxJavaPlugins.m31848b(th2);
                                    }
                                    subscriber.onError(this.f62434j.get());
                                    return;
                                }
                            }
                            i3 = i4;
                        }
                    }
                    if (t == null) {
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onComplete();
                        return;
                    } else {
                        subscriber.onNext(t);
                        iArr[i3] = iArr[i3] + 1;
                        j3++;
                    }
                }
                if (j3 == j2) {
                    if (this.f62432h) {
                        Arrays.fill(listArr, (Object) null);
                        return;
                    }
                    Throwable th3 = this.f62434j.get();
                    if (th3 != null) {
                        m31756a();
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onError(th3);
                        return;
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            z = true;
                            break;
                        } else {
                            if (iArr[i6] != listArr[i6].size()) {
                                z = false;
                                break;
                            }
                            i6++;
                        }
                    }
                    if (z) {
                        Arrays.fill(listArr, (Object) null);
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.f62431g.addAndGet(-j3);
                }
                int i7 = get();
                if (i7 == i2 && (i7 = addAndGet(-i2)) == 0) {
                    return;
                } else {
                    i2 = i7;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f62432h) {
                return;
            }
            this.f62432h = true;
            m31756a();
            if (getAndIncrement() == 0) {
                Arrays.fill(this.f62428d, (Object) null);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f62431g, j2);
                if (this.f62433i.get() == 0) {
                    m31757b();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
