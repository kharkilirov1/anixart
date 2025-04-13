package com.yandex.mobile.ads.exo.metadata.mp4;

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
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C4758a();

    /* renamed from: a */
    public final String f48126a;

    /* renamed from: b */
    public final byte[] f48127b;

    /* renamed from: c */
    public final int f48128c;

    /* renamed from: d */
    public final int f48129d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.mp4.MdtaMetadataEntry$a */
    public class C4758a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i2) {
            return new MdtaMetadataEntry[i2];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, int i2) {
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f48126a.equals(mdtaMetadataEntry.f48126a) && Arrays.equals(this.f48127b, mdtaMetadataEntry.f48127b) && this.f48128c == mdtaMetadataEntry.f48128c && this.f48129d == mdtaMetadataEntry.f48129d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f48127b) + o11.m26984a(this.f48126a, 527, 31)) * 31) + this.f48128c) * 31) + this.f48129d;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("mdta: key=");
        m26356a.append(this.f48126a);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48126a);
        parcel.writeByteArray(this.f48127b);
        parcel.writeInt(this.f48128c);
        parcel.writeInt(this.f48129d);
    }

    public MdtaMetadataEntry(int i2, int i3, String str, byte[] bArr) {
        this.f48126a = str;
        this.f48127b = bArr;
        this.f48128c = i2;
        this.f48129d = i3;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f48126a = (String) s91.m28101a(parcel.readString());
        this.f48127b = (byte[]) s91.m28101a(parcel.createByteArray());
        this.f48128c = parcel.readInt();
        this.f48129d = parcel.readInt();
    }
}
