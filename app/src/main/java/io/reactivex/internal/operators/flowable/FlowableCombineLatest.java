package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    public static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {

        /* renamed from: b */
        public final Subscriber<? super R> f59932b;

        /* renamed from: c */
        public final Function<? super Object[], ? extends R> f59933c;

        /* renamed from: d */
        public final CombineLatestInnerSubscriber<T>[] f59934d;

        /* renamed from: e */
        public final SpscLinkedArrayQueue<Object> f59935e;

        /* renamed from: f */
        public final Object[] f59936f;

        /* renamed from: g */
        public final boolean f59937g;

        /* renamed from: h */
        public boolean f59938h;

        /* renamed from: i */
        public int f59939i;

        /* renamed from: j */
        public int f59940j;

        /* renamed from: k */
        public volatile boolean f59941k;

        /* renamed from: l */
        public final AtomicLong f59942l;

        /* renamed from: m */
        public volatile boolean f59943m;

        /* renamed from: n */
        public final AtomicReference<Throwable> f59944n;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 4) != 0) {
                return 0;
            }
            int i3 = i2 & 2;
            this.f59938h = i3 != 0;
            return i3;
        }

        /* renamed from: c */
        public void m31459c() {
            if (getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            if (this.f59938h) {
                Subscriber<? super R> subscriber = this.f59932b;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f59935e;
                while (!this.f59941k) {
                    Throwable th = this.f59944n.get();
                    if (th != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th);
                        return;
                    }
                    boolean z = this.f59943m;
                    boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                    if (!isEmpty) {
                        subscriber.onNext(null);
                    }
                    if (z && isEmpty) {
                        subscriber.onComplete();
                        return;
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
                return;
            }
            Subscriber<? super R> subscriber2 = this.f59932b;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue2 = this.f59935e;
            int i3 = 1;
            do {
                long j2 = this.f59942l.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z2 = this.f59943m;
                    Object poll = spscLinkedArrayQueue2.poll();
                    boolean z3 = poll == null;
                    if (m31461h(z2, z3, subscriber2, spscLinkedArrayQueue2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        R apply = this.f59933c.apply((Object[]) spscLinkedArrayQueue2.poll());
                        Objects.requireNonNull(apply, "The combiner returned a null value");
                        subscriber2.onNext(apply);
                        ((CombineLatestInnerSubscriber) poll).m31463a();
                        j3++;
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        m31460f();
                        ExceptionHelper.m31817a(this.f59944n, th2);
                        subscriber2.onError(ExceptionHelper.m31818b(this.f59944n));
                        return;
                    }
                }
                if (j3 == j2 && m31461h(this.f59943m, spscLinkedArrayQueue2.isEmpty(), subscriber2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.f59942l.addAndGet(-j3);
                }
                i3 = addAndGet(-i3);
            } while (i3 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f59941k = true;
            m31460f();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f59935e.clear();
        }

        /* renamed from: f */
        public void m31460f() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.f59934d) {
                SubscriptionHelper.m31797a(combineLatestInnerSubscriber);
            }
        }

        /* renamed from: h */
        public boolean m31461h(boolean z, boolean z2, Subscriber<?> subscriber, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.f59941k) {
                m31460f();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f59937g) {
                if (!z2) {
                    return false;
                }
                m31460f();
                Throwable m31818b = ExceptionHelper.m31818b(this.f59944n);
                if (m31818b == null || m31818b == ExceptionHelper.f62793a) {
                    subscriber.onComplete();
                } else {
                    subscriber.onError(m31818b);
                }
                return true;
            }
            Throwable m31818b2 = ExceptionHelper.m31818b(this.f59944n);
            if (m31818b2 != null && m31818b2 != ExceptionHelper.f62793a) {
                m31460f();
                spscLinkedArrayQueue.clear();
                subscriber.onError(m31818b2);
                return true;
            }
            if (!z2) {
                return false;
            }
            m31460f();
            subscriber.onComplete();
            return true;
        }

        /* renamed from: i */
        public void m31462i(int i2) {
            synchronized (this) {
                Object[] objArr = this.f59936f;
                if (objArr[i2] != null) {
                    int i3 = this.f59940j + 1;
                    if (i3 != objArr.length) {
                        this.f59940j = i3;
                        return;
                    }
                    this.f59943m = true;
                } else {
                    this.f59943m = true;
                }
                m31459c();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f59935e.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Object poll = this.f59935e.poll();
            if (poll == null) {
                return null;
            }
            R apply = this.f59933c.apply((Object[]) this.f59935e.poll());
            Objects.requireNonNull(apply, "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).m31463a();
            return apply;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f59942l, j2);
                m31459c();
            }
        }
    }

    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final CombineLatestCoordinator<T, ?> f59945b;

        /* renamed from: c */
        public final int f59946c;

        /* renamed from: d */
        public final int f59947d;

        /* renamed from: e */
        public final int f59948e;

        /* renamed from: f */
        public int f59949f;

        /* renamed from: a */
        public void m31463a() {
            int i2 = this.f59949f + 1;
            if (i2 != this.f59948e) {
                this.f59949f = i2;
            } else {
                this.f59949f = 0;
                get().request(i2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, this.f59947d);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59945b.m31462i(this.f59946c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            CombineLatestCoordinator<T, ?> combineLatestCoordinator = this.f59945b;
            int i2 = this.f59946c;
            if (!ExceptionHelper.m31817a(combineLatestCoordinator.f59944n, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                if (combineLatestCoordinator.f59937g) {
                    combineLatestCoordinator.m31462i(i2);
                    return;
                }
                combineLatestCoordinator.m31460f();
                combineLatestCoordinator.f59943m = true;
                combineLatestCoordinator.m31459c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            boolean z;
            CombineLatestCoordinator<T, ?> combineLatestCoordinator = this.f59945b;
            int i2 = this.f59946c;
            synchronized (combineLatestCoordinator) {
                Object[] objArr = combineLatestCoordinator.f59936f;
                int i3 = combineLatestCoordinator.f59939i;
                if (objArr[i2] == null) {
                    i3++;
                    combineLatestCoordinator.f59939i = i3;
                }
                objArr[i2] = t;
                if (objArr.length == i3) {
                    combineLatestCoordinator.f59935e.m31765c(combineLatestCoordinator.f59934d[i2], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                combineLatestCoordinator.f59934d[i2].m31463a();
            } else {
                combineLatestCoordinator.m31459c();
            }
        }
    }

    public final class SingletonArrayFunc implements Function<T, R> {

        /* renamed from: b */
        public final /* synthetic */ FlowableCombineLatest f59950b;

        @Override // io.reactivex.functions.Function
        public R apply(T t) throws Exception {
            Objects.requireNonNull(this.f59950b);
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
