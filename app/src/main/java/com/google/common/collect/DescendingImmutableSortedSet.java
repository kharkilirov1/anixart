package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.NavigableSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* renamed from: g */
    public final ImmutableSortedSet<E> f20951g;

    public DescendingImmutableSortedSet(ImmutableSortedSet<E> immutableSortedSet) {
        super(Ordering.m11854a(immutableSortedSet.comparator()).mo11416h());
        this.f20951g = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: G */
    public ImmutableSortedSet<E> mo11489G() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    /* renamed from: H */
    public UnmodifiableIterator<E> descendingIterator() {
        return this.f20951g.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: I */
    public ImmutableSortedSet<E> descendingSet() {
        return this.f20951g;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: M */
    public ImmutableSortedSet<E> mo11492M(E e2, boolean z) {
        return this.f20951g.tailSet(e2, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: S */
    public ImmutableSortedSet<E> mo11495S(E e2, boolean z, E e3, boolean z2) {
        return this.f20951g.subSet(e3, z2, e2, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: V */
    public ImmutableSortedSet<E> mo11498V(E e2, boolean z) {
        return this.f20951g.headSet(e2, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e2) {
        return this.f20951g.floor(e2);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return this.f20951g.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public NavigableSet descendingSet() {
        return this.f20951g;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e2) {
        return this.f20951g.ceiling(e2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e2) {
        return this.f20951g.lower(e2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e2) {
        return this.f20951g.higher(e2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return this.f20951g.mo11425r();
    }

    @Override // com.google.common.collect.ImmutableSortedSetFauxverideShim, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return this.f20951g.descendingIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f20951g.size();
    }
}
