package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes2.dex */
public final class Parameter implements AnnotatedElement {
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Parameter)) {
            return false;
        }
        Objects.requireNonNull((Parameter) obj);
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @NullableDecl
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        Objects.requireNonNull(cls);
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @NullableDecl
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        Objects.requireNonNull(cls);
        Iterator it = FluentIterable.m11553b(null).m11554a(cls).m11555d().iterator();
        return (A) (it.hasNext() ? Optional.m11176d(it.next()) : Optional.m11174a()).mo11119f();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        Iterable m11555d = FluentIterable.m11553b(null).m11554a(cls).m11555d();
        return (A[]) ((Annotation[]) (m11555d instanceof Collection ? (Collection) m11555d : Lists.m11736c(m11555d.iterator())).toArray((Object[]) Array.newInstance((Class<?>) cls, 0)));
    }

    public int hashCode() {
        return 0;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        Objects.requireNonNull(cls);
        throw null;
    }

    public String toString() {
        return "null arg0";
    }
}
