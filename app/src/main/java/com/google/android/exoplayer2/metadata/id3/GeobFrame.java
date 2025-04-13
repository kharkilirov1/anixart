package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator<GeobFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.GeobFrame.1
        @Override // android.os.Parcelable.Creator
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public GeobFrame[] newArray(int i2) {
            return new GeobFrame[i2];
        }
    };

    /* renamed from: c */
    public final String f12052c;

    /* renamed from: d */
    public final String f12053d;

    /* renamed from: e */
    public final String f12054e;

    /* renamed from: f */
    public final byte[] f12055f;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12052c = str;
        this.f12053d = str2;
        this.f12054e = str3;
        this.f12055f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return Util.m7728a(this.f12052c, geobFrame.f12052c) && Util.m7728a(this.f12053d, geobFrame.f12053d) && Util.m7728a(this.f12054e, geobFrame.f12054e) && Arrays.equals(this.f12055f, geobFrame.f12055f);
    }

    public int hashCode() {
        String str = this.f12052c;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12053d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12054e;
        return Arrays.hashCode(this.f12055f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f12061b;
        String str2 = this.f12052c;
        String str3 = this.f12053d;
        String str4 = this.f12054e;
        return C0000a.m21r(C0576a.m4122u(C0576a.m4106e(str4, C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, 36)))), str, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12052c);
        parcel.writeString(this.f12053d);
        parcel.writeString(this.f12054e);
        parcel.writeByteArray(this.f12055f);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12052c = readString;
        this.f12053d = parcel.readString();
        this.f12054e = parcel.readString();
        this.f12055f = parcel.createByteArray();
    }
}
