package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzdj<T> implements Serializable, zzdg {

    /* renamed from: b */
    public final T f16070b;

    public zzdj(T t) {
        this.f16070b = t;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof zzdj)) {
            return false;
        }
        T t = this.f16070b;
        T t2 = ((zzdj) obj).f16070b;
        return t == t2 || t.equals(t2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16070b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16070b);
        return C0000a.m21r(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }
}
