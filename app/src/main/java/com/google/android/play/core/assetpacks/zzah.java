package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzah extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ int f19666c;

    /* renamed from: d */
    public final /* synthetic */ String f19667d;

    /* renamed from: e */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19668e;

    /* renamed from: f */
    public final /* synthetic */ int f19669f;

    /* renamed from: g */
    public final /* synthetic */ zzaw f19670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzaw zzawVar, com.google.android.play.core.tasks.zzi zziVar, int i2, String str, com.google.android.play.core.tasks.zzi zziVar2, int i3) {
        super(zziVar);
        this.f19670g = zzawVar;
        this.f19666c = i2;
        this.f19667d = str;
        this.f19668e = zziVar2;
        this.f19669f = i3;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzaw zzawVar = this.f19670g;
            com.google.android.play.core.internal.zzu zzuVar = zzawVar.f19701d.f20120n;
            String str = zzawVar.f19698a;
            int i2 = this.f19666c;
            String str2 = this.f19667d;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            bundle.putString("module_name", str2);
            zzuVar.mo10917B2(str, bundle, zzaw.m10704g(), new zzar(this.f19670g, this.f19668e, this.f19666c, this.f19667d, this.f19669f));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10836c(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
