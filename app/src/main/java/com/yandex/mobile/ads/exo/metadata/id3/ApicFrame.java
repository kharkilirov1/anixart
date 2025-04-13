package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.sb0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C4747a();

    /* renamed from: b */
    public final String f48088b;

    /* renamed from: c */
    @Nullable
    public final String f48089c;

    /* renamed from: d */
    public final int f48090d;

    /* renamed from: e */
    public final byte[] f48091e;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.ApicFrame$a */
    public class C4747a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i2) {
            return new ApicFrame[i2];
        }
    }

    public ApicFrame(String str, @Nullable String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f48088b = str;
        this.f48089c = str2;
        this.f48090d = i2;
        this.f48091e = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo22239a(sb0.C5738a c5738a) {
        c5738a.m28176a(this.f48090d, this.f48091e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f48090d == apicFrame.f48090d && s91.m28112a(this.f48088b, apicFrame.f48088b) && s91.m28112a(this.f48089c, apicFrame.f48089c) && Arrays.equals(this.f48091e, apicFrame.f48091e);
    }

    public final int hashCode() {
        int i2 = (this.f48090d + 527) * 31;
        String str = this.f48088b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48089c;
        return Arrays.hashCode(this.f48091e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f48111a + ": mimeType=" + this.f48088b + ", description=" + this.f48089c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48088b);
        parcel.writeString(this.f48089c);
        parcel.writeInt(this.f48090d);
        parcel.writeByteArray(this.f48091e);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f48088b = (String) s91.m28101a(parcel.readString());
        this.f48089c = parcel.readString();
        this.f48090d = parcel.readInt();
        this.f48091e = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
