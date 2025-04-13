package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzad extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ List f19654c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19655d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f19656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzaw zzawVar, com.google.android.play.core.tasks.zzi zziVar, List list, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.f19656e = zzawVar;
        this.f19654c = list;
        this.f19655d = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        ArrayList m10708m = zzaw.m10708m(this.f19654c);
        try {
            zzaw zzawVar = this.f19656e;
            zzawVar.f19701d.f20120n.mo10922i1(zzawVar.f19698a, m10708m, zzaw.m10704g(), new zzam(this.f19656e, this.f19655d));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10836c(e2, "cancelDownloads(%s)", this.f19654c);
        }
    }
}
