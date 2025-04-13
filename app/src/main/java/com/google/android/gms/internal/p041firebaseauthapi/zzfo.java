package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public abstract class zzfo {

    /* renamed from: a */
    public final Class f16505a;

    /* renamed from: b */
    public final Map f16506b;

    /* renamed from: c */
    public final Class f16507c;

    @SafeVarargs
    public zzfo(Class cls, zzfp... zzfpVarArr) {
        this.f16505a = cls;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 <= 0; i2++) {
            zzfp zzfpVar = zzfpVarArr[i2];
            if (hashMap.containsKey(zzfpVar.f16508a)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzfpVar.f16508a.getCanonicalName())));
            }
            hashMap.put(zzfpVar.f16508a, zzfpVar);
        }
        this.f16507c = zzfpVarArr[0].f16508a;
        this.f16506b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public zzfn mo8895a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract zzabc mo8896b(zzyu zzyuVar) throws zzaaf;

    /* renamed from: c */
    public abstract String mo8897c();

    /* renamed from: d */
    public abstract void mo8898d(zzabc zzabcVar) throws GeneralSecurityException;

    /* renamed from: e */
    public int mo8899e() {
        return 1;
    }

    /* renamed from: f */
    public abstract int mo8900f();

    /* renamed from: g */
    public final Object m8955g(zzabc zzabcVar, Class cls) throws GeneralSecurityException {
        zzfp zzfpVar = (zzfp) this.f16506b.get(cls);
        if (zzfpVar != null) {
            return zzfpVar.mo8889a(zzabcVar);
        }
        throw new IllegalArgumentException(C0000a.m16m("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    /* renamed from: h */
    public final Set m8956h() {
        return this.f16506b.keySet();
    }
}
