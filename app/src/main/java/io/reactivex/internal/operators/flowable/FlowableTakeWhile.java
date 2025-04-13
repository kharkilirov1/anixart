package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTakeWhile<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TakeWhileSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60719b;

        /* renamed from: c */
        public final Predicate<? super T> f60720c = null;

        /* renamed from: d */
        public Subscription f60721d;

        /* renamed from: e */
        public boolean f60722e;

        public TakeWhileSubscriber(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            this.f60719b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60721d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60721d, subscription)) {
                this.f60721d = subscription;
                this.f60719b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60722e) {
                return;
            }
            this.f60722e = true;
            this.f60719b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60722e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60722e = true;
                this.f60719b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60722e) {
                return;
            }
            try {
                if (this.f60720c.mo31407b(t)) {
                    this.f60719b.onNext(t);
                    return;
                }
                this.f60722e = true;
                this.f60721d.cancel();
                this.f60719b.onComplete();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60721d.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60721d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new TakeWhileSubscriber(subscriber, null));
    }
}
