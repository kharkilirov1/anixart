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
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C4762a();

    /* renamed from: a */
    public final float f48139a;

    /* renamed from: b */
    public final int f48140b;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.mp4.SmtaMetadataEntry$a */
    public class C4762a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i2) {
            return new SmtaMetadataEntry[i2];
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, int i2) {
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f48139a == smtaMetadataEntry.f48139a && this.f48140b == smtaMetadataEntry.f48140b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f48139a).hashCode() + 527) * 31) + this.f48140b;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("smta: captureFrameRate=");
        m26356a.append(this.f48139a);
        m26356a.append(", svcTemporalLayerCount=");
        m26356a.append(this.f48140b);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f48139a);
        parcel.writeInt(this.f48140b);
    }

    public SmtaMetadataEntry(int i2, float f2) {
        this.f48139a = f2;
        this.f48140b = i2;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f48139a = parcel.readFloat();
        this.f48140b = parcel.readInt();
    }
}
