package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Cut;
import com.google.common.collect.Iterators;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    public final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {

        /* renamed from: b */
        public final Collection<Range<C>> f21624b;

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f21624b;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection<Range<C>> mo11329H() {
            return this.f21624b;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return Sets.m11884b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m11887e(this);
        }
    }

    public final class Complement extends TreeRangeSet<C> {
    }

    public static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: b */
        public final NavigableMap<Cut<C>, Range<C>> f21625b;

        /* renamed from: c */
        public final NavigableMap<Cut<C>, Range<C>> f21626c;

        /* renamed from: d */
        public final Range<Cut<C>> f21627d;

        public ComplementRangesByLowerBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f21625b = navigableMap;
            this.f21626c = new RangesByUpperBound(navigableMap);
            this.f21627d = range;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo11420a() {
            Collection<Range<C>> values;
            if (this.f21627d.m11865d()) {
                values = this.f21626c.tailMap(this.f21627d.m11870i(), this.f21627d.f21404b.mo11513j() == BoundType.CLOSED).values();
            } else {
                values = this.f21626c.values();
            }
            PeekingIterator m11715j = Iterators.m11715j(values.iterator());
            Range<Cut<C>> range = this.f21627d;
            Cut<C> cut = Cut.BelowAll.f20943c;
            if (!range.m11863a(cut) || (m11715j.hasNext() && ((Range) ((Iterators.PeekingImpl) m11715j).peek()).f21404b == cut)) {
                if (!m11715j.hasNext()) {
                    return Iterators.ArrayItr.f21133f;
                }
                cut = ((Range) m11715j.next()).f21405c;
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(cut, m11715j) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1

                /* renamed from: d */
                public Cut<C> f21628d;

                /* renamed from: e */
                public final /* synthetic */ PeekingIterator f21629e;

                {
                    this.f21629e = m11715j;
                    this.f21628d = cut;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    Range range2;
                    if (!ComplementRangesByLowerBound.this.f21627d.f21405c.mo11511h(this.f21628d)) {
                        Cut<C> cut2 = this.f21628d;
                        Cut.AboveAll aboveAll = Cut.AboveAll.f20942c;
                        if (cut2 != aboveAll) {
                            if (this.f21629e.hasNext()) {
                                Range range3 = (Range) this.f21629e.next();
                                range2 = new Range(this.f21628d, range3.f21404b);
                                this.f21628d = range3.f21405c;
                            } else {
                                range2 = new Range(this.f21628d, aboveAll);
                                this.f21628d = aboveAll;
                            }
                            return new ImmutableEntry(range2.f21404b, range2);
                        }
                    }
                    m11333b();
                    return null;
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        /* renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo11392b() {
            Cut<C> higherKey;
            PeekingIterator m11715j = Iterators.m11715j(this.f21626c.headMap(this.f21627d.m11866e() ? this.f21627d.f21405c.mo11509e() : Cut.AboveAll.f20942c, this.f21627d.m11866e() && this.f21627d.f21405c.mo11514k() == BoundType.CLOSED).descendingMap().values().iterator());
            if (m11715j.hasNext()) {
                Iterators.PeekingImpl peekingImpl = (Iterators.PeekingImpl) m11715j;
                higherKey = ((Range) peekingImpl.peek()).f21405c == Cut.AboveAll.f20942c ? ((Range) m11715j.next()).f21404b : this.f21625b.higherKey(((Range) peekingImpl.peek()).f21405c);
            } else {
                Range<Cut<C>> range = this.f21627d;
                Cut.BelowAll belowAll = Cut.BelowAll.f20943c;
                if (!range.m11863a(belowAll) || this.f21625b.containsKey(belowAll)) {
                    return Iterators.ArrayItr.f21133f;
                }
                higherKey = this.f21625b.higherKey(belowAll);
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>((Cut) MoreObjects.m11165a(higherKey, Cut.AboveAll.f20942c), m11715j) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2

                /* renamed from: d */
                public Cut<C> f21631d;

                /* renamed from: e */
                public final /* synthetic */ PeekingIterator f21632e;

                {
                    this.f21632e = m11715j;
                    this.f21631d = r2;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    Cut<C> cut = this.f21631d;
                    Cut.BelowAll belowAll2 = Cut.BelowAll.f20943c;
                    if (cut == belowAll2) {
                        m11333b();
                        return null;
                    }
                    if (this.f21632e.hasNext()) {
                        Range range2 = (Range) this.f21632e.next();
                        Range range3 = new Range(range2.f21405c, this.f21631d);
                        this.f21631d = range2.f21404b;
                        if (ComplementRangesByLowerBound.this.f21627d.f21404b.mo11511h(range3.f21404b)) {
                            return new ImmutableEntry(range3.f21404b, range3);
                        }
                    } else if (ComplementRangesByLowerBound.this.f21627d.f21404b.mo11511h(belowAll2)) {
                        Range range4 = new Range(belowAll2, this.f21631d);
                        this.f21631d = belowAll2;
                        return new ImmutableEntry(belowAll2, range4);
                    }
                    m11333b();
                    return null;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (!(obj instanceof Cut)) {
                return null;
            }
            try {
                Cut cut = (Cut) obj;
                Map.Entry<Cut<C>, Range<C>> firstEntry = m11964d(Range.m11860b(cut, BoundType.m11424a(true))).firstEntry();
                if (firstEntry == null || !firstEntry.getKey().equals(cut)) {
                    return null;
                }
                return firstEntry.getValue();
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return NaturalOrdering.f21382d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> m11964d(Range<Cut<C>> range) {
            if (!this.f21627d.m11868g(range)) {
                return ImmutableSortedMap.f21092h;
            }
            return new ComplementRangesByLowerBound(this.f21625b, range.m11867f(this.f21627d));
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return m11964d(Range.m11862k((Cut) obj, BoundType.m11424a(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.m11719n(mo11420a());
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return m11964d(Range.m11861j((Cut) obj, BoundType.m11424a(z), (Cut) obj2, BoundType.m11424a(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return m11964d(Range.m11860b((Cut) obj, BoundType.m11424a(z)));
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
    }

    public static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: b */
        public final Range<Cut<C>> f21640b;

        /* renamed from: c */
        public final Range<C> f21641c;

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> f21642d;

        /* renamed from: e */
        public final NavigableMap<Cut<C>, Range<C>> f21643e;

        public SubRangeSetRangesByLowerBound(Range<Cut<C>> range, Range<C> range2, NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f21640b = range;
            Objects.requireNonNull(range2);
            this.f21641c = range2;
            Objects.requireNonNull(navigableMap);
            this.f21642d = navigableMap;
            this.f21643e = new RangesByUpperBound(navigableMap);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo11420a() {
            final Iterator<Range<C>> it;
            if (this.f21641c.m11869h()) {
                return Iterators.ArrayItr.f21133f;
            }
            if (this.f21640b.f21405c.mo11511h(this.f21641c.f21404b)) {
                return Iterators.ArrayItr.f21133f;
            }
            if (this.f21640b.f21404b.mo11511h(this.f21641c.f21404b)) {
                it = this.f21643e.tailMap(this.f21641c.f21404b, false).values().iterator();
            } else {
                it = this.f21642d.tailMap(this.f21640b.f21404b.mo11509e(), this.f21640b.f21404b.mo11513j() == BoundType.CLOSED).values().iterator();
            }
            final Cut cut = (Cut) NaturalOrdering.f21382d.mo11857c(this.f21640b.f21405c, new Cut.BelowValue(this.f21641c.f21405c));
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.1
                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    if (!it.hasNext()) {
                        m11333b();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (cut.mo11511h(range.f21404b)) {
                        m11333b();
                        return null;
                    }
                    Range m11867f = range.m11867f(SubRangeSetRangesByLowerBound.this.f21641c);
                    return new ImmutableEntry(m11867f.f21404b, m11867f);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        /* renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo11392b() {
            if (this.f21641c.m11869h()) {
                return Iterators.ArrayItr.f21133f;
            }
            Cut cut = (Cut) NaturalOrdering.f21382d.mo11857c(this.f21640b.f21405c, new Cut.BelowValue(this.f21641c.f21405c));
            final Iterator it = this.f21642d.headMap(cut.mo11509e(), cut.mo11514k() == BoundType.CLOSED).descendingMap().values().iterator();
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.2
                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    if (!it.hasNext()) {
                        m11333b();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (SubRangeSetRangesByLowerBound.this.f21641c.f21404b.compareTo(range.f21405c) >= 0) {
                        m11333b();
                        return null;
                    }
                    Range m11867f = range.m11867f(SubRangeSetRangesByLowerBound.this.f21641c);
                    if (SubRangeSetRangesByLowerBound.this.f21640b.m11863a(m11867f.f21404b)) {
                        return new ImmutableEntry(m11867f.f21404b, m11867f);
                    }
                    m11333b();
                    return null;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@NullableDecl Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f21640b.m11863a(cut) && cut.compareTo(this.f21641c.f21404b) >= 0 && cut.compareTo(this.f21641c.f21405c) < 0) {
                        if (cut.equals(this.f21641c.f21404b)) {
                            Map.Entry<Cut<C>, Range<C>> floorEntry = this.f21642d.floorEntry(cut);
                            Range<C> value = floorEntry == null ? null : floorEntry.getValue();
                            if (value != null && value.f21405c.compareTo(this.f21641c.f21404b) > 0) {
                                return value.m11867f(this.f21641c);
                            }
                        } else {
                            Range range = (Range) this.f21642d.get(cut);
                            if (range != null) {
                                return range.m11867f(this.f21641c);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return NaturalOrdering.f21382d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> m11968d(Range<Cut<C>> range) {
            return !range.m11868g(this.f21640b) ? ImmutableSortedMap.f21092h : new SubRangeSetRangesByLowerBound(this.f21640b.m11867f(range), this.f21641c, this.f21642d);
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return m11968d(Range.m11862k((Cut) obj, BoundType.m11424a(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.m11719n(mo11420a());
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return m11968d(Range.m11861j((Cut) obj, BoundType.m11424a(z), (Cut) obj2, BoundType.m11424a(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return m11968d(Range.m11860b((Cut) obj, BoundType.m11424a(z)));
        }
    }

    @Override // com.google.common.collect.RangeSet
    /* renamed from: a */
    public Set<Range<C>> mo11667a() {
        Objects.requireNonNull(null);
        throw null;
    }

    @VisibleForTesting
    public static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: b */
        public final NavigableMap<Cut<C>, Range<C>> f21634b;

        /* renamed from: c */
        public final Range<Cut<C>> f21635c;

        public RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap) {
            this.f21634b = navigableMap;
            this.f21635c = (Range<Cut<C>>) Range.f21403d;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo11420a() {
            final Iterator<Range<C>> it;
            if (this.f21635c.m11865d()) {
                Map.Entry lowerEntry = this.f21634b.lowerEntry(this.f21635c.m11870i());
                it = lowerEntry == null ? this.f21634b.values().iterator() : this.f21635c.f21404b.mo11511h(((Range) lowerEntry.getValue()).f21405c) ? this.f21634b.tailMap(lowerEntry.getKey(), true).values().iterator() : this.f21634b.tailMap(this.f21635c.m11870i(), true).values().iterator();
            } else {
                it = this.f21634b.values().iterator();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.1
                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    if (!it.hasNext()) {
                        m11333b();
                        return null;
                    }
                    Range range = (Range) it.next();
                    if (!RangesByUpperBound.this.f21635c.f21405c.mo11511h(range.f21405c)) {
                        return new ImmutableEntry(range.f21405c, range);
                    }
                    m11333b();
                    return null;
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        /* renamed from: b */
        public Iterator<Map.Entry<Cut<C>, Range<C>>> mo11392b() {
            final PeekingIterator m11715j = Iterators.m11715j((this.f21635c.m11866e() ? this.f21634b.headMap(this.f21635c.f21405c.mo11509e(), false).descendingMap().values() : this.f21634b.descendingMap().values()).iterator());
            if (m11715j.hasNext() && this.f21635c.f21405c.mo11511h(((Range) ((Iterators.PeekingImpl) m11715j).peek()).f21405c)) {
                m11715j.next();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.2
                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    if (!m11715j.hasNext()) {
                        m11333b();
                        return null;
                    }
                    Range range = (Range) m11715j.next();
                    if (RangesByUpperBound.this.f21635c.f21404b.mo11511h(range.f21405c)) {
                        return new ImmutableEntry(range.f21405c, range);
                    }
                    m11333b();
                    return null;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@NullableDecl Object obj) {
            Map.Entry<Cut<C>, Range<C>> lowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    if (this.f21635c.m11863a(cut) && (lowerEntry = this.f21634b.lowerEntry(cut)) != null && lowerEntry.getValue().f21405c.equals(cut)) {
                        return lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return NaturalOrdering.f21382d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        /* renamed from: d */
        public final NavigableMap<Cut<C>, Range<C>> m11966d(Range<Cut<C>> range) {
            return range.m11868g(this.f21635c) ? new RangesByUpperBound(this.f21634b, range.m11867f(this.f21635c)) : ImmutableSortedMap.f21092h;
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return m11966d(Range.m11862k((Cut) obj, BoundType.m11424a(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f21635c.equals(Range.f21403d) ? this.f21634b.isEmpty() : !((AbstractIterator) mo11420a()).hasNext();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f21635c.equals(Range.f21403d) ? this.f21634b.size() : Iterators.m11719n(mo11420a());
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return m11966d(Range.m11861j((Cut) obj, BoundType.m11424a(z), (Cut) obj2, BoundType.m11424a(z2)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return m11966d(Range.m11860b((Cut) obj, BoundType.m11424a(z)));
        }

        public RangesByUpperBound(NavigableMap<Cut<C>, Range<C>> navigableMap, Range<Cut<C>> range) {
            this.f21634b = navigableMap;
            this.f21635c = range;
        }
    }
}
