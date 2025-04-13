package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzhi extends zzeq<zzhi, zzhh> implements zzfr {
    private static final zzhi zzb;
    private zzeu<String> zzd = zzfz.f16143e;

    static {
        zzhi zzhiVar = new zzhi();
        zzb = zzhiVar;
        zzeq.m8404c(zzhi.class, zzhiVar);
    }

    /* renamed from: f */
    public static zzhi m8533f(byte[] bArr) throws zzew {
        zzhi zzhiVar = zzb;
        int length = bArr.length;
        zzeg m8384a = zzeg.m8384a();
        zzeq zzeqVar = (zzeq) zzhiVar.mo8405d(4, null, null);
        try {
            zzfy zzfyVar = zzfy.f16140c;
            zzgb m8469a = zzfyVar.m8469a(zzeqVar.getClass());
            m8469a.mo8453f(zzeqVar, bArr, 0, length, new zzdp(m8384a));
            m8469a.mo8449b(zzeqVar);
            if (zzeqVar.zza != 0) {
                throw new RuntimeException();
            }
            boolean z = true;
            byte byteValue = ((Byte) zzeqVar.mo8405d(1, null, null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    boolean mo8451d = zzfyVar.m8469a(zzeqVar.getClass()).mo8451d(zzeqVar);
                    zzeqVar.mo8405d(2, true != mo8451d ? null : zzeqVar, null);
                    z = mo8451d;
                }
            }
            if (z) {
                return (zzhi) zzeqVar;
            }
            throw new zzew(new zzgo().getMessage());
        } catch (zzew e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzew) {
                throw ((zzew) e3.getCause());
            }
            throw new zzew(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzew.m8417d();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzeq
    /* renamed from: d */
    public final Object mo8405d(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzga(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i3 == 3) {
            return new zzhi();
        }
        zzhg zzhgVar = null;
        if (i3 == 4) {
            return new zzhh(zzhgVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
