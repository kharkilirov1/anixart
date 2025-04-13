package com.google.common.primitives;

import androidx.room.util.C0576a;
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
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Doubles extends DoublesMethodsForWeb {

    /* renamed from: a */
    public static final /* synthetic */ int f21923a = 0;

    @GwtCompatible
    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final double[] f21924b;

        /* renamed from: c */
        public final int f21925c;

        /* renamed from: d */
        public final int f21926d;

        public DoubleArrayAsList(double[] dArr, int i2, int i3) {
            this.f21924b = dArr;
            this.f21925c = i2;
            this.f21926d = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Double) {
                double[] dArr = this.f21924b;
                double doubleValue = ((Double) obj).doubleValue();
                int i2 = this.f21925c;
                int i3 = this.f21926d;
                int i4 = Doubles.f21923a;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (dArr[i2] == doubleValue) {
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
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21924b[this.f21925c + i2] != doubleArrayAsList.f21924b[doubleArrayAsList.f21925c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Double.valueOf(this.f21924b[this.f21925c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21925c; i3 < this.f21926d; i3++) {
                double d = this.f21924b[i3];
                int i4 = Doubles.f21923a;
                i2 = (i2 * 31) + Double.valueOf(d).hashCode();
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                double[] dArr = this.f21924b;
                double doubleValue = ((Double) obj).doubleValue();
                int i2 = this.f21925c;
                int i3 = this.f21926d;
                int i4 = Doubles.f21923a;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (dArr[i2] == doubleValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21925c;
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
            if (obj instanceof Double) {
                double[] dArr = this.f21924b;
                double doubleValue = ((Double) obj).doubleValue();
                int i2 = this.f21925c;
                int i3 = this.f21926d;
                int i4 = Doubles.f21923a;
                int i5 = i3 - 1;
                while (true) {
                    if (i5 < i2) {
                        i5 = -1;
                        break;
                    }
                    if (dArr[i5] == doubleValue) {
                        break;
                    }
                    i5--;
                }
                if (i5 >= 0) {
                    return i5 - this.f21925c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Double d = (Double) obj;
            Preconditions.m11186j(i2, size());
            double[] dArr = this.f21924b;
            int i3 = this.f21925c + i2;
            double d2 = dArr[i3];
            Objects.requireNonNull(d);
            dArr[i3] = d.doubleValue();
            return Double.valueOf(d2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21926d - this.f21925c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            double[] dArr = this.f21924b;
            int i4 = this.f21925c;
            return new DoubleArrayAsList(dArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f21924b[this.f21925c]);
            int i2 = this.f21925c;
            while (true) {
                i2++;
                if (i2 >= this.f21926d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f21924b[i2]);
            }
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public Double mo11126b(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            double[] dArr3 = dArr;
            double[] dArr4 = dArr2;
            int min = Math.min(dArr3.length, dArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int compare = Double.compare(dArr3[i2], dArr4[i2]);
                if (compare != 0) {
                    return compare;
                }
            }
            return dArr3.length - dArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    static {
        String concat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder m4122u = C0576a.m4122u("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?".length() + C0576a.m4106e(concat, 23), "[+-]?(?:NaN|Infinity|", concat, "|", "0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?");
        m4122u.append(")");
        Pattern.compile(m4122u.toString().replace("#", "+"));
    }
}
