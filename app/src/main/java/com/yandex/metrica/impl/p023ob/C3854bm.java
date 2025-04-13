package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import java.util.ArrayList;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.bm */
/* loaded from: classes2.dex */
public class C3854bm implements Parcelable {
    public static final Parcelable.Creator<C3854bm> CREATOR = new a();

    /* renamed from: a */
    public final int f44841a;

    /* renamed from: b */
    public final int f44842b;

    /* renamed from: c */
    public final int f44843c;

    /* renamed from: d */
    public final long f44844d;

    /* renamed from: e */
    public final boolean f44845e;

    /* renamed from: f */
    public final boolean f44846f;

    /* renamed from: g */
    public final boolean f44847g;

    /* renamed from: h */
    @NonNull
    public final List<C3932em> f44848h;

    /* renamed from: com.yandex.metrica.impl.ob.bm$a */
    public class a implements Parcelable.Creator<C3854bm> {
        @Override // android.os.Parcelable.Creator
        public C3854bm createFromParcel(Parcel parcel) {
            return new C3854bm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3854bm[] newArray(int i2) {
            return new C3854bm[i2];
        }
    }

    public C3854bm(int i2, int i3, int i4, long j2, boolean z, boolean z2, boolean z3, @NonNull List<C3932em> list) {
        this.f44841a = i2;
        this.f44842b = i3;
        this.f44843c = i4;
        this.f44844d = j2;
        this.f44845e = z;
        this.f44846f = z2;
        this.f44847g = z3;
        this.f44848h = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3854bm.class != obj.getClass()) {
            return false;
        }
        C3854bm c3854bm = (C3854bm) obj;
        if (this.f44841a == c3854bm.f44841a && this.f44842b == c3854bm.f44842b && this.f44843c == c3854bm.f44843c && this.f44844d == c3854bm.f44844d && this.f44845e == c3854bm.f44845e && this.f44846f == c3854bm.f44846f && this.f44847g == c3854bm.f44847g) {
            return this.f44848h.equals(c3854bm.f44848h);
        }
        return false;
    }

    public int hashCode() {
        int i2 = ((((this.f44841a * 31) + this.f44842b) * 31) + this.f44843c) * 31;
        long j2 = this.f44844d;
        return this.f44848h.hashCode() + ((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f44845e ? 1 : 0)) * 31) + (this.f44846f ? 1 : 0)) * 31) + (this.f44847g ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("UiParsingConfig{tooLongTextBound=");
        m24u.append(this.f44841a);
        m24u.append(", truncatedTextBound=");
        m24u.append(this.f44842b);
        m24u.append(", maxVisitedChildrenInLevel=");
        m24u.append(this.f44843c);
        m24u.append(", afterCreateTimeout=");
        m24u.append(this.f44844d);
        m24u.append(", relativeTextSizeCalculation=");
        m24u.append(this.f44845e);
        m24u.append(", errorReporting=");
        m24u.append(this.f44846f);
        m24u.append(", parsingAllowedByDefault=");
        m24u.append(this.f44847g);
        m24u.append(", filters=");
        return C0576a.m4119r(m24u, this.f44848h, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f44841a);
        parcel.writeInt(this.f44842b);
        parcel.writeInt(this.f44843c);
        parcel.writeLong(this.f44844d);
        parcel.writeByte(this.f44845e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44846f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f44847g ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f44848h);
    }

    public C3854bm(Parcel parcel) {
        this.f44841a = parcel.readInt();
        this.f44842b = parcel.readInt();
        this.f44843c = parcel.readInt();
        this.f44844d = parcel.readLong();
        this.f44845e = parcel.readByte() != 0;
        this.f44846f = parcel.readByte() != 0;
        this.f44847g = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C3932em.class.getClassLoader());
        this.f44848h = arrayList;
    }
}
