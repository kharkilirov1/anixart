package com.yandex.mobile.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.sb0;

/* loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C4745a();

    /* renamed from: a */
    public final int f48079a;

    /* renamed from: b */
    @Nullable
    public final String f48080b;

    /* renamed from: c */
    @Nullable
    public final String f48081c;

    /* renamed from: d */
    @Nullable
    public final String f48082d;

    /* renamed from: e */
    public final boolean f48083e;

    /* renamed from: f */
    public final int f48084f;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders$a */
    public class C4745a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i2) {
            return new IcyHeaders[i2];
        }
    }

    public IcyHeaders(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i3) {
        C5220ia.m25473a(i3 == -1 || i3 > 0);
        this.f48079a = i2;
        this.f48080b = str;
        this.f48081c = str2;
        this.f48082d = str3;
        this.f48083e = z;
        this.f48084f = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders m22253a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders.m22253a(java.util.Map):com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders");
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ C5606pv mo22238a() {
        return C4740b.m22250a(this);
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f48079a == icyHeaders.f48079a && s91.m28112a(this.f48080b, icyHeaders.f48080b) && s91.m28112a(this.f48081c, icyHeaders.f48081c) && s91.m28112a(this.f48082d, icyHeaders.f48082d) && this.f48083e == icyHeaders.f48083e && this.f48084f == icyHeaders.f48084f;
    }

    public final int hashCode() {
        int i2 = (this.f48079a + 527) * 31;
        String str = this.f48080b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48081c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48082d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f48083e ? 1 : 0)) * 31) + this.f48084f;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("IcyHeaders: name=\"");
        m26356a.append(this.f48081c);
        m26356a.append("\", genre=\"");
        m26356a.append(this.f48080b);
        m26356a.append("\", bitrate=");
        m26356a.append(this.f48079a);
        m26356a.append(", metadataInterval=");
        m26356a.append(this.f48084f);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f48079a);
        parcel.writeString(this.f48080b);
        parcel.writeString(this.f48081c);
        parcel.writeString(this.f48082d);
        boolean z = this.f48083e;
        int i3 = s91.f54530a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f48084f);
    }

    public IcyHeaders(Parcel parcel) {
        this.f48079a = parcel.readInt();
        this.f48080b = parcel.readString();
        this.f48081c = parcel.readString();
        this.f48082d = parcel.readString();
        this.f48083e = s91.m28110a(parcel);
        this.f48084f = parcel.readInt();
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo22239a(sb0.C5738a c5738a) {
        String str = this.f48081c;
        if (str != null) {
            c5738a.m28198j(str);
        }
        String str2 = this.f48080b;
        if (str2 != null) {
            c5738a.m28196i(str2);
        }
    }
}
