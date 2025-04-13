package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzdz {

    /* renamed from: a */
    public final zzbh f19977a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzco<zzy> f19978b;

    /* renamed from: c */
    public final zzde f19979c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzco<Executor> f19980d;

    /* renamed from: e */
    public final zzco f19981e;

    /* renamed from: f */
    public final com.google.android.play.core.common.zza f19982f;

    /* renamed from: g */
    public final zzeb f19983g;

    public zzdz(zzbh zzbhVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar, zzde zzdeVar, com.google.android.play.core.internal.zzco<Executor> zzcoVar2, zzco zzcoVar3, com.google.android.play.core.common.zza zzaVar, zzeb zzebVar) {
        this.f19977a = zzbhVar;
        this.f19978b = zzcoVar;
        this.f19979c = zzdeVar;
        this.f19980d = zzcoVar2;
        this.f19981e = zzcoVar3;
        this.f19982f = zzaVar;
        this.f19983g = zzebVar;
    }

    /* renamed from: a */
    public final void m10794a(final zzdw zzdwVar) {
        File m10741r = this.f19977a.m10741r(zzdwVar.f19921b, zzdwVar.f19971c, zzdwVar.f19972d);
        zzbh zzbhVar = this.f19977a;
        String str = zzdwVar.f19921b;
        int i2 = zzdwVar.f19971c;
        long j2 = zzdwVar.f19972d;
        Objects.requireNonNull(zzbhVar);
        File file = new File(new File(zzbhVar.m10732g(str, i2, j2), "_slices"), "_metadata");
        if (!m10741r.exists() || !file.exists()) {
            throw new zzck(String.format("Cannot find pack files to move for pack %s.", zzdwVar.f19921b), zzdwVar.f19920a);
        }
        File m10739p = this.f19977a.m10739p(zzdwVar.f19921b, zzdwVar.f19971c, zzdwVar.f19972d);
        m10739p.mkdirs();
        if (!m10741r.renameTo(m10739p)) {
            throw new zzck("Cannot move merged pack files to final location.", zzdwVar.f19920a);
        }
        new File(this.f19977a.m10739p(zzdwVar.f19921b, zzdwVar.f19971c, zzdwVar.f19972d), "merge.tmp").delete();
        File m10740q = this.f19977a.m10740q(zzdwVar.f19921b, zzdwVar.f19971c, zzdwVar.f19972d);
        m10740q.mkdirs();
        if (!file.renameTo(m10740q)) {
            throw new zzck("Cannot move metadata files to final location.", zzdwVar.f19920a);
        }
        if (this.f19982f.m10822a()) {
            try {
                this.f19983g.m10796b(zzdwVar.f19921b, zzdwVar.f19971c, zzdwVar.f19972d, zzdwVar.f19973e);
                this.f19980d.mo10897u().execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzdy
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdz zzdzVar = zzdz.this;
                        zzdw zzdwVar2 = zzdwVar;
                        zzdzVar.f19977a.m10728b(zzdwVar2.f19921b, zzdwVar2.f19971c, zzdwVar2.f19972d);
                    }
                });
            } catch (IOException e2) {
                throw new zzck(String.format("Could not write asset pack version tag for pack %s: %s", zzdwVar.f19921b, e2.getMessage()), zzdwVar.f19920a);
            }
        } else {
            Executor mo10897u = this.f19980d.mo10897u();
            final zzbh zzbhVar2 = this.f19977a;
            Objects.requireNonNull(zzbhVar2);
            mo10897u.execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzdx
                @Override // java.lang.Runnable
                public final void run() {
                    zzbh.this.m10748y();
                }
            });
        }
        zzde zzdeVar = this.f19979c;
        String str2 = zzdwVar.f19921b;
        int i3 = zzdwVar.f19971c;
        long j3 = zzdwVar.f19972d;
        Objects.requireNonNull(zzdeVar);
        zzdeVar.m10780c(new zzcv(zzdeVar, str2, i3, j3));
        this.f19981e.m10775b(zzdwVar.f19921b);
        this.f19978b.mo10897u().mo10709a(zzdwVar.f19920a, zzdwVar.f19921b);
    }
}
