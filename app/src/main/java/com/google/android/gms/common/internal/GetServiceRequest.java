package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15699b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final int f15700c;

    /* renamed from: d */
    @SafeParcelable.Field
    public int f15701d;

    /* renamed from: e */
    @SafeParcelable.Field
    public String f15702e;

    /* renamed from: f */
    @SafeParcelable.Field
    public IBinder f15703f;

    /* renamed from: g */
    @SafeParcelable.Field
    public Scope[] f15704g;

    /* renamed from: h */
    @SafeParcelable.Field
    public Bundle f15705h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public Account f15706i;

    /* renamed from: j */
    @SafeParcelable.Field
    public Feature[] f15707j;

    /* renamed from: k */
    @SafeParcelable.Field
    public Feature[] f15708k;

    /* renamed from: l */
    @SafeParcelable.Field
    public boolean f15709l;

    /* renamed from: m */
    @SafeParcelable.Field
    public int f15710m;

    /* renamed from: n */
    @SafeParcelable.Field
    public boolean f15711n;

    /* renamed from: o */
    @Nullable
    @SafeParcelable.Field
    public String f15712o;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param String str, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param Scope[] scopeArr, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Account account, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param Feature[] featureArr2, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i5, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param String str2) {
        this.f15699b = i2;
        this.f15700c = i3;
        this.f15701d = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f15702e = "com.google.android.gms";
        } else {
            this.f15702e = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IAccountAccessor m8120q = IAccountAccessor.Stub.m8120q(iBinder);
                int i6 = AccountAccessor.f15648a;
                if (m8120q != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = m8120q.mo8085w();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f15706i = account2;
        } else {
            this.f15703f = iBinder;
            this.f15706i = account;
        }
        this.f15704g = scopeArr;
        this.f15705h = bundle;
        this.f15707j = featureArr;
        this.f15708k = featureArr2;
        this.f15709l = z;
        this.f15710m = i5;
        this.f15711n = z2;
        this.f15712o = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        zzm.m8200a(this, parcel, i2);
    }

    public GetServiceRequest(int i2, @Nullable String str) {
        this.f15699b = 6;
        this.f15701d = GoogleApiAvailabilityLight.f15327a;
        this.f15700c = i2;
        this.f15709l = true;
        this.f15712o = str;
    }
}
