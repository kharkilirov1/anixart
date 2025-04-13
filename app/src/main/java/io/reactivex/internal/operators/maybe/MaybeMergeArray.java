package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {

    public static final class ClqSimpleQueue<T> extends ConcurrentLinkedQueue<T> implements SimpleQueueWithConsumerIndex<T> {

        /* renamed from: b */
        public int f61090b;

        /* renamed from: c */
        public final AtomicInteger f61091c = new AtomicInteger();

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        /* renamed from: e */
        public int mo31620e() {
            return this.f61091c.get();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t) {
            this.f61091c.getAndIncrement();
            return super.offer(t);
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T t = (T) super.poll();
            if (t != null) {
                this.f61090b++;
            }
            return t;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        /* renamed from: r */
        public void mo31621r() {
            poll();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        /* renamed from: t */
        public int mo31622t() {
            return this.f61090b;
        }
    }

    public static final class MergeMaybeObserver<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f61092b;

        /* renamed from: c */
        public final CompositeDisposable f61093c;

        /* renamed from: d */
        public final AtomicLong f61094d;

        /* renamed from: e */
        public final SimpleQueueWithConsumerIndex<Object> f61095e;

        /* renamed from: f */
        public final AtomicThrowable f61096f;

        /* renamed from: g */
        public final int f61097g;

        /* renamed from: h */
        public volatile boolean f61098h;

        /* renamed from: i */
        public boolean f61099i;

        /* renamed from: j */
        public long f61100j;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f61099i = true;
            return 2;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            this.f61093c.mo31393b(disposable);
        }

        /* renamed from: c */
        public void m31623c() {
            if (getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            if (this.f61099i) {
                Subscriber<? super T> subscriber = this.f61092b;
                SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex = this.f61095e;
                int i3 = 1;
                while (!this.f61098h) {
                    Throwable th = this.f61096f.get();
                    if (th != null) {
                        simpleQueueWithConsumerIndex.clear();
                        subscriber.onError(th);
                        return;
                    }
                    boolean z = simpleQueueWithConsumerIndex.mo31620e() == this.f61097g;
                    if (!simpleQueueWithConsumerIndex.isEmpty()) {
                        subscriber.onNext(null);
                    }
                    if (z) {
                        subscriber.onComplete();
                        return;
                    } else {
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                simpleQueueWithConsumerIndex.clear();
                return;
            }
            NotificationLite notificationLite = NotificationLite.COMPLETE;
            Subscriber<? super T> subscriber2 = this.f61092b;
            SimpleQueueWithConsumerIndex<Object> simpleQueueWithConsumerIndex2 = this.f61095e;
            long j2 = this.f61100j;
            do {
                long j3 = this.f61094d.get();
                while (j2 != j3) {
                    if (this.f61098h) {
                        simpleQueueWithConsumerIndex2.clear();
                        return;
                    }
                    if (this.f61096f.get() != null) {
                        simpleQueueWithConsumerIndex2.clear();
                        subscriber2.onError(ExceptionHelper.m31818b(this.f61096f));
                        return;
                    } else {
                        if (simpleQueueWithConsumerIndex2.mo31622t() == this.f61097g) {
                            subscriber2.onComplete();
                            return;
                        }
                        Object poll = simpleQueueWithConsumerIndex2.poll();
                        if (poll == null) {
                            break;
                        } else if (poll != notificationLite) {
                            subscriber2.onNext(poll);
                            j2++;
                        }
                    }
                }
                if (j2 == j3) {
                    if (this.f61096f.get() != null) {
                        simpleQueueWithConsumerIndex2.clear();
                        subscriber2.onError(ExceptionHelper.m31818b(this.f61096f));
                        return;
                    } else {
                        while (simpleQueueWithConsumerIndex2.peek() == notificationLite) {
                            simpleQueueWithConsumerIndex2.mo31621r();
                        }
                        if (simpleQueueWithConsumerIndex2.mo31622t() == this.f61097g) {
                            subscriber2.onComplete();
                            return;
                        }
                    }
                }
                this.f61100j = j2;
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f61098h) {
                return;
            }
            this.f61098h = true;
            this.f61093c.mo31379f();
            if (getAndIncrement() == 0) {
                this.f61095e.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61095e.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61095e.isEmpty();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61095e.offer(NotificationLite.COMPLETE);
            m31623c();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61096f, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61093c.mo31379f();
            this.f61095e.offer(NotificationLite.COMPLETE);
            m31623c();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61095e.offer(t);
            m31623c();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T t;
            do {
                t = (T) this.f61095e.poll();
            } while (t == NotificationLite.COMPLETE);
            return t;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f61094d, j2);
                m31623c();
            }
        }
    }

    public static final class MpscFillOnceSimpleQueue<T> extends AtomicReferenceArray<T> implements SimpleQueueWithConsumerIndex<T> {

        /* renamed from: b */
        public final AtomicInteger f61101b;

        /* renamed from: c */
        public int f61102c;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        /* renamed from: e */
        public int mo31620e() {
            return this.f61101b.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61102c == this.f61101b.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t) {
            Objects.requireNonNull(t, "value is null");
            int andIncrement = this.f61101b.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t);
            return true;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public T peek() {
            int i2 = this.f61102c;
            if (i2 == length()) {
                return null;
            }
            return get(i2);
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i2 = this.f61102c;
            if (i2 == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.f61101b;
            do {
                T t = get(i2);
                if (t != null) {
                    this.f61102c = i2 + 1;
                    lazySet(i2, null);
                    return t;
                }
            } while (atomicInteger.get() != i2);
            return null;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        /* renamed from: r */
        public void mo31621r() {
            int i2 = this.f61102c;
            lazySet(i2, null);
            this.f61102c = i2 + 1;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        /* renamed from: t */
        public int mo31622t() {
            return this.f61102c;
        }
    }

    public interface SimpleQueueWithConsumerIndex<T> extends SimpleQueue<T> {
        /* renamed from: e */
        int mo31620e();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        T poll();

        /* renamed from: r */
        void mo31621r();

        /* renamed from: t */
        int mo31622t();
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
