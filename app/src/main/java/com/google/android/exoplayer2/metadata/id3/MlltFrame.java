package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new Parcelable.Creator<MlltFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.MlltFrame.1
        @Override // android.os.Parcelable.Creator
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MlltFrame[] newArray(int i2) {
            return new MlltFrame[i2];
        }
    };

    /* renamed from: c */
    public final int f12065c;

    /* renamed from: d */
    public final int f12066d;

    /* renamed from: e */
    public final int f12067e;

    /* renamed from: f */
    public final int[] f12068f;

    /* renamed from: g */
    public final int[] f12069g;

    public MlltFrame(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12065c = i2;
        this.f12066d = i3;
        this.f12067e = i4;
        this.f12068f = iArr;
        this.f12069g = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f12065c == mlltFrame.f12065c && this.f12066d == mlltFrame.f12066d && this.f12067e == mlltFrame.f12067e && Arrays.equals(this.f12068f, mlltFrame.f12068f) && Arrays.equals(this.f12069g, mlltFrame.f12069g);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f12069g) + ((Arrays.hashCode(this.f12068f) + ((((((527 + this.f12065c) * 31) + this.f12066d) * 31) + this.f12067e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f12065c);
        parcel.writeInt(this.f12066d);
        parcel.writeInt(this.f12067e);
        parcel.writeIntArray(this.f12068f);
        parcel.writeIntArray(this.f12069g);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f12065c = parcel.readInt();
        this.f12066d = parcel.readInt();
        this.f12067e = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i2 = Util.f14736a;
        this.f12068f = createIntArray;
        this.f12069g = parcel.createIntArray();
    }
}
