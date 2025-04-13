package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new Parcelable.Creator<ChapterTocFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.1
        @Override // android.os.Parcelable.Creator
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterTocFrame[] newArray(int i2) {
            return new ChapterTocFrame[i2];
        }
    };

    /* renamed from: c */
    public final String f12044c;

    /* renamed from: d */
    public final boolean f12045d;

    /* renamed from: e */
    public final boolean f12046e;

    /* renamed from: f */
    public final String[] f12047f;

    /* renamed from: g */
    public final Id3Frame[] f12048g;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f12044c = str;
        this.f12045d = z;
        this.f12046e = z2;
        this.f12047f = strArr;
        this.f12048g = id3FrameArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f12045d == chapterTocFrame.f12045d && this.f12046e == chapterTocFrame.f12046e && Util.m7728a(this.f12044c, chapterTocFrame.f12044c) && Arrays.equals(this.f12047f, chapterTocFrame.f12047f) && Arrays.equals(this.f12048g, chapterTocFrame.f12048g);
    }

    public int hashCode() {
        int i2 = (((527 + (this.f12045d ? 1 : 0)) * 31) + (this.f12046e ? 1 : 0)) * 31;
        String str = this.f12044c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12044c);
        parcel.writeByte(this.f12045d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12046e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f12047f);
        parcel.writeInt(this.f12048g.length);
        for (Id3Frame id3Frame : this.f12048g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12044c = readString;
        this.f12045d = parcel.readByte() != 0;
        this.f12046e = parcel.readByte() != 0;
        this.f12047f = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f12048g = new Id3Frame[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f12048g[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
