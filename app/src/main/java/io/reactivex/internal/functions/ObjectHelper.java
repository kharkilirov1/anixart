package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* loaded from: classes3.dex */
public final class ObjectHelper {

    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.functions.BiPredicate
        /* renamed from: a */
        public boolean mo31404a(Object obj, Object obj2) {
            return ObjectHelper.m31426b(obj, obj2);
        }
    }

    public ObjectHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static int m31425a(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m31426b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    public static int m31427c(int i2, String str) {
        if (i2 > 0) {
            return i2;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
    }
}
