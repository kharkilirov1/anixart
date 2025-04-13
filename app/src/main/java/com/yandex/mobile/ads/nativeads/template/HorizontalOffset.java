package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class HorizontalOffset implements Parcelable {
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new C6238a();

    /* renamed from: a */
    private final float f57810a;

    /* renamed from: b */
    private final float f57811b;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.HorizontalOffset$a */
    public class C6238a implements Parcelable.Creator<HorizontalOffset> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset createFromParcel(Parcel parcel) {
            return new HorizontalOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset[] newArray(int i2) {
            return new HorizontalOffset[i2];
        }
    }

    public HorizontalOffset(float f2, float f3) {
        this.f57810a = f2;
        this.f57811b = f3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HorizontalOffset.class != obj.getClass()) {
            return false;
        }
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return Float.compare(horizontalOffset.f57810a, this.f57810a) == 0 && Float.compare(horizontalOffset.f57811b, this.f57811b) == 0;
    }

    public float getLeft() {
        return this.f57810a;
    }

    public float getRight() {
        return this.f57811b;
    }

    public int hashCode() {
        float f2 = this.f57810a;
        int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.f57811b;
        return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public String toString() {
        return this.f57810a + ", " + this.f57811b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f57810a);
        parcel.writeFloat(this.f57811b);
    }

    public HorizontalOffset(Parcel parcel) {
        this.f57810a = parcel.readFloat();
        this.f57811b = parcel.readFloat();
    }
}
