package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;

@GwtIncompatible
/* loaded from: classes.dex */
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    @Beta
    public class StandardDescendingSet extends Sets.DescendingSet<E> {
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    /* renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract NavigableSet<E> mo7455G();

    @Override // java.util.NavigableSet
    public E ceiling(E e2) {
        return mo11329H().ceiling(e2);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return mo11329H().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return mo11329H().descendingSet();
    }

    @Override // java.util.NavigableSet
    public E floor(E e2) {
        return mo11329H().floor(e2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(E e2, boolean z) {
        return mo11329H().headSet(e2, z);
    }

    @Override // java.util.NavigableSet
    public E higher(E e2) {
        return mo11329H().higher(e2);
    }

    @Override // java.util.NavigableSet
    public E lower(E e2) {
        return mo11329H().lower(e2);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return mo11329H().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return mo11329H().pollLast();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        return mo11329H().subSet(e2, z, e3, z2);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(E e2, boolean z) {
        return mo11329H().tailSet(e2, z);
    }
}
