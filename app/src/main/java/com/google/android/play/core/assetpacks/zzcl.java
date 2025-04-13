package com.google.android.play.core.assetpacks;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzcl {

    /* renamed from: k */
    public static final com.google.android.play.core.internal.zzag f19847k = new com.google.android.play.core.internal.zzag("ExtractorLooper");

    /* renamed from: a */
    public final zzde f19848a;

    /* renamed from: b */
    public final zzcf f19849b;

    /* renamed from: c */
    public final zzer f19850c;

    /* renamed from: d */
    public final zzdu f19851d;

    /* renamed from: e */
    public final zzdz f19852e;

    /* renamed from: f */
    public final zzeg f19853f;

    /* renamed from: g */
    public final zzek f19854g;

    /* renamed from: h */
    public final com.google.android.play.core.internal.zzco<zzy> f19855h;

    /* renamed from: i */
    public final zzdh f19856i;

    /* renamed from: j */
    public final AtomicBoolean f19857j = new AtomicBoolean(false);

    public zzcl(zzde zzdeVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar, zzcf zzcfVar, zzer zzerVar, zzdu zzduVar, zzdz zzdzVar, zzeg zzegVar, zzek zzekVar, zzdh zzdhVar) {
        this.f19848a = zzdeVar;
        this.f19855h = zzcoVar;
        this.f19849b = zzcfVar;
        this.f19850c = zzerVar;
        this.f19851d = zzduVar;
        this.f19852e = zzdzVar;
        this.f19853f = zzegVar;
        this.f19854g = zzekVar;
        this.f19856i = zzdhVar;
    }

    /* renamed from: a */
    public final void m10773a(final int i2, Exception exc) {
        try {
            final zzde zzdeVar = this.f19848a;
            Objects.requireNonNull(zzdeVar);
            zzdeVar.m10780c(new zzdd() { // from class: com.google.android.play.core.assetpacks.zzcs
                @Override // com.google.android.play.core.assetpacks.zzdd
                /* renamed from: u */
                public final Object mo10776u() {
                    zzde.this.m10779b(i2).f19902c.f19897d = 5;
                    return null;
                }
            });
            this.f19848a.m10778a(i2);
        } catch (zzck unused) {
            f19847k.m10835b("Error during error handling: %s", exc.getMessage());
        }
    }
}
