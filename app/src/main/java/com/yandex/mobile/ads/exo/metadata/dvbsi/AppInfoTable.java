package com.yandex.mobile.ads.exo.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.sb0;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new C4741a();

    /* renamed from: a */
    public final int f48059a;

    /* renamed from: b */
    public final String f48060b;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.dvbsi.AppInfoTable$a */
    public class C4741a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        public final AppInfoTable createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            return new AppInfoTable(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable[] newArray(int i2) {
            return new AppInfoTable[i2];
        }
    }

    public AppInfoTable(int i2, String str) {
        this.f48059a = i2;
        this.f48060b = str;
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

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("Ait(controlCode=");
        m26356a.append(this.f48059a);
        m26356a.append(",url=");
        return C0000a.m20q(m26356a, this.f48060b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48060b);
        parcel.writeInt(this.f48059a);
    }
}
