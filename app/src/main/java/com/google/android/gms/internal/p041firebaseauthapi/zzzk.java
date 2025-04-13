package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzzk {

    /* renamed from: b */
    public static volatile zzzk f17150b;

    /* renamed from: c */
    public static final zzzk f17151c = new zzzk(true);

    /* renamed from: a */
    public final Map f17152a;

    public zzzk() {
        this.f17152a = new HashMap();
    }

    /* renamed from: a */
    public static zzzk m9627a() {
        zzzk zzzkVar = f17150b;
        if (zzzkVar == null) {
            synchronized (zzzk.class) {
                zzzkVar = f17150b;
                if (zzzkVar == null) {
                    zzzkVar = f17151c;
                    f17150b = zzzkVar;
                }
            }
        }
        return zzzkVar;
    }

    public zzzk(boolean z) {
        this.f17152a = Collections.emptyMap();
    }
}
