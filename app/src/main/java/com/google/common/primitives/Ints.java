package com.google.common.primitives;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Ints extends IntsMethodsForWeb {

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public Integer mo11126b(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int min = Math.min(iArr3.length, iArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int m12081c = Ints.m12081c(iArr3[i2], iArr4[i2]);
                if (m12081c != 0) {
                    return m12081c;
                }
            }
            return iArr3.length - iArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    /* renamed from: a */
    public static List<Integer> m12079a(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new IntArrayAsList(iArr);
    }

    /* renamed from: b */
    public static int m12080b(long j2) {
        int i2 = (int) j2;
        Preconditions.m11183g(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    /* renamed from: c */
    public static int m12081c(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    @Beta
    /* renamed from: d */
    public static int m12082d(int i2, int i3, int i4) {
        Preconditions.m11182f(i3 <= i4, "min (%s) must be less than or equal to max (%s)", i3, i4);
        return Math.min(Math.max(i2, i3), i4);
    }

    /* renamed from: e */
    public static int m12083e(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* renamed from: f */
    public static int m12084f(long j2) {
        if (j2 > ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < ParserMinimalBase.MIN_INT_L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* renamed from: g */
    public static int[] m12085g(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            IntArrayAsList intArrayAsList = (IntArrayAsList) collection;
            return Arrays.copyOfRange(intArrayAsList.f21949b, intArrayAsList.f21950c, intArrayAsList.f21951d);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            Objects.requireNonNull(obj);
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    @GwtCompatible
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final int[] f21949b;

        /* renamed from: c */
        public final int f21950c;

        /* renamed from: d */
        public final int f21951d;

        public IntArrayAsList(int[] iArr) {
            int length = iArr.length;
            this.f21949b = iArr;
            this.f21950c = 0;
            this.f21951d = length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f21949b;
                int intValue = ((Integer) obj).intValue();
                int i2 = this.f21950c;
                int i3 = this.f21951d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (iArr[i2] == intValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21949b[this.f21950c + i2] != intArrayAsList.f21949b[intArrayAsList.f21950c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Integer.valueOf(this.f21949b[this.f21950c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21950c; i3 < this.f21951d; i3++) {
                i2 = (i2 * 31) + this.f21949b[i3];
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f21949b;
                int intValue = ((Integer) obj).intValue();
                int i2 = this.f21950c;
                int i3 = this.f21951d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (iArr[i2] == intValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21950c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f21949b;
                int intValue = ((Integer) obj).intValue();
                int i2 = this.f21950c;
                int i3 = this.f21951d - 1;
                while (true) {
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == intValue) {
                        break;
                    }
                    i3--;
                }
                if (i3 >= 0) {
                    return i3 - this.f21950c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Integer num = (Integer) obj;
            Preconditions.m11186j(i2, size());
            int[] iArr = this.f21949b;
            int i3 = this.f21950c + i2;
            int i4 = iArr[i3];
            Objects.requireNonNull(num);
            iArr[i3] = num.intValue();
            return Integer.valueOf(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21951d - this.f21950c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            int[] iArr = this.f21949b;
            int i4 = this.f21950c;
            return new IntArrayAsList(iArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f21949b[this.f21950c]);
            int i2 = this.f21950c;
            while (true) {
                i2++;
                if (i2 >= this.f21951d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f21949b[i2]);
            }
        }

        public IntArrayAsList(int[] iArr, int i2, int i3) {
            this.f21949b = iArr;
            this.f21950c = i2;
            this.f21951d = i3;
        }
    }
}
