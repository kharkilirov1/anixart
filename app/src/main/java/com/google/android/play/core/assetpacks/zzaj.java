package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzaj extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ int f19674c;

    /* renamed from: d */
    public final /* synthetic */ String f19675d;

    /* renamed from: e */
    public final /* synthetic */ String f19676e;

    /* renamed from: f */
    public final /* synthetic */ int f19677f;

    /* renamed from: g */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19678g;

    /* renamed from: h */
    public final /* synthetic */ zzaw f19679h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzaw zzawVar, com.google.android.play.core.tasks.zzi zziVar, int i2, String str, String str2, int i3, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.f19679h = zzawVar;
        this.f19674c = i2;
        this.f19675d = str;
        this.f19676e = str2;
        this.f19677f = i3;
        this.f19678g = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzaw zzawVar = this.f19679h;
            zzawVar.f19701d.f20120n.mo10918R0(zzawVar.f19698a, zzaw.m10706j(this.f19674c, this.f19675d, this.f19676e, this.f19677f), zzaw.m10704g(), new zzan(this.f19679h, this.f19678g));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10835b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f19675d, this.f19676e, Integer.valueOf(this.f19677f), Integer.valueOf(this.f19674c));
            this.f19678g.m11014c(new RuntimeException(e2));
        }
    }
}
