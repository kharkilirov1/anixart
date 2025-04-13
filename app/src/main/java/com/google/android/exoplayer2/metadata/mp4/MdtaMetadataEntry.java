package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new Parcelable.Creator<MdtaMetadataEntry>() { // from class: com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry[] newArray(int i2) {
            return new MdtaMetadataEntry[i2];
        }
    };

    /* renamed from: b */
    public final String f12076b;

    /* renamed from: c */
    public final byte[] f12077c;

    /* renamed from: d */
    public final int f12078d;

    /* renamed from: e */
    public final int f12079e;

    public MdtaMetadataEntry(String str, byte[] bArr, int i2, int i3) {
        this.f12076b = str;
        this.f12077c = bArr;
        this.f12078d = i2;
        this.f12079e = i3;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: Q */
    public /* synthetic */ Format mo6698Q() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public /* synthetic */ void mo6699b(MediaMetadata.Builder builder) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f12076b.equals(mdtaMetadataEntry.f12076b) && Arrays.equals(this.f12077c, mdtaMetadataEntry.f12077c) && this.f12078d == mdtaMetadataEntry.f12078d && this.f12079e == mdtaMetadataEntry.f12079e;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f12077c) + C0576a.m4107f(this.f12076b, 527, 31)) * 31) + this.f12078d) * 31) + this.f12079e;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f12076b);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12076b);
        parcel.writeByteArray(this.f12077c);
        parcel.writeInt(this.f12078d);
        parcel.writeInt(this.f12079e);
    }

    public MdtaMetadataEntry(Parcel parcel, C10571 c10571) {
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12076b = readString;
        this.f12077c = parcel.createByteArray();
        this.f12078d = parcel.readInt();
        this.f12079e = parcel.readInt();
    }
}
