package com.google.android.gms.internal.auth;

import javax.annotation.CheckForNull;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzdi<T> implements zzdg<T> {

    /* renamed from: b */
    @CheckForNull
    public volatile zzdg<T> f16069b;

    public final String toString() {
        Object obj = this.f16069b;
        if (obj == null) {
            obj = "<supplier that returned null>";
        }
        String valueOf = String.valueOf(obj);
        return C0000a.m21r(new StringBuilder(valueOf.length() + 19), "Suppliers.memoize(", valueOf, ")");
    }
}
