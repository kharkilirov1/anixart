package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Iterators;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    @GwtIncompatible
    public static final class SerializedForm<C extends Comparable> implements Serializable {
    }

    public EmptyContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: G */
    public ImmutableSortedSet<C> mo11489G() {
        return ImmutableSortedSet.m11692J(ReverseNaturalOrdering.f21461b);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: H */
    public UnmodifiableIterator<C> descendingIterator() {
        return Iterators.ArrayItr.f21133f;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: M */
    public ImmutableSortedSet mo11492M(Object obj, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: S */
    public ImmutableSortedSet mo11495S(Object obj, boolean z, Object obj2, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: V */
    public ImmutableSortedSet mo11498V(Object obj, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* renamed from: Y */
    public ContiguousSet<C> mo11492M(C c2, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* renamed from: a0 */
    public Range<C> mo11500a0() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* renamed from: b */
    public ImmutableList<C> mo11543b() {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        return (ImmutableList<C>) RegularImmutableList.f21423f;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public Iterator descendingIterator() {
        return Iterators.ArrayItr.f21133f;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* renamed from: e0 */
    public ContiguousSet<C> mo11495S(C c2, boolean z, C c3, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* renamed from: f0 */
    public ContiguousSet<C> mo11498V(C c2, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public Object first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSetFauxverideShim, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return Iterators.ArrayItr.f21133f;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public Object last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: s */
    public UnmodifiableIterator<C> iterator() {
        return Iterators.ArrayItr.f21133f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
