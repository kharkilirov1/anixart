package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfh implements zzfo {

    /* renamed from: a */
    public final zzfo[] f16115a;

    public zzfh(zzfo... zzfoVarArr) {
        this.f16115a = zzfoVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    /* renamed from: a */
    public final zzfn mo8396a(Class<?> cls) {
        zzfo[] zzfoVarArr = this.f16115a;
        for (int i2 = 0; i2 < 2; i2++) {
            zzfo zzfoVar = zzfoVarArr[i2];
            if (zzfoVar.mo8397b(cls)) {
                return zzfoVar.mo8396a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    /* renamed from: b */
    public final boolean mo8397b(Class<?> cls) {
        zzfo[] zzfoVarArr = this.f16115a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzfoVarArr[i2].mo8397b(cls)) {
                return true;
            }
        }
        return false;
    }
}
