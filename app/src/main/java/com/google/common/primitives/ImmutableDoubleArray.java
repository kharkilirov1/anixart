package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public final class ImmutableDoubleArray implements Serializable {

    /* renamed from: e */
    public static final ImmutableDoubleArray f21934e = new ImmutableDoubleArray(new double[0]);

    /* renamed from: b */
    public final double[] f21935b;

    /* renamed from: c */
    public final transient int f21936c;

    /* renamed from: d */
    public final int f21937d;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final ImmutableDoubleArray f21938b;

        public AsList(ImmutableDoubleArray immutableDoubleArray, C19131 c19131) {
            this.f21938b = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof AsList) {
                return this.f21938b.equals(((AsList) obj).f21938b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i2 = this.f21938b.f21936c;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i3 = i2 + 1;
                    if (ImmutableDoubleArray.m12072a(this.f21938b.f21935b[i2], ((Double) obj2).doubleValue())) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return Double.valueOf(this.f21938b.m12073b(i2));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f21938b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            ImmutableDoubleArray immutableDoubleArray = this.f21938b;
            double doubleValue = ((Double) obj).doubleValue();
            for (int i2 = immutableDoubleArray.f21936c; i2 < immutableDoubleArray.f21937d; i2++) {
                if (ImmutableDoubleArray.m12072a(immutableDoubleArray.f21935b[i2], doubleValue)) {
                    return i2 - immutableDoubleArray.f21936c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            ImmutableDoubleArray immutableDoubleArray = this.f21938b;
            double doubleValue = ((Double) obj).doubleValue();
            for (int i2 = immutableDoubleArray.f21937d - 1; i2 >= immutableDoubleArray.f21936c; i2--) {
                if (ImmutableDoubleArray.m12072a(immutableDoubleArray.f21935b[i2], doubleValue)) {
                    return i2 - immutableDoubleArray.f21936c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21938b.m12074c();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i2, int i3) {
            ImmutableDoubleArray immutableDoubleArray;
            ImmutableDoubleArray immutableDoubleArray2 = this.f21938b;
            Preconditions.m11190n(i2, i3, immutableDoubleArray2.m12074c());
            if (i2 == i3) {
                immutableDoubleArray = ImmutableDoubleArray.f21934e;
            } else {
                double[] dArr = immutableDoubleArray2.f21935b;
                int i4 = immutableDoubleArray2.f21936c;
                immutableDoubleArray = new ImmutableDoubleArray(dArr, i2 + i4, i4 + i3);
            }
            return new AsList(immutableDoubleArray, null);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f21938b.toString();
        }
    }

    @CanIgnoreReturnValue
    public static final class Builder {
    }

    public ImmutableDoubleArray(double[] dArr) {
        int length = dArr.length;
        this.f21935b = dArr;
        this.f21936c = 0;
        this.f21937d = length;
    }

    /* renamed from: a */
    public static boolean m12072a(double d, double d2) {
        return Double.doubleToLongBits(d) == Double.doubleToLongBits(d2);
    }

    /* renamed from: b */
    public double m12073b(int i2) {
        Preconditions.m11186j(i2, m12074c());
        return this.f21935b[this.f21936c + i2];
    }

    /* renamed from: c */
    public int m12074c() {
        return this.f21937d - this.f21936c;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (m12074c() != immutableDoubleArray.m12074c()) {
            return false;
        }
        for (int i2 = 0; i2 < m12074c(); i2++) {
            if (!m12072a(m12073b(i2), immutableDoubleArray.m12073b(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.f21936c; i3 < this.f21937d; i3++) {
            double d = this.f21935b[i3];
            int i4 = Doubles.f21923a;
            i2 = (i2 * 31) + Double.valueOf(d).hashCode();
        }
        return i2;
    }

    public String toString() {
        if (this.f21937d == this.f21936c) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(m12074c() * 5);
        sb.append('[');
        sb.append(this.f21935b[this.f21936c]);
        for (int i2 = this.f21936c + 1; i2 < this.f21937d; i2++) {
            sb.append(", ");
            sb.append(this.f21935b[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public ImmutableDoubleArray(double[] dArr, int i2, int i3) {
        this.f21935b = dArr;
        this.f21936c = i2;
        this.f21937d = i3;
    }
}
