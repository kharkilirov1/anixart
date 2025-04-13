package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator<GetServiceRequest> {
    /* renamed from: a */
    public static void m8200a(GetServiceRequest getServiceRequest, Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = getServiceRequest.f15699b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.f15700c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        int i5 = getServiceRequest.f15701d;
        parcel.writeInt(262147);
        parcel.writeInt(i5);
        SafeParcelWriter.m8168g(parcel, 4, getServiceRequest.f15702e, false);
        SafeParcelWriter.m8165d(parcel, 5, getServiceRequest.f15703f, false);
        SafeParcelWriter.m8171j(parcel, 6, getServiceRequest.f15704g, i2, false);
        SafeParcelWriter.m8163b(parcel, 7, getServiceRequest.f15705h, false);
        SafeParcelWriter.m8167f(parcel, 8, getServiceRequest.f15706i, i2, false);
        SafeParcelWriter.m8171j(parcel, 10, getServiceRequest.f15707j, i2, false);
        SafeParcelWriter.m8171j(parcel, 11, getServiceRequest.f15708k, i2, false);
        boolean z = getServiceRequest.f15709l;
        parcel.writeInt(262156);
        parcel.writeInt(z ? 1 : 0);
        int i6 = getServiceRequest.f15710m;
        parcel.writeInt(262157);
        parcel.writeInt(i6);
        boolean z2 = getServiceRequest.f15711n;
        parcel.writeInt(262158);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 15, getServiceRequest.f15712o, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @Override // android.os.Parcelable.Creator
    public final GetServiceRequest createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 2:
                    i3 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 3:
                    i4 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m8153p(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m8148k(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m8140c(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.m8144g(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.m8148k(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m8148k(parcel, readInt, Feature.CREATOR);
                    break;
                case '\f':
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case '\r':
                    i5 = SafeParcelReader.m8154q(parcel, readInt);
                    break;
                case 14:
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 15:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new GetServiceRequest(i2, i3, i4, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i5, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }
}
