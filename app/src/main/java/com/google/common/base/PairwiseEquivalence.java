package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class PairwiseEquivalence<T> extends Equivalence<Iterable<T>> implements Serializable {
    @Override // com.google.common.base.Equivalence
    /* renamed from: a */
    public boolean mo11151a(Object obj, Object obj2) {
        Iterator<T> it = ((Iterable) obj).iterator();
        Iterator<T> it2 = ((Iterable) obj2).iterator();
        if (!it.hasNext() || !it2.hasNext()) {
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        it.next();
        it2.next();
        throw null;
    }

    @Override // com.google.common.base.Equivalence
    /* renamed from: b */
    public int mo11152b(Object obj) {
        Iterator<T> it = ((Iterable) obj).iterator();
        if (!it.hasNext()) {
            return 78721;
        }
        it.next();
        throw null;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof PairwiseEquivalence)) {
            return false;
        }
        java.util.Objects.requireNonNull((PairwiseEquivalence) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "null.pairwise()";
    }
}
