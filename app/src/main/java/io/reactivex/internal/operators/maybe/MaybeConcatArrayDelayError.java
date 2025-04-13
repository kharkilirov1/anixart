package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeConcatArrayDelayError<T> extends Flowable<T> {

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60970b;

        /* renamed from: h */
        public int f60976h;

        /* renamed from: i */
        public long f60977i;

        /* renamed from: f */
        public final MaybeSource<? extends T>[] f60974f = null;

        /* renamed from: c */
        public final AtomicLong f60971c = new AtomicLong();

        /* renamed from: e */
        public final SequentialDisposable f60973e = new SequentialDisposable();

        /* renamed from: d */
        public final AtomicReference<Object> f60972d = new AtomicReference<>(NotificationLite.COMPLETE);

        /* renamed from: g */
        public final AtomicThrowable f60975g = new AtomicThrowable();

        public ConcatMaybeObserver(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f60970b = subscriber;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31411c(this.f60973e, disposable);
        }

        /* renamed from: b */
        public void m31613b() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f60972d;
            Subscriber<? super T> subscriber = this.f60970b;
            SequentialDisposable sequentialDisposable = this.f60973e;
            while (!sequentialDisposable.mo31380s()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j2 = this.f60977i;
                        if (j2 != this.f60971c.get()) {
                            this.f60977i = j2 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        } else {
                            z = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z && !sequentialDisposable.mo31380s()) {
                        int i2 = this.f60976h;
                        MaybeSource<? extends T>[] maybeSourceArr = this.f60974f;
                        if (i2 == maybeSourceArr.length) {
                            if (this.f60975g.get() != null) {
                                subscriber.onError(ExceptionHelper.m31818b(this.f60975g));
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                        this.f60976h = i2 + 1;
                        maybeSourceArr[i2].mo31353b(this);
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
            DisposableHelper.m31409a(this.f60973e);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f60972d.lazySet(NotificationLite.COMPLETE);
            m31613b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f60972d.lazySet(NotificationLite.COMPLETE);
            if (ExceptionHelper.m31817a(this.f60975g, th)) {
                m31613b();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f60972d.lazySet(t);
            m31613b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60971c, j2);
                m31613b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(subscriber, null);
        subscriber.mo31352d(concatMaybeObserver);
        concatMaybeObserver.m31613b();
    }
}
