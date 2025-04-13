package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new Parcelable.Creator<PrivFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.PrivFrame.1
        @Override // android.os.Parcelable.Creator
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PrivFrame[] newArray(int i2) {
            return new PrivFrame[i2];
        }
    };

    /* renamed from: c */
    public final String f12070c;

    /* renamed from: d */
    public final byte[] f12071d;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f12070c = str;
        this.f12071d = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return Util.m7728a(this.f12070c, privFrame.f12070c) && Arrays.equals(this.f12071d, privFrame.f12071d);
    }

    public int hashCode() {
        String str = this.f12070c;
        return Arrays.hashCode(this.f12071d) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f12061b;
        String str2 = this.f12070c;
        return C0576a.m4115n(C0576a.m4106e(str2, C0576a.m4106e(str, 8)), str, ": owner=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12070c);
        parcel.writeByteArray(this.f12071d);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12070c = readString;
        this.f12071d = parcel.createByteArray();
    }
}
