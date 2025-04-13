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
public final class ImmutableIntArray implements Serializable {

    /* renamed from: e */
    public static final ImmutableIntArray f21939e = new ImmutableIntArray(new int[0]);

    /* renamed from: b */
    public final int[] f21940b;

    /* renamed from: c */
    public final transient int f21941c;

    /* renamed from: d */
    public final int f21942d;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final ImmutableIntArray f21943b;

        public AsList(ImmutableIntArray immutableIntArray, C19141 c19141) {
            this.f21943b = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof AsList) {
                return this.f21943b.equals(((AsList) obj).f21943b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i2 = this.f21943b.f21941c;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i3 = i2 + 1;
                    if (this.f21943b.f21940b[i2] == ((Integer) obj2).intValue()) {
                        i2 = i3;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return Integer.valueOf(this.f21943b.m12075a(i2));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f21943b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            ImmutableIntArray immutableIntArray = this.f21943b;
            int intValue = ((Integer) obj).intValue();
            for (int i2 = immutableIntArray.f21941c; i2 < immutableIntArray.f21942d; i2++) {
                if (immutableIntArray.f21940b[i2] == intValue) {
                    return i2 - immutableIntArray.f21941c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            ImmutableIntArray immutableIntArray = this.f21943b;
            int intValue = ((Integer) obj).intValue();
            int i2 = immutableIntArray.f21942d - 1;
            while (true) {
                int i3 = immutableIntArray.f21941c;
                if (i2 < i3) {
                    return -1;
                }
                if (immutableIntArray.f21940b[i2] == intValue) {
                    return i2 - i3;
                }
                i2--;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21943b.m12076b();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i2, int i3) {
            ImmutableIntArray immutableIntArray;
            ImmutableIntArray immutableIntArray2 = this.f21943b;
            Preconditions.m11190n(i2, i3, immutableIntArray2.m12076b());
            if (i2 == i3) {
                immutableIntArray = ImmutableIntArray.f21939e;
            } else {
                int[] iArr = immutableIntArray2.f21940b;
                int i4 = immutableIntArray2.f21941c;
                immutableIntArray = new ImmutableIntArray(iArr, i2 + i4, i4 + i3);
            }
            return new AsList(immutableIntArray, null);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f21943b.toString();
        }
    }

    @CanIgnoreReturnValue
    public static final class Builder {
    }

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.f21940b = iArr;
        this.f21941c = 0;
        this.f21942d = length;
    }

    /* renamed from: a */
    public int m12075a(int i2) {
        Preconditions.m11186j(i2, m12076b());
        return this.f21940b[this.f21941c + i2];
    }

    /* renamed from: b */
    public int m12076b() {
        return this.f21942d - this.f21941c;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (m12076b() != immutableIntArray.m12076b()) {
            return false;
        }
        for (int i2 = 0; i2 < m12076b(); i2++) {
            if (m12075a(i2) != immutableIntArray.m12075a(i2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.f21941c; i3 < this.f21942d; i3++) {
            i2 = (i2 * 31) + this.f21940b[i3];
        }
        return i2;
    }

    public String toString() {
        if (this.f21942d == this.f21941c) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(m12076b() * 5);
        sb.append('[');
        sb.append(this.f21940b[this.f21941c]);
        for (int i2 = this.f21941c + 1; i2 < this.f21942d; i2++) {
            sb.append(", ");
            sb.append(this.f21940b[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public ImmutableIntArray(int[] iArr, int i2, int i3) {
        this.f21940b = iArr;
        this.f21941c = i2;
        this.f21942d = i3;
    }
}
