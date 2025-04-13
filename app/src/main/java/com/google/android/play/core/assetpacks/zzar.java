package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzar extends zzal<Void> {

    /* renamed from: c */
    public final int f19686c;

    /* renamed from: d */
    public final String f19687d;

    /* renamed from: e */
    public final int f19688e;

    /* renamed from: f */
    public final /* synthetic */ zzaw f19689f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzaw zzawVar, com.google.android.play.core.tasks.zzi<Void> zziVar, int i2, String str, int i3) {
        super(zzawVar, zziVar);
        this.f19689f = zzawVar;
        this.f19686c = i2;
        this.f19687d = str;
        this.f19688e = i3;
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    /* renamed from: g */
    public final void mo10698g(Bundle bundle) {
        this.f19689f.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10835b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i2 = this.f19688e;
        if (i2 > 0) {
            this.f19689f.m10715i(this.f19686c, this.f19687d, i2 - 1);
        }
    }
}
