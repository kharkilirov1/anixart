package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.sb0;

/* loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new C4759a();

    /* renamed from: a */
    public final long f48130a;

    /* renamed from: b */
    public final long f48131b;

    /* renamed from: c */
    public final long f48132c;

    /* renamed from: d */
    public final long f48133d;

    /* renamed from: e */
    public final long f48134e;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.mp4.MotionPhotoMetadata$a */
    public class C4759a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i2) {
            return new MotionPhotoMetadata[i2];
        }
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, int i2) {
        this(parcel);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ C5606pv mo22238a() {
        return C4740b.m22250a(this);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ void mo22239a(sb0.C5738a c5738a) {
        C4740b.m22251b(this, c5738a);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: b */
    public /* synthetic */ byte[] mo22240b() {
        return C4740b.m22252c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f48130a == motionPhotoMetadata.f48130a && this.f48131b == motionPhotoMetadata.f48131b && this.f48132c == motionPhotoMetadata.f48132c && this.f48133d == motionPhotoMetadata.f48133d && this.f48134e == motionPhotoMetadata.f48134e;
    }

    public final int hashCode() {
        long j2 = this.f48130a;
        long j3 = this.f48131b;
        int i2 = (((int) (j3 ^ (j3 >>> 32))) + ((((int) (j2 ^ (j2 >>> 32))) + 527) * 31)) * 31;
        long j4 = this.f48132c;
        int i3 = (((int) (j4 ^ (j4 >>> 32))) + i2) * 31;
        long j5 = this.f48133d;
        int i4 = (((int) (j5 ^ (j5 >>> 32))) + i3) * 31;
        long j6 = this.f48134e;
        return ((int) ((j6 >>> 32) ^ j6)) + i4;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("Motion photo metadata: photoStartPosition=");
        m26356a.append(this.f48130a);
        m26356a.append(", photoSize=");
        m26356a.append(this.f48131b);
        m26356a.append(", photoPresentationTimestampUs=");
        m26356a.append(this.f48132c);
        m26356a.append(", videoStartPosition=");
        m26356a.append(this.f48133d);
        m26356a.append(", videoSize=");
        m26356a.append(this.f48134e);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f48130a);
        parcel.writeLong(this.f48131b);
        parcel.writeLong(this.f48132c);
        parcel.writeLong(this.f48133d);
        parcel.writeLong(this.f48134e);
    }

    public MotionPhotoMetadata(long j2, long j3, long j4, long j5, long j6) {
        this.f48130a = j2;
        this.f48131b = j3;
        this.f48132c = j4;
        this.f48133d = j5;
        this.f48134e = j6;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f48130a = parcel.readLong();
        this.f48131b = parcel.readLong();
        this.f48132c = parcel.readLong();
        this.f48133d = parcel.readLong();
        this.f48134e = parcel.readLong();
    }
}
