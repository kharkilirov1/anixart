package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class SingleFromPublisher<T> extends Single<T> {

    public static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62527b;

        /* renamed from: c */
        public Subscription f62528c;

        /* renamed from: d */
        public T f62529d;

        /* renamed from: e */
        public boolean f62530e;

        /* renamed from: f */
        public volatile boolean f62531f;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62528c, subscription)) {
                this.f62528c = subscription;
                this.f62527b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62531f = true;
            this.f62528c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62530e) {
                return;
            }
            this.f62530e = true;
            T t = this.f62529d;
            this.f62529d = null;
            if (t == null) {
                this.f62527b.onError(new NoSuchElementException("The source Publisher is empty"));
            } else {
                this.f62527b.onSuccess(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62530e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62530e = true;
            this.f62529d = null;
            this.f62527b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62530e) {
                return;
            }
            if (this.f62529d == null) {
                this.f62529d = t;
                return;
            }
            this.f62528c.cancel();
            this.f62530e = true;
            this.f62529d = null;
            this.f62527b.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62531f;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
