package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Wa */
/* loaded from: classes2.dex */
public class C3716Wa implements Parcelable {
    public static final Parcelable.Creator<C3716Wa> CREATOR = new a();

    /* renamed from: a */
    public final long f44374a;

    /* renamed from: b */
    public final int f44375b;

    /* renamed from: com.yandex.metrica.impl.ob.Wa$a */
    public class a implements Parcelable.Creator<C3716Wa> {
        @Override // android.os.Parcelable.Creator
        public C3716Wa createFromParcel(Parcel parcel) {
            return new C3716Wa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3716Wa[] newArray(int i2) {
            return new C3716Wa[i2];
        }
    }

    public C3716Wa(long j2, int i2) {
        this.f44374a = j2;
        this.f44375b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DiagnosticsConfig{expirationTimestampSeconds=");
        m24u.append(this.f44374a);
        m24u.append(", intervalSeconds=");
        return C0000a.m17n(m24u, this.f44375b, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f44374a);
        parcel.writeInt(this.f44375b);
    }

    public C3716Wa(Parcel parcel) {
        this.f44374a = parcel.readLong();
        this.f44375b = parcel.readInt();
    }
}
