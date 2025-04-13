package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new Parcelable.Creator<ApicFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ApicFrame.1
        @Override // android.os.Parcelable.Creator
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ApicFrame[] newArray(int i2) {
            return new ApicFrame[i2];
        }
    };

    /* renamed from: c */
    public final String f12033c;

    /* renamed from: d */
    @Nullable
    public final String f12034d;

    /* renamed from: e */
    public final int f12035e;

    /* renamed from: f */
    public final byte[] f12036f;

    public ApicFrame(String str, @Nullable String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f12033c = str;
        this.f12034d = str2;
        this.f12035e = i2;
        this.f12036f = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public void mo6699b(MediaMetadata.Builder builder) {
        builder.m5849b(this.f12036f, this.f12035e);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f12035e == apicFrame.f12035e && Util.m7728a(this.f12033c, apicFrame.f12033c) && Util.m7728a(this.f12034d, apicFrame.f12034d) && Arrays.equals(this.f12036f, apicFrame.f12036f);
    }

    public int hashCode() {
        int i2 = (527 + this.f12035e) * 31;
        String str = this.f12033c;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12034d;
        return Arrays.hashCode(this.f12036f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f12061b;
        String str2 = this.f12033c;
        String str3 = this.f12034d;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, 25))), str, ": mimeType=", str2, ", description=");
        m4122u.append(str3);
        return m4122u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12033c);
        parcel.writeString(this.f12034d);
        parcel.writeInt(this.f12035e);
        parcel.writeByteArray(this.f12036f);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12033c = readString;
        this.f12034d = parcel.readString();
        this.f12035e = parcel.readInt();
        this.f12036f = parcel.createByteArray();
    }
}
