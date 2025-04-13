package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
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
public final class Booleans {

    @GwtCompatible
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final boolean[] f21905b;

        /* renamed from: c */
        public final int f21906c;

        /* renamed from: d */
        public final int f21907d;

        public BooleanArrayAsList(boolean[] zArr, int i2, int i3) {
            this.f21905b = zArr;
            this.f21906c = i2;
            this.f21907d = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                boolean[] zArr = this.f21905b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = this.f21906c;
                int i3 = this.f21907d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (zArr[i2] == booleanValue) {
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
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21905b[this.f21906c + i2] != booleanArrayAsList.f21905b[booleanArrayAsList.f21906c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Boolean.valueOf(this.f21905b[this.f21906c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21906c; i3 < this.f21907d; i3++) {
                i2 = (i2 * 31) + (this.f21905b[i3] ? 1231 : 1237);
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                boolean[] zArr = this.f21905b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = this.f21906c;
                int i3 = this.f21907d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (zArr[i2] == booleanValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21906c;
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
            if (obj instanceof Boolean) {
                boolean[] zArr = this.f21905b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = this.f21906c;
                int i3 = this.f21907d - 1;
                while (true) {
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                    if (zArr[i3] == booleanValue) {
                        break;
                    }
                    i3--;
                }
                if (i3 >= 0) {
                    return i3 - this.f21906c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Boolean bool = (Boolean) obj;
            Preconditions.m11186j(i2, size());
            boolean[] zArr = this.f21905b;
            int i3 = this.f21906c + i2;
            boolean z = zArr[i3];
            Objects.requireNonNull(bool);
            zArr[i3] = bool.booleanValue();
            return Boolean.valueOf(z);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21907d - this.f21906c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f21905b;
            int i4 = this.f21906c;
            return new BooleanArrayAsList(zArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.f21905b[this.f21906c] ? "[true" : "[false");
            int i2 = this.f21906c;
            while (true) {
                i2++;
                if (i2 >= this.f21907d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(this.f21905b[i2] ? ", true" : ", false");
            }
        }
    }

    public enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* renamed from: b */
        public final int f21911b;

        /* renamed from: c */
        public final String f21912c;

        BooleanComparator(int i2, String str) {
            this.f21911b = i2;
            this.f21912c = str;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool2;
            return (bool3.booleanValue() ? this.f21911b : 0) - (bool.booleanValue() ? this.f21911b : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f21912c;
        }
    }

    public enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            boolean[] zArr3 = zArr;
            boolean[] zArr4 = zArr2;
            int min = Math.min(zArr3.length, zArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int m12071a = Booleans.m12071a(zArr3[i2], zArr4[i2]);
                if (m12071a != 0) {
                    return m12071a;
                }
            }
            return zArr3.length - zArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    /* renamed from: a */
    public static int m12071a(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }
}
