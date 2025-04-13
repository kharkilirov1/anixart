package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class NaturalOrdering extends Ordering<Comparable> implements Serializable {

    /* renamed from: d */
    public static final NaturalOrdering f21382d = new NaturalOrdering();

    /* renamed from: b */
    @NullableDecl
    public transient Ordering<Comparable> f21383b;

    /* renamed from: c */
    @NullableDecl
    public transient Ordering<Comparable> f21384c;

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: e */
    public <S extends Comparable> Ordering<S> mo11825e() {
        Ordering<S> ordering = (Ordering<S>) this.f21383b;
        if (ordering != null) {
            return ordering;
        }
        NullsFirstOrdering nullsFirstOrdering = new NullsFirstOrdering(this);
        this.f21383b = nullsFirstOrdering;
        return nullsFirstOrdering;
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: f */
    public <S extends Comparable> Ordering<S> mo11826f() {
        Ordering<S> ordering = (Ordering<S>) this.f21384c;
        if (ordering != null) {
            return ordering;
        }
        NullsLastOrdering nullsLastOrdering = new NullsLastOrdering(this);
        this.f21384c = nullsLastOrdering;
        return nullsLastOrdering;
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: h */
    public <S extends Comparable> Ordering<S> mo11416h() {
        return ReverseNaturalOrdering.f21461b;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
