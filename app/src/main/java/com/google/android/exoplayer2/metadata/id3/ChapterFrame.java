package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator<ChapterFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ChapterFrame.1
        @Override // android.os.Parcelable.Creator
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterFrame[] newArray(int i2) {
            return new ChapterFrame[i2];
        }
    };

    /* renamed from: c */
    public final String f12038c;

    /* renamed from: d */
    public final int f12039d;

    /* renamed from: e */
    public final int f12040e;

    /* renamed from: f */
    public final long f12041f;

    /* renamed from: g */
    public final long f12042g;

    /* renamed from: h */
    public final Id3Frame[] f12043h;

    public ChapterFrame(String str, int i2, int i3, long j2, long j3, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f12038c = str;
        this.f12039d = i2;
        this.f12040e = i3;
        this.f12041f = j2;
        this.f12042g = j3;
        this.f12043h = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f12039d == chapterFrame.f12039d && this.f12040e == chapterFrame.f12040e && this.f12041f == chapterFrame.f12041f && this.f12042g == chapterFrame.f12042g && Util.m7728a(this.f12038c, chapterFrame.f12038c) && Arrays.equals(this.f12043h, chapterFrame.f12043h);
    }

    public int hashCode() {
        int i2 = (((((((527 + this.f12039d) * 31) + this.f12040e) * 31) + ((int) this.f12041f)) * 31) + ((int) this.f12042g)) * 31;
        String str = this.f12038c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12038c);
        parcel.writeInt(this.f12039d);
        parcel.writeInt(this.f12040e);
        parcel.writeLong(this.f12041f);
        parcel.writeLong(this.f12042g);
        parcel.writeInt(this.f12043h.length);
        for (Id3Frame id3Frame : this.f12043h) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12038c = readString;
        this.f12039d = parcel.readInt();
        this.f12040e = parcel.readInt();
        this.f12041f = parcel.readLong();
        this.f12042g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12043h = new Id3Frame[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f12043h[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
