package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* renamed from: h */
    public static final RegularImmutableSortedSet<Comparable> f21457h;

    /* renamed from: g */
    @VisibleForTesting
    public final transient ImmutableList<E> f21458g;

    static {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        f21457h = new RegularImmutableSortedSet<>(RegularImmutableList.f21423f, NaturalOrdering.f21382d);
    }

    public RegularImmutableSortedSet(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.f21458g = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: G */
    public ImmutableSortedSet<E> mo11489G() {
        Comparator reverseOrder = Collections.reverseOrder(this.f21105e);
        return isEmpty() ? ImmutableSortedSet.m11692J(reverseOrder) : new RegularImmutableSortedSet(this.f21458g.mo11638G(), reverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator<E> descendingIterator() {
        return this.f21458g.mo11638G().listIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: M */
    public ImmutableSortedSet<E> mo11492M(E e2, boolean z) {
        ImmutableList<E> immutableList = this.f21458g;
        Objects.requireNonNull(e2);
        int binarySearch = Collections.binarySearch(immutableList, e2, this.f21105e);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else if (z) {
            binarySearch++;
        }
        return m11879W(0, binarySearch);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: S */
    public ImmutableSortedSet<E> mo11495S(E e2, boolean z, E e3, boolean z2) {
        return m11879W(m11881a0(e2, z), size()).mo11492M(e3, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: V */
    public ImmutableSortedSet<E> mo11498V(E e2, boolean z) {
        return m11879W(m11881a0(e2, z), size());
    }

    /* renamed from: W */
    public RegularImmutableSortedSet<E> m11879W(int i2, int i3) {
        return (i2 == 0 && i3 == size()) ? this : i2 < i3 ? new RegularImmutableSortedSet<>(this.f21458g.subList(i2, i3), this.f21105e) : ImmutableSortedSet.m11692J(this.f21105e);
    }

    /* renamed from: Y */
    public int m11880Y(E e2, boolean z) {
        ImmutableList<E> immutableList = this.f21458g;
        Objects.requireNonNull(e2);
        int binarySearch = Collections.binarySearch(immutableList, e2, this.f21105e);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    /* renamed from: a0 */
    public int m11881a0(E e2, boolean z) {
        ImmutableList<E> immutableList = this.f21458g;
        Objects.requireNonNull(e2);
        int binarySearch = Collections.binarySearch(immutableList, e2, this.f21105e);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* renamed from: b */
    public ImmutableList<E> mo11543b() {
        return this.f21458g;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e2) {
        int m11881a0 = m11881a0(e2, true);
        if (m11881a0 == size()) {
            return null;
        }
        return this.f21458g.get(m11881a0);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f21458g, obj, this.f21105e) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo11389l();
        }
        if (!SortedIterables.m11895a(this.f21105e, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int compare = this.f21105e.compare(next2, next);
                if (compare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (compare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (compare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        return this.f21458g.mo11618d(objArr, i2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: e */
    public Object[] mo11619e() {
        return this.f21458g.mo11619e();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!SortedIterables.m11895a(this.f21105e, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            UnmodifiableIterator<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || this.f21105e.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: f */
    public int mo11620f() {
        return this.f21458g.mo11620f();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f21458g.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e2) {
        int m11880Y = m11880Y(e2, true) - 1;
        if (m11880Y == -1) {
            return null;
        }
        return this.f21458g.get(m11880Y);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: g */
    public int mo11621g() {
        return this.f21458g.mo11621g();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e2) {
        int m11881a0 = m11881a0(e2, false);
        if (m11881a0 == size()) {
            return null;
        }
        return this.f21458g.get(m11881a0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f21458g.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e2) {
        int m11880Y = m11880Y(e2, false) - 1;
        if (m11880Y == -1) {
            return null;
        }
        return this.f21458g.get(m11880Y);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return this.f21458g.mo11425r();
    }

    @Override // com.google.common.collect.ImmutableSortedSetFauxverideShim, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return this.f21458g.listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21458g.size();
    }
}
