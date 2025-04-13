package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzs extends zzk implements zzu {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: B2 */
    public final void mo10917B2(String str, Bundle bundle, Bundle bundle2, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeInt(1);
        bundle2.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(7, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: R0 */
    public final void mo10918R0(String str, Bundle bundle, Bundle bundle2, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeInt(1);
        bundle2.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(11, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: Y */
    public final void mo10919Y(String str, Bundle bundle, Bundle bundle2, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeInt(1);
        bundle2.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(13, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: b2 */
    public final void mo10920b2(String str, Bundle bundle, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(10, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: e2 */
    public final void mo10921e2(String str, Bundle bundle, Bundle bundle2, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeInt(1);
        bundle2.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(9, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: i1 */
    public final void mo10922i1(String str, List<Bundle> list, Bundle bundle, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        m10912i.writeTypedList(list);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(14, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: n0 */
    public final void mo10923n0(String str, Bundle bundle, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(5, m10912i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.internal.zzu
    /* renamed from: x1 */
    public final void mo10924x1(String str, Bundle bundle, Bundle bundle2, zzw zzwVar) throws RemoteException {
        Parcel m10912i = m10912i();
        m10912i.writeString(str);
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10912i.writeInt(1);
        bundle2.writeToParcel(m10912i, 0);
        m10912i.writeStrongBinder(zzwVar);
        m10913q(6, m10912i);
    }
}
