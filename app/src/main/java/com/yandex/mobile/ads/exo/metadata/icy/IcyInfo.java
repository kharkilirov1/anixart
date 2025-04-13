package com.yandex.mobile.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.sb0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C4746a();

    /* renamed from: a */
    public final byte[] f48085a;

    /* renamed from: b */
    @Nullable
    public final String f48086b;

    /* renamed from: c */
    @Nullable
    public final String f48087c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.icy.IcyInfo$a */
    public class C4746a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i2) {
            return new IcyInfo[i2];
        }
    }

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.f48085a = bArr;
        this.f48086b = str;
        this.f48087c = str2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ C5606pv mo22238a() {
        return C4740b.m22250a(this);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo22239a(sb0.C5738a c5738a) {
        String str = this.f48086b;
        if (str != null) {
            c5738a.m28202l(str);
        }
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: b */
    public /* synthetic */ byte[] mo22240b() {
        return C4740b.m22252c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f48085a, ((IcyInfo) obj).f48085a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48085a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f48086b, this.f48087c, Integer.valueOf(this.f48085a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.f48085a);
        parcel.writeString(this.f48086b);
        parcel.writeString(this.f48087c);
    }

    public IcyInfo(Parcel parcel) {
        this.f48085a = (byte[]) C5220ia.m25469a(parcel.createByteArray());
        this.f48086b = parcel.readString();
        this.f48087c = parcel.readString();
    }
}
