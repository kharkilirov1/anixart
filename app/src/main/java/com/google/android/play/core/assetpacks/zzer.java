package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzer {

    /* renamed from: b */
    public static final com.google.android.play.core.internal.zzag f20044b = new com.google.android.play.core.internal.zzag("VerifySliceTaskHandler");

    /* renamed from: a */
    public final zzbh f20045a;

    public zzer(zzbh zzbhVar) {
        this.f20045a = zzbhVar;
    }

    /* renamed from: a */
    public final void m10814a(zzeq zzeqVar) {
        File m10744u = this.f20045a.m10744u(zzeqVar.f19921b, zzeqVar.f20040c, zzeqVar.f20041d, zzeqVar.f20042e);
        if (!m10744u.exists()) {
            throw new zzck(String.format("Cannot find unverified files for slice %s.", zzeqVar.f20042e), zzeqVar.f19920a);
        }
        try {
            File m10743t = this.f20045a.m10743t(zzeqVar.f19921b, zzeqVar.f20040c, zzeqVar.f20041d, zzeqVar.f20042e);
            if (!m10743t.exists()) {
                throw new zzck(String.format("Cannot find metadata files for slice %s.", zzeqVar.f20042e), zzeqVar.f19920a);
            }
            try {
                if (!zzdq.m10786a(zzep.m10813a(m10744u, m10743t)).equals(zzeqVar.f20043f)) {
                    throw new zzck(String.format("Verification failed for slice %s.", zzeqVar.f20042e), zzeqVar.f19920a);
                }
                f20044b.m10837d("Verification of slice %s of pack %s successful.", zzeqVar.f20042e, zzeqVar.f19921b);
                File m10745v = this.f20045a.m10745v(zzeqVar.f19921b, zzeqVar.f20040c, zzeqVar.f20041d, zzeqVar.f20042e);
                if (!m10745v.exists()) {
                    m10745v.mkdirs();
                }
                if (!m10744u.renameTo(m10745v)) {
                    throw new zzck(String.format("Failed to move slice %s after verification.", zzeqVar.f20042e), zzeqVar.f19920a);
                }
            } catch (IOException e2) {
                throw new zzck(String.format("Could not digest file during verification for slice %s.", zzeqVar.f20042e), e2, zzeqVar.f19920a);
            } catch (NoSuchAlgorithmException e3) {
                throw new zzck("SHA256 algorithm not supported.", e3, zzeqVar.f19920a);
            }
        } catch (IOException e4) {
            throw new zzck(String.format("Could not reconstruct slice archive during verification for slice %s.", zzeqVar.f20042e), e4, zzeqVar.f19920a);
        }
    }
}
