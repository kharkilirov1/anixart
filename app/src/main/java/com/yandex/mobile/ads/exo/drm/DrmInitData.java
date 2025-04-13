package com.yandex.mobile.ads.exo.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5915vf;
import com.yandex.mobile.ads.impl.o11;
import com.yandex.mobile.ads.impl.s91;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C4713a();

    /* renamed from: a */
    private final SchemeData[] f47935a;

    /* renamed from: b */
    private int f47936b;

    /* renamed from: c */
    @Nullable
    public final String f47937c;

    /* renamed from: d */
    public final int f47938d;

    /* renamed from: com.yandex.mobile.ads.exo.drm.DrmInitData$a */
    public class C4713a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i2) {
            return new DrmInitData[i2];
        }
    }

    public DrmInitData(ArrayList arrayList) {
        this(null, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    /* renamed from: a */
    public final SchemeData m22089a(int i2) {
        return this.f47935a[i2];
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C5915vf.f55807a;
        return uuid.equals(schemeData3.f47940b) ? uuid.equals(schemeData4.f47940b) ? 0 : 1 : schemeData3.f47940b.compareTo(schemeData4.f47940b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return s91.m28112a(this.f47937c, drmInitData.f47937c) && Arrays.equals(this.f47935a, drmInitData.f47935a);
    }

    public final int hashCode() {
        if (this.f47936b == 0) {
            String str = this.f47937c;
            this.f47936b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f47935a);
        }
        return this.f47936b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f47937c);
        parcel.writeTypedArray(this.f47935a, 0);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    @CheckResult
    /* renamed from: a */
    public final DrmInitData m22090a(@Nullable String str) {
        return s91.m28112a(this.f47937c, str) ? this : new DrmInitData(str, false, this.f47935a);
    }

    private DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.f47937c = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f47935a = schemeDataArr;
        this.f47938d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C4712a();

        /* renamed from: a */
        private int f47939a;

        /* renamed from: b */
        public final UUID f47940b;

        /* renamed from: c */
        @Nullable
        public final String f47941c;

        /* renamed from: d */
        public final String f47942d;

        /* renamed from: e */
        @Nullable
        public final byte[] f47943e;

        /* renamed from: com.yandex.mobile.ads.exo.drm.DrmInitData$SchemeData$a */
        public class C4712a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i2) {
                return new SchemeData[i2];
            }
        }

        public SchemeData() {
            throw null;
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.f47940b = (UUID) C5220ia.m25469a(uuid);
            this.f47941c = str;
            this.f47942d = (String) C5220ia.m25469a(str2);
            this.f47943e = bArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return s91.m28112a(this.f47941c, schemeData.f47941c) && s91.m28112a(this.f47942d, schemeData.f47942d) && s91.m28112a(this.f47940b, schemeData.f47940b) && Arrays.equals(this.f47943e, schemeData.f47943e);
        }

        public final int hashCode() {
            if (this.f47939a == 0) {
                int hashCode = this.f47940b.hashCode() * 31;
                String str = this.f47941c;
                this.f47939a = Arrays.hashCode(this.f47943e) + o11.m26984a(this.f47942d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f47939a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f47940b.getMostSignificantBits());
            parcel.writeLong(this.f47940b.getLeastSignificantBits());
            parcel.writeString(this.f47941c);
            parcel.writeString(this.f47942d);
            parcel.writeByteArray(this.f47943e);
        }

        public SchemeData(Parcel parcel) {
            this.f47940b = new UUID(parcel.readLong(), parcel.readLong());
            this.f47941c = parcel.readString();
            this.f47942d = (String) s91.m28101a(parcel.readString());
            this.f47943e = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f47937c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) s91.m28101a((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f47935a = schemeDataArr;
        this.f47938d = schemeDataArr.length;
    }
}
