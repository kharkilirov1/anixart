package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
/* loaded from: classes.dex */
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* renamed from: j */
    public static final long[] f21451j = {0};

    /* renamed from: k */
    public static final ImmutableSortedMultiset<Comparable> f21452k = new RegularImmutableSortedMultiset(NaturalOrdering.f21382d);

    /* renamed from: f */
    @VisibleForTesting
    public final transient RegularImmutableSortedSet<E> f21453f;

    /* renamed from: g */
    public final transient long[] f21454g;

    /* renamed from: h */
    public final transient int f21455h;

    /* renamed from: i */
    public final transient int f21456i;

    public RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.f21453f = ImmutableSortedSet.m11692J(comparator);
        this.f21454g = f21451j;
        this.f21455h = 0;
        this.f21456i = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* renamed from: A */
    public ImmutableSortedSet<E> mo11389l() {
        return this.f21453f;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> mo11529n0(E e2, BoundType boundType) {
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.f21453f;
        Objects.requireNonNull(boundType);
        return m11878F(0, regularImmutableSortedSet.m11880Y(e2, boundType == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset<E> mo11527D0(E e2, BoundType boundType) {
        RegularImmutableSortedSet<E> regularImmutableSortedSet = this.f21453f;
        Objects.requireNonNull(boundType);
        return m11878F(regularImmutableSortedSet.m11881a0(e2, boundType == BoundType.CLOSED), this.f21456i);
    }

    /* renamed from: F */
    public ImmutableSortedMultiset<E> m11878F(int i2, int i3) {
        Preconditions.m11190n(i2, i3, this.f21456i);
        return i2 == i3 ? ImmutableSortedMultiset.m11688C(comparator()) : (i2 == 0 && i3 == this.f21456i) ? this : new RegularImmutableSortedMultiset(this.f21453f.m11879W(i2, i3), this.f21454g, this.f21455h + i2, i3 - i2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return mo11531y(0);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: l */
    public NavigableSet mo11389l() {
        return this.f21453f;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return mo11531y(this.f21456i - 1);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return this.f21455h > 0 || this.f21456i < this.f21454g.length - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0010, code lost:
    
        if (r7 >= 0) goto L9;
     */
    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo11383s0(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7) {
        /*
            r6 = this;
            com.google.common.collect.RegularImmutableSortedSet<E> r0 = r6.f21453f
            java.util.Objects.requireNonNull(r0)
            if (r7 != 0) goto L8
            goto L13
        L8:
            com.google.common.collect.ImmutableList<E> r1 = r0.f21458g     // Catch: java.lang.ClassCastException -> L13
            java.util.Comparator<? super E> r0 = r0.f21105e     // Catch: java.lang.ClassCastException -> L13
            int r7 = java.util.Collections.binarySearch(r1, r7, r0)     // Catch: java.lang.ClassCastException -> L13
            if (r7 < 0) goto L13
            goto L14
        L13:
            r7 = -1
        L14:
            if (r7 < 0) goto L24
            long[] r0 = r6.f21454g
            int r1 = r6.f21455h
            int r1 = r1 + r7
            int r7 = r1 + 1
            r2 = r0[r7]
            r4 = r0[r1]
            long r2 = r2 - r4
            int r7 = (int) r2
            goto L25
        L24:
            r7 = 0
        L25:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedMultiset.mo11383s0(java.lang.Object):int");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.f21454g;
        int i2 = this.f21455h;
        return Ints.m12084f(jArr[this.f21456i + i2] - jArr[i2]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* renamed from: u */
    public ImmutableSet mo11389l() {
        return this.f21453f;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* renamed from: y */
    public Multiset.Entry<E> mo11531y(int i2) {
        E e2 = this.f21453f.f21458g.get(i2);
        long[] jArr = this.f21454g;
        int i3 = this.f21455h + i2;
        return new Multisets.ImmutableEntry(e2, (int) (jArr[i3 + 1] - jArr[i3]));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: l */
    public Set mo11389l() {
        return this.f21453f;
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i2, int i3) {
        this.f21453f = regularImmutableSortedSet;
        this.f21454g = jArr;
        this.f21455h = i2;
        this.f21456i = i3;
    }
}
