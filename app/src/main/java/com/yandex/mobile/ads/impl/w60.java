package com.yandex.mobile.ads.impl;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class w60 extends x60 {

    /* renamed from: com.yandex.mobile.ads.impl.w60$a */
    public static class C5960a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        public final int[] f56024a;

        /* renamed from: b */
        public final int f56025b;

        /* renamed from: c */
        public final int f56026c;

        public C5960a(int i2, int i3, int[] iArr) {
            this.f56024a = iArr;
            this.f56025b = i2;
            this.f56026c = i3;
        }

        /* renamed from: b */
        public final int[] m29388b() {
            return Arrays.copyOfRange(this.f56024a, this.f56025b, this.f56026c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f56024a;
                int intValue = ((Integer) obj).intValue();
                int i2 = this.f56025b;
                int i3 = this.f56026c;
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
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5960a)) {
                return super.equals(obj);
            }
            C5960a c5960a = (C5960a) obj;
            int size = size();
            if (c5960a.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f56024a[this.f56025b + i2] != c5960a.f56024a[c5960a.f56025b + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i2) {
            tr0.m28729a(i2, size());
            return Integer.valueOf(this.f56024a[this.f56025b + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i2 = 1;
            for (int i3 = this.f56025b; i3 < this.f56026c; i3++) {
                i2 = (i2 * 31) + this.f56024a[i3];
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f56024a;
                int intValue = ((Integer) obj).intValue();
                int i2 = this.f56025b;
                int i3 = this.f56026c;
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
                    return i2 - this.f56025b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f56024a;
                int intValue = ((Integer) obj).intValue();
                int i2 = this.f56025b;
                int i3 = this.f56026c - 1;
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
                    return i3 - this.f56025b;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i2, Object obj) {
            Integer num = (Integer) obj;
            tr0.m28729a(i2, size());
            int[] iArr = this.f56024a;
            int i3 = this.f56025b + i2;
            int i4 = iArr[i3];
            Objects.requireNonNull(num);
            iArr[i3] = num.intValue();
            return Integer.valueOf(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f56026c - this.f56025b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i2, int i3) {
            tr0.m28730a(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            int[] iArr = this.f56024a;
            int i4 = this.f56025b;
            return new C5960a(i2 + i4, i4 + i3, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f56024a[this.f56025b]);
            int i2 = this.f56025b;
            while (true) {
                i2++;
                if (i2 >= this.f56026c) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f56024a[i2]);
            }
        }
    }

    /* renamed from: a */
    public static int m29384a(long j2) {
        int i2 = (int) j2;
        if (((long) i2) == j2) {
            return i2;
        }
        throw new IllegalArgumentException(s41.m28070a("Out of range: %s", Long.valueOf(j2)));
    }

    /* renamed from: b */
    public static int m29387b(long j2) {
        if (j2 > ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < ParserMinimalBase.MIN_INT_L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* renamed from: a */
    public static int[] m29386a(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof C5960a) {
            return ((C5960a) abstractCollection).m29388b();
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            Objects.requireNonNull(obj);
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static List<Integer> m29385a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new C5960a(0, iArr.length, iArr);
    }
}
