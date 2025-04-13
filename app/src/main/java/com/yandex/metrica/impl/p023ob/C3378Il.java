package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Il */
/* loaded from: classes2.dex */
public class C3378Il implements Parcelable {
    public static final Parcelable.Creator<C3378Il> CREATOR = new a();

    /* renamed from: a */
    public final boolean f43141a;

    /* renamed from: b */
    public final boolean f43142b;

    /* renamed from: c */
    public final boolean f43143c;

    /* renamed from: d */
    public final boolean f43144d;

    /* renamed from: e */
    @Nullable
    public final C3854bm f43145e;

    /* renamed from: f */
    @Nullable
    public final C3428Kl f43146f;

    /* renamed from: g */
    @Nullable
    public final C3428Kl f43147g;

    /* renamed from: h */
    @Nullable
    public final C3428Kl f43148h;

    /* renamed from: com.yandex.metrica.impl.ob.Il$a */
    public class a implements Parcelable.Creator<C3378Il> {
        @Override // android.os.Parcelable.Creator
        public C3378Il createFromParcel(Parcel parcel) {
            return new C3378Il(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3378Il[] newArray(int i2) {
            return new C3378Il[i2];
        }
    }

    public C3378Il(@NonNull C3575Qi c3575Qi) {
        this(c3575Qi.m18848f().f46411k, c3575Qi.m18848f().f46413m, c3575Qi.m18848f().f46412l, c3575Qi.m18848f().f46414n, c3575Qi.m18839T(), c3575Qi.m18838S(), c3575Qi.m18837R(), c3575Qi.m18840U());
    }

    /* renamed from: a */
    public boolean m18337a() {
        return (this.f43145e == null || this.f43146f == null || this.f43147g == null || this.f43148h == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3378Il.class != obj.getClass()) {
            return false;
        }
        C3378Il c3378Il = (C3378Il) obj;
        if (this.f43141a != c3378Il.f43141a || this.f43142b != c3378Il.f43142b || this.f43143c != c3378Il.f43143c || this.f43144d != c3378Il.f43144d) {
            return false;
        }
        C3854bm c3854bm = this.f43145e;
        if (c3854bm == null ? c3378Il.f43145e != null : !c3854bm.equals(c3378Il.f43145e)) {
            return false;
        }
        C3428Kl c3428Kl = this.f43146f;
        if (c3428Kl == null ? c3378Il.f43146f != null : !c3428Kl.equals(c3378Il.f43146f)) {
            return false;
        }
        C3428Kl c3428Kl2 = this.f43147g;
        if (c3428Kl2 == null ? c3378Il.f43147g != null : !c3428Kl2.equals(c3378Il.f43147g)) {
            return false;
        }
        C3428Kl c3428Kl3 = this.f43148h;
        return c3428Kl3 != null ? c3428Kl3.equals(c3378Il.f43148h) : c3378Il.f43148h == null;
    }

    public int hashCode() {
        int i2 = (((((((this.f43141a ? 1 : 0) * 31) + (this.f43142b ? 1 : 0)) * 31) + (this.f43143c ? 1 : 0)) * 31) + (this.f43144d ? 1 : 0)) * 31;
        C3854bm c3854bm = this.f43145e;
        int hashCode = (i2 + (c3854bm != null ? c3854bm.hashCode() : 0)) * 31;
        C3428Kl c3428Kl = this.f43146f;
        int hashCode2 = (hashCode + (c3428Kl != null ? c3428Kl.hashCode() : 0)) * 31;
        C3428Kl c3428Kl2 = this.f43147g;
        int hashCode3 = (hashCode2 + (c3428Kl2 != null ? c3428Kl2.hashCode() : 0)) * 31;
        C3428Kl c3428Kl3 = this.f43148h;
        return hashCode3 + (c3428Kl3 != null ? c3428Kl3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("UiAccessConfig{uiParsingEnabled=");
        m24u.append(this.f43141a);
        m24u.append(", uiEventSendingEnabled=");
        m24u.append(this.f43142b);
        m24u.append(", uiCollectingForBridgeEnabled=");
        m24u.append(this.f43143c);
        m24u.append(", uiRawEventSendingEnabled=");
        m24u.append(this.f43144d);
        m24u.append(", uiParsingConfig=");
        m24u.append(this.f43145e);
        m24u.append(", uiEventSendingConfig=");
        m24u.append(this.f43146f);
        m24u.append(", uiCollectingForBridgeConfig=");
        m24u.append(this.f43147g);
        m24u.append(", uiRawEventSendingConfig=");
        m24u.append(this.f43148h);
        m24u.append('}');
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f43141a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43142b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43143c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f43144d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f43145e, i2);
        parcel.writeParcelable(this.f43146f, i2);
        parcel.writeParcelable(this.f43147g, i2);
        parcel.writeParcelable(this.f43148h, i2);
    }

    public C3378Il(boolean z, boolean z2, boolean z3, boolean z4, @Nullable C3854bm c3854bm, @Nullable C3428Kl c3428Kl, @Nullable C3428Kl c3428Kl2, @Nullable C3428Kl c3428Kl3) {
        this.f43141a = z;
        this.f43142b = z2;
        this.f43143c = z3;
        this.f43144d = z4;
        this.f43145e = c3854bm;
        this.f43146f = c3428Kl;
        this.f43147g = c3428Kl2;
        this.f43148h = c3428Kl3;
    }

    public C3378Il(Parcel parcel) {
        this.f43141a = parcel.readByte() != 0;
        this.f43142b = parcel.readByte() != 0;
        this.f43143c = parcel.readByte() != 0;
        this.f43144d = parcel.readByte() != 0;
        this.f43145e = (C3854bm) parcel.readParcelable(C3854bm.class.getClassLoader());
        this.f43146f = (C3428Kl) parcel.readParcelable(C3428Kl.class.getClassLoader());
        this.f43147g = (C3428Kl) parcel.readParcelable(C3428Kl.class.getClassLoader());
        this.f43148h = (C3428Kl) parcel.readParcelable(C3428Kl.class.getClassLoader());
    }
}
