package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Cut;
import com.google.common.collect.Iterators;
import com.google.common.collect.Range;
import com.google.common.collect.SortedLists;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes.dex */
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    /* renamed from: c */
    public static final ImmutableRangeSet<Comparable<?>> f21072c;

    /* renamed from: b */
    public final transient ImmutableList<Range<C>> f21073b;

    public final class AsSet extends ImmutableSortedSet<C> {

        /* renamed from: g */
        public final DiscreteDomain<C> f21078g;

        /* renamed from: h */
        @NullableDecl
        public transient Integer f21079h;

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$1 */
        public class C16641 extends AbstractIterator<C> {

            /* renamed from: d */
            public final Iterator<Range<C>> f21081d;

            /* renamed from: e */
            public Iterator<C> f21082e = Iterators.ArrayItr.f21133f;

            public C16641() {
                this.f21081d = ImmutableRangeSet.this.f21073b.listIterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                while (!this.f21082e.hasNext()) {
                    if (!this.f21081d.hasNext()) {
                        m11333b();
                        return null;
                    }
                    this.f21082e = ContiguousSet.m11488W(this.f21081d.next(), AsSet.this.f21078g).iterator();
                }
                return this.f21082e.next();
            }
        }

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$2 */
        public class C16652 extends AbstractIterator<C> {

            /* renamed from: d */
            public final Iterator<Range<C>> f21084d;

            /* renamed from: e */
            public Iterator<C> f21085e = Iterators.ArrayItr.f21133f;

            public C16652() {
                this.f21084d = ImmutableRangeSet.this.f21073b.mo11638G().listIterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                while (!this.f21085e.hasNext()) {
                    if (!this.f21084d.hasNext()) {
                        m11333b();
                        return null;
                    }
                    this.f21085e = ContiguousSet.m11488W(this.f21084d.next(), AsSet.this.f21078g).descendingIterator();
                }
                return this.f21085e.next();
            }
        }

        public AsSet(DiscreteDomain<C> discreteDomain) {
            super(NaturalOrdering.f21382d);
            this.f21078g = discreteDomain;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: G */
        public ImmutableSortedSet<C> mo11489G() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        @GwtIncompatible
        /* renamed from: H */
        public UnmodifiableIterator<C> descendingIterator() {
            return new C16652();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: M */
        public ImmutableSortedSet mo11492M(Object obj, boolean z) {
            return m11670W(Range.m11862k((Comparable) obj, BoundType.m11424a(z)));
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: S */
        public ImmutableSortedSet mo11495S(Object obj, boolean z, Object obj2, boolean z2) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            if (!z && !z2) {
                Range<Comparable> range = Range.f21403d;
                if (comparable.compareTo(comparable2) == 0) {
                    return RegularImmutableSortedSet.f21457h;
                }
            }
            return m11670W(Range.m11861j(comparable, BoundType.m11424a(z), comparable2, BoundType.m11424a(z2)));
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: V */
        public ImmutableSortedSet mo11498V(Object obj, boolean z) {
            return m11670W(Range.m11860b((Comparable) obj, BoundType.m11424a(z)));
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
        /* renamed from: W */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.common.collect.ImmutableSortedSet<C> m11670W(final com.google.common.collect.Range<C> r11) {
            /*
                Method dump skipped, instructions count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableRangeSet.AsSet.m11670W(com.google.common.collect.Range):com.google.common.collect.ImmutableSortedSet");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.m11668b((Comparable) obj) != null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible
        public Iterator descendingIterator() {
            return new C16652();
        }

        @Override // com.google.common.collect.ImmutableSortedSetFauxverideShim, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public Iterator iterator() {
            return new C16641();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return ImmutableRangeSet.this.f21073b.mo11425r();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: s */
        public UnmodifiableIterator<C> iterator() {
            return new C16641();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer num = this.f21079h;
            if (num == null) {
                long j2 = 0;
                UnmodifiableListIterator<Range<C>> listIterator = ImmutableRangeSet.this.f21073b.listIterator();
                while (listIterator.hasNext()) {
                    j2 += ContiguousSet.m11488W(listIterator.next(), this.f21078g).size();
                    if (j2 >= ParserMinimalBase.MAX_INT_L) {
                        break;
                    }
                }
                num = Integer.valueOf(Ints.m12084f(j2));
                this.f21079h = num;
            }
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.f21073b.toString();
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
    }

    public static class Builder<C extends Comparable<?>> {
        public Builder() {
            new ArrayList();
        }
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        @Override // java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, 0);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
    }

    static {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        f21072c = new ImmutableRangeSet<>(RegularImmutableList.f21423f);
        ImmutableList.m11628E(Range.f21403d);
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.f21073b = immutableList;
    }

    @Override // com.google.common.collect.RangeSet
    /* renamed from: a */
    public Set mo11667a() {
        if (this.f21073b.isEmpty()) {
            int i2 = ImmutableSet.f21087d;
            return RegularImmutableSet.f21445j;
        }
        ImmutableList<Range<C>> immutableList = this.f21073b;
        Range<Comparable> range = Range.f21403d;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.f21408b);
    }

    /* renamed from: b */
    public Range<C> m11668b(C c2) {
        ImmutableList<Range<C>> immutableList = this.f21073b;
        Range<Comparable> range = Range.f21403d;
        int m11896a = SortedLists.m11896a(immutableList, Range.LowerBoundFn.f21407b, new Cut.BelowValue(c2), NaturalOrdering.f21382d, SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (m11896a == -1) {
            return null;
        }
        Range<C> range2 = this.f21073b.get(m11896a);
        if (range2.m11863a(c2)) {
            return range2;
        }
        return null;
    }

    /* renamed from: c */
    public Range<C> m11669c() {
        if (this.f21073b.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new Range<>(this.f21073b.get(0).f21404b, this.f21073b.get(r1.size() - 1).f21405c);
    }
}
