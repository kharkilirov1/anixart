package com.yandex.mobile.ads.video.models.p026ad;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class JavaScriptResource implements Parcelable {
    public static final Parcelable.Creator<JavaScriptResource> CREATOR = new C6268a();

    /* renamed from: a */
    @NonNull
    private final String f57981a;

    /* renamed from: b */
    @NonNull
    private final String f57982b;

    /* renamed from: c */
    private final boolean f57983c;

    /* renamed from: com.yandex.mobile.ads.video.models.ad.JavaScriptResource$a */
    public class C6268a implements Parcelable.Creator<JavaScriptResource> {
        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource createFromParcel(@NonNull Parcel parcel) {
            return new JavaScriptResource(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource[] newArray(int i2) {
            return new JavaScriptResource[i2];
        }
    }

    public /* synthetic */ JavaScriptResource(Parcel parcel, int i2) {
        this(parcel);
    }

    @NonNull
    /* renamed from: c */
    public final String m30763c() {
        return this.f57981a;
    }

    @NonNull
    /* renamed from: d */
    public final String m30764d() {
        return this.f57982b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaScriptResource.class != obj.getClass()) {
            return false;
        }
        JavaScriptResource javaScriptResource = (JavaScriptResource) obj;
        if (this.f57983c == javaScriptResource.f57983c && this.f57981a.equals(javaScriptResource.f57981a)) {
            return this.f57982b.equals(javaScriptResource.f57982b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57982b.hashCode() + (((this.f57981a.hashCode() * 31) + (this.f57983c ? 1 : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeString(this.f57981a);
        parcel.writeInt(this.f57983c ? 1 : 0);
        parcel.writeString(this.f57982b);
    }

    public JavaScriptResource(@NonNull String str, @NonNull String str2, boolean z) {
        this.f57981a = str;
        this.f57982b = str2;
        this.f57983c = z;
    }

    private JavaScriptResource(@NonNull Parcel parcel) {
        this.f57981a = parcel.readString();
        this.f57983c = parcel.readInt() != 0;
        this.f57982b = parcel.readString();
    }
}
