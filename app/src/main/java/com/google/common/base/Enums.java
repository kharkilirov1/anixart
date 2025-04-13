package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.WeakHashMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Enums {

    public static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public Object mo11126b(String str) {
            return Enum.valueOf(null, str);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            java.util.Objects.requireNonNull((StringConverter) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    static {
        new WeakHashMap();
    }
}
