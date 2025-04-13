package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.zzag;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzo extends zzn<Void> {
    public zzo(zzq zzqVar, com.google.android.play.core.tasks.zzi<Void> zziVar) {
        super(zzqVar, new zzag("OnCompleteUpdateCallback"), zziVar);
    }

    @Override // com.google.android.play.core.appupdate.zzn, com.google.android.play.core.internal.zzr
    /* renamed from: m */
    public final void mo10664m(Bundle bundle) throws RemoteException {
        this.f19628c.f19633a.m10843c(this.f19627b);
        this.f19626a.m10837d("onCompleteUpdate", new Object[0]);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f19627b.m11014c(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f19627b.m11015d(null);
        }
    }
}
