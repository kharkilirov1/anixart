package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p000a.C0000a;

/* loaded from: classes3.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {

        /* renamed from: b */
        public final Disposable f62798b;

        public DisposableNotification(Disposable disposable) {
            this.f62798b = disposable;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("NotificationLite.Disposable[");
            m24u.append(this.f62798b);
            m24u.append("]");
            return m24u.toString();
        }
    }

    public static final class ErrorNotification implements Serializable {

        /* renamed from: b */
        public final Throwable f62799b;

        public ErrorNotification(Throwable th) {
            this.f62799b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.m31426b(this.f62799b, ((ErrorNotification) obj).f62799b);
            }
            return false;
        }

        public int hashCode() {
            return this.f62799b.hashCode();
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("NotificationLite.Error[");
            m24u.append(this.f62799b);
            m24u.append("]");
            return m24u.toString();
        }
    }

    public static final class SubscriptionNotification implements Serializable {

        /* renamed from: b */
        public final Subscription f62800b;

        public SubscriptionNotification(Subscription subscription) {
            this.f62800b = subscription;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("NotificationLite.Subscription[");
            m24u.append(this.f62800b);
            m24u.append("]");
            return m24u.toString();
        }
    }

    /* renamed from: a */
    public static <T> boolean m31828a(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f62799b);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m31829b(Object obj, Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            subscriber.onError(((ErrorNotification) obj).f62799b);
            return true;
        }
        subscriber.onNext(obj);
        return false;
    }

    /* renamed from: c */
    public static <T> boolean m31830c(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f62799b);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.mo31373a(((DisposableNotification) obj).f62798b);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    /* renamed from: d */
    public static Object m31831d(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    /* renamed from: e */
    public static Object m31832e(Throwable th) {
        return new ErrorNotification(th);
    }

    /* renamed from: f */
    public static Throwable m31833f(Object obj) {
        return ((ErrorNotification) obj).f62799b;
    }

    /* renamed from: h */
    public static boolean m31834h(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: i */
    public static boolean m31835i(Object obj) {
        return obj instanceof ErrorNotification;
    }

    /* renamed from: j */
    public static Object m31836j(Subscription subscription) {
        return new SubscriptionNotification(subscription);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
