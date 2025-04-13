package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C4750a();

    /* renamed from: b */
    public final String f48099b;

    /* renamed from: c */
    public final boolean f48100c;

    /* renamed from: d */
    public final boolean f48101d;

    /* renamed from: e */
    public final String[] f48102e;

    /* renamed from: f */
    private final Id3Frame[] f48103f;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.ChapterTocFrame$a */
    public class C4750a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i2) {
            return new ChapterTocFrame[i2];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f48099b = str;
        this.f48100c = z;
        this.f48101d = z2;
        this.f48102e = strArr;
        this.f48103f = id3FrameArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f48100c == chapterTocFrame.f48100c && this.f48101d == chapterTocFrame.f48101d && s91.m28112a(this.f48099b, chapterTocFrame.f48099b) && Arrays.equals(this.f48102e, chapterTocFrame.f48102e) && Arrays.equals(this.f48103f, chapterTocFrame.f48103f);
    }

    public final int hashCode() {
        int i2 = ((((this.f48100c ? 1 : 0) + 527) * 31) + (this.f48101d ? 1 : 0)) * 31;
        String str = this.f48099b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48099b);
        parcel.writeByte(this.f48100c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48101d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f48102e);
        parcel.writeInt(this.f48103f.length);
        for (Id3Frame id3Frame : this.f48103f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f48099b = (String) s91.m28101a(parcel.readString());
        this.f48100c = parcel.readByte() != 0;
        this.f48101d = parcel.readByte() != 0;
        this.f48102e = (String[]) s91.m28101a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f48103f = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f48103f[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
