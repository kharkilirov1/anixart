package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
final class ReverseNaturalOrdering extends Ordering<Comparable> implements Serializable {

    /* renamed from: b */
    public static final ReverseNaturalOrdering f21461b = new ReverseNaturalOrdering();

    @Override // com.google.common.collect.Ordering
    /* renamed from: b */
    public Object mo11856b(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        return NaturalOrdering.f21382d.compare(comparable, comparable2) <= 0 ? comparable : comparable2;
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: c */
    public Object mo11857c(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        return NaturalOrdering.f21382d.compare(comparable, comparable2) >= 0 ? comparable : comparable2;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: h */
    public <S extends Comparable> Ordering<S> mo11416h() {
        return NaturalOrdering.f21382d;
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
