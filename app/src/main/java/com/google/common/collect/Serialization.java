package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;

@GwtIncompatible
/* loaded from: classes.dex */
final class Serialization {

    public static final class FieldSetter<T> {
        public FieldSetter(Field field, C17541 c17541) {
            field.setAccessible(true);
        }
    }

    /* renamed from: a */
    public static <T> FieldSetter<T> m11882a(Class<T> cls, String str) {
        try {
            return new FieldSetter<>(cls.getDeclaredField(str), null);
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }
}
