package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Uc */
/* loaded from: classes2.dex */
public class C3668Uc {

    /* renamed from: a */
    public final long f44132a;

    /* renamed from: b */
    public final float f44133b;

    /* renamed from: c */
    public final int f44134c;

    /* renamed from: d */
    public final int f44135d;

    /* renamed from: e */
    public final long f44136e;

    /* renamed from: f */
    public final int f44137f;

    /* renamed from: g */
    public final boolean f44138g;

    /* renamed from: h */
    public final long f44139h;

    /* renamed from: i */
    public final boolean f44140i;

    /* renamed from: j */
    public final boolean f44141j;

    /* renamed from: k */
    public final boolean f44142k;

    /* renamed from: l */
    public final boolean f44143l;

    /* renamed from: m */
    @Nullable
    public final C3269Ec f44144m;

    /* renamed from: n */
    @Nullable
    public final C3269Ec f44145n;

    /* renamed from: o */
    @Nullable
    public final C3269Ec f44146o;

    /* renamed from: p */
    @Nullable
    public final C3269Ec f44147p;

    /* renamed from: q */
    @Nullable
    public final C3394Jc f44148q;

    public C3668Uc(long j2, float f2, int i2, int i3, long j3, int i4, boolean z, long j4, boolean z2, boolean z3, boolean z4, boolean z5, @Nullable C3269Ec c3269Ec, @Nullable C3269Ec c3269Ec2, @Nullable C3269Ec c3269Ec3, @Nullable C3269Ec c3269Ec4, @Nullable C3394Jc c3394Jc) {
        this.f44132a = j2;
        this.f44133b = f2;
        this.f44134c = i2;
        this.f44135d = i3;
        this.f44136e = j3;
        this.f44137f = i4;
        this.f44138g = z;
        this.f44139h = j4;
        this.f44140i = z2;
        this.f44141j = z3;
        this.f44142k = z4;
        this.f44143l = z5;
        this.f44144m = c3269Ec;
        this.f44145n = c3269Ec2;
        this.f44146o = c3269Ec3;
        this.f44147p = c3269Ec4;
        this.f44148q = c3394Jc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3668Uc.class != obj.getClass()) {
            return false;
        }
        C3668Uc c3668Uc = (C3668Uc) obj;
        if (this.f44132a != c3668Uc.f44132a || Float.compare(c3668Uc.f44133b, this.f44133b) != 0 || this.f44134c != c3668Uc.f44134c || this.f44135d != c3668Uc.f44135d || this.f44136e != c3668Uc.f44136e || this.f44137f != c3668Uc.f44137f || this.f44138g != c3668Uc.f44138g || this.f44139h != c3668Uc.f44139h || this.f44140i != c3668Uc.f44140i || this.f44141j != c3668Uc.f44141j || this.f44142k != c3668Uc.f44142k || this.f44143l != c3668Uc.f44143l) {
            return false;
        }
        C3269Ec c3269Ec = this.f44144m;
        if (c3269Ec == null ? c3668Uc.f44144m != null : !c3269Ec.equals(c3668Uc.f44144m)) {
            return false;
        }
        C3269Ec c3269Ec2 = this.f44145n;
        if (c3269Ec2 == null ? c3668Uc.f44145n != null : !c3269Ec2.equals(c3668Uc.f44145n)) {
            return false;
        }
        C3269Ec c3269Ec3 = this.f44146o;
        if (c3269Ec3 == null ? c3668Uc.f44146o != null : !c3269Ec3.equals(c3668Uc.f44146o)) {
            return false;
        }
        C3269Ec c3269Ec4 = this.f44147p;
        if (c3269Ec4 == null ? c3668Uc.f44147p != null : !c3269Ec4.equals(c3668Uc.f44147p)) {
            return false;
        }
        C3394Jc c3394Jc = this.f44148q;
        C3394Jc c3394Jc2 = c3668Uc.f44148q;
        return c3394Jc != null ? c3394Jc.equals(c3394Jc2) : c3394Jc2 == null;
    }

    public int hashCode() {
        long j2 = this.f44132a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        float f2 = this.f44133b;
        int floatToIntBits = (((((i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f44134c) * 31) + this.f44135d) * 31;
        long j3 = this.f44136e;
        int i3 = (((((floatToIntBits + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f44137f) * 31) + (this.f44138g ? 1 : 0)) * 31;
        long j4 = this.f44139h;
        int i4 = (((((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f44140i ? 1 : 0)) * 31) + (this.f44141j ? 1 : 0)) * 31) + (this.f44142k ? 1 : 0)) * 31) + (this.f44143l ? 1 : 0)) * 31;
        C3269Ec c3269Ec = this.f44144m;
        int hashCode = (i4 + (c3269Ec != null ? c3269Ec.hashCode() : 0)) * 31;
        C3269Ec c3269Ec2 = this.f44145n;
        int hashCode2 = (hashCode + (c3269Ec2 != null ? c3269Ec2.hashCode() : 0)) * 31;
        C3269Ec c3269Ec3 = this.f44146o;
        int hashCode3 = (hashCode2 + (c3269Ec3 != null ? c3269Ec3.hashCode() : 0)) * 31;
        C3269Ec c3269Ec4 = this.f44147p;
        int hashCode4 = (hashCode3 + (c3269Ec4 != null ? c3269Ec4.hashCode() : 0)) * 31;
        C3394Jc c3394Jc = this.f44148q;
        return hashCode4 + (c3394Jc != null ? c3394Jc.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LocationArguments{updateTimeInterval=");
        m24u.append(this.f44132a);
        m24u.append(", updateDistanceInterval=");
        m24u.append(this.f44133b);
        m24u.append(", recordsCountToForceFlush=");
        m24u.append(this.f44134c);
        m24u.append(", maxBatchSize=");
        m24u.append(this.f44135d);
        m24u.append(", maxAgeToForceFlush=");
        m24u.append(this.f44136e);
        m24u.append(", maxRecordsToStoreLocally=");
        m24u.append(this.f44137f);
        m24u.append(", collectionEnabled=");
        m24u.append(this.f44138g);
        m24u.append(", lbsUpdateTimeInterval=");
        m24u.append(this.f44139h);
        m24u.append(", lbsCollectionEnabled=");
        m24u.append(this.f44140i);
        m24u.append(", passiveCollectionEnabled=");
        m24u.append(this.f44141j);
        m24u.append(", allCellsCollectingEnabled=");
        m24u.append(this.f44142k);
        m24u.append(", connectedCellCollectingEnabled=");
        m24u.append(this.f44143l);
        m24u.append(", wifiAccessConfig=");
        m24u.append(this.f44144m);
        m24u.append(", lbsAccessConfig=");
        m24u.append(this.f44145n);
        m24u.append(", gpsAccessConfig=");
        m24u.append(this.f44146o);
        m24u.append(", passiveAccessConfig=");
        m24u.append(this.f44147p);
        m24u.append(", gplConfig=");
        m24u.append(this.f44148q);
        m24u.append('}');
        return m24u.toString();
    }
}
