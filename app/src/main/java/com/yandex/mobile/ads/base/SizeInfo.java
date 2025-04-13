package com.yandex.mobile.ads.base;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5782t5;
import com.yandex.mobile.ads.impl.n11;
import com.yandex.mobile.ads.impl.o11;
import com.yandex.mobile.ads.impl.p11;
import com.yandex.mobile.ads.impl.tg1;
import java.util.Locale;

/* loaded from: classes2.dex */
public class SizeInfo implements Parcelable {
    public static final Parcelable.Creator<SizeInfo> CREATOR = new C4647a();

    /* renamed from: a */
    private final int f47734a;

    /* renamed from: b */
    private final int f47735b;

    /* renamed from: c */
    @NonNull
    private final String f47736c;

    /* renamed from: d */
    @NonNull
    private final int f47737d;

    /* renamed from: com.yandex.mobile.ads.base.SizeInfo$a */
    public class C4647a implements Parcelable.Creator<SizeInfo> {
        @Override // android.os.Parcelable.Creator
        public final SizeInfo createFromParcel(@NonNull Parcel parcel) {
            return new SizeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SizeInfo[] newArray(int i2) {
            return new SizeInfo[i2];
        }
    }

    public SizeInfo(int i2, int i3, @NonNull int i4) {
        this.f47734a = (i2 >= 0 || -1 == i2) ? i2 : 0;
        this.f47735b = (i3 >= 0 || -2 == i3) ? i3 : 0;
        this.f47737d = i4;
        this.f47736c = String.format(Locale.US, "%dx%d", Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    public final int m21913a(@NonNull Context context) {
        int i2 = this.f47735b;
        return -2 == i2 ? tg1.m28656b(context) : i2;
    }

    /* renamed from: b */
    public final int m21914b(@NonNull Context context) {
        int i2 = this.f47735b;
        if (-2 == i2) {
            int i3 = tg1.f55120b;
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        int i4 = tg1.f55120b;
        return n11.m26789a(context, 1, i2);
    }

    /* renamed from: c */
    public final int m21915c() {
        return this.f47735b;
    }

    /* renamed from: d */
    public final int m21918d(@NonNull Context context) {
        int i2 = this.f47734a;
        if (-1 == i2) {
            int i3 = tg1.f55120b;
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        int i4 = tg1.f55120b;
        return n11.m26789a(context, 1, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m21919e() {
        return this.f47734a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SizeInfo sizeInfo = (SizeInfo) obj;
        return this.f47734a == sizeInfo.f47734a && this.f47735b == sizeInfo.f47735b && this.f47737d == sizeInfo.f47737d;
    }

    public final int hashCode() {
        return C5782t5.m28463a(this.f47737d) + o11.m26984a(this.f47736c, ((this.f47734a * 31) + this.f47735b) * 31, 31);
    }

    public final String toString() {
        return this.f47736c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeInt(this.f47734a);
        parcel.writeInt(this.f47735b);
        parcel.writeInt(C5782t5.m28463a(this.f47737d));
        parcel.writeString(this.f47736c);
    }

    /* renamed from: c */
    public final int m21916c(@NonNull Context context) {
        int i2 = this.f47734a;
        return -1 == i2 ? tg1.m28658c(context) : i2;
    }

    public SizeInfo(@NonNull Parcel parcel) {
        this.f47734a = parcel.readInt();
        this.f47735b = parcel.readInt();
        this.f47737d = p11._values()[parcel.readInt()];
        this.f47736c = parcel.readString();
    }

    @NonNull
    /* renamed from: d */
    public final int m21917d() {
        return this.f47737d;
    }
}
