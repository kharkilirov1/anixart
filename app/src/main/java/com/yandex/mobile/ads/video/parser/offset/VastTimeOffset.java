package com.yandex.mobile.ads.video.parser.offset;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class VastTimeOffset implements Parcelable {
    public static final Parcelable.Creator<VastTimeOffset> CREATOR = new C6269a();

    /* renamed from: a */
    @NonNull
    private final EnumC6270b f57984a;

    /* renamed from: b */
    private final float f57985b;

    /* renamed from: com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$a */
    public class C6269a implements Parcelable.Creator<VastTimeOffset> {
        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset createFromParcel(@NonNull Parcel parcel) {
            return new VastTimeOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset[] newArray(int i2) {
            return new VastTimeOffset[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.parser.offset.VastTimeOffset$b */
    public enum EnumC6270b {
        f57986a,
        f57987b,
        f57988c;

        EnumC6270b() {
        }
    }

    public VastTimeOffset(@NonNull EnumC6270b enumC6270b, float f2) {
        this.f57984a = enumC6270b;
        this.f57985b = f2;
    }

    @NonNull
    /* renamed from: c */
    public final EnumC6270b m30765c() {
        return this.f57984a;
    }

    /* renamed from: d */
    public final float m30766d() {
        return this.f57985b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        EnumC6270b enumC6270b = this.f57984a;
        parcel.writeInt(enumC6270b == null ? -1 : enumC6270b.ordinal());
        parcel.writeFloat(this.f57985b);
    }

    public VastTimeOffset(@NonNull Parcel parcel) {
        int readInt = parcel.readInt();
        this.f57984a = readInt == -1 ? null : EnumC6270b.values()[readInt];
        this.f57985b = parcel.readFloat();
    }
}
