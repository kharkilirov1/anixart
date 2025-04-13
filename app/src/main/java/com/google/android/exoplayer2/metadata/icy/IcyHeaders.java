package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: com.google.android.exoplayer2.metadata.icy.IcyHeaders.1
        @Override // android.os.Parcelable.Creator
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IcyHeaders[] newArray(int i2) {
            return new IcyHeaders[i2];
        }
    };

    /* renamed from: b */
    public final int f12024b;

    /* renamed from: c */
    @Nullable
    public final String f12025c;

    /* renamed from: d */
    @Nullable
    public final String f12026d;

    /* renamed from: e */
    @Nullable
    public final String f12027e;

    /* renamed from: f */
    public final boolean f12028f;

    /* renamed from: g */
    public final int f12029g;

    public IcyHeaders(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i3) {
        Assertions.m7513a(i3 == -1 || i3 > 0);
        this.f12024b = i2;
        this.f12025c = str;
        this.f12026d = str2;
        this.f12027e = str3;
        this.f12028f = z;
        this.f12029g = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0074  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders m6708a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.m6708a(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: Q */
    public /* synthetic */ Format mo6698Q() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public void mo6699b(MediaMetadata.Builder builder) {
        String str = this.f12026d;
        if (str != null) {
            builder.f9829E = str;
        }
        String str2 = this.f12025c;
        if (str2 != null) {
            builder.f9827C = str2;
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f12024b == icyHeaders.f12024b && Util.m7728a(this.f12025c, icyHeaders.f12025c) && Util.m7728a(this.f12026d, icyHeaders.f12026d) && Util.m7728a(this.f12027e, icyHeaders.f12027e) && this.f12028f == icyHeaders.f12028f && this.f12029g == icyHeaders.f12029g;
    }

    public int hashCode() {
        int i2 = (527 + this.f12024b) * 31;
        String str = this.f12025c;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12026d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12027e;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12028f ? 1 : 0)) * 31) + this.f12029g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        String str = this.f12026d;
        String str2 = this.f12025c;
        int i2 = this.f12024b;
        int i3 = this.f12029g;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str2, C0576a.m4106e(str, 80)), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        m4122u.append("\", bitrate=");
        m4122u.append(i2);
        m4122u.append(", metadataInterval=");
        m4122u.append(i3);
        return m4122u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f12024b);
        parcel.writeString(this.f12025c);
        parcel.writeString(this.f12026d);
        parcel.writeString(this.f12027e);
        boolean z = this.f12028f;
        int i3 = Util.f14736a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f12029g);
    }

    public IcyHeaders(Parcel parcel) {
        this.f12024b = parcel.readInt();
        this.f12025c = parcel.readString();
        this.f12026d = parcel.readString();
        this.f12027e = parcel.readString();
        int i2 = Util.f14736a;
        this.f12028f = parcel.readInt() != 0;
        this.f12029g = parcel.readInt();
    }
}
