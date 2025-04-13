package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    /* renamed from: i */
    public static final /* synthetic */ int f21410i = 0;

    /* renamed from: h */
    public final Range<C> f21411h;

    @GwtIncompatible
    public static final class SerializedForm<C extends Comparable> implements Serializable {
    }

    public RegularContiguousSet(Range<C> range, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.f21411h = range;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* renamed from: H */
    public UnmodifiableIterator<C> descendingIterator() {
        return new AbstractSequentialIterator<C>(last()) { // from class: com.google.common.collect.RegularContiguousSet.2

            /* renamed from: c */
            public final C f21414c;

            {
                this.f21414c = (C) RegularContiguousSet.this.first();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
            @Override // com.google.common.collect.AbstractSequentialIterator
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object mo11273a(java.lang.Object r3) {
                /*
                    r2 = this;
                    java.lang.Comparable r3 = (java.lang.Comparable) r3
                    C extends java.lang.Comparable r0 = r2.f21414c
                    int r1 = com.google.common.collect.RegularContiguousSet.f21410i
                    if (r0 == 0) goto L12
                    com.google.common.collect.Range<java.lang.Comparable> r1 = com.google.common.collect.Range.f21403d
                    int r0 = r3.compareTo(r0)
                    if (r0 != 0) goto L12
                    r0 = 1
                    goto L13
                L12:
                    r0 = 0
                L13:
                    if (r0 == 0) goto L17
                    r3 = 0
                    goto L1f
                L17:
                    com.google.common.collect.RegularContiguousSet r0 = com.google.common.collect.RegularContiguousSet.this
                    com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r0.f20939g
                    java.lang.Comparable r3 = r0.mo11542f(r3)
                L1f:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularContiguousSet.C17492.mo11273a(java.lang.Object):java.lang.Object");
            }
        };
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> mo11492M(C c2, boolean z) {
        return m11872h0(Range.m11862k(c2, BoundType.m11424a(z)));
    }

    @Override // com.google.common.collect.ContiguousSet
    /* renamed from: a0 */
    public Range<C> mo11500a0() {
        BoundType boundType = BoundType.CLOSED;
        return new Range<>(this.f21411h.f21404b.mo11515l(boundType, this.f20939g), this.f21411h.f21405c.mo11516m(boundType, this.f20939g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f21411h.m11863a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return Collections2.m11431b(this, collection);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> mo11495S(C c2, boolean z, C c3, boolean z2) {
        return (c2.compareTo(c3) != 0 || z || z2) ? m11872h0(Range.m11861j(c2, BoundType.m11424a(z), c3, BoundType.m11424a(z2))) : new EmptyContiguousSet(this.f20939g);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.f20939g.equals(regularContiguousSet.f20939g)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public ContiguousSet<C> mo11498V(C c2, boolean z) {
        return m11872h0(Range.m11860b(c2, BoundType.m11424a(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C first() {
        return this.f21411h.f21404b.mo11512i(this.f20939g);
    }

    /* renamed from: h0 */
    public final ContiguousSet<C> m11872h0(Range<C> range) {
        return this.f21411h.m11868g(range) ? ContiguousSet.m11488W(this.f21411h.m11867f(range), this.f20939g) : new EmptyContiguousSet(this.f20939g);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.m11887e(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public C last() {
        return this.f21411h.f21405c.mo11510f(this.f20939g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: s */
    public UnmodifiableIterator<C> iterator() {
        return new AbstractSequentialIterator<C>(first()) { // from class: com.google.common.collect.RegularContiguousSet.1

            /* renamed from: c */
            public final C f21412c;

            {
                this.f21412c = (C) RegularContiguousSet.this.last();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
            @Override // com.google.common.collect.AbstractSequentialIterator
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object mo11273a(java.lang.Object r3) {
                /*
                    r2 = this;
                    java.lang.Comparable r3 = (java.lang.Comparable) r3
                    C extends java.lang.Comparable r0 = r2.f21412c
                    int r1 = com.google.common.collect.RegularContiguousSet.f21410i
                    if (r0 == 0) goto L12
                    com.google.common.collect.Range<java.lang.Comparable> r1 = com.google.common.collect.Range.f21403d
                    int r0 = r3.compareTo(r0)
                    if (r0 != 0) goto L12
                    r0 = 1
                    goto L13
                L12:
                    r0 = 0
                L13:
                    if (r0 == 0) goto L17
                    r3 = 0
                    goto L1f
                L17:
                    com.google.common.collect.RegularContiguousSet r0 = com.google.common.collect.RegularContiguousSet.this
                    com.google.common.collect.DiscreteDomain<C extends java.lang.Comparable> r0 = r0.f20939g
                    java.lang.Comparable r3 = r0.mo11540d(r3)
                L1f:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularContiguousSet.C17481.mo11273a(java.lang.Object):java.lang.Object");
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long mo11537a = this.f20939g.mo11537a(first(), last());
        if (mo11537a >= ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        return ((int) mo11537a) + 1;
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: z */
    public ImmutableList<C> mo11658z() {
        return this.f20939g.f20956b ? new ImmutableAsList<C>() { // from class: com.google.common.collect.RegularContiguousSet.3
            @Override // com.google.common.collect.ImmutableAsList
            /* renamed from: J */
            public ImmutableCollection mo11608J() {
                return RegularContiguousSet.this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Object get(int i2) {
                Preconditions.m11186j(i2, size());
                RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                return regularContiguousSet.f20939g.mo11541e(regularContiguousSet.first(), i2);
            }
        } : ImmutableList.m11631t(toArray());
    }
}
