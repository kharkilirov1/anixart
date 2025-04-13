package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class EndConsumerHelper {
    public EndConsumerHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static void m31814a(Class<?> cls) {
        String name = cls.getName();
        RxJavaPlugins.m31848b(new ProtocolViolationException("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
    }

    /* renamed from: b */
    public static boolean m31815b(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        Objects.requireNonNull(disposable, "next is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.mo31379f();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        m31814a(cls);
        return false;
    }

    /* renamed from: c */
    public static boolean m31816c(AtomicReference<Subscription> atomicReference, Subscription subscription, Class<?> cls) {
        Objects.requireNonNull(subscription, "next is null");
        if (atomicReference.compareAndSet(null, subscription)) {
            return true;
        }
        subscription.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        m31814a(cls);
        return false;
    }
}
