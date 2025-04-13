package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class RatingAppearance implements Parcelable {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new C6248a();

    /* renamed from: a */
    private final int f57913a;

    /* renamed from: b */
    private final int f57914b;

    public static final class Builder {

        /* renamed from: a */
        private int f57915a;

        /* renamed from: b */
        private int f57916b;

        @NonNull
        public RatingAppearance build() {
            return new RatingAppearance(this, 0);
        }

        @NonNull
        public Builder setBackgroundStarColor(int i2) {
            this.f57915a = i2;
            return this;
        }

        @NonNull
        public Builder setProgressStarColor(int i2) {
            this.f57916b = i2;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance$a */
    public class C6248a implements Parcelable.Creator<RatingAppearance> {
        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            return new RatingAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i2) {
            return new RatingAppearance[i2];
        }
    }

    public /* synthetic */ RatingAppearance(Builder builder, int i2) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RatingAppearance.class != obj.getClass()) {
            return false;
        }
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return this.f57913a == ratingAppearance.f57913a && this.f57914b == ratingAppearance.f57914b;
    }

    public int getBackgroundStarColor() {
        return this.f57913a;
    }

    public int getProgressStarColor() {
        return this.f57914b;
    }

    public int hashCode() {
        return (this.f57913a * 31) + this.f57914b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f57913a);
        parcel.writeInt(this.f57914b);
    }

    private RatingAppearance(@NonNull Builder builder) {
        this.f57913a = builder.f57915a;
        this.f57914b = builder.f57916b;
    }

    public RatingAppearance(Parcel parcel) {
        this.f57913a = parcel.readInt();
        this.f57914b = parcel.readInt();
    }
}
