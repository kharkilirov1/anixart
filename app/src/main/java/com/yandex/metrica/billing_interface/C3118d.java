package com.yandex.metrica.billing_interface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.billing_interface.d */
/* loaded from: classes2.dex */
public class C3118d {

    /* renamed from: a */
    @NonNull
    public final EnumC3119e f42410a;

    /* renamed from: b */
    @NonNull
    public final String f42411b;

    /* renamed from: c */
    public final int f42412c;

    /* renamed from: d */
    public final long f42413d;

    /* renamed from: e */
    @NonNull
    public final String f42414e;

    /* renamed from: f */
    public final long f42415f;

    /* renamed from: g */
    @Nullable
    public final C3117c f42416g;

    /* renamed from: h */
    public final int f42417h;

    /* renamed from: i */
    @Nullable
    public final C3117c f42418i;

    /* renamed from: j */
    @NonNull
    public final String f42419j;

    /* renamed from: k */
    @NonNull
    public final String f42420k;

    /* renamed from: l */
    public final long f42421l;

    /* renamed from: m */
    public final boolean f42422m;

    /* renamed from: n */
    @NonNull
    public final String f42423n;

    public C3118d(@NonNull EnumC3119e enumC3119e, @NonNull String str, int i2, long j2, @NonNull String str2, long j3, @Nullable C3117c c3117c, int i3, @Nullable C3117c c3117c2, @NonNull String str3, @NonNull String str4, long j4, boolean z, @NonNull String str5) {
        this.f42410a = enumC3119e;
        this.f42411b = str;
        this.f42412c = i2;
        this.f42413d = j2;
        this.f42414e = str2;
        this.f42415f = j3;
        this.f42416g = c3117c;
        this.f42417h = i3;
        this.f42418i = c3117c2;
        this.f42419j = str3;
        this.f42420k = str4;
        this.f42421l = j4;
        this.f42422m = z;
        this.f42423n = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3118d.class != obj.getClass()) {
            return false;
        }
        C3118d c3118d = (C3118d) obj;
        if (this.f42412c != c3118d.f42412c || this.f42413d != c3118d.f42413d || this.f42415f != c3118d.f42415f || this.f42417h != c3118d.f42417h || this.f42421l != c3118d.f42421l || this.f42422m != c3118d.f42422m || this.f42410a != c3118d.f42410a || !this.f42411b.equals(c3118d.f42411b) || !this.f42414e.equals(c3118d.f42414e)) {
            return false;
        }
        C3117c c3117c = this.f42416g;
        if (c3117c == null ? c3118d.f42416g != null : !c3117c.equals(c3118d.f42416g)) {
            return false;
        }
        C3117c c3117c2 = this.f42418i;
        if (c3117c2 == null ? c3118d.f42418i != null : !c3117c2.equals(c3118d.f42418i)) {
            return false;
        }
        if (this.f42419j.equals(c3118d.f42419j) && this.f42420k.equals(c3118d.f42420k)) {
            return this.f42423n.equals(c3118d.f42423n);
        }
        return false;
    }

    public int hashCode() {
        int m4107f = (C0576a.m4107f(this.f42411b, this.f42410a.hashCode() * 31, 31) + this.f42412c) * 31;
        long j2 = this.f42413d;
        int m4107f2 = C0576a.m4107f(this.f42414e, (m4107f + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31);
        long j3 = this.f42415f;
        int i2 = (m4107f2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        C3117c c3117c = this.f42416g;
        int hashCode = (((i2 + (c3117c != null ? c3117c.hashCode() : 0)) * 31) + this.f42417h) * 31;
        C3117c c3117c2 = this.f42418i;
        int m4107f3 = C0576a.m4107f(this.f42420k, C0576a.m4107f(this.f42419j, (hashCode + (c3117c2 != null ? c3117c2.hashCode() : 0)) * 31, 31), 31);
        long j4 = this.f42421l;
        return this.f42423n.hashCode() + ((((m4107f3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f42422m ? 1 : 0)) * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ProductInfo{type=");
        m24u.append(this.f42410a);
        m24u.append(", sku='");
        C0576a.m4100A(m24u, this.f42411b, '\'', ", quantity=");
        m24u.append(this.f42412c);
        m24u.append(", priceMicros=");
        m24u.append(this.f42413d);
        m24u.append(", priceCurrency='");
        C0576a.m4100A(m24u, this.f42414e, '\'', ", introductoryPriceMicros=");
        m24u.append(this.f42415f);
        m24u.append(", introductoryPricePeriod=");
        m24u.append(this.f42416g);
        m24u.append(", introductoryPriceCycles=");
        m24u.append(this.f42417h);
        m24u.append(", subscriptionPeriod=");
        m24u.append(this.f42418i);
        m24u.append(", signature='");
        C0576a.m4100A(m24u, this.f42419j, '\'', ", purchaseToken='");
        C0576a.m4100A(m24u, this.f42420k, '\'', ", purchaseTime=");
        m24u.append(this.f42421l);
        m24u.append(", autoRenewing=");
        m24u.append(this.f42422m);
        m24u.append(", purchaseOriginalJson='");
        m24u.append(this.f42423n);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }
}
