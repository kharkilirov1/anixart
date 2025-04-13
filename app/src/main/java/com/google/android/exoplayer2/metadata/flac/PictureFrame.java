package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new Parcelable.Creator<PictureFrame>() { // from class: com.google.android.exoplayer2.metadata.flac.PictureFrame.1
        @Override // android.os.Parcelable.Creator
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PictureFrame[] newArray(int i2) {
            return new PictureFrame[i2];
        }
    };

    /* renamed from: b */
    public final int f12011b;

    /* renamed from: c */
    public final String f12012c;

    /* renamed from: d */
    public final String f12013d;

    /* renamed from: e */
    public final int f12014e;

    /* renamed from: f */
    public final int f12015f;

    /* renamed from: g */
    public final int f12016g;

    /* renamed from: h */
    public final int f12017h;

    /* renamed from: i */
    public final byte[] f12018i;

    public PictureFrame(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f12011b = i2;
        this.f12012c = str;
        this.f12013d = str2;
        this.f12014e = i3;
        this.f12015f = i4;
        this.f12016g = i5;
        this.f12017h = i6;
        this.f12018i = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: Q */
    public /* synthetic */ Format mo6698Q() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public void mo6699b(MediaMetadata.Builder builder) {
        builder.m5849b(this.f12018i, this.f12011b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f12011b == pictureFrame.f12011b && this.f12012c.equals(pictureFrame.f12012c) && this.f12013d.equals(pictureFrame.f12013d) && this.f12014e == pictureFrame.f12014e && this.f12015f == pictureFrame.f12015f && this.f12016g == pictureFrame.f12016g && this.f12017h == pictureFrame.f12017h && Arrays.equals(this.f12018i, pictureFrame.f12018i);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12018i) + ((((((((C0576a.m4107f(this.f12013d, C0576a.m4107f(this.f12012c, (this.f12011b + 527) * 31, 31), 31) + this.f12014e) * 31) + this.f12015f) * 31) + this.f12016g) * 31) + this.f12017h) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        String str = this.f12012c;
        String str2 = this.f12013d;
        return C1008a.m6437d(C0576a.m4106e(str2, C0576a.m4106e(str, 32)), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f12011b);
        parcel.writeString(this.f12012c);
        parcel.writeString(this.f12013d);
        parcel.writeInt(this.f12014e);
        parcel.writeInt(this.f12015f);
        parcel.writeInt(this.f12016g);
        parcel.writeInt(this.f12017h);
        parcel.writeByteArray(this.f12018i);
    }

    public PictureFrame(Parcel parcel) {
        this.f12011b = parcel.readInt();
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12012c = readString;
        this.f12013d = parcel.readString();
        this.f12014e = parcel.readInt();
        this.f12015f = parcel.readInt();
        this.f12016g = parcel.readInt();
        this.f12017h = parcel.readInt();
        this.f12018i = parcel.createByteArray();
    }
}
