package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzag;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
class zzn<T> extends com.google.android.play.core.internal.zzq {

    /* renamed from: a */
    public final zzag f19626a;

    /* renamed from: b */
    public final com.google.android.play.core.tasks.zzi<T> f19627b;

    /* renamed from: c */
    public final /* synthetic */ zzq f19628c;

    public zzn(zzq zzqVar, zzag zzagVar, com.google.android.play.core.tasks.zzi<T> zziVar) {
        this.f19628c = zzqVar;
        this.f19626a = zzagVar;
        this.f19627b = zziVar;
    }

    @Override // com.google.android.play.core.internal.zzr
    /* renamed from: c */
    public void mo10663c(Bundle bundle) throws RemoteException {
        this.f19628c.f19633a.m10843c(this.f19627b);
        this.f19626a.m10837d("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzr
    /* renamed from: m */
    public void mo10664m(Bundle bundle) throws RemoteException {
        this.f19628c.f19633a.m10843c(this.f19627b);
        this.f19626a.m10837d("onCompleteUpdate", new Object[0]);
    }
}
