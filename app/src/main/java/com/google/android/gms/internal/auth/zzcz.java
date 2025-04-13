package com.google.android.gms.internal.auth;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public abstract class zzcz<T> {

    /* renamed from: b */
    public static final AtomicInteger f16065b;

    /* renamed from: a */
    public final T f16066a;

    static {
        new AtomicReference();
        new zzdb();
        f16065b = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzcz(zzcx zzcxVar, String str, Object obj) {
        if (zzcxVar.f16063a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f16066a = obj;
    }
}
