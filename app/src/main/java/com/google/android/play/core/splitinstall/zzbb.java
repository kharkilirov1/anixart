package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzcb;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
class zzbb<T> extends zzcb {

    /* renamed from: a */
    public final com.google.android.play.core.tasks.zzi<T> f20277a;

    /* renamed from: b */
    public final /* synthetic */ zzbc f20278b;

    /* renamed from: A1 */
    public void mo10874A1(int i2, Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onStartInstall(%d)", Integer.valueOf(i2));
    }

    /* renamed from: C0 */
    public void mo10875C0(Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onDeferredLanguageUninstall", new Object[0]);
    }

    /* renamed from: H */
    public void mo10876H(List<Bundle> list) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzcc
    /* renamed from: M1 */
    public final void mo10877M1(Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzcc
    /* renamed from: Z0 */
    public final void mo10878Z0(int i2, Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onCompleteInstall(%d)", Integer.valueOf(i2));
    }

    /* renamed from: Z1 */
    public void mo10879Z1(int i2, Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onGetSession(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.internal.zzcc
    /* renamed from: b1 */
    public final void mo10880b1(Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onGetSplitsForAppUpdate", new Object[0]);
    }

    /* renamed from: c */
    public void mo10881c(Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onDeferredInstall", new Object[0]);
    }

    /* renamed from: d */
    public void mo10882d(int i2, Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onCancelInstall(%d)", Integer.valueOf(i2));
    }

    /* renamed from: g */
    public void mo10883g(Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: i0 */
    public void mo10884i0(Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        zzbc.f20279b.m10837d("onDeferredUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzcc
    /* renamed from: q1 */
    public final void mo10885q1(Bundle bundle) throws RemoteException {
        this.f20278b.f20281a.m10843c(this.f20277a);
        int i2 = bundle.getInt("error_code");
        zzbc.f20279b.m10835b("onError(%d)", Integer.valueOf(i2));
        this.f20277a.m11014c(new SplitInstallException(i2));
    }
}
