package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class FlowableIntervalRange extends Flowable<Long> {

    public static final class IntervalRangeSubscriber extends AtomicLong implements Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super Long> f60287b;

        /* renamed from: c */
        public final long f60288c;

        /* renamed from: d */
        public long f60289d;

        /* renamed from: e */
        public final AtomicReference<Disposable> f60290e = new AtomicReference<>();

        public IntervalRangeSubscriber(Subscriber<? super Long> subscriber, long j2, long j3) {
            this.f60287b = subscriber;
            this.f60289d = j2;
            this.f60288c = j3;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            DisposableHelper.m31409a(this.f60290e);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this, j2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Disposable disposable = this.f60290e.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                long j2 = get();
                if (j2 == 0) {
                    this.f60287b.onError(new MissingBackpressureException(C0000a.m19p(C0000a.m24u("Can't deliver value "), this.f60289d, " due to lack of requests")));
                    DisposableHelper.m31409a(this.f60290e);
                    return;
                }
                long j3 = this.f60289d;
                this.f60287b.onNext(Long.valueOf(j3));
                if (j3 == this.f60288c) {
                    if (this.f60290e.get() != disposableHelper) {
                        this.f60287b.onComplete();
                    }
                    DisposableHelper.m31409a(this.f60290e);
                } else {
                    this.f60289d = j3 + 1;
                    if (j2 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Long> subscriber) {
        subscriber.mo31352d(new IntervalRangeSubscriber(subscriber, 0L, 0L));
        throw null;
    }
}
