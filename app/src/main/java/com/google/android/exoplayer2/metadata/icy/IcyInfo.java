package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new Parcelable.Creator<IcyInfo>() { // from class: com.google.android.exoplayer2.metadata.icy.IcyInfo.1
        @Override // android.os.Parcelable.Creator
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IcyInfo[] newArray(int i2) {
            return new IcyInfo[i2];
        }
    };

    /* renamed from: b */
    public final byte[] f12030b;

    /* renamed from: c */
    @Nullable
    public final String f12031c;

    /* renamed from: d */
    @Nullable
    public final String f12032d;

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.f12030b = bArr;
        this.f12031c = str;
        this.f12032d = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: Q */
    public /* synthetic */ Format mo6698Q() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public void mo6699b(MediaMetadata.Builder builder) {
        String str = this.f12031c;
        if (str != null) {
            builder.f9831a = str;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12030b, ((IcyInfo) obj).f12030b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12030b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f12031c, this.f12032d, Integer.valueOf(this.f12030b.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.f12030b);
        parcel.writeString(this.f12031c);
        parcel.writeString(this.f12032d);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        Objects.requireNonNull(createByteArray);
        this.f12030b = createByteArray;
        this.f12031c = parcel.readString();
        this.f12032d = parcel.readString();
    }
}
