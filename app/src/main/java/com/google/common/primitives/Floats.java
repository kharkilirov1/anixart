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
public final class Floats extends FloatsMethodsForWeb {

    @GwtCompatible
    public static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final float[] f21929b;

        /* renamed from: c */
        public final int f21930c;

        /* renamed from: d */
        public final int f21931d;

        public FloatArrayAsList(float[] fArr, int i2, int i3) {
            this.f21929b = fArr;
            this.f21930c = i2;
            this.f21931d = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Float) {
                float[] fArr = this.f21929b;
                float floatValue = ((Float) obj).floatValue();
                int i2 = this.f21930c;
                int i3 = this.f21931d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (fArr[i2] == floatValue) {
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
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21929b[this.f21930c + i2] != floatArrayAsList.f21929b[floatArrayAsList.f21930c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Float.valueOf(this.f21929b[this.f21930c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21930c; i3 < this.f21931d; i3++) {
                i2 = (i2 * 31) + Float.valueOf(this.f21929b[i3]).hashCode();
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Float) {
                float[] fArr = this.f21929b;
                float floatValue = ((Float) obj).floatValue();
                int i2 = this.f21930c;
                int i3 = this.f21931d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (fArr[i2] == floatValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21930c;
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
            if (obj instanceof Float) {
                float[] fArr = this.f21929b;
                float floatValue = ((Float) obj).floatValue();
                int i2 = this.f21930c;
                int i3 = this.f21931d - 1;
                while (true) {
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                    if (fArr[i3] == floatValue) {
                        break;
                    }
                    i3--;
                }
                if (i3 >= 0) {
                    return i3 - this.f21930c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Float f2 = (Float) obj;
            Preconditions.m11186j(i2, size());
            float[] fArr = this.f21929b;
            int i3 = this.f21930c + i2;
            float f3 = fArr[i3];
            Objects.requireNonNull(f2);
            fArr[i3] = f2.floatValue();
            return Float.valueOf(f3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21931d - this.f21930c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            float[] fArr = this.f21929b;
            int i4 = this.f21930c;
            return new FloatArrayAsList(fArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f21929b[this.f21930c]);
            int i2 = this.f21930c;
            while (true) {
                i2++;
                if (i2 >= this.f21931d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f21929b[i2]);
            }
        }
    }

    public static final class FloatConverter extends Converter<String, Float> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public Float mo11126b(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    public enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            float[] fArr3 = fArr;
            float[] fArr4 = fArr2;
            int min = Math.min(fArr3.length, fArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                int compare = Float.compare(fArr3[i2], fArr4[i2]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr3.length - fArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }
}
