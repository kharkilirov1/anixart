package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzge {

    /* renamed from: b */
    public static final zzge f16513b;

    /* renamed from: a */
    public final Map f16514a;

    static {
        zzgc zzgcVar = new zzgc();
        HashMap hashMap = zzgcVar.f16512a;
        if (hashMap == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzge zzgeVar = new zzge(Collections.unmodifiableMap(hashMap));
        zzgcVar.f16512a = null;
        f16513b = zzgeVar;
    }

    public /* synthetic */ zzge(Map map) {
        this.f16514a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            return this.f16514a.equals(((zzge) obj).f16514a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16514a.hashCode();
    }

    public final String toString() {
        return this.f16514a.toString();
    }
}
