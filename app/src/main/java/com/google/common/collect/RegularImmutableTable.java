package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: com.google.common.collect.RegularImmutableTable$1 */
    class C17531 implements Comparator<Table.Cell<Object, Object, Object>> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Table.Cell<Object, Object, Object> cell, Table.Cell<Object, Object, Object> cell2) {
            return 0;
        }
    }

    public final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        public CellSet(C17531 c17531) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            V mo11412g = RegularImmutableTable.this.mo11412g(cell.mo11419b(), cell.mo11418a());
            return mo11412g != null && mo11412g.equals(cell.getValue());
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public Object get(int i2) {
            return RegularImmutableTable.this.mo11518n(i2);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    public final class Values extends ImmutableList<V> {
        public Values(C17531 c17531) {
        }

        @Override // java.util.List
        public V get(int i2) {
            return (V) RegularImmutableTable.this.mo11519o(i2);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return RegularImmutableTable.this.size();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: k */
    public final ImmutableSet<Table.Cell<R, C, V>> mo11410e() {
        if (!(size() == 0)) {
            return new CellSet(null);
        }
        int i2 = ImmutableSet.f21087d;
        return RegularImmutableSet.f21445j;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: l */
    public final ImmutableCollection<V> mo11411f() {
        if (!(size() == 0)) {
            return new Values(null);
        }
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        return RegularImmutableList.f21423f;
    }

    /* renamed from: n */
    public abstract Table.Cell<R, C, V> mo11518n(int i2);

    /* renamed from: o */
    public abstract V mo11519o(int i2);

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    /* renamed from: t */
    public /* bridge */ /* synthetic */ Map mo11417t() {
        return mo11417t();
    }
}
