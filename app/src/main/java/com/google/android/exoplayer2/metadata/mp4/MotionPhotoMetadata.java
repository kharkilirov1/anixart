package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Longs;

/* loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.1
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata[] newArray(int i2) {
            return new MotionPhotoMetadata[i2];
        }
    };

    /* renamed from: b */
    public final long f12080b;

    /* renamed from: c */
    public final long f12081c;

    /* renamed from: d */
    public final long f12082d;

    /* renamed from: e */
    public final long f12083e;

    /* renamed from: f */
    public final long f12084f;

    public MotionPhotoMetadata(long j2, long j3, long j4, long j5, long j6) {
        this.f12080b = j2;
        this.f12081c = j3;
        this.f12082d = j4;
        this.f12083e = j5;
        this.f12084f = j6;
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f12080b == motionPhotoMetadata.f12080b && this.f12081c == motionPhotoMetadata.f12081c && this.f12082d == motionPhotoMetadata.f12082d && this.f12083e == motionPhotoMetadata.f12083e && this.f12084f == motionPhotoMetadata.f12084f;
    }

    public int hashCode() {
        return Longs.m12088c(this.f12084f) + ((Longs.m12088c(this.f12083e) + ((Longs.m12088c(this.f12082d) + ((Longs.m12088c(this.f12081c) + ((Longs.m12088c(this.f12080b) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        long j2 = this.f12080b;
        long j3 = this.f12081c;
        long j4 = this.f12082d;
        long j5 = this.f12083e;
        long j6 = this.f12084f;
        StringBuilder m4121t = C0576a.m4121t(218, "Motion photo metadata: photoStartPosition=", j2, ", photoSize=");
        m4121t.append(j3);
        m4121t.append(", photoPresentationTimestampUs=");
        m4121t.append(j4);
        m4121t.append(", videoStartPosition=");
        m4121t.append(j5);
        m4121t.append(", videoSize=");
        m4121t.append(j6);
        return m4121t.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f12080b);
        parcel.writeLong(this.f12081c);
        parcel.writeLong(this.f12082d);
        parcel.writeLong(this.f12083e);
        parcel.writeLong(this.f12084f);
    }

    public MotionPhotoMetadata(Parcel parcel, C10581 c10581) {
        this.f12080b = parcel.readLong();
        this.f12081c = parcel.readLong();
        this.f12082d = parcel.readLong();
        this.f12083e = parcel.readLong();
        this.f12084f = parcel.readLong();
    }
}
