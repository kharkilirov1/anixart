package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C4749a();

    /* renamed from: b */
    public final String f48093b;

    /* renamed from: c */
    public final int f48094c;

    /* renamed from: d */
    public final int f48095d;

    /* renamed from: e */
    public final long f48096e;

    /* renamed from: f */
    public final long f48097f;

    /* renamed from: g */
    private final Id3Frame[] f48098g;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.ChapterFrame$a */
    public class C4749a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i2) {
            return new ChapterFrame[i2];
        }
    }

    public ChapterFrame(String str, int i2, int i3, long j2, long j3, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f48093b = str;
        this.f48094c = i2;
        this.f48095d = i3;
        this.f48096e = j2;
        this.f48097f = j3;
        this.f48098g = id3FrameArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f48094c == chapterFrame.f48094c && this.f48095d == chapterFrame.f48095d && this.f48096e == chapterFrame.f48096e && this.f48097f == chapterFrame.f48097f && s91.m28112a(this.f48093b, chapterFrame.f48093b) && Arrays.equals(this.f48098g, chapterFrame.f48098g);
    }

    public final int hashCode() {
        int i2 = (((((((this.f48094c + 527) * 31) + this.f48095d) * 31) + ((int) this.f48096e)) * 31) + ((int) this.f48097f)) * 31;
        String str = this.f48093b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48093b);
        parcel.writeInt(this.f48094c);
        parcel.writeInt(this.f48095d);
        parcel.writeLong(this.f48096e);
        parcel.writeLong(this.f48097f);
        parcel.writeInt(this.f48098g.length);
        for (Id3Frame id3Frame : this.f48098g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f48093b = (String) s91.m28101a(parcel.readString());
        this.f48094c = parcel.readInt();
        this.f48095d = parcel.readInt();
        this.f48096e = parcel.readLong();
        this.f48097f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f48098g = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f48098g[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
