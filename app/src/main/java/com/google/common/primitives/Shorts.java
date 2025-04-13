package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Shorts extends ShortsMethodsForWeb {

    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            short[] sArr3 = sArr;
            short[] sArr4 = sArr2;
            int min = Math.min(sArr3.length, sArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int i3 = sArr3[i2] - sArr4[i2];
                if (i3 != 0) {
                    return i3;
                }
            }
            return sArr3.length - sArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final short[] f21963b;

        /* renamed from: c */
        public final int f21964c;

        /* renamed from: d */
        public final int f21965d;

        public ShortArrayAsList(short[] sArr, int i2, int i3) {
            this.f21963b = sArr;
            this.f21964c = i2;
            this.f21965d = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@NullableDecl Object obj) {
            if (obj instanceof Short) {
                short[] sArr = this.f21963b;
                short shortValue = ((Short) obj).shortValue();
                int i2 = this.f21964c;
                int i3 = this.f21965d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (sArr[i2] == shortValue) {
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
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21963b[this.f21964c + i2] != shortArrayAsList.f21963b[shortArrayAsList.f21964c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Short.valueOf(this.f21963b[this.f21964c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21964c; i3 < this.f21965d; i3++) {
                i2 = (i2 * 31) + this.f21963b[i3];
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@NullableDecl Object obj) {
            if (obj instanceof Short) {
                short[] sArr = this.f21963b;
                short shortValue = ((Short) obj).shortValue();
                int i2 = this.f21964c;
                int i3 = this.f21965d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (sArr[i2] == shortValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21964c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
            if (obj instanceof Short) {
                short[] sArr = this.f21963b;
                short shortValue = ((Short) obj).shortValue();
                int i2 = this.f21964c;
                int i3 = this.f21965d - 1;
                while (true) {
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                    if (sArr[i3] == shortValue) {
                        break;
                    }
                    i3--;
                }
                if (i3 >= 0) {
                    return i3 - this.f21964c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Short sh = (Short) obj;
            Preconditions.m11186j(i2, size());
            short[] sArr = this.f21963b;
            int i3 = this.f21964c + i2;
            short s = sArr[i3];
            Objects.requireNonNull(sh);
            sArr[i3] = sh.shortValue();
            return Short.valueOf(s);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21965d - this.f21964c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            short[] sArr = this.f21963b;
            int i4 = this.f21964c;
            return new ShortArrayAsList(sArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append((int) this.f21963b[this.f21964c]);
            int i2 = this.f21964c;
            while (true) {
                i2++;
                if (i2 >= this.f21965d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.f21963b[i2]);
            }
        }
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public Short mo11126b(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }
}
