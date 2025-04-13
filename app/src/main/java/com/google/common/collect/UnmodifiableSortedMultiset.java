package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements SortedMultiset<E> {

    /* renamed from: e */
    @NullableDecl
    public transient UnmodifiableSortedMultiset<E> f21657e;

    public UnmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        super(sortedMultiset);
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: D0 */
    public SortedMultiset<E> mo11527D0(E e2, BoundType boundType) {
        return Multisets.m11822b(((SortedMultiset) this.f21377b).mo11527D0(e2, boundType));
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public Object mo7455G() {
        return (SortedMultiset) this.f21377b;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    /* renamed from: H */
    public Collection mo11329H() {
        return (SortedMultiset) this.f21377b;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset
    /* renamed from: K */
    public Multiset mo11329H() {
        return (SortedMultiset) this.f21377b;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    /* renamed from: L */
    public Set mo11823L() {
        return Sets.m11893k(((SortedMultiset) this.f21377b).mo11389l());
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: R */
    public SortedMultiset<E> mo11399R() {
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset = this.f21657e;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset<E> unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset<>(((SortedMultiset) this.f21377b).mo11399R());
        unmodifiableSortedMultiset2.f21657e = this;
        this.f21657e = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return ((SortedMultiset) this.f21377b).comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: f1 */
    public SortedMultiset<E> mo11400f1(E e2, BoundType boundType, E e3, BoundType boundType2) {
        return Multisets.m11822b(((SortedMultiset) this.f21377b).mo11400f1(e2, boundType, e3, boundType2));
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return ((SortedMultiset) this.f21377b).firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return ((SortedMultiset) this.f21377b).lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: n0 */
    public SortedMultiset<E> mo11529n0(E e2, BoundType boundType) {
        return Multisets.m11822b(((SortedMultiset) this.f21377b).mo11529n0(e2, boundType));
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    /* renamed from: l */
    public NavigableSet<E> mo11389l() {
        return (NavigableSet) super.mo11389l();
    }
}
