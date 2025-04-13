package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeConcatArray<T> extends Flowable<T> {

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60963b;

        /* renamed from: g */
        public int f60968g;

        /* renamed from: h */
        public long f60969h;

        /* renamed from: f */
        public final MaybeSource<? extends T>[] f60967f = null;

        /* renamed from: c */
        public final AtomicLong f60964c = new AtomicLong();

        /* renamed from: e */
        public final SequentialDisposable f60966e = new SequentialDisposable();

        /* renamed from: d */
        public final AtomicReference<Object> f60965d = new AtomicReference<>(NotificationLite.COMPLETE);

        public ConcatMaybeObserver(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f60963b = subscriber;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31411c(this.f60966e, disposable);
        }

        /* renamed from: b */
        public void m31612b() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f60965d;
            Subscriber<? super T> subscriber = this.f60963b;
            SequentialDisposable sequentialDisposable = this.f60966e;
            while (!sequentialDisposable.mo31380s()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z = true;
                    if (obj != NotificationLite.COMPLETE) {
                        long j2 = this.f60969h;
                        if (j2 != this.f60964c.get()) {
                            this.f60969h = j2 + 1;
                            atomicReference.lazySet(null);
                            subscriber.onNext(obj);
                        } else {
                            z = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z && !sequentialDisposable.mo31380s()) {
                        int i2 = this.f60968g;
                        MaybeSource<? extends T>[] maybeSourceArr = this.f60967f;
                        if (i2 == maybeSourceArr.length) {
                            subscriber.onComplete();
                            return;
                        } else {
                            this.f60968g = i2 + 1;
                            maybeSourceArr[i2].mo31353b(this);
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
            DisposableHelper.m31409a(this.f60966e);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f60965d.lazySet(NotificationLite.COMPLETE);
            m31612b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f60963b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f60965d.lazySet(t);
            m31612b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60964c, j2);
                m31612b();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(subscriber, null);
        subscriber.mo31352d(concatMaybeObserver);
        concatMaybeObserver.m31612b();
    }
}
