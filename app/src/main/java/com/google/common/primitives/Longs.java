package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Longs {

    public static final class AsciiDigits {
        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 < 10; i2++) {
                bArr[i2 + 48] = (byte) i2;
            }
            for (int i3 = 0; i3 < 26; i3++) {
                byte b = (byte) (i3 + 10);
                bArr[i3 + 65] = b;
                bArr[i3 + 97] = b;
            }
        }
    }

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int min = Math.min(jArr3.length, jArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int m12086a = Longs.m12086a(jArr3[i2], jArr4[i2]);
                if (m12086a != 0) {
                    return m12086a;
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final long[] f21956b;

        /* renamed from: c */
        public final int f21957c;

        /* renamed from: d */
        public final int f21958d;

        public LongArrayAsList(long[] jArr, int i2, int i3) {
            this.f21956b = jArr;
            this.f21957c = i2;
            this.f21958d = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Long) {
                long[] jArr = this.f21956b;
                long longValue = ((Long) obj).longValue();
                int i2 = this.f21957c;
                int i3 = this.f21958d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (jArr[i2] == longValue) {
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
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21956b[this.f21957c + i2] != longArrayAsList.f21956b[longArrayAsList.f21957c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Long.valueOf(this.f21956b[this.f21957c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21957c; i3 < this.f21958d; i3++) {
                i2 = (i2 * 31) + Longs.m12088c(this.f21956b[i3]);
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                long[] jArr = this.f21956b;
                long longValue = ((Long) obj).longValue();
                int i2 = this.f21957c;
                int i3 = this.f21958d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (jArr[i2] == longValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21957c;
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
            if (obj instanceof Long) {
                long[] jArr = this.f21956b;
                long longValue = ((Long) obj).longValue();
                int i2 = this.f21957c;
                int i3 = this.f21958d - 1;
                while (true) {
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                    if (jArr[i3] == longValue) {
                        break;
                    }
                    i3--;
                }
                if (i3 >= 0) {
                    return i3 - this.f21957c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Long l2 = (Long) obj;
            Preconditions.m11186j(i2, size());
            long[] jArr = this.f21956b;
            int i3 = this.f21957c + i2;
            long j2 = jArr[i3];
            Objects.requireNonNull(l2);
            jArr[i3] = l2.longValue();
            return Long.valueOf(j2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21958d - this.f21957c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            long[] jArr = this.f21956b;
            int i4 = this.f21957c;
            return new LongArrayAsList(jArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f21956b[this.f21957c]);
            int i2 = this.f21957c;
            while (true) {
                i2++;
                if (i2 >= this.f21958d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f21956b[i2]);
            }
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public Long mo11126b(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    /* renamed from: a */
    public static int m12086a(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    /* renamed from: b */
    public static long m12087b(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (b8 & 255);
    }

    /* renamed from: c */
    public static int m12088c(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }
}
