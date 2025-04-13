package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTimer extends Flowable<Long> {

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super Long> f60784b;

        /* renamed from: c */
        public volatile boolean f60785c;

        public TimerSubscriber(Subscriber<? super Long> subscriber) {
            this.f60784b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            DisposableHelper.m31409a(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                this.f60785c = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            if (get() != DisposableHelper.DISPOSED) {
                if (!this.f60785c) {
                    lazySet(emptyDisposable);
                    this.f60784b.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                } else {
                    this.f60784b.onNext(0L);
                    lazySet(emptyDisposable);
                    this.f60784b.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super Long> subscriber) {
        subscriber.mo31352d(new TimerSubscriber(subscriber));
        throw null;
    }
}
