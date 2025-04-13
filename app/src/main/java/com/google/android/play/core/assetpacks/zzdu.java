package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzdu {

    /* renamed from: b */
    public static final com.google.android.play.core.internal.zzag f19968b = new com.google.android.play.core.internal.zzag("MergeSliceTaskHandler");

    /* renamed from: a */
    public final zzbh f19969a;

    public zzdu(zzbh zzbhVar) {
        this.f19969a = zzbhVar;
    }

    /* renamed from: b */
    public static void m10792b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String valueOf = String.valueOf(file2);
                throw new zzck(C0000a.m20q(new StringBuilder(valueOf.length() + 51), "File clashing with existing file from other slice: ", valueOf));
            }
            if (file.renameTo(file2)) {
                return;
            }
            String valueOf2 = String.valueOf(file);
            throw new zzck(C0000a.m20q(new StringBuilder(valueOf2.length() + 21), "Unable to move file: ", valueOf2));
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            m10792b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf3 = String.valueOf(file);
        throw new zzck(C0000a.m20q(new StringBuilder(valueOf3.length() + 28), "Unable to delete directory: ", valueOf3));
    }

    /* renamed from: a */
    public final void m10793a(zzdt zzdtVar) {
        File m10745v = this.f19969a.m10745v(zzdtVar.f19921b, zzdtVar.f19965c, zzdtVar.f19966d, zzdtVar.f19967e);
        if (!m10745v.exists()) {
            throw new zzck(String.format("Cannot find verified files for slice %s.", zzdtVar.f19967e), zzdtVar.f19920a);
        }
        File m10741r = this.f19969a.m10741r(zzdtVar.f19921b, zzdtVar.f19965c, zzdtVar.f19966d);
        if (!m10741r.exists()) {
            m10741r.mkdirs();
        }
        m10792b(m10745v, m10741r);
        try {
            this.f19969a.m10727a(zzdtVar.f19921b, zzdtVar.f19965c, zzdtVar.f19966d, this.f19969a.m10736m(zzdtVar.f19921b, zzdtVar.f19965c, zzdtVar.f19966d) + 1);
        } catch (IOException e2) {
            f19968b.m10835b("Writing merge checkpoint failed with %s.", e2.getMessage());
            throw new zzck("Writing merge checkpoint failed.", e2, zzdtVar.f19920a);
        }
    }
}
