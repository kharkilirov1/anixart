package com.yandex.mobile.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.o11;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.sb0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C4743a();

    /* renamed from: a */
    public final int f48069a;

    /* renamed from: b */
    public final String f48070b;

    /* renamed from: c */
    public final String f48071c;

    /* renamed from: d */
    public final int f48072d;

    /* renamed from: e */
    public final int f48073e;

    /* renamed from: f */
    public final int f48074f;

    /* renamed from: g */
    public final int f48075g;

    /* renamed from: h */
    public final byte[] f48076h;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.flac.PictureFrame$a */
    public class C4743a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i2) {
            return new PictureFrame[i2];
        }
    }

    public PictureFrame(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f48069a = i2;
        this.f48070b = str;
        this.f48071c = str2;
        this.f48072d = i3;
        this.f48073e = i4;
        this.f48074f = i5;
        this.f48075g = i6;
        this.f48076h = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ C5606pv mo22238a() {
        return C4740b.m22250a(this);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo22239a(sb0.C5738a c5738a) {
        c5738a.m28176a(this.f48069a, this.f48076h);
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
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f48069a == pictureFrame.f48069a && this.f48070b.equals(pictureFrame.f48070b) && this.f48071c.equals(pictureFrame.f48071c) && this.f48072d == pictureFrame.f48072d && this.f48073e == pictureFrame.f48073e && this.f48074f == pictureFrame.f48074f && this.f48075g == pictureFrame.f48075g && Arrays.equals(this.f48076h, pictureFrame.f48076h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48076h) + ((((((((o11.m26984a(this.f48071c, o11.m26984a(this.f48070b, (this.f48069a + 527) * 31, 31), 31) + this.f48072d) * 31) + this.f48073e) * 31) + this.f48074f) * 31) + this.f48075g) * 31);
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("Picture: mimeType=");
        m26356a.append(this.f48070b);
        m26356a.append(", description=");
        m26356a.append(this.f48071c);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f48069a);
        parcel.writeString(this.f48070b);
        parcel.writeString(this.f48071c);
        parcel.writeInt(this.f48072d);
        parcel.writeInt(this.f48073e);
        parcel.writeInt(this.f48074f);
        parcel.writeInt(this.f48075g);
        parcel.writeByteArray(this.f48076h);
    }

    public PictureFrame(Parcel parcel) {
        this.f48069a = parcel.readInt();
        this.f48070b = (String) s91.m28101a(parcel.readString());
        this.f48071c = (String) s91.m28101a(parcel.readString());
        this.f48072d = parcel.readInt();
        this.f48073e = parcel.readInt();
        this.f48074f = parcel.readInt();
        this.f48075g = parcel.readInt();
        this.f48076h = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
