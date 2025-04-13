package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;

/* loaded from: classes3.dex */
public final class BannerAppearance implements Parcelable {
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new C6243a();

    /* renamed from: a */
    @Nullable
    private final HorizontalOffset f57855a;

    /* renamed from: b */
    @Nullable
    private final HorizontalOffset f57856b;

    /* renamed from: c */
    private final int f57857c;

    /* renamed from: d */
    private final int f57858d;

    /* renamed from: e */
    private final float f57859e;

    public static final class Builder {

        /* renamed from: a */
        private int f57860a;

        /* renamed from: b */
        private int f57861b;

        /* renamed from: c */
        private float f57862c;

        /* renamed from: d */
        private HorizontalOffset f57863d;

        /* renamed from: e */
        private HorizontalOffset f57864e;

        @NonNull
        public BannerAppearance build() {
            return new BannerAppearance(this, 0);
        }

        @NonNull
        public Builder setBackgroundColor(int i2) {
            this.f57860a = i2;
            return this;
        }

        @NonNull
        public Builder setBorderColor(int i2) {
            this.f57861b = i2;
            return this;
        }

        @NonNull
        public Builder setBorderWidth(float f2) {
            this.f57862c = f2;
            return this;
        }

        @NonNull
        public Builder setContentPadding(@NonNull HorizontalOffset horizontalOffset) {
            this.f57863d = horizontalOffset;
            return this;
        }

        @NonNull
        public Builder setImageMargins(@NonNull HorizontalOffset horizontalOffset) {
            this.f57864e = horizontalOffset;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance$a */
    public class C6243a implements Parcelable.Creator<BannerAppearance> {
        @Override // android.os.Parcelable.Creator
        public final BannerAppearance createFromParcel(Parcel parcel) {
            return new BannerAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerAppearance[] newArray(int i2) {
            return new BannerAppearance[i2];
        }
    }

    public /* synthetic */ BannerAppearance(Builder builder, int i2) {
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
        if (obj == null || BannerAppearance.class != obj.getClass()) {
            return false;
        }
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        if (this.f57857c != bannerAppearance.f57857c || this.f57858d != bannerAppearance.f57858d || Float.compare(bannerAppearance.f57859e, this.f57859e) != 0) {
            return false;
        }
        HorizontalOffset horizontalOffset = this.f57855a;
        if (horizontalOffset == null ? bannerAppearance.f57855a != null : !horizontalOffset.equals(bannerAppearance.f57855a)) {
            return false;
        }
        HorizontalOffset horizontalOffset2 = this.f57856b;
        HorizontalOffset horizontalOffset3 = bannerAppearance.f57856b;
        return horizontalOffset2 == null ? horizontalOffset3 == null : horizontalOffset2.equals(horizontalOffset3);
    }

    public int getBackgroundColor() {
        return this.f57857c;
    }

    public int getBorderColor() {
        return this.f57858d;
    }

    public float getBorderWidth() {
        return this.f57859e;
    }

    @Nullable
    public HorizontalOffset getContentPadding() {
        return this.f57855a;
    }

    @Nullable
    public HorizontalOffset getImageMargins() {
        return this.f57856b;
    }

    public int hashCode() {
        int i2 = ((this.f57857c * 31) + this.f57858d) * 31;
        float f2 = this.f57859e;
        int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        HorizontalOffset horizontalOffset = this.f57855a;
        int hashCode = (floatToIntBits + (horizontalOffset != null ? horizontalOffset.hashCode() : 0)) * 31;
        HorizontalOffset horizontalOffset2 = this.f57856b;
        return hashCode + (horizontalOffset2 != null ? horizontalOffset2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f57857c);
        parcel.writeInt(this.f57858d);
        parcel.writeFloat(this.f57859e);
        parcel.writeParcelable(this.f57855a, 0);
        parcel.writeParcelable(this.f57856b, 0);
    }

    private BannerAppearance(@NonNull Builder builder) {
        this.f57857c = builder.f57860a;
        this.f57858d = builder.f57861b;
        this.f57859e = builder.f57862c;
        this.f57855a = builder.f57863d;
        this.f57856b = builder.f57864e;
    }

    public BannerAppearance(Parcel parcel) {
        this.f57857c = parcel.readInt();
        this.f57858d = parcel.readInt();
        this.f57859e = parcel.readFloat();
        this.f57855a = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
        this.f57856b = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
    }
}
