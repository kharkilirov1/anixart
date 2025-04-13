package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new Parcelable.Creator<SlowMotionData>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.1
        @Override // android.os.Parcelable.Creator
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public SlowMotionData[] newArray(int i2) {
            return new SlowMotionData[i2];
        }
    };

    /* renamed from: b */
    public final List<Segment> f12085b;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR = new Parcelable.Creator<Segment>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.1
            @Override // android.os.Parcelable.Creator
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public Segment[] newArray(int i2) {
                return new Segment[i2];
            }
        };

        /* renamed from: b */
        public final long f12086b;

        /* renamed from: c */
        public final long f12087c;

        /* renamed from: d */
        public final int f12088d;

        public Segment(long j2, long j3, int i2) {
            Assertions.m7513a(j2 < j3);
            this.f12086b = j2;
            this.f12087c = j3;
            this.f12088d = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f12086b == segment.f12086b && this.f12087c == segment.f12087c && this.f12088d == segment.f12088d;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f12086b), Long.valueOf(this.f12087c), Integer.valueOf(this.f12088d)});
        }

        public String toString() {
            return Util.m7747p("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f12086b), Long.valueOf(this.f12087c), Integer.valueOf(this.f12088d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f12086b);
            parcel.writeLong(this.f12087c);
            parcel.writeInt(this.f12088d);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f12085b = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j2 = list.get(0).f12087c;
            int i2 = 1;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (list.get(i2).f12086b < j2) {
                    z = true;
                    break;
                } else {
                    j2 = list.get(i2).f12087c;
                    i2++;
                }
            }
        }
        Assertions.m7513a(!z);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: Q */
    public /* synthetic */ Format mo6698Q() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public /* synthetic */ void mo6699b(MediaMetadata.Builder builder) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f12085b.equals(((SlowMotionData) obj).f12085b);
    }

    public int hashCode() {
        return this.f12085b.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f12085b);
        return C0576a.m4114m(valueOf.length() + 21, "SlowMotion: segments=", valueOf);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f12085b);
    }
}
