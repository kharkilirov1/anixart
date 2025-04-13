package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C4754a();

    /* renamed from: b */
    public final int f48115b;

    /* renamed from: c */
    public final int f48116c;

    /* renamed from: d */
    public final int f48117d;

    /* renamed from: e */
    public final int[] f48118e;

    /* renamed from: f */
    public final int[] f48119f;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.MlltFrame$a */
    public class C4754a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i2) {
            return new MlltFrame[i2];
        }
    }

    public MlltFrame(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f48115b = i2;
        this.f48116c = i3;
        this.f48117d = i4;
        this.f48118e = iArr;
        this.f48119f = iArr2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f48115b == mlltFrame.f48115b && this.f48116c == mlltFrame.f48116c && this.f48117d == mlltFrame.f48117d && Arrays.equals(this.f48118e, mlltFrame.f48118e) && Arrays.equals(this.f48119f, mlltFrame.f48119f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48119f) + ((Arrays.hashCode(this.f48118e) + ((((((this.f48115b + 527) * 31) + this.f48116c) * 31) + this.f48117d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f48115b);
        parcel.writeInt(this.f48116c);
        parcel.writeInt(this.f48117d);
        parcel.writeIntArray(this.f48118e);
        parcel.writeIntArray(this.f48119f);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f48115b = parcel.readInt();
        this.f48116c = parcel.readInt();
        this.f48117d = parcel.readInt();
        this.f48118e = (int[]) s91.m28101a(parcel.createIntArray());
        this.f48119f = (int[]) s91.m28101a(parcel.createIntArray());
    }
}
