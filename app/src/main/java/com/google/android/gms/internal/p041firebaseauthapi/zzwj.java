package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzwj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwj> CREATOR = new zzwk();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f16948b;

    /* renamed from: c */
    @SafeParcelable.Field
    public String f16949c;

    /* renamed from: d */
    @SafeParcelable.Field
    public boolean f16950d;

    /* renamed from: e */
    @SafeParcelable.Field
    public String f16951e;

    /* renamed from: f */
    @SafeParcelable.Field
    public String f16952f;

    /* renamed from: g */
    @SafeParcelable.Field
    public zzwy f16953g;

    /* renamed from: h */
    @SafeParcelable.Field
    public String f16954h;

    /* renamed from: i */
    @SafeParcelable.Field
    public String f16955i;

    /* renamed from: j */
    @SafeParcelable.Field
    public long f16956j;

    /* renamed from: k */
    @SafeParcelable.Field
    public long f16957k;

    /* renamed from: l */
    @SafeParcelable.Field
    public boolean f16958l;

    /* renamed from: m */
    @SafeParcelable.Field
    public zze f16959m;

    /* renamed from: n */
    @SafeParcelable.Field
    public List f16960n;

    public zzwj() {
        this.f16953g = new zzwy();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f16948b, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16949c, false);
        boolean z = this.f16950d;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 5, this.f16951e, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f16952f, false);
        SafeParcelWriter.m8167f(parcel, 7, this.f16953g, i2, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f16954h, false);
        SafeParcelWriter.m8168g(parcel, 9, this.f16955i, false);
        long j2 = this.f16956j;
        parcel.writeInt(524298);
        parcel.writeLong(j2);
        long j3 = this.f16957k;
        parcel.writeInt(524299);
        parcel.writeLong(j3);
        boolean z2 = this.f16958l;
        parcel.writeInt(262156);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8167f(parcel, 13, this.f16959m, i2, false);
        SafeParcelWriter.m8172k(parcel, 14, this.f16960n, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzwj(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param zzwy zzwyVar, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param long j2, @SafeParcelable.Param long j3, @SafeParcelable.Param boolean z2, @SafeParcelable.Param zze zzeVar, @SafeParcelable.Param List list) {
        zzwy zzwyVar2;
        this.f16948b = str;
        this.f16949c = str2;
        this.f16950d = z;
        this.f16951e = str3;
        this.f16952f = str4;
        if (zzwyVar == null) {
            zzwyVar2 = new zzwy();
        } else {
            List list2 = zzwyVar.f16987b;
            zzwy zzwyVar3 = new zzwy();
            if (list2 != null) {
                zzwyVar3.f16987b.addAll(list2);
            }
            zzwyVar2 = zzwyVar3;
        }
        this.f16953g = zzwyVar2;
        this.f16954h = str5;
        this.f16955i = str6;
        this.f16956j = j2;
        this.f16957k = j3;
        this.f16958l = z2;
        this.f16959m = zzeVar;
        this.f16960n = list == null ? new ArrayList() : list;
    }
}
