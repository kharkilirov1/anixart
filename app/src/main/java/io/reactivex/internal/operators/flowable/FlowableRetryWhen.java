package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.UnicastProcessor;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60506l.cancel();
            this.f60504j.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            m31559h(th);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        UnicastProcessor.m31856i(8).m31853e();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
