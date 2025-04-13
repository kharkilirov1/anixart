package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p000a.C0000a;

/* loaded from: classes3.dex */
public enum SubscriptionHelper implements Subscription {
    CANCELLED;

    /* renamed from: a */
    public static boolean m31797a(AtomicReference<Subscription> atomicReference) {
        Subscription andSet;
        Subscription subscription = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (subscription == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: b */
    public static void m31798b(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, long j2) {
        Subscription subscription = atomicReference.get();
        if (subscription != null) {
            subscription.request(j2);
            return;
        }
        if (m31803h(j2)) {
            BackpressureHelper.m31808a(atomicLong, j2);
            Subscription subscription2 = atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m31799c(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, Subscription subscription) {
        if (!m31801e(atomicReference, subscription)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        subscription.request(andSet);
        return true;
    }

    /* renamed from: d */
    public static void m31800d(long j2) {
        RxJavaPlugins.m31848b(new ProtocolViolationException(C0000a.m11h("More produced than requested: ", j2)));
    }

    /* renamed from: e */
    public static boolean m31801e(AtomicReference<Subscription> atomicReference, Subscription subscription) {
        Objects.requireNonNull(subscription, "s is null");
        if (atomicReference.compareAndSet(null, subscription)) {
            return true;
        }
        subscription.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        RxJavaPlugins.m31848b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    /* renamed from: f */
    public static boolean m31802f(AtomicReference<Subscription> atomicReference, Subscription subscription, long j2) {
        if (!m31801e(atomicReference, subscription)) {
            return false;
        }
        subscription.request(j2);
        return true;
    }

    /* renamed from: h */
    public static boolean m31803h(long j2) {
        if (j2 > 0) {
            return true;
        }
        RxJavaPlugins.m31848b(new IllegalArgumentException(C0000a.m11h("n > 0 required but it was ", j2)));
        return false;
    }

    /* renamed from: i */
    public static boolean m31804i(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            RxJavaPlugins.m31848b(new NullPointerException("next is null"));
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription2.cancel();
        RxJavaPlugins.m31848b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }
}
