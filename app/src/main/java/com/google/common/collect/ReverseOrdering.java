package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class ReverseOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    public final Ordering<? super T> f21462b;

    public ReverseOrdering(Ordering<? super T> ordering) {
        this.f21462b = ordering;
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: b */
    public <E extends T> E mo11856b(E e2, E e3) {
        return (E) this.f21462b.mo11857c(e2, e3);
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: c */
    public <E extends T> E mo11857c(E e2, E e3) {
        return (E) this.f21462b.mo11856b(e2, e3);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f21462b.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f21462b.equals(((ReverseOrdering) obj).f21462b);
        }
        return false;
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: h */
    public <S extends T> Ordering<S> mo11416h() {
        return this.f21462b;
    }

    public int hashCode() {
        return -this.f21462b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21462b);
        return C0576a.m4114m(valueOf.length() + 10, valueOf, ".reverse()");
    }
}
