package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {

    /* renamed from: d */
    @GwtTransient
    public final Comparator<? super E> f20850d;

    /* renamed from: e */
    @NullableDecl
    public transient SortedMultiset<E> f20851e;

    public AbstractSortedMultiset() {
        this.f20850d = NaturalOrdering.f21382d;
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: R */
    public SortedMultiset<E> mo11399R() {
        SortedMultiset<E> sortedMultiset = this.f20851e;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        DescendingMultiset<Object> descendingMultiset = new DescendingMultiset<Object>() { // from class: com.google.common.collect.AbstractSortedMultiset.1DescendingMultisetImpl
            @Override // com.google.common.collect.DescendingMultiset
            /* renamed from: L */
            public Iterator<Multiset.Entry<Object>> mo11402L() {
                return AbstractSortedMultiset.this.mo11401r();
            }

            @Override // com.google.common.collect.DescendingMultiset
            /* renamed from: M */
            public SortedMultiset<Object> mo11403M() {
                return AbstractSortedMultiset.this;
            }

            @Override // com.google.common.collect.DescendingMultiset, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Object> iterator() {
                SortedMultiset<E> mo11399R = AbstractSortedMultiset.this.mo11399R();
                return new Multisets.MultisetIteratorImpl(mo11399R, mo11399R.entrySet().iterator());
            }
        };
        this.f20851e = descendingMultiset;
        return descendingMultiset;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: b */
    public Set mo11387b() {
        return new SortedMultisets.NavigableElementSet(this);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return this.f20850d;
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: f1 */
    public SortedMultiset<E> mo11400f1(@NullableDecl E e2, BoundType boundType, @NullableDecl E e3, BoundType boundType2) {
        Objects.requireNonNull(boundType);
        Objects.requireNonNull(boundType2);
        return ((TreeMultiset) ((TreeMultiset) this).mo11527D0(e2, boundType)).mo11529n0(e3, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        Iterator<Multiset.Entry<E>> mo11380g = mo11380g();
        if (mo11380g.hasNext()) {
            return mo11380g.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        Iterator<Multiset.Entry<E>> mo11401r = mo11401r();
        if (mo11401r.hasNext()) {
            return mo11401r.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        Iterator<Multiset.Entry<E>> mo11380g = mo11380g();
        if (!mo11380g.hasNext()) {
            return null;
        }
        Multiset.Entry<E> next = mo11380g.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(next.mo11547b(), next.getCount());
        mo11380g.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        Iterator<Multiset.Entry<E>> mo11401r = mo11401r();
        if (!mo11401r.hasNext()) {
            return null;
        }
        Multiset.Entry<E> next = mo11401r.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(next.mo11547b(), next.getCount());
        mo11401r.remove();
        return immutableEntry;
    }

    /* renamed from: r */
    public abstract Iterator<Multiset.Entry<E>> mo11401r();

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    /* renamed from: l */
    public NavigableSet<E> mo11389l() {
        return (NavigableSet) super.mo11389l();
    }

    public AbstractSortedMultiset(Comparator<? super E> comparator) {
        Objects.requireNonNull(comparator);
        this.f20850d = comparator;
    }
}
