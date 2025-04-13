package com.yandex.mobile.ads.exo.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C4775a();

    /* renamed from: a */
    public final int f48193a;

    /* renamed from: b */
    public final int f48194b;

    /* renamed from: c */
    public final int f48195c;

    /* renamed from: com.yandex.mobile.ads.exo.offline.StreamKey$a */
    public class C4775a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i2) {
            return new StreamKey[i2];
        }
    }

    public StreamKey(int i2, int i3, int i4) {
        this.f48193a = i2;
        this.f48194b = i3;
        this.f48195c = i4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i2 = this.f48193a - streamKey2.f48193a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f48194b - streamKey2.f48194b;
        return i3 == 0 ? this.f48195c - streamKey2.f48195c : i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f48193a == streamKey.f48193a && this.f48194b == streamKey.f48194b && this.f48195c == streamKey.f48195c;
    }

    public final int hashCode() {
        return (((this.f48193a * 31) + this.f48194b) * 31) + this.f48195c;
    }

    public final String toString() {
        return this.f48193a + "." + this.f48194b + "." + this.f48195c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f48193a);
        parcel.writeInt(this.f48194b);
        parcel.writeInt(this.f48195c);
    }

    public StreamKey(Parcel parcel) {
        this.f48193a = parcel.readInt();
        this.f48194b = parcel.readInt();
        this.f48195c = parcel.readInt();
    }
}
