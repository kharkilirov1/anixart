package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.C0932C;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new Parcelable.Creator<DrmInitData>() { // from class: com.google.android.exoplayer2.drm.DrmInitData.1
        @Override // android.os.Parcelable.Creator
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DrmInitData[] newArray(int i2) {
            return new DrmInitData[i2];
        }
    };

    /* renamed from: b */
    public final SchemeData[] f10708b;

    /* renamed from: c */
    public int f10709c;

    /* renamed from: d */
    @Nullable
    public final String f10710d;

    /* renamed from: e */
    public final int f10711e;

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.f10710d = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f10708b = schemeDataArr;
        this.f10711e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* renamed from: a */
    public DrmInitData m6297a(@Nullable String str) {
        return Util.m7728a(this.f10710d, str) ? this : new DrmInitData(str, false, this.f10708b);
    }

    @Override // java.util.Comparator
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C0932C.f9456a;
        return uuid.equals(schemeData3.f10713c) ? uuid.equals(schemeData4.f10713c) ? 0 : 1 : schemeData3.f10713c.compareTo(schemeData4.f10713c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return Util.m7728a(this.f10710d, drmInitData.f10710d) && Arrays.equals(this.f10708b, drmInitData.f10708b);
    }

    public int hashCode() {
        if (this.f10709c == 0) {
            String str = this.f10710d;
            this.f10709c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f10708b);
        }
        return this.f10709c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f10710d);
        parcel.writeTypedArray(this.f10708b, 0);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new Parcelable.Creator<SchemeData>() { // from class: com.google.android.exoplayer2.drm.DrmInitData.SchemeData.1
            @Override // android.os.Parcelable.Creator
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SchemeData[] newArray(int i2) {
                return new SchemeData[i2];
            }
        };

        /* renamed from: b */
        public int f10712b;

        /* renamed from: c */
        public final UUID f10713c;

        /* renamed from: d */
        @Nullable
        public final String f10714d;

        /* renamed from: e */
        public final String f10715e;

        /* renamed from: f */
        @Nullable
        public final byte[] f10716f;

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            Objects.requireNonNull(uuid);
            this.f10713c = uuid;
            this.f10714d = str;
            Objects.requireNonNull(str2);
            this.f10715e = str2;
            this.f10716f = bArr;
        }

        /* renamed from: c */
        public boolean m6298c() {
            return this.f10716f != null;
        }

        /* renamed from: d */
        public boolean m6299d(UUID uuid) {
            return C0932C.f9456a.equals(this.f10713c) || uuid.equals(this.f10713c);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Util.m7728a(this.f10714d, schemeData.f10714d) && Util.m7728a(this.f10715e, schemeData.f10715e) && Util.m7728a(this.f10713c, schemeData.f10713c) && Arrays.equals(this.f10716f, schemeData.f10716f);
        }

        public int hashCode() {
            if (this.f10712b == 0) {
                int hashCode = this.f10713c.hashCode() * 31;
                String str = this.f10714d;
                this.f10712b = Arrays.hashCode(this.f10716f) + C0576a.m4107f(this.f10715e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f10712b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f10713c.getMostSignificantBits());
            parcel.writeLong(this.f10713c.getLeastSignificantBits());
            parcel.writeString(this.f10714d);
            parcel.writeString(this.f10715e);
            parcel.writeByteArray(this.f10716f);
        }

        public SchemeData(Parcel parcel) {
            this.f10713c = new UUID(parcel.readLong(), parcel.readLong());
            this.f10714d = parcel.readString();
            String readString = parcel.readString();
            int i2 = Util.f14736a;
            this.f10715e = readString;
            this.f10716f = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f10710d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i2 = Util.f14736a;
        this.f10708b = schemeDataArr;
        this.f10711e = schemeDataArr.length;
    }
}
