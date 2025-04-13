package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultisets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    /* renamed from: b */
    @NullableDecl
    public transient Comparator<? super E> f20952b;

    /* renamed from: c */
    @NullableDecl
    public transient NavigableSet<E> f20953c;

    /* renamed from: d */
    @NullableDecl
    public transient Set<Multiset.Entry<E>> f20954d;

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: D0 */
    public SortedMultiset<E> mo11527D0(E e2, BoundType boundType) {
        return mo11403M().mo11529n0(e2, boundType).mo11399R();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public Object mo11329H() {
        return mo11403M();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    /* renamed from: H */
    public Collection mo11329H() {
        return mo11403M();
    }

    @Override // com.google.common.collect.ForwardingMultiset
    /* renamed from: K */
    public Multiset<E> mo11329H() {
        return mo11403M();
    }

    /* renamed from: L */
    public abstract Iterator<Multiset.Entry<E>> mo11402L();

    /* renamed from: M */
    public abstract SortedMultiset<E> mo11403M();

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: R */
    public SortedMultiset<E> mo11399R() {
        return mo11403M();
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f20952b;
        if (comparator != null) {
            return comparator;
        }
        Ordering mo11416h = Ordering.m11854a(mo11403M().comparator()).mo11416h();
        this.f20952b = mo11416h;
        return mo11416h;
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.f20954d;
        if (set != null) {
            return set;
        }
        Multisets.EntrySet<Object> entrySet = new Multisets.EntrySet<Object>() { // from class: com.google.common.collect.DescendingMultiset.1EntrySetImpl
            @Override // com.google.common.collect.Multisets.EntrySet
            /* renamed from: e */
            public Multiset<Object> mo11391e() {
                return DescendingMultiset.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Multiset.Entry<Object>> iterator() {
                return DescendingMultiset.this.mo11402L();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DescendingMultiset.this.mo11403M().entrySet().size();
            }
        };
        this.f20954d = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: f1 */
    public SortedMultiset<E> mo11400f1(E e2, BoundType boundType, E e3, BoundType boundType2) {
        return mo11403M().mo11400f1(e3, boundType2, e2, boundType).mo11399R();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return mo11403M().lastEntry();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new Multisets.MultisetIteratorImpl(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return mo11403M().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: n0 */
    public SortedMultiset<E> mo11529n0(E e2, BoundType boundType) {
        return mo11403M().mo11527D0(e2, boundType).mo11399R();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        return mo11403M().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        return mo11403M().pollFirstEntry();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return m11559I();
    }

    @Override // com.google.common.collect.ForwardingObject
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    /* renamed from: l */
    public NavigableSet<E> mo11389l() {
        NavigableSet<E> navigableSet = this.f20953c;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets.NavigableElementSet navigableElementSet = new SortedMultisets.NavigableElementSet(this);
        this.f20953c = navigableElementSet;
        return navigableElementSet;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.m11830d(this, tArr);
    }
}
