package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes2.dex */
public abstract class TypeParameter<T> extends TypeCapture<T> {

    /* renamed from: a */
    public final TypeVariable<?> f21989a;

    public TypeParameter() {
        Type m12096a = m12096a();
        Preconditions.m11184h(m12096a instanceof TypeVariable, "%s should be a type variable.", m12096a);
        this.f21989a = (TypeVariable) m12096a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof TypeParameter) {
            return this.f21989a.equals(((TypeParameter) obj).f21989a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21989a.hashCode();
    }

    public String toString() {
        return this.f21989a.toString();
    }
}
