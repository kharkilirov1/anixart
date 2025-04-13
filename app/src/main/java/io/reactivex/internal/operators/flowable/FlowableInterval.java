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
public final class FlowableInterval extends Flowable<Long> {

    public static final class IntervalSubscriber extends AtomicLong implements Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super Long> f60284b;

        /* renamed from: c */
        public long f60285c;

        /* renamed from: d */
        public final AtomicReference<Disposable> f60286d = new AtomicReference<>();

        public IntervalSubscriber(Subscriber<? super Long> subscriber) {
            this.f60284b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            DisposableHelper.m31409a(this.f60286d);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this, j2);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60286d.get() != DisposableHelper.DISPOSED) {
                if (get() == 0) {
                    this.f60284b.onError(new MissingBackpressureException(C0000a.m19p(C0000a.m24u("Can't deliver value "), this.f60285c, " due to lack of requests")));
                    DisposableHelper.m31409a(this.f60286d);
                    return;
                }
                Subscriber<? super Long> subscriber = this.f60284b;
                long j2 = this.f60285c;
                this.f60285c = j2 + 1;
                subscriber.onNext(Long.valueOf(j2));
                BackpressureHelper.m31812e(this, 1L);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Long> subscriber) {
        subscriber.mo31352d(new IntervalSubscriber(subscriber));
        throw null;
    }
}
