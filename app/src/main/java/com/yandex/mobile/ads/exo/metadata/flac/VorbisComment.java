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
import java.util.Objects;

@Deprecated
/* loaded from: classes2.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C4744a();

    /* renamed from: a */
    public final String f48077a;

    /* renamed from: b */
    public final String f48078b;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.flac.VorbisComment$a */
    public class C4744a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i2) {
            return new VorbisComment[i2];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f48077a = str;
        this.f48078b = str2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ C5606pv mo22238a() {
        return C4740b.m22250a(this);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo22239a(sb0.C5738a c5738a) {
        String str = this.f48077a;
        Objects.requireNonNull(str);
        switch (str) {
            case "ALBUM":
                c5738a.m28181b(this.f48078b);
                break;
            case "TITLE":
                c5738a.m28202l(this.f48078b);
                break;
            case "DESCRIPTION":
                c5738a.m28192g(this.f48078b);
                break;
            case "ALBUMARTIST":
                c5738a.m28174a(this.f48078b);
                break;
            case "ARTIST":
                c5738a.m28184c(this.f48078b);
                break;
        }
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f48077a.equals(vorbisComment.f48077a) && this.f48078b.equals(vorbisComment.f48078b);
    }

    public final int hashCode() {
        return this.f48078b.hashCode() + o11.m26984a(this.f48077a, 527, 31);
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("VC: ");
        m26356a.append(this.f48077a);
        m26356a.append("=");
        m26356a.append(this.f48078b);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48077a);
        parcel.writeString(this.f48078b);
    }

    public VorbisComment(Parcel parcel) {
        this.f48077a = (String) s91.m28101a(parcel.readString());
        this.f48078b = (String) s91.m28101a(parcel.readString());
    }
}
