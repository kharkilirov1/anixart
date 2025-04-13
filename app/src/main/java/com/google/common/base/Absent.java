package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class Absent<T> extends Optional<T> {

    /* renamed from: b */
    public static final Absent<Object> f20463b = new Absent<>();

    @Override // com.google.common.base.Optional
    /* renamed from: c */
    public boolean mo11117c() {
        return false;
    }

    @Override // com.google.common.base.Optional
    /* renamed from: e */
    public T mo11118e(T t) {
        return t;
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    @NullableDecl
    /* renamed from: f */
    public T mo11119f() {
        return null;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
