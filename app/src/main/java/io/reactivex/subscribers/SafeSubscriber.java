package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class SafeSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: b */
    public Subscription f62992b;

    /* renamed from: c */
    public boolean f62993c;

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        try {
            this.f62992b.cancel();
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31804i(this.f62992b, subscription)) {
            this.f62992b = subscription;
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62993c = true;
                try {
                    subscription.cancel();
                    RxJavaPlugins.m31848b(th);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    RxJavaPlugins.m31848b(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62993c) {
            return;
        }
        this.f62993c = true;
        if (this.f62992b != null) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            throw null;
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            RxJavaPlugins.m31848b(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f62993c) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62993c = true;
        if (this.f62992b == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                throw null;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                RxJavaPlugins.m31848b(new CompositeException(th, nullPointerException, th2));
                return;
            }
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            throw null;
        } catch (Throwable th3) {
            Exceptions.m31402a(th3);
            RxJavaPlugins.m31848b(new CompositeException(th, th3));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f62993c) {
            return;
        }
        if (this.f62992b == null) {
            this.f62993c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(new CompositeException(nullPointerException, th));
                return;
            }
        }
        if (t == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f62992b.cancel();
                onError(nullPointerException2);
                return;
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                onError(new CompositeException(nullPointerException2, th2));
                return;
            }
        }
        try {
            throw null;
        } catch (Throwable th3) {
            Exceptions.m31402a(th3);
            try {
                this.f62992b.cancel();
                onError(th3);
            } catch (Throwable th4) {
                Exceptions.m31402a(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        try {
            this.f62992b.request(j2);
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            try {
                this.f62992b.cancel();
                RxJavaPlugins.m31848b(th);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                RxJavaPlugins.m31848b(new CompositeException(th, th2));
            }
        }
    }
}
