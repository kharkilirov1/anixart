package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ArrayBuilders {
    private BooleanBuilder _booleanBuilder = null;
    private ByteBuilder _byteBuilder = null;
    private ShortBuilder _shortBuilder = null;
    private IntBuilder _intBuilder = null;
    private LongBuilder _longBuilder = null;
    private FloatBuilder _floatBuilder = null;
    private DoubleBuilder _doubleBuilder = null;

    public static final class BooleanBuilder extends PrimitiveArrayBuilder<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final boolean[] _constructArray(int i2) {
            return new boolean[i2];
        }
    }

    public static final class ByteBuilder extends PrimitiveArrayBuilder<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final byte[] _constructArray(int i2) {
            return new byte[i2];
        }
    }

    public static final class DoubleBuilder extends PrimitiveArrayBuilder<double[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final double[] _constructArray(int i2) {
            return new double[i2];
        }
    }

    public static final class FloatBuilder extends PrimitiveArrayBuilder<float[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final float[] _constructArray(int i2) {
            return new float[i2];
        }
    }

    public static final class IntBuilder extends PrimitiveArrayBuilder<int[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final int[] _constructArray(int i2) {
            return new int[i2];
        }
    }

    public static final class LongBuilder extends PrimitiveArrayBuilder<long[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final long[] _constructArray(int i2) {
            return new long[i2];
        }
    }

    public static final class ShortBuilder extends PrimitiveArrayBuilder<short[]> {
        @Override // com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder
        public final short[] _constructArray(int i2) {
            return new short[i2];
        }
    }

    public static <T> HashSet<T> arrayToSet(T[] tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T t : tArr) {
            hashSet.add(t);
        }
        return hashSet;
    }

    public static Object getArrayComparator(final Object obj) {
        final int length = Array.getLength(obj);
        final Class<?> cls = obj.getClass();
        return new Object() { // from class: com.fasterxml.jackson.databind.util.ArrayBuilders.1
            public boolean equals(Object obj2) {
                if (obj2 == this) {
                    return true;
                }
                if (!ClassUtil.hasClass(obj2, cls) || Array.getLength(obj2) != length) {
                    return false;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj3 = Array.get(obj, i2);
                    Object obj4 = Array.get(obj2, i2);
                    if (obj3 != obj4 && obj3 != null && !obj3.equals(obj4)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static <T> T[] insertInListNoDup(T[] tArr, T t) {
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (tArr[i2] == t) {
                if (i2 == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
                System.arraycopy(tArr, 0, tArr2, 1, i2);
                tArr2[0] = t;
                int i3 = i2 + 1;
                int i4 = length - i3;
                if (i4 > 0) {
                    System.arraycopy(tArr, i3, tArr2, i3, i4);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t;
        return tArr3;
    }

    public BooleanBuilder getBooleanBuilder() {
        if (this._booleanBuilder == null) {
            this._booleanBuilder = new BooleanBuilder();
        }
        return this._booleanBuilder;
    }

    public ByteBuilder getByteBuilder() {
        if (this._byteBuilder == null) {
            this._byteBuilder = new ByteBuilder();
        }
        return this._byteBuilder;
    }

    public DoubleBuilder getDoubleBuilder() {
        if (this._doubleBuilder == null) {
            this._doubleBuilder = new DoubleBuilder();
        }
        return this._doubleBuilder;
    }

    public FloatBuilder getFloatBuilder() {
        if (this._floatBuilder == null) {
            this._floatBuilder = new FloatBuilder();
        }
        return this._floatBuilder;
    }

    public IntBuilder getIntBuilder() {
        if (this._intBuilder == null) {
            this._intBuilder = new IntBuilder();
        }
        return this._intBuilder;
    }

    public LongBuilder getLongBuilder() {
        if (this._longBuilder == null) {
            this._longBuilder = new LongBuilder();
        }
        return this._longBuilder;
    }

    public ShortBuilder getShortBuilder() {
        if (this._shortBuilder == null) {
            this._shortBuilder = new ShortBuilder();
        }
        return this._shortBuilder;
    }
}
