package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C4755a();

    /* renamed from: b */
    public final String f48120b;

    /* renamed from: c */
    public final byte[] f48121c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.PrivFrame$a */
    public class C4755a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i2) {
            return new PrivFrame[i2];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f48120b = str;
        this.f48121c = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return s91.m28112a(this.f48120b, privFrame.f48120b) && Arrays.equals(this.f48121c, privFrame.f48121c);
    }

    public final int hashCode() {
        String str = this.f48120b;
        return Arrays.hashCode(this.f48121c) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f48111a + ": owner=" + this.f48120b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48120b);
        parcel.writeByteArray(this.f48121c);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f48120b = (String) s91.m28101a(parcel.readString());
        this.f48121c = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
