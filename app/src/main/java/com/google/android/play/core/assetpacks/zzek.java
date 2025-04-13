package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzek {

    /* renamed from: a */
    public final zzbh f20020a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzco<zzy> f20021b;

    /* renamed from: c */
    public final zzde f20022c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzco<Executor> f20023d;

    /* renamed from: e */
    public final zzco f20024e;

    public zzek(zzbh zzbhVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar, zzde zzdeVar, com.google.android.play.core.internal.zzco<Executor> zzcoVar2, zzco zzcoVar3) {
        this.f20020a = zzbhVar;
        this.f20021b = zzcoVar;
        this.f20022c = zzdeVar;
        this.f20023d = zzcoVar2;
        this.f20024e = zzcoVar3;
    }

    /* renamed from: a */
    public final void m10799a(final zzei zzeiVar) {
        File m10739p = this.f20020a.m10739p(zzeiVar.f19921b, zzeiVar.f20015c, zzeiVar.f20017e);
        if (!m10739p.exists()) {
            throw new zzck(String.format("Cannot find pack files to promote for pack %s at %s", zzeiVar.f19921b, m10739p.getAbsolutePath()), zzeiVar.f19920a);
        }
        File m10739p2 = this.f20020a.m10739p(zzeiVar.f19921b, zzeiVar.f20016d, zzeiVar.f20017e);
        m10739p2.mkdirs();
        if (!m10739p.renameTo(m10739p2)) {
            throw new zzck(String.format("Cannot promote pack %s from %s to %s", zzeiVar.f19921b, m10739p.getAbsolutePath(), m10739p2.getAbsolutePath()), zzeiVar.f19920a);
        }
        this.f20023d.mo10897u().execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.zzej
            @Override // java.lang.Runnable
            public final void run() {
                zzek zzekVar = zzek.this;
                zzei zzeiVar2 = zzeiVar;
                zzekVar.f20020a.m10728b(zzeiVar2.f19921b, zzeiVar2.f20016d, zzeiVar2.f20017e);
            }
        });
        zzde zzdeVar = this.f20022c;
        String str = zzeiVar.f19921b;
        int i2 = zzeiVar.f20016d;
        long j2 = zzeiVar.f20017e;
        Objects.requireNonNull(zzdeVar);
        zzdeVar.m10780c(new zzcv(zzdeVar, str, i2, j2));
        this.f20024e.m10775b(zzeiVar.f19921b);
        this.f20021b.mo10897u().mo10709a(zzeiVar.f19920a, zzeiVar.f19921b);
    }
}
