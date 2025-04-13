package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;

@Beta
/* loaded from: classes2.dex */
public abstract class Invokable<T, R> extends Element implements GenericDeclaration {

    public static class ConstructorInvokable<T> extends Invokable<T, T> {
        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            getDeclaringClass().getTypeParameters();
            throw null;
        }
    }

    public static class MethodInvokable<T> extends Invokable<T, Object> {
        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            throw null;
        }
    }

    @Override // com.google.common.reflect.Element
    /* renamed from: a */
    public TypeToken<T> mo12095a() {
        return new TypeToken.SimpleTypeToken(getDeclaringClass());
    }

    @Override // com.google.common.reflect.Element, java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        throw null;
    }
}
