package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Cut;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {

    /* renamed from: g */
    public final DiscreteDomain<C> f20939g;

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(NaturalOrdering.f21382d);
        this.f20939g = discreteDomain;
    }

    /* renamed from: W */
    public static <C extends Comparable> ContiguousSet<C> m11488W(Range<C> range, DiscreteDomain<C> discreteDomain) {
        Objects.requireNonNull(range);
        Objects.requireNonNull(discreteDomain);
        try {
            Range<C> m11867f = !range.m11865d() ? range.m11867f(new Range<>(new Cut.BelowValue(discreteDomain.mo11539c()), Cut.AboveAll.f20942c)) : range;
            if (!range.m11866e()) {
                m11867f = m11867f.m11867f(new Range<>(Cut.BelowAll.f20943c, new Cut.AboveValue(discreteDomain.mo11538b())));
            }
            return m11867f.m11869h() || range.f21404b.mo11512i(discreteDomain).compareTo(range.f21405c.mo11510f(discreteDomain)) > 0 ? new EmptyContiguousSet(discreteDomain) : new RegularContiguousSet(m11867f, discreteDomain);
        } catch (NoSuchElementException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: G */
    public ImmutableSortedSet<C> mo11489G() {
        return new DescendingImmutableSortedSet(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: K */
    public ImmutableSortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11492M(comparable, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: L */
    public ImmutableSortedSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11492M(comparable, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: T */
    public ImmutableSortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11498V(comparable, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: U */
    public ImmutableSortedSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11498V(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: Y */
    public abstract ContiguousSet<C> mo11492M(C c2, boolean z);

    /* renamed from: a0 */
    public abstract Range<C> mo11500a0();

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> subSet(C c2, C c3) {
        Objects.requireNonNull(c2);
        Objects.requireNonNull(c3);
        Preconditions.m11178b(comparator().compare(c2, c3) <= 0);
        return mo11495S(c2, true, c3, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> subSet(C c2, boolean z, C c3, boolean z2) {
        Objects.requireNonNull(c2);
        Objects.requireNonNull(c3);
        Preconditions.m11178b(comparator().compare(c2, c3) <= 0);
        return mo11495S(c2, z, c3, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: e0 */
    public abstract ContiguousSet<C> mo11495S(C c2, boolean z, C c3, boolean z2);

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: f0 */
    public abstract ContiguousSet<C> mo11498V(C c2, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public NavigableSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11492M(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSetFauxverideShim, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public NavigableSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11498V(comparable, z);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return mo11500a0().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public SortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11492M(comparable, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        Objects.requireNonNull(comparable);
        return mo11498V(comparable, true);
    }
}
