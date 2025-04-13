package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new Parcelable.Creator<UrlLinkFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.1
        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame[] newArray(int i2) {
            return new UrlLinkFrame[i2];
        }
    };

    /* renamed from: c */
    @Nullable
    public final String f12074c;

    /* renamed from: d */
    public final String f12075d;

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f12074c = str2;
        this.f12075d = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f12061b.equals(urlLinkFrame.f12061b) && Util.m7728a(this.f12074c, urlLinkFrame.f12074c) && Util.m7728a(this.f12075d, urlLinkFrame.f12075d);
    }

    public int hashCode() {
        int m4107f = C0576a.m4107f(this.f12061b, 527, 31);
        String str = this.f12074c;
        int hashCode = (m4107f + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12075d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f12061b;
        String str2 = this.f12075d;
        return C0576a.m4115n(C0576a.m4106e(str2, C0576a.m4106e(str, 6)), str, ": url=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12061b);
        parcel.writeString(this.f12074c);
        parcel.writeString(this.f12075d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UrlLinkFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.exoplayer2.util.Util.f14736a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f12074c = r0
            java.lang.String r3 = r3.readString()
            r2.f12075d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }
}
