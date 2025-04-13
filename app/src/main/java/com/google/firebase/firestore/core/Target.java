package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.ResourcePath;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Target {

    /* renamed from: a */
    public final List<OrderBy> f22742a;

    /* renamed from: b */
    public final List<Filter> f22743b;

    /* renamed from: c */
    public final ResourcePath f22744c;

    /* renamed from: d */
    @Nullable
    public final String f22745d;

    /* renamed from: e */
    public final long f22746e;

    /* renamed from: f */
    @Nullable
    public final Bound f22747f;

    /* renamed from: g */
    @Nullable
    public final Bound f22748g;

    /* renamed from: com.google.firebase.firestore.core.Target$1 */
    public static /* synthetic */ class C20891 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22749a;

        static {
            int[] iArr = new int[FieldFilter.Operator.values().length];
            f22749a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22749a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22749a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22749a[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22749a[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22749a[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22749a[0] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22749a[1] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22749a[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22749a[4] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public Target(ResourcePath resourcePath, @Nullable String str, List<Filter> list, List<OrderBy> list2, long j2, @Nullable Bound bound, @Nullable Bound bound2) {
        this.f22744c = resourcePath;
        this.f22745d = str;
        this.f22742a = list2;
        this.f22743b = list;
        this.f22746e = j2;
        this.f22747f = bound;
        this.f22748g = bound2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Target.class != obj.getClass()) {
            return false;
        }
        Target target = (Target) obj;
        String str = this.f22745d;
        if (str == null ? target.f22745d != null : !str.equals(target.f22745d)) {
            return false;
        }
        if (this.f22746e != target.f22746e || !this.f22742a.equals(target.f22742a) || !this.f22743b.equals(target.f22743b) || !this.f22744c.equals(target.f22744c)) {
            return false;
        }
        Bound bound = this.f22747f;
        if (bound == null ? target.f22747f != null : !bound.equals(target.f22747f)) {
            return false;
        }
        Bound bound2 = this.f22748g;
        Bound bound3 = target.f22748g;
        return bound2 != null ? bound2.equals(bound3) : bound3 == null;
    }

    public int hashCode() {
        int hashCode = this.f22742a.hashCode() * 31;
        String str = this.f22745d;
        int hashCode2 = (this.f22744c.hashCode() + ((this.f22743b.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j2 = this.f22746e;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Bound bound = this.f22747f;
        int hashCode3 = (i2 + (bound != null ? bound.hashCode() : 0)) * 31;
        Bound bound2 = this.f22748g;
        return hashCode3 + (bound2 != null ? bound2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Query(");
        m24u.append(this.f22744c.mo12428b());
        if (this.f22745d != null) {
            m24u.append(" collectionGroup=");
            m24u.append(this.f22745d);
        }
        if (!this.f22743b.isEmpty()) {
            m24u.append(" where ");
            for (int i2 = 0; i2 < this.f22743b.size(); i2++) {
                if (i2 > 0) {
                    m24u.append(" and ");
                }
                m24u.append(this.f22743b.get(i2));
            }
        }
        if (!this.f22742a.isEmpty()) {
            m24u.append(" order by ");
            for (int i3 = 0; i3 < this.f22742a.size(); i3++) {
                if (i3 > 0) {
                    m24u.append(", ");
                }
                m24u.append(this.f22742a.get(i3));
            }
        }
        m24u.append(")");
        return m24u.toString();
    }
}
