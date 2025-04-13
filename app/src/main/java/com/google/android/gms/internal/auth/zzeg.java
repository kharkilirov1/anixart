package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzeg {

    /* renamed from: b */
    public static volatile zzeg f16090b;

    /* renamed from: c */
    public static final zzeg f16091c = new zzeg(true);

    /* renamed from: a */
    public final Map f16092a;

    public zzeg() {
        new HashMap();
    }

    /* renamed from: a */
    public static zzeg m8384a() {
        zzeg zzegVar = f16090b;
        if (zzegVar == null) {
            synchronized (zzeg.class) {
                zzegVar = f16090b;
                if (zzegVar == null) {
                    zzegVar = f16091c;
                    f16090b = zzegVar;
                }
            }
        }
        return zzegVar;
    }

    public zzeg(boolean z) {
        this.f16092a = Collections.emptyMap();
    }
}
