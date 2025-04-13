package com.google.common.base;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class Present<T> extends Optional<T> {

    /* renamed from: b */
    public final T f20547b;

    public Present(T t) {
        this.f20547b = t;
    }

    @Override // com.google.common.base.Optional
    /* renamed from: c */
    public boolean mo11117c() {
        return true;
    }

    @Override // com.google.common.base.Optional
    /* renamed from: e */
    public T mo11118e(T t) {
        return this.f20547b;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Present) {
            return this.f20547b.equals(((Present) obj).f20547b);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    /* renamed from: f */
    public T mo11119f() {
        return this.f20547b;
    }

    public int hashCode() {
        return this.f20547b.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f20547b);
        return C0576a.m4115n(valueOf.length() + 13, "Optional.of(", valueOf, ")");
    }
}
