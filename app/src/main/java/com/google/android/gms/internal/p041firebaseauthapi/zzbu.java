package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzbu {

    /* renamed from: a */
    public final ConcurrentMap f16416a;

    /* renamed from: b */
    public final Class f16417b;

    public /* synthetic */ zzbu(ConcurrentMap concurrentMap, zzbo zzboVar, zzge zzgeVar, Class cls) {
        this.f16416a = concurrentMap;
        this.f16417b = cls;
    }

    /* renamed from: a */
    public final List m8869a(byte[] bArr) {
        List list = (List) this.f16416a.get(new zzbq(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
