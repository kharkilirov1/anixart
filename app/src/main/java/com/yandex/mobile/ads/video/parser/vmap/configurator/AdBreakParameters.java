package com.yandex.mobile.ads.video.parser.vmap.configurator;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class AdBreakParameters implements Parcelable {
    public static final Parcelable.Creator<AdBreakParameters> CREATOR = new C6272a();

    /* renamed from: a */
    @Nullable
    private final String f57994a;

    /* renamed from: b */
    @Nullable
    private final String f57995b;

    /* renamed from: c */
    @Nullable
    private final String f57996c;

    /* renamed from: com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters$a */
    public class C6272a implements Parcelable.Creator<AdBreakParameters> {
        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters createFromParcel(@NonNull Parcel parcel) {
            return new AdBreakParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters[] newArray(int i2) {
            return new AdBreakParameters[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters$b */
    public static class C6273b {

        /* renamed from: a */
        @Nullable
        private String f57997a;

        /* renamed from: b */
        @Nullable
        private String f57998b;

        /* renamed from: c */
        @Nullable
        private String f57999c;

        @NonNull
        /* renamed from: a */
        public final void m30774a(@NonNull String str) {
            this.f57998b = str;
        }

        @NonNull
        /* renamed from: b */
        public final void m30775b(@NonNull String str) {
            this.f57997a = str;
        }

        @NonNull
        /* renamed from: c */
        public final void m30776c(@NonNull String str) {
            this.f57999c = str;
        }
    }

    public /* synthetic */ AdBreakParameters(C6273b c6273b, int i2) {
        this(c6273b);
    }

    @Nullable
    /* renamed from: c */
    public final String m30768c() {
        return this.f57995b;
    }

    @Nullable
    /* renamed from: d */
    public final String m30769d() {
        return this.f57994a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    /* renamed from: e */
    public final String m30770e() {
        return this.f57996c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeString(this.f57994a);
        parcel.writeString(this.f57995b);
        parcel.writeString(this.f57996c);
    }

    private AdBreakParameters(@NonNull C6273b c6273b) {
        this.f57994a = c6273b.f57997a;
        this.f57995b = c6273b.f57998b;
        this.f57996c = c6273b.f57999c;
    }

    public AdBreakParameters(@NonNull Parcel parcel) {
        this.f57994a = parcel.readString();
        this.f57995b = parcel.readString();
        this.f57996c = parcel.readString();
    }
}
