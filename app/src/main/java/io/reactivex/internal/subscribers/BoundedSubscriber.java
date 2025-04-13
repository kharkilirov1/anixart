package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class BoundedSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription, Disposable, LambdaConsumerIntrospection {
    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.m31797a(this);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31801e(this, subscription)) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        SubscriptionHelper.m31797a(this);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription == subscriptionHelper) {
            return;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription == subscriptionHelper) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (mo31380s()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        get().request(j2);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == SubscriptionHelper.CANCELLED;
    }
}
