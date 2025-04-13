package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;

/* loaded from: classes3.dex */
public final class ImageAppearance implements Parcelable {
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new C6245a();

    /* renamed from: a */
    @Nullable
    private final SizeConstraint f57875a;

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        private SizeConstraint f57876a;

        @NonNull
        public ImageAppearance build() {
            return new ImageAppearance(this, 0);
        }

        @NonNull
        public Builder setWidthConstraint(@NonNull SizeConstraint sizeConstraint) {
            this.f57876a = sizeConstraint;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance$a */
    public class C6245a implements Parcelable.Creator<ImageAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ImageAppearance createFromParcel(Parcel parcel) {
            return new ImageAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAppearance[] newArray(int i2) {
            return new ImageAppearance[i2];
        }
    }

    public /* synthetic */ ImageAppearance(Builder builder, int i2) {
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
        if (obj == null || ImageAppearance.class != obj.getClass()) {
            return false;
        }
        ImageAppearance imageAppearance = (ImageAppearance) obj;
        SizeConstraint sizeConstraint = this.f57875a;
        if (sizeConstraint != null) {
            if (sizeConstraint.equals(imageAppearance.f57875a)) {
                return true;
            }
        } else if (imageAppearance.f57875a == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public SizeConstraint getWidthConstraint() {
        return this.f57875a;
    }

    public int hashCode() {
        SizeConstraint sizeConstraint = this.f57875a;
        if (sizeConstraint != null) {
            return sizeConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f57875a, i2);
    }

    private ImageAppearance(@NonNull Builder builder) {
        this.f57875a = builder.f57876a;
    }

    public ImageAppearance(Parcel parcel) {
        this.f57875a = (SizeConstraint) parcel.readParcelable(SizeConstraint.class.getClassLoader());
    }
}
