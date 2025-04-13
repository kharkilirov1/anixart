package com.google.common.reflect;

import com.google.common.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
class Element extends AccessibleObject implements Member {
    /* renamed from: a */
    public TypeToken<?> mo12095a() {
        return new TypeToken.SimpleTypeToken(getDeclaringClass());
    }

    public boolean equals(@NullableDecl Object obj) {
        if ((obj instanceof Element) && mo12095a().equals(((Element) obj).mo12095a())) {
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        throw null;
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public Class<?> getDeclaringClass() {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    @Override // java.lang.reflect.AccessibleObject
    public final boolean isAccessible() {
        throw null;
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        throw null;
    }

    @Override // java.lang.reflect.AccessibleObject
    public final void setAccessible(boolean z) throws SecurityException {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
