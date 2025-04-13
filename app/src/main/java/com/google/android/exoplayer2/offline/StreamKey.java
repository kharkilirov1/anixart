package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.google.android.exoplayer2.offline.StreamKey.1
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i2) {
            return new StreamKey[i2];
        }
    };

    /* renamed from: b */
    public final int f12206b;

    /* renamed from: c */
    public final int f12207c;

    /* renamed from: d */
    public final int f12208d;

    public StreamKey(int i2, int i3, int i4) {
        this.f12206b = i2;
        this.f12207c = i3;
        this.f12208d = i4;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i2 = this.f12206b - streamKey2.f12206b;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f12207c - streamKey2.f12207c;
        return i3 == 0 ? this.f12208d - streamKey2.f12208d : i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f12206b == streamKey.f12206b && this.f12207c == streamKey.f12207c && this.f12208d == streamKey.f12208d;
    }

    public int hashCode() {
        return (((this.f12206b * 31) + this.f12207c) * 31) + this.f12208d;
    }

    public String toString() {
        int i2 = this.f12206b;
        int i3 = this.f12207c;
        int i4 = this.f12208d;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f12206b);
        parcel.writeInt(this.f12207c);
        parcel.writeInt(this.f12208d);
    }

    public StreamKey(Parcel parcel) {
        this.f12206b = parcel.readInt();
        this.f12207c = parcel.readInt();
        this.f12208d = parcel.readInt();
    }
}
