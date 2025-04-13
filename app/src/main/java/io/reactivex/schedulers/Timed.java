package io.reactivex.schedulers;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class Timed<T> {

    /* renamed from: a */
    public final T f62915a;

    /* renamed from: b */
    public final long f62916b;

    /* renamed from: c */
    public final TimeUnit f62917c;

    public Timed(@NonNull T t, long j2, @NonNull TimeUnit timeUnit) {
        this.f62915a = t;
        this.f62916b = j2;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.f62917c = timeUnit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Timed)) {
            return false;
        }
        Timed timed = (Timed) obj;
        return ObjectHelper.m31426b(this.f62915a, timed.f62915a) && this.f62916b == timed.f62916b && ObjectHelper.m31426b(this.f62917c, timed.f62917c);
    }

    public int hashCode() {
        T t = this.f62915a;
        int hashCode = t != null ? t.hashCode() : 0;
        long j2 = this.f62916b;
        return this.f62917c.hashCode() + (((hashCode * 31) + ((int) (j2 ^ (j2 >>> 31)))) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Timed[time=");
        m24u.append(this.f62916b);
        m24u.append(", unit=");
        m24u.append(this.f62917c);
        m24u.append(", value=");
        m24u.append(this.f62915a);
        m24u.append("]");
        return m24u.toString();
    }
}
