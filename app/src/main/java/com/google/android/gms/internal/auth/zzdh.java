package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzdh<T> implements Serializable, zzdg {

    /* renamed from: b */
    public final zzdg<T> f16068b;

    public zzdh(zzdg<T> zzdgVar) {
        Objects.requireNonNull(zzdgVar);
        this.f16068b = zzdgVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16068b);
        return C0000a.m21r(new StringBuilder(valueOf.length() + 19), "Suppliers.memoize(", valueOf, ")");
    }
}
