package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzfv extends zzfp {
    public zzfv(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfp
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8889a(zzabc zzabcVar) throws GeneralSecurityException {
        zzjo zzjoVar = (zzjo) zzabcVar;
        int m9180v = zzjoVar.m9160v().m9180v();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzjoVar.m9161w().m9525C(), "HMAC");
        int m9179q = zzjoVar.m9160v().m9179q();
        int i2 = m9180v - 2;
        if (i2 == 1) {
            return new zzni(new zznh("HMACSHA1", secretKeySpec), m9179q);
        }
        if (i2 == 2) {
            return new zzni(new zznh("HMACSHA384", secretKeySpec), m9179q);
        }
        if (i2 == 3) {
            return new zzni(new zznh("HMACSHA256", secretKeySpec), m9179q);
        }
        if (i2 == 4) {
            return new zzni(new zznh("HMACSHA512", secretKeySpec), m9179q);
        }
        if (i2 == 5) {
            return new zzni(new zznh("HMACSHA224", secretKeySpec), m9179q);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
