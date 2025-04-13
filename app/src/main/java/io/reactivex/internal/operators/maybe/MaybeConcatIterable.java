package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60978b;

        /* renamed from: c */
        public final AtomicLong f60979c;

        /* renamed from: d */
        public final AtomicReference<Object> f60980d;

        /* renamed from: e */
        public final SequentialDisposable f60981e;

        /* renamed from: f */
        public final Iterator<? extends MaybeSource<? extends T>> f60982f;

        /* renamed from: g */
        public long f60983g;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31411c(this.f60981e, disposable);
        }

        /* renamed from: b */
        public void m31614b() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f60980d;
            Subscriber<? super T> subscriber = this.f60978b;
            SequentialDisposable sequentialDisposable = this.f60981e;
            while (!sequentialDisposable.mo31380s()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j2 = this.f60983g;
                        if (j2 != this.f60979c.get()) {
                            this.f60983g = j2 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        } else {
                            z = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z && !sequentialDisposable.mo31380s()) {
                        try {
                            if (this.f60982f.hasNext()) {
                                try {
                                    MaybeSource<? extends T> next = this.f60982f.next();
                                    Objects.requireNonNull(next, "The source Iterator returned a null MaybeSource");
                                    next.mo31353b(this);
                                } catch (Throwable th) {
                                    Exceptions.m31402a(th);
                                    subscriber.onError(th);
                                    return;
                                }
                            } else {
                                subscriber.onComplete();
                            }
                        } catch (Throwable th2) {
                            Exceptions.m31402a(th2);
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            DisposableHelper.m31409a(this.f60981e);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f60980d.lazySet(NotificationLite.COMPLETE);
            m31614b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f60978b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f60980d.lazySet(t);
            m31614b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60979c, j2);
                m31614b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
