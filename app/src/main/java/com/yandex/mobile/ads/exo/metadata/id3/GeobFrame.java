package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C4752a();

    /* renamed from: b */
    public final String f48107b;

    /* renamed from: c */
    public final String f48108c;

    /* renamed from: d */
    public final String f48109d;

    /* renamed from: e */
    public final byte[] f48110e;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.GeobFrame$a */
    public class C4752a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i2) {
            return new GeobFrame[i2];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f48107b = str;
        this.f48108c = str2;
        this.f48109d = str3;
        this.f48110e = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return s91.m28112a(this.f48107b, geobFrame.f48107b) && s91.m28112a(this.f48108c, geobFrame.f48108c) && s91.m28112a(this.f48109d, geobFrame.f48109d) && Arrays.equals(this.f48110e, geobFrame.f48110e);
    }

    public final int hashCode() {
        String str = this.f48107b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f48108c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48109d;
        return Arrays.hashCode(this.f48110e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f48111a + ": mimeType=" + this.f48107b + ", filename=" + this.f48108c + ", description=" + this.f48109d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48107b);
        parcel.writeString(this.f48108c);
        parcel.writeString(this.f48109d);
        parcel.writeByteArray(this.f48110e);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f48107b = (String) s91.m28101a(parcel.readString());
        this.f48108c = (String) s91.m28101a(parcel.readString());
        this.f48109d = (String) s91.m28101a(parcel.readString());
        this.f48110e = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
