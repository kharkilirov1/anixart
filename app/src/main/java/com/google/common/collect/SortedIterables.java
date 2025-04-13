package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;

@GwtCompatible
/* loaded from: classes.dex */
final class SortedIterables {
    /* renamed from: a */
    public static boolean m11895a(Comparator<?> comparator, Iterable<?> iterable) {
        Object comparator2;
        Objects.requireNonNull(comparator);
        Objects.requireNonNull(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.f21382d;
            }
        } else {
            if (!(iterable instanceof SortedIterable)) {
                return false;
            }
            comparator2 = ((SortedIterable) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
