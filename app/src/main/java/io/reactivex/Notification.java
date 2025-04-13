package io.reactivex;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class Notification<T> {

    /* renamed from: b */
    public static final Notification<Object> f59570b = new Notification<>(null);

    /* renamed from: a */
    public final Object f59571a;

    public Notification(Object obj) {
        this.f59571a = obj;
    }

    @Nullable
    /* renamed from: a */
    public Throwable m31356a() {
        Object obj = this.f59571a;
        if (NotificationLite.m31835i(obj)) {
            return NotificationLite.m31833f(obj);
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public T m31357b() {
        Object obj = this.f59571a;
        if (obj == null || NotificationLite.m31835i(obj)) {
            return null;
        }
        return (T) this.f59571a;
    }

    /* renamed from: c */
    public boolean m31358c() {
        return this.f59571a == null;
    }

    /* renamed from: d */
    public boolean m31359d() {
        return NotificationLite.m31835i(this.f59571a);
    }

    /* renamed from: e */
    public boolean m31360e() {
        Object obj = this.f59571a;
        return (obj == null || NotificationLite.m31835i(obj)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return ObjectHelper.m31426b(this.f59571a, ((Notification) obj).f59571a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f59571a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f59571a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.m31835i(obj)) {
            StringBuilder m24u = C0000a.m24u("OnErrorNotification[");
            m24u.append(NotificationLite.m31833f(obj));
            m24u.append("]");
            return m24u.toString();
        }
        StringBuilder m24u2 = C0000a.m24u("OnNextNotification[");
        m24u2.append(this.f59571a);
        m24u2.append("]");
        return m24u2.toString();
    }
}
