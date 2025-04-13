package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzdh {

    /* renamed from: e */
    public static final com.google.android.play.core.internal.zzag f19922e = new com.google.android.play.core.internal.zzag("ExtractorTaskFinder");

    /* renamed from: a */
    public final zzde f19923a;

    /* renamed from: b */
    public final zzbh f19924b;

    /* renamed from: c */
    public final zzbu f19925c;

    /* renamed from: d */
    public final com.google.android.play.core.common.zza f19926d;

    public zzdh(zzde zzdeVar, zzbh zzbhVar, zzbu zzbuVar, com.google.android.play.core.common.zza zzaVar) {
        this.f19923a = zzdeVar;
        this.f19924b = zzbhVar;
        this.f19925c = zzbuVar;
        this.f19926d = zzaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028a A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.play.core.assetpacks.zzdg m10781a() {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzdh.m10781a():com.google.android.play.core.assetpacks.zzdg");
    }

    /* renamed from: b */
    public final boolean m10782b(zzdb zzdbVar, zzdc zzdcVar) {
        zzbh zzbhVar = this.f19924b;
        zzda zzdaVar = zzdbVar.f19902c;
        File m10742s = zzbhVar.m10742s(zzdaVar.f19894a, zzdbVar.f19901b, zzdaVar.f19895b, zzdcVar.f19903a);
        if (m10742s.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(m10742s);
                try {
                    Properties properties = new Properties();
                    properties.load(fileInputStream);
                    fileInputStream.close();
                    if (properties.getProperty("fileStatus") == null) {
                        zzen.f20030h.m10835b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    } else if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                zzen.f20030h.m10835b("Could not read checkpoint while checking if extraction finished. %s", e2);
            }
        }
        return false;
    }
}
