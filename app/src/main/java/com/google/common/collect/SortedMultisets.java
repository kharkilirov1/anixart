package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.j2objc.annotations.Weak;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

@GwtCompatible
/* loaded from: classes.dex */
final class SortedMultisets {

    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {

        /* renamed from: b */
        @Weak
        public final SortedMultiset<E> f21504b;

        public ElementSet(SortedMultiset<E> sortedMultiset) {
            this.f21504b = sortedMultiset;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return this.f21504b.comparator();
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        /* renamed from: e */
        public Multiset mo11390e() {
            return this.f21504b;
        }

        @Override // java.util.SortedSet
        public E first() {
            Multiset.Entry<E> firstEntry = this.f21504b.firstEntry();
            if (firstEntry != null) {
                return firstEntry.mo11547b();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
            return this.f21504b.mo11529n0(e2, BoundType.OPEN).mo11389l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new Multisets.C17435(this.f21504b.entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public E last() {
            Multiset.Entry<E> lastEntry = this.f21504b.lastEntry();
            if (lastEntry != null) {
                return lastEntry.mo11547b();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
            return this.f21504b.mo11400f1(e2, BoundType.CLOSED, e3, BoundType.OPEN).mo11389l();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
            return this.f21504b.mo11527D0(e2, BoundType.CLOSED).mo11389l();
        }
    }

    @GwtIncompatible
    public static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        public NavigableElementSet(SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            return (E) SortedMultisets.m11899a(this.f21504b.mo11527D0(e2, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new NavigableElementSet(this.f21504b.mo11399R());
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
            return (E) SortedMultisets.m11899a(this.f21504b.mo11529n0(e2, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
            return new NavigableElementSet(this.f21504b.mo11529n0(e2, BoundType.m11424a(z)));
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            return (E) SortedMultisets.m11899a(this.f21504b.mo11527D0(e2, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
            return (E) SortedMultisets.m11899a(this.f21504b.mo11529n0(e2, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) SortedMultisets.m11899a(this.f21504b.pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) SortedMultisets.m11899a(this.f21504b.pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
            return new NavigableElementSet(this.f21504b.mo11400f1(e2, BoundType.m11424a(z), e3, BoundType.m11424a(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
            return new NavigableElementSet(this.f21504b.mo11527D0(e2, BoundType.m11424a(z)));
        }
    }

    /* renamed from: a */
    public static Object m11899a(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.mo11547b();
    }
}
