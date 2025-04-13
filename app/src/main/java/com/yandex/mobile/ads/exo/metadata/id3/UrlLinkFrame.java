package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.o11;
import com.yandex.mobile.ads.impl.s91;

/* loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C4757a();

    /* renamed from: b */
    @Nullable
    public final String f48124b;

    /* renamed from: c */
    public final String f48125c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.UrlLinkFrame$a */
    public class C4757a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i2) {
            return new UrlLinkFrame[i2];
        }
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f48124b = str2;
        this.f48125c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f48111a.equals(urlLinkFrame.f48111a) && s91.m28112a(this.f48124b, urlLinkFrame.f48124b) && s91.m28112a(this.f48125c, urlLinkFrame.f48125c);
    }

    public final int hashCode() {
        int m26984a = o11.m26984a(this.f48111a, 527, 31);
        String str = this.f48124b;
        int hashCode = (m26984a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48125c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f48111a + ": url=" + this.f48125c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48111a);
        parcel.writeString(this.f48124b);
        parcel.writeString(this.f48125c);
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) s91.m28101a(parcel.readString()));
        this.f48124b = parcel.readString();
        this.f48125c = (String) s91.m28101a(parcel.readString());
    }
}
