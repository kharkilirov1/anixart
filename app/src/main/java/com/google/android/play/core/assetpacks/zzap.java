package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzap extends zzal<Void> {

    /* renamed from: c */
    public final /* synthetic */ zzaw f19685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzaw zzawVar, com.google.android.play.core.tasks.zzi<Void> zziVar) {
        super(zzawVar, zziVar);
        this.f19685c = zzawVar;
    }

    @Override // com.google.android.play.core.assetpacks.zzal, com.google.android.play.core.internal.zzw
    /* renamed from: k2 */
    public final void mo10699k2(Bundle bundle, Bundle bundle2) {
        super.mo10699k2(bundle, bundle2);
        if (!this.f19685c.f19703f.compareAndSet(true, false)) {
            zzaw.f19696g.m10838e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f19685c.mo10716l();
        }
    }
}
