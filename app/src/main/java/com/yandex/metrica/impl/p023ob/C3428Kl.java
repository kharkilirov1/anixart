package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import java.util.ArrayList;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Kl */
/* loaded from: classes2.dex */
public class C3428Kl implements Parcelable {
    public static final Parcelable.Creator<C3428Kl> CREATOR = new a();

    /* renamed from: a */
    public final boolean f43285a;

    /* renamed from: b */
    public final boolean f43286b;

    /* renamed from: c */
    public final boolean f43287c;

    /* renamed from: d */
    public final boolean f43288d;

    /* renamed from: e */
    public final boolean f43289e;

    /* renamed from: f */
    public final boolean f43290f;

    /* renamed from: g */
    public final boolean f43291g;

    /* renamed from: h */
    public final boolean f43292h;

    /* renamed from: i */
    public final boolean f43293i;

    /* renamed from: j */
    public final boolean f43294j;

    /* renamed from: k */
    public final int f43295k;

    /* renamed from: l */
    public final int f43296l;

    /* renamed from: m */
    public final int f43297m;

    /* renamed from: n */
    public final int f43298n;

    /* renamed from: o */
    public final int f43299o;

    /* renamed from: p */
    @NonNull
    public final List<C3932em> f43300p;

    /* renamed from: com.yandex.metrica.impl.ob.Kl$a */
    public class a implements Parcelable.Creator<C3428Kl> {
        @Override // android.os.Parcelable.Creator
        public C3428Kl createFromParcel(Parcel parcel) {
            return new C3428Kl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3428Kl[] newArray(int i2) {
            return new C3428Kl[i2];
        }
    }

    public C3428Kl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, int i3, int i4, int i5, int i6, @NonNull List<C3932em> list) {
        this.f43285a = z;
        this.f43286b = z2;
        this.f43287c = z3;
        this.f43288d = z4;
        this.f43289e = z5;
        this.f43290f = z6;
        this.f43291g = z7;
        this.f43292h = z8;
        this.f43293i = z9;
        this.f43294j = z10;
        this.f43295k = i2;
        this.f43296l = i3;
        this.f43297m = i4;
        this.f43298n = i5;
        this.f43299o = i6;
        this.f43300p = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3428Kl.class != obj.getClass()) {
            return false;
        }
        C3428Kl c3428Kl = (C3428Kl) obj;
        if (this.f43285a == c3428Kl.f43285a && this.f43286b == c3428Kl.f43286b && this.f43287c == c3428Kl.f43287c && this.f43288d == c3428Kl.f43288d && this.f43289e == c3428Kl.f43289e && this.f43290f == c3428Kl.f43290f && this.f43291g == c3428Kl.f43291g && this.f43292h == c3428Kl.f43292h && this.f43293i == c3428Kl.f43293i && this.f43294j == c3428Kl.f43294j && this.f43295k == c3428Kl.f43295k && this.f43296l == c3428Kl.f43296l && this.f43297m == c3428Kl.f43297m && this.f43298n == c3428Kl.f43298n && this.f43299o == c3428Kl.f43299o) {
            return this.f43300p.equals(c3428Kl.f43300p);
        }
        return false;
    }

    public int hashCode() {
        return this.f43300p.hashCode() + ((((((((((((((((((((((((((((((this.f43285a ? 1 : 0) * 31) + (this.f43286b ? 1 : 0)) * 31) + (this.f43287c ? 1 : 0)) * 31) + (this.f43288d ? 1 : 0)) * 31) + (this.f43289e ? 1 : 0)) * 31) + (this.f43290f ? 1 : 0)) * 31) + (this.f43291g ? 1 : 0)) * 31) + (this.f43292h ? 1 : 0)) * 31) + (this.f43293i ? 1 : 0)) * 31) + (this.f43294j ? 1 : 0)) * 31) + this.f43295k) * 31) + this.f43296l) * 31) + this.f43297m) * 31) + this.f43298n) * 31) + this.f43299o) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("UiCollectingConfig{textSizeCollecting=");
        m24u.append(this.f43285a);
        m24u.append(", relativeTextSizeCollecting=");
        m24u.append(this.f43286b);
        m24u.append(", textVisibilityCollecting=");
        m24u.append(this.f43287c);
        m24u.append(", textStyleCollecting=");
        m24u.append(this.f43288d);
        m24u.append(", infoCollecting=");
        m24u.append(this.f43289e);
        m24u.append(", nonContentViewCollecting=");
        m24u.append(this.f43290f);
        m24u.append(", textLengthCollecting=");
        m24u.append(this.f43291g);
        m24u.append(", viewHierarchical=");
        m24u.append(this.f43292h);
        m24u.append(", ignoreFiltered=");
        m24u.append(this.f43293i);
        m24u.append(", webViewUrlsCollecting=");
        m24u.append(this.f43294j);
        m24u.append(", tooLongTextBound=");
        m24u.append(this.f43295k);
        m24u.append(", truncatedTextBound=");
        m24u.append(this.f43296l);
        m24u.append(", maxEntitiesCount=");
        m24u.append(this.f43297m);
        m24u.append(", maxFullContentLength=");
        m24u.append(this.f43298n);
        m24u.append(", webViewUrlLimit=");
        m24u.append(this.f43299o);
        m24u.append(", filters=");
        return C0576a.m4119r(m24u, this.f43300p, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f43285a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43286b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43287c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43288d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43289e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43290f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43291g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43292h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43293i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43294j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f43295k);
        parcel.writeInt(this.f43296l);
        parcel.writeInt(this.f43297m);
        parcel.writeInt(this.f43298n);
        parcel.writeInt(this.f43299o);
        parcel.writeList(this.f43300p);
    }

    public C3428Kl(Parcel parcel) {
        this.f43285a = parcel.readByte() != 0;
        this.f43286b = parcel.readByte() != 0;
        this.f43287c = parcel.readByte() != 0;
        this.f43288d = parcel.readByte() != 0;
        this.f43289e = parcel.readByte() != 0;
        this.f43290f = parcel.readByte() != 0;
        this.f43291g = parcel.readByte() != 0;
        this.f43292h = parcel.readByte() != 0;
        this.f43293i = parcel.readByte() != 0;
        this.f43294j = parcel.readByte() != 0;
        this.f43295k = parcel.readInt();
        this.f43296l = parcel.readInt();
        this.f43297m = parcel.readInt();
        this.f43298n = parcel.readInt();
        this.f43299o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C3932em.class.getClassLoader());
        this.f43300p = arrayList;
    }
}
