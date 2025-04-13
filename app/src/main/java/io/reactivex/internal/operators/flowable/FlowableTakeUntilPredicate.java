package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTakeUntilPredicate<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class InnerSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60715b;

        /* renamed from: c */
        public final Predicate<? super T> f60716c = null;

        /* renamed from: d */
        public Subscription f60717d;

        /* renamed from: e */
        public boolean f60718e;

        public InnerSubscriber(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            this.f60715b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60717d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60717d, subscription)) {
                this.f60717d = subscription;
                this.f60715b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60718e) {
                return;
            }
            this.f60718e = true;
            this.f60715b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60718e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60718e = true;
                this.f60715b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60718e) {
                return;
            }
            this.f60715b.onNext(t);
            try {
                if (this.f60716c.mo31407b(t)) {
                    this.f60718e = true;
                    this.f60717d.cancel();
                    this.f60715b.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60717d.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60717d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new InnerSubscriber(subscriber, null));
    }
}
