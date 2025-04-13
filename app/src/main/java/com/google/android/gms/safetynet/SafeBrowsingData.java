package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f17187b;

    /* renamed from: c */
    @SafeParcelable.Field
    public DataHolder f17188c;

    /* renamed from: d */
    @SafeParcelable.Field
    public ParcelFileDescriptor f17189d;

    /* renamed from: e */
    @SafeParcelable.Field
    public long f17190e;

    /* renamed from: f */
    @SafeParcelable.Field
    public byte[] f17191f;

    public SafeBrowsingData() {
        this.f17187b = null;
        this.f17188c = null;
        this.f17189d = null;
        this.f17190e = 0L;
        this.f17191f = null;
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param String str, @SafeParcelable.Param DataHolder dataHolder, @SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param long j2, @SafeParcelable.Param byte[] bArr) {
        this.f17187b = str;
        this.f17188c = dataHolder;
        this.f17189d = parcelFileDescriptor;
        this.f17190e = j2;
        this.f17191f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        ParcelFileDescriptor parcelFileDescriptor = this.f17189d;
        zzj.m9684a(this, parcel, i2);
        this.f17189d = null;
    }
}
