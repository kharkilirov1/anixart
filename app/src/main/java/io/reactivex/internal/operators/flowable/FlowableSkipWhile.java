package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSkipWhile<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SkipWhileSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60647b;

        /* renamed from: c */
        public final Predicate<? super T> f60648c = null;

        /* renamed from: d */
        public Subscription f60649d;

        /* renamed from: e */
        public boolean f60650e;

        public SkipWhileSubscriber(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            this.f60647b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60649d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60649d, subscription)) {
                this.f60649d = subscription;
                this.f60647b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60647b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60647b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60650e) {
                this.f60647b.onNext(t);
                return;
            }
            try {
                if (this.f60648c.mo31407b(t)) {
                    this.f60649d.request(1L);
                } else {
                    this.f60650e = true;
                    this.f60647b.onNext(t);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60649d.cancel();
                this.f60647b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60649d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SkipWhileSubscriber(subscriber, null));
    }
}
