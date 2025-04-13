package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzaax {
    /* renamed from: a */
    public static final int m8609a(int i2, Object obj, Object obj2) {
        zzaaw zzaawVar = (zzaaw) obj;
        if (zzaawVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzaawVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m8610b(Object obj) {
        return !((zzaaw) obj).f16287b;
    }

    /* renamed from: c */
    public static final Object m8611c(Object obj, Object obj2) {
        zzaaw zzaawVar = (zzaaw) obj;
        zzaaw zzaawVar2 = (zzaaw) obj2;
        if (!zzaawVar2.isEmpty()) {
            if (!zzaawVar.f16287b) {
                zzaawVar = zzaawVar.m8607b();
            }
            zzaawVar.m8608d();
            if (!zzaawVar2.isEmpty()) {
                zzaawVar.putAll(zzaawVar2);
            }
        }
        return zzaawVar;
    }
}
