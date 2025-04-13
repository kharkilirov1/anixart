package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class TextAppearance implements Parcelable {
    public static final Parcelable.Creator<TextAppearance> CREATOR = new C6249a();

    /* renamed from: a */
    @Nullable
    private final String f57917a;

    /* renamed from: b */
    private final int f57918b;

    /* renamed from: c */
    private final float f57919c;

    /* renamed from: d */
    private final int f57920d;

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        private String f57921a;

        /* renamed from: b */
        private int f57922b;

        /* renamed from: c */
        private float f57923c;

        /* renamed from: d */
        private int f57924d;

        @NonNull
        public TextAppearance build() {
            return new TextAppearance(this, 0);
        }

        @NonNull
        public Builder setFontFamilyName(@Nullable String str) {
            this.f57921a = str;
            return this;
        }

        public Builder setFontStyle(int i2) {
            this.f57924d = i2;
            return this;
        }

        @NonNull
        public Builder setTextColor(int i2) {
            this.f57922b = i2;
            return this;
        }

        @NonNull
        public Builder setTextSize(float f2) {
            this.f57923c = f2;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance$a */
    public class C6249a implements Parcelable.Creator<TextAppearance> {
        @Override // android.os.Parcelable.Creator
        public final TextAppearance createFromParcel(Parcel parcel) {
            return new TextAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance[] newArray(int i2) {
            return new TextAppearance[i2];
        }
    }

    public /* synthetic */ TextAppearance(Builder builder, int i2) {
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
        if (obj == null || TextAppearance.class != obj.getClass()) {
            return false;
        }
        TextAppearance textAppearance = (TextAppearance) obj;
        if (this.f57918b != textAppearance.f57918b || Float.compare(textAppearance.f57919c, this.f57919c) != 0 || this.f57920d != textAppearance.f57920d) {
            return false;
        }
        String str = this.f57917a;
        if (str != null) {
            if (str.equals(textAppearance.f57917a)) {
                return true;
            }
        } else if (textAppearance.f57917a == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public String getFontFamilyName() {
        return this.f57917a;
    }

    public int getFontStyle() {
        return this.f57920d;
    }

    public int getTextColor() {
        return this.f57918b;
    }

    public float getTextSize() {
        return this.f57919c;
    }

    public int hashCode() {
        int i2 = this.f57918b * 31;
        float f2 = this.f57919c;
        int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        String str = this.f57917a;
        return ((floatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f57920d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f57918b);
        parcel.writeFloat(this.f57919c);
        parcel.writeString(this.f57917a);
        parcel.writeInt(this.f57920d);
    }

    private TextAppearance(Builder builder) {
        this.f57918b = builder.f57922b;
        this.f57919c = builder.f57923c;
        this.f57917a = builder.f57921a;
        this.f57920d = builder.f57924d;
    }

    public TextAppearance(Parcel parcel) {
        this.f57918b = parcel.readInt();
        this.f57919c = parcel.readFloat();
        this.f57917a = parcel.readString();
        this.f57920d = parcel.readInt();
    }
}
