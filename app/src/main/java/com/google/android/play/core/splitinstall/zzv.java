package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzv implements zzf {

    /* renamed from: a */
    public final /* synthetic */ SplitInstallSessionState f20292a;

    /* renamed from: b */
    public final /* synthetic */ Intent f20293b;

    /* renamed from: c */
    public final /* synthetic */ Context f20294c;

    /* renamed from: d */
    public final /* synthetic */ zzx f20295d;

    public zzv(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.f20295d = zzxVar;
        this.f20292a = splitInstallSessionState;
        this.f20293b = intent;
        this.f20294c = context;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    /* renamed from: a */
    public final void mo10983a(@SplitInstallErrorCode int i2) {
        zzx zzxVar = this.f20295d;
        zzxVar.f20301g.post(new zzw(zzxVar, this.f20292a, 6, i2));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    /* renamed from: u */
    public final void mo10984u() {
        zzx zzxVar = this.f20295d;
        zzxVar.f20301g.post(new zzw(zzxVar, this.f20292a, 5, 0));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    /* renamed from: v */
    public final void mo10985v() {
        if (this.f20293b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f20295d.f20162a.m10835b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f20293b.putExtra("triggered_from_app_after_verification", true);
            this.f20294c.sendBroadcast(this.f20293b);
        }
    }
}
