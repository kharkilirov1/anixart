package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible
/* loaded from: classes.dex */
public interface SortedMultiset<E> extends SortedMultisetBridge<E>, SortedIterable<E> {
    /* renamed from: D0 */
    SortedMultiset<E> mo11527D0(E e2, BoundType boundType);

    /* renamed from: R */
    SortedMultiset<E> mo11399R();

    Comparator<? super E> comparator();

    @Override // com.google.common.collect.Multiset
    Set<Multiset.Entry<E>> entrySet();

    /* renamed from: f1 */
    SortedMultiset<E> mo11400f1(E e2, BoundType boundType, E e3, BoundType boundType2);

    Multiset.Entry<E> firstEntry();

    @Override // com.google.common.collect.Multiset
    /* renamed from: l */
    NavigableSet<E> mo11389l();

    Multiset.Entry<E> lastEntry();

    /* renamed from: n0 */
    SortedMultiset<E> mo11529n0(E e2, BoundType boundType);

    Multiset.Entry<E> pollFirstEntry();

    Multiset.Entry<E> pollLastEntry();
}
