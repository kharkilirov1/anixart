package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
/* loaded from: classes.dex */
public final class ObjectArrays {
    @CanIgnoreReturnValue
    /* renamed from: a */
    public static Object m11827a(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C0576a.m4111j(20, "at index ", i2));
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static Object[] m11828b(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    /* renamed from: c */
    public static <T> T[] m11829c(T[] tArr, int i2) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
    }

    /* renamed from: d */
    public static <T> T[] m11830d(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) m11829c(tArr, size);
        }
        m11828b(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
