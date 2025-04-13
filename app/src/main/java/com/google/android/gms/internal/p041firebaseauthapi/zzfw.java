package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzfw extends zzfn {
    public zzfw(zzfx zzfxVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzjr zzjrVar = (zzjr) zzabcVar;
        zzjn m9152r = zzjo.m9152r();
        if (m9152r.f17169d) {
            m9152r.m9647j();
            m9152r.f17169d = false;
        }
        ((zzjo) m9152r.f17168c).zze = 0;
        zzju m9171v = zzjrVar.m9171v();
        if (m9152r.f17169d) {
            m9152r.m9647j();
            m9152r.f17169d = false;
        }
        zzjo.m9157y((zzjo) m9152r.f17168c, m9171v);
        byte[] m9337a = zznk.m9337a(zzjrVar.m9170q());
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9152r.f17169d) {
            m9152r.m9647j();
            m9152r.f17169d = false;
        }
        ((zzjo) m9152r.f17168c).zzg = m9523z;
        return (zzjo) m9152r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzjr.m9167u(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzfx.m8960j(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzfx.m8960j(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzfx.m8960j(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzfx.m8960j(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzfx.m8960j(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzfx.m8960j(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzfx.m8960j(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzfx.m8960j(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzfx.m8960j(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzfx.m8960j(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzjr zzjrVar = (zzjr) zzabcVar;
        if (zzjrVar.m9170q() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzfx.m8961k(zzjrVar.m9171v());
    }
}
