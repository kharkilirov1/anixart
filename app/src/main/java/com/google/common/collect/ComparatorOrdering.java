package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {

    /* renamed from: b */
    public final Comparator<T> f20927b;

    public ComparatorOrdering(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f20927b = comparator;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f20927b.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.f20927b.equals(((ComparatorOrdering) obj).f20927b);
        }
        return false;
    }

    public int hashCode() {
        return this.f20927b.hashCode();
    }

    public String toString() {
        return this.f20927b.toString();
    }
}
