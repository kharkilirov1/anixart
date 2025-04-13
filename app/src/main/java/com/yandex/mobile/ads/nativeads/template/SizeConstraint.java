package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class SizeConstraint implements Parcelable {
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new C6241a();

    /* renamed from: a */
    @NonNull
    private final SizeConstraintType f57849a;

    /* renamed from: b */
    private final float f57850b;

    public enum SizeConstraintType {
        FIXED,
        FIXED_RATIO,
        PREFERRED_RATIO;

        SizeConstraintType() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.SizeConstraint$a */
    public class C6241a implements Parcelable.Creator<SizeConstraint> {
        @Override // android.os.Parcelable.Creator
        public final SizeConstraint createFromParcel(Parcel parcel) {
            return new SizeConstraint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint[] newArray(int i2) {
            return new SizeConstraint[i2];
        }
    }

    public SizeConstraint(@NonNull SizeConstraintType sizeConstraintType, float f2) {
        this.f57849a = sizeConstraintType;
        this.f57850b = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SizeConstraint.class != obj.getClass()) {
            return false;
        }
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return Float.compare(sizeConstraint.f57850b, this.f57850b) == 0 && this.f57849a == sizeConstraint.f57849a;
    }

    @NonNull
    public SizeConstraintType getSizeConstraintType() {
        return this.f57849a;
    }

    public float getValue() {
        return this.f57850b;
    }

    public int hashCode() {
        float f2 = this.f57850b;
        int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        SizeConstraintType sizeConstraintType = this.f57849a;
        return floatToIntBits + (sizeConstraintType != null ? sizeConstraintType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f57850b);
        SizeConstraintType sizeConstraintType = this.f57849a;
        parcel.writeInt(sizeConstraintType == null ? -1 : sizeConstraintType.ordinal());
    }

    public SizeConstraint(Parcel parcel) {
        this.f57850b = parcel.readFloat();
        int readInt = parcel.readInt();
        this.f57849a = readInt == -1 ? null : SizeConstraintType.values()[readInt];
    }
}
