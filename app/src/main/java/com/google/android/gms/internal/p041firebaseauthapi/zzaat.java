package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzaat implements zzaba {

    /* renamed from: a */
    public final zzaba[] f16283a;

    public zzaat(zzaba... zzabaVarArr) {
        this.f16283a = zzabaVarArr;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaba
    /* renamed from: a */
    public final zzaaz mo8602a(Class cls) {
        zzaba[] zzabaVarArr = this.f16283a;
        for (int i2 = 0; i2 < 2; i2++) {
            zzaba zzabaVar = zzabaVarArr[i2];
            if (zzabaVar.mo8603b(cls)) {
                return zzabaVar.mo8602a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaba
    /* renamed from: b */
    public final boolean mo8603b(Class cls) {
        zzaba[] zzabaVarArr = this.f16283a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzabaVarArr[i2].mo8603b(cls)) {
                return true;
            }
        }
        return false;
    }
}
