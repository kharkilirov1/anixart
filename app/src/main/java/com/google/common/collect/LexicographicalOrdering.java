package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class LexicographicalOrdering<T> extends Ordering<Iterable<T>> implements Serializable {
    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Iterator<T> it = ((Iterable) obj).iterator();
        Iterator<T> it2 = ((Iterable) obj2).iterator();
        if (!it.hasNext()) {
            return it2.hasNext() ? -1 : 0;
        }
        if (!it2.hasNext()) {
            return 1;
        }
        it.next();
        it2.next();
        throw null;
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LexicographicalOrdering)) {
            return false;
        }
        Objects.requireNonNull((LexicographicalOrdering) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "null.lexicographical()";
    }
}
