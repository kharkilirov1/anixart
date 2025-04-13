package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15942b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final zzi f15943c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final boolean f15944d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f15945e;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable IBinder iBinder, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        this.f15942b = str;
        zzj zzjVar = null;
        if (iBinder != null) {
            try {
                int i2 = com.google.android.gms.common.internal.zzy.f15833a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper mo8203x = (queryLocalInterface instanceof com.google.android.gms.common.internal.zzz ? (com.google.android.gms.common.internal.zzz) queryLocalInterface : new com.google.android.gms.common.internal.zzx(iBinder)).mo8203x();
                byte[] bArr = mo8203x == null ? null : (byte[]) ObjectWrapper.m8284t(mo8203x);
                if (bArr != null) {
                    zzjVar = new zzj(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.f15943c = zzjVar;
        this.f15944d = z;
        this.f15945e = z2;
    }

    public zzs(String str, @Nullable zzi zziVar, boolean z, boolean z2) {
        this.f15942b = str;
        this.f15943c = zziVar;
        this.f15944d = z;
        this.f15945e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15942b, false);
        zzi zziVar = this.f15943c;
        if (zziVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zziVar = null;
        }
        SafeParcelWriter.m8165d(parcel, 2, zziVar, false);
        boolean z = this.f15944d;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15945e;
        parcel.writeInt(262148);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
