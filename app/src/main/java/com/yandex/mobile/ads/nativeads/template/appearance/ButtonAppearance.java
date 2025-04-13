package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ButtonAppearance implements Parcelable {
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new C6244a();

    /* renamed from: a */
    @Nullable
    private final TextAppearance f57865a;

    /* renamed from: b */
    private final int f57866b;

    /* renamed from: c */
    private final float f57867c;

    /* renamed from: d */
    private final int f57868d;

    /* renamed from: e */
    private final int f57869e;

    public static final class Builder {

        /* renamed from: a */
        private int f57870a;

        /* renamed from: b */
        private float f57871b;

        /* renamed from: c */
        private int f57872c;

        /* renamed from: d */
        private int f57873d;

        /* renamed from: e */
        private TextAppearance f57874e;

        @NonNull
        public ButtonAppearance build() {
            return new ButtonAppearance(this, 0);
        }

        @NonNull
        public Builder setBorderColor(int i2) {
            this.f57870a = i2;
            return this;
        }

        @NonNull
        public Builder setBorderWidth(float f2) {
            this.f57871b = f2;
            return this;
        }

        @NonNull
        public Builder setNormalColor(int i2) {
            this.f57872c = i2;
            return this;
        }

        @NonNull
        public Builder setPressedColor(int i2) {
            this.f57873d = i2;
            return this;
        }

        @NonNull
        public Builder setTextAppearance(@NonNull TextAppearance textAppearance) {
            this.f57874e = textAppearance;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance$a */
    public class C6244a implements Parcelable.Creator<ButtonAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance createFromParcel(Parcel parcel) {
            return new ButtonAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance[] newArray(int i2) {
            return new ButtonAppearance[i2];
        }
    }

    public /* synthetic */ ButtonAppearance(Builder builder, int i2) {
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
        if (obj == null || ButtonAppearance.class != obj.getClass()) {
            return false;
        }
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        if (this.f57866b != buttonAppearance.f57866b || Float.compare(buttonAppearance.f57867c, this.f57867c) != 0 || this.f57868d != buttonAppearance.f57868d || this.f57869e != buttonAppearance.f57869e) {
            return false;
        }
        TextAppearance textAppearance = this.f57865a;
        if (textAppearance != null) {
            if (textAppearance.equals(buttonAppearance.f57865a)) {
                return true;
            }
        } else if (buttonAppearance.f57865a == null) {
            return true;
        }
        return false;
    }

    public int getBorderColor() {
        return this.f57866b;
    }

    public float getBorderWidth() {
        return this.f57867c;
    }

    public int getNormalColor() {
        return this.f57868d;
    }

    public int getPressedColor() {
        return this.f57869e;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f57865a;
    }

    public int hashCode() {
        int i2 = this.f57866b * 31;
        float f2 = this.f57867c;
        int floatToIntBits = (((((i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f57868d) * 31) + this.f57869e) * 31;
        TextAppearance textAppearance = this.f57865a;
        return floatToIntBits + (textAppearance != null ? textAppearance.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f57866b);
        parcel.writeFloat(this.f57867c);
        parcel.writeInt(this.f57868d);
        parcel.writeInt(this.f57869e);
        parcel.writeParcelable(this.f57865a, 0);
    }

    private ButtonAppearance(@NonNull Builder builder) {
        this.f57866b = builder.f57870a;
        this.f57867c = builder.f57871b;
        this.f57868d = builder.f57872c;
        this.f57869e = builder.f57873d;
        this.f57865a = builder.f57874e;
    }

    public ButtonAppearance(Parcel parcel) {
        this.f57866b = parcel.readInt();
        this.f57867c = parcel.readFloat();
        this.f57868d = parcel.readInt();
        this.f57869e = parcel.readInt();
        this.f57865a = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
    }
}
