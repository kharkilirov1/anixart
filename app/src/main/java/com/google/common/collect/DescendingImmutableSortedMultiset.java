package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: f */
    public final transient ImmutableSortedMultiset<E> f20950f;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f20950f = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet<E> mo11389l() {
        return this.f20950f.mo11389l().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* renamed from: D */
    public ImmutableSortedMultiset<E> mo11529n0(E e2, BoundType boundType) {
        return this.f20950f.mo11527D0(e2, boundType).mo11399R();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: D0 */
    public SortedMultiset mo11527D0(Object obj, BoundType boundType) {
        return this.f20950f.mo11529n0(obj, boundType).mo11399R();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* renamed from: E */
    public ImmutableSortedMultiset<E> mo11527D0(E e2, BoundType boundType) {
        return this.f20950f.mo11529n0(e2, boundType).mo11399R();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: R */
    public SortedMultiset mo11399R() {
        return this.f20950f;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return this.f20950f.lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return this.f20950f.firstEntry();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: n0 */
    public SortedMultiset mo11529n0(Object obj, BoundType boundType) {
        return this.f20950f.mo11527D0(obj, boundType).mo11399R();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return this.f20950f.mo11425r();
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    public int mo11383s0(@NullableDecl Object obj) {
        return this.f20950f.mo11383s0(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.f20950f.size();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* renamed from: y */
    public Multiset.Entry<E> mo11531y(int i2) {
        return this.f20950f.entrySet().mo11543b().mo11638G().get(i2);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* renamed from: z */
    public ImmutableSortedMultiset<E> mo11399R() {
        return this.f20950f;
    }
}
