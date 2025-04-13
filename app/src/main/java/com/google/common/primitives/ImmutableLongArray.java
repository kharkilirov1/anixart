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
public final class ImmutableLongArray implements Serializable {

    /* renamed from: e */
    public static final ImmutableLongArray f21944e = new ImmutableLongArray(new long[0]);

    /* renamed from: b */
    public final long[] f21945b;

    /* renamed from: c */
    public final transient int f21946c;

    /* renamed from: d */
    public final int f21947d;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final ImmutableLongArray f21948b;

        public AsList(ImmutableLongArray immutableLongArray, C19151 c19151) {
            this.f21948b = immutableLongArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof AsList) {
                return this.f21948b.equals(((AsList) obj).f21948b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i2 = this.f21948b.f21946c;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i3 = i2 + 1;
                    if (this.f21948b.f21945b[i2] == ((Long) obj2).longValue()) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return Long.valueOf(this.f21948b.m12077a(i2));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f21948b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            ImmutableLongArray immutableLongArray = this.f21948b;
            long longValue = ((Long) obj).longValue();
            for (int i2 = immutableLongArray.f21946c; i2 < immutableLongArray.f21947d; i2++) {
                if (immutableLongArray.f21945b[i2] == longValue) {
                    return i2 - immutableLongArray.f21946c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            ImmutableLongArray immutableLongArray = this.f21948b;
            long longValue = ((Long) obj).longValue();
            int i2 = immutableLongArray.f21947d - 1;
            while (true) {
                int i3 = immutableLongArray.f21946c;
                if (i2 < i3) {
                    return -1;
                }
                if (immutableLongArray.f21945b[i2] == longValue) {
                    return i2 - i3;
                }
                i2--;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21948b.m12078b();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i2, int i3) {
            ImmutableLongArray immutableLongArray;
            ImmutableLongArray immutableLongArray2 = this.f21948b;
            Preconditions.m11190n(i2, i3, immutableLongArray2.m12078b());
            if (i2 == i3) {
                immutableLongArray = ImmutableLongArray.f21944e;
            } else {
                long[] jArr = immutableLongArray2.f21945b;
                int i4 = immutableLongArray2.f21946c;
                immutableLongArray = new ImmutableLongArray(jArr, i2 + i4, i4 + i3);
            }
            return new AsList(immutableLongArray, null);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f21948b.toString();
        }
    }

    @CanIgnoreReturnValue
    public static final class Builder {
    }

    public ImmutableLongArray(long[] jArr) {
        int length = jArr.length;
        this.f21945b = jArr;
        this.f21946c = 0;
        this.f21947d = length;
    }

    /* renamed from: a */
    public long m12077a(int i2) {
        Preconditions.m11186j(i2, m12078b());
        return this.f21945b[this.f21946c + i2];
    }

    /* renamed from: b */
    public int m12078b() {
        return this.f21947d - this.f21946c;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (m12078b() != immutableLongArray.m12078b()) {
            return false;
        }
        for (int i2 = 0; i2 < m12078b(); i2++) {
            if (m12077a(i2) != immutableLongArray.m12077a(i2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.f21946c; i3 < this.f21947d; i3++) {
            i2 = (i2 * 31) + Longs.m12088c(this.f21945b[i3]);
        }
        return i2;
    }

    public String toString() {
        if (this.f21947d == this.f21946c) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(m12078b() * 5);
        sb.append('[');
        sb.append(this.f21945b[this.f21946c]);
        for (int i2 = this.f21946c + 1; i2 < this.f21947d; i2++) {
            sb.append(", ");
            sb.append(this.f21945b[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public ImmutableLongArray(long[] jArr, int i2, int i3) {
        this.f21945b = jArr;
        this.f21946c = i2;
        this.f21947d = i3;
    }
}
