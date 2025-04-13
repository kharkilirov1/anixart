package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.o11;
import com.yandex.mobile.ads.impl.s91;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C4748a();

    /* renamed from: b */
    public final byte[] f48092b;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.BinaryFrame$a */
    public class C4748a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i2) {
            return new BinaryFrame[i2];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f48092b = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f48111a.equals(binaryFrame.f48111a) && Arrays.equals(this.f48092b, binaryFrame.f48092b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48092b) + o11.m26984a(this.f48111a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48111a);
        parcel.writeByteArray(this.f48092b);
    }

    public BinaryFrame(Parcel parcel) {
        super((String) s91.m28101a(parcel.readString()));
        this.f48092b = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
