package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class MaybeFlatMapIterableFlowable<T, R> extends Flowable<R> {

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T> {

        /* renamed from: b */
        public final Subscriber<? super R> f61042b;

        /* renamed from: c */
        public final Function<? super T, ? extends Iterable<? extends R>> f61043c = null;

        /* renamed from: d */
        public final AtomicLong f61044d = new AtomicLong();

        /* renamed from: e */
        public Disposable f61045e;

        /* renamed from: f */
        public volatile Iterator<? extends R> f61046f;

        /* renamed from: g */
        public volatile boolean f61047g;

        /* renamed from: h */
        public boolean f61048h;

        public FlatMapIterableObserver(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f61042b = subscriber;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f61048h = true;
            return 2;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61045e, disposable)) {
                this.f61045e = disposable;
                this.f61042b.mo31352d(this);
            }
        }

        /* renamed from: c */
        public void m31619c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f61042b;
            Iterator<? extends R> it = this.f61046f;
            if (this.f61048h && it != null) {
                subscriber.onNext(null);
                subscriber.onComplete();
                return;
            }
            int i2 = 1;
            while (true) {
                if (it != null) {
                    long j2 = this.f61044d.get();
                    if (j2 == Long.MAX_VALUE) {
                        while (!this.f61047g) {
                            try {
                                subscriber.onNext(it.next());
                                if (this.f61047g) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
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
                        return;
                    }
                    long j3 = 0;
                    while (j3 != j2) {
                        if (this.f61047g) {
                            return;
                        }
                        try {
                            R next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            subscriber.onNext(next);
                            if (this.f61047g) {
                                return;
                            }
                            j3++;
                            try {
                                if (!it.hasNext()) {
                                    subscriber.onComplete();
                                    return;
                                }
                            } catch (Throwable th3) {
                                Exceptions.m31402a(th3);
                                subscriber.onError(th3);
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.m31402a(th4);
                            subscriber.onError(th4);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        BackpressureHelper.m31812e(this.f61044d, j3);
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f61046f;
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f61047g = true;
            this.f61045e.mo31379f();
            this.f61045e = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61046f = null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61046f == null;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61042b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61045e = DisposableHelper.DISPOSED;
            this.f61042b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                Iterator<? extends R> it = this.f61043c.apply(t).iterator();
                if (!it.hasNext()) {
                    this.f61042b.onComplete();
                } else {
                    this.f61046f = it;
                    m31619c();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61042b.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f61046f;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f61046f = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f61044d, j2);
                m31619c();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new FlatMapIterableObserver(subscriber, null);
        throw null;
    }
}
