package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@GwtCompatible
/* loaded from: classes.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {

    public class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        public RowSortedMap(C17721 c17721) {
            super();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set mo11360b() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return ((SortedMap) StandardRowSortedTable.this.f21510d).comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) ((SortedMap) StandardRowSortedTable.this.f21510d).firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
            Objects.requireNonNull(r);
            return new StandardRowSortedTable(((SortedMap) StandardRowSortedTable.this.f21510d).headMap(r), StandardRowSortedTable.this.f21511e).mo11417t();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set mo11362g() {
            return (SortedSet) super.mo11362g();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) ((SortedMap) StandardRowSortedTable.this.f21510d).lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            Objects.requireNonNull(r);
            Objects.requireNonNull(r2);
            return new StandardRowSortedTable(((SortedMap) StandardRowSortedTable.this.f21510d).subMap(r, r2), StandardRowSortedTable.this.f21511e).mo11417t();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
            Objects.requireNonNull(r);
            return new StandardRowSortedTable(((SortedMap) StandardRowSortedTable.this.f21510d).tailMap(r), StandardRowSortedTable.this.f21511e).mo11417t();
        }
    }

    public StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, Supplier<? extends Map<C, V>> supplier) {
        super(sortedMap, supplier);
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: p */
    public Map mo11900p() {
        return new RowSortedMap(null);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public SortedMap<R, Map<C, V>> mo11417t() {
        return (SortedMap) super.mo11417t();
    }
}
