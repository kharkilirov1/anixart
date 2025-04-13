package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    @Override // com.google.common.collect.ForwardingSet
    /* renamed from: M, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract SortedSet<E> mo11329H();

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return mo7455G().comparator();
    }

    @Override // java.util.SortedSet
    public E first() {
        return mo7455G().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(E e2) {
        return mo7455G().headSet(e2);
    }

    @Override // java.util.SortedSet
    public E last() {
        return mo7455G().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(E e2, E e3) {
        return mo7455G().subSet(e2, e3);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(E e2) {
        return mo7455G().tailSet(e2);
    }
}
