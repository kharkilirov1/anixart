package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableConcatWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ConcatWithSubscriber<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, CompletableObserver, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f59992b;

        /* renamed from: c */
        public Subscription f59993c;

        /* renamed from: d */
        public CompletableSource f59994d = null;

        /* renamed from: e */
        public boolean f59995e;

        public ConcatWithSubscriber(Subscriber<? super T> subscriber, CompletableSource completableSource) {
            this.f59992b = subscriber;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f59993c.cancel();
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59993c, subscription)) {
                this.f59993c = subscription;
                this.f59992b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59995e) {
                this.f59992b.onComplete();
                return;
            }
            this.f59995e = true;
            this.f59993c = SubscriptionHelper.CANCELLED;
            CompletableSource completableSource = this.f59994d;
            this.f59994d = null;
            completableSource.mo31345b(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f59992b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f59992b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f59993c.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new ConcatWithSubscriber(subscriber, null));
    }
}
