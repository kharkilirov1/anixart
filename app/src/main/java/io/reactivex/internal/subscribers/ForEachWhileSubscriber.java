package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {

    /* renamed from: b */
    public boolean f62733b;

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        SubscriptionHelper.m31797a(this);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62733b) {
            return;
        }
        this.f62733b = true;
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f62733b) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62733b = true;
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f62733b) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            SubscriptionHelper.m31797a(this);
            onError(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return get() == SubscriptionHelper.CANCELLED;
    }
}
