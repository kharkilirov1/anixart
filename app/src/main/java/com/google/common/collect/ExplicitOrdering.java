package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {
    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        throw null;
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof ExplicitOrdering)) {
            return false;
        }
        Objects.requireNonNull((ExplicitOrdering) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
