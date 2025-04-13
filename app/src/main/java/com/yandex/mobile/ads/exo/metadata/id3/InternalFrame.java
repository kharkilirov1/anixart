package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;

/* loaded from: classes2.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C4753a();

    /* renamed from: b */
    public final String f48112b;

    /* renamed from: c */
    public final String f48113c;

    /* renamed from: d */
    public final String f48114d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.InternalFrame$a */
    public class C4753a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i2) {
            return new InternalFrame[i2];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f48112b = str;
        this.f48113c = str2;
        this.f48114d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return s91.m28112a(this.f48113c, internalFrame.f48113c) && s91.m28112a(this.f48112b, internalFrame.f48112b) && s91.m28112a(this.f48114d, internalFrame.f48114d);
    }

    public final int hashCode() {
        String str = this.f48112b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f48113c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48114d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f48111a + ": domain=" + this.f48112b + ", description=" + this.f48113c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48111a);
        parcel.writeString(this.f48112b);
        parcel.writeString(this.f48114d);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f48112b = (String) s91.m28101a(parcel.readString());
        this.f48113c = (String) s91.m28101a(parcel.readString());
        this.f48114d = (String) s91.m28101a(parcel.readString());
    }
}
