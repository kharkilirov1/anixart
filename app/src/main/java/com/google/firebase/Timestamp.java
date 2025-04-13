package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.firebase.firestore.util.Preconditions;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    @NonNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp.1
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel parcel) {
            return new Timestamp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i2) {
            return new Timestamp[i2];
        }
    };

    /* renamed from: b */
    public final long f22284b;

    /* renamed from: c */
    public final int f22285c;

    public Timestamp(long j2, int i2) {
        m12223c(j2, i2);
        this.f22284b = j2;
        this.f22285c = i2;
    }

    /* renamed from: c */
    public static void m12223c(long j2, int i2) {
        Preconditions.m12495a(i2 >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i2));
        Preconditions.m12495a(((double) i2) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i2));
        Preconditions.m12495a(j2 >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j2));
        Preconditions.m12495a(j2 < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j2));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Timestamp timestamp) {
        long j2 = this.f22284b;
        long j3 = timestamp.f22284b;
        return j2 == j3 ? Integer.signum(this.f22285c - timestamp.f22285c) : Long.signum(j2 - j3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
    }

    public int hashCode() {
        long j2 = this.f22284b;
        return (((((int) j2) * 37 * 37) + ((int) (j2 >> 32))) * 37) + this.f22285c;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Timestamp(seconds=");
        m24u.append(this.f22284b);
        m24u.append(", nanoseconds=");
        return C0000a.m18o(m24u, this.f22285c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeLong(this.f22284b);
        parcel.writeInt(this.f22285c);
    }

    public Timestamp(@NonNull Parcel parcel) {
        this.f22284b = parcel.readLong();
        this.f22285c = parcel.readInt();
    }
}
