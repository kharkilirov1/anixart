package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    /* renamed from: d */
    @NullableDecl
    public transient ArrayTable<R, C, V>.RowMap f20858d;

    /* renamed from: com.google.common.collect.ArrayTable$1 */
    public class C16231 extends AbstractIndexedListIterator<Table.Cell<R, C, V>> {

        /* renamed from: d */
        public final /* synthetic */ ArrayTable f20859d;

        @Override // com.google.common.collect.AbstractIndexedListIterator
        /* renamed from: a */
        public Object mo11331a(int i2) {
            ArrayTable arrayTable = this.f20859d;
            Objects.requireNonNull(arrayTable);
            new Tables.AbstractCell<Object, Object, Object>(i2) { // from class: com.google.common.collect.ArrayTable.2
                {
                    throw null;
                }

                @Override // com.google.common.collect.Table.Cell
                /* renamed from: a */
                public Object mo11418a() {
                    Objects.requireNonNull(ArrayTable.this);
                    throw null;
                }

                @Override // com.google.common.collect.Table.Cell
                /* renamed from: b */
                public Object mo11419b() {
                    Objects.requireNonNull(ArrayTable.this);
                    throw null;
                }

                @Override // com.google.common.collect.Table.Cell
                public Object getValue() {
                    Objects.requireNonNull(ArrayTable.this);
                    throw null;
                }
            };
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$3 */
    public class C16253 extends AbstractIndexedListIterator<V> {

        /* renamed from: d */
        public final /* synthetic */ ArrayTable f20861d;

        @Override // com.google.common.collect.AbstractIndexedListIterator
        /* renamed from: a */
        public V mo11331a(int i2) {
            Objects.requireNonNull(this.f20861d);
            throw null;
        }
    }

    public static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {

        /* renamed from: b */
        public final ImmutableMap<K, Integer> f20862b = null;

        public ArrayMap(ImmutableMap immutableMap, C16231 c16231) {
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> mo11420a() {
            return new AbstractIndexedListIterator<Map.Entry<K, V>>(size()) { // from class: com.google.common.collect.ArrayTable.ArrayMap.2
                @Override // com.google.common.collect.AbstractIndexedListIterator
                /* renamed from: a */
                public Object mo11331a(final int i2) {
                    final ArrayMap arrayMap = ArrayMap.this;
                    Preconditions.m11186j(i2, arrayMap.size());
                    return new AbstractMapEntry<Object, Object>() { // from class: com.google.common.collect.ArrayTable.ArrayMap.1
                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public Object getKey() {
                            ArrayMap arrayMap2 = ArrayMap.this;
                            return arrayMap2.f20862b.keySet().mo11543b().get(i2);
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public Object getValue() {
                            return ArrayMap.this.mo11422c(i2);
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public Object setValue(Object obj) {
                            return ArrayMap.this.mo11423d(i2, obj);
                        }
                    };
                }
            };
        }

        /* renamed from: b */
        public abstract String mo11421b();

        @NullableDecl
        /* renamed from: c */
        public abstract V mo11422c(int i2);

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.f20862b.containsKey(obj);
        }

        @NullableDecl
        /* renamed from: d */
        public abstract V mo11423d(int i2, V v);

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            Integer num = this.f20862b.get(obj);
            if (num == null) {
                return null;
            }
            return mo11422c(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f20862b.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f20862b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
            Integer num = this.f20862b.get(k2);
            if (num != null) {
                return mo11423d(num.intValue(), v);
            }
            String mo11421b = mo11421b();
            String valueOf = String.valueOf(k2);
            String valueOf2 = String.valueOf(this.f20862b.keySet());
            StringBuilder m4122u = C0576a.m4122u(valueOf2.length() + valueOf.length() + C0576a.m4106e(mo11421b, 9), mo11421b, " ", valueOf, " not in ");
            m4122u.append(valueOf2);
            throw new IllegalArgumentException(m4122u.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f20862b.size();
        }
    }

    public class Column extends ArrayMap<R, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Column(int i2) {
            super(null, null);
            Objects.requireNonNull(ArrayTable.this);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: b */
        public String mo11421b() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: c */
        public V mo11422c(int i2) {
            Objects.requireNonNull(ArrayTable.this);
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: d */
        public V mo11423d(int i2, V v) {
            Objects.requireNonNull(ArrayTable.this);
            throw null;
        }
    }

    public class ColumnMap extends ArrayMap<C, Map<R, V>> {

        /* renamed from: c */
        public final /* synthetic */ ArrayTable f20867c;

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: b */
        public String mo11421b() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: c */
        public Object mo11422c(int i2) {
            return new Column(i2);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: d */
        public Object mo11423d(int i2, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    public class Row extends ArrayMap<C, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(int i2) {
            super(null, null);
            Objects.requireNonNull(ArrayTable.this);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: b */
        public String mo11421b() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: c */
        public V mo11422c(int i2) {
            Objects.requireNonNull(ArrayTable.this);
            throw null;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: d */
        public V mo11423d(int i2, V v) {
            Objects.requireNonNull(ArrayTable.this);
            throw null;
        }
    }

    public class RowMap extends ArrayMap<R, Map<C, V>> {
        public RowMap(C16231 c16231) {
            super(null, null);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: b */
        public String mo11421b() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: c */
        public Object mo11422c(int i2) {
            return new Row(i2);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* renamed from: d */
        public Object mo11423d(int i2, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: a */
    public Iterator<Table.Cell<R, C, V>> mo11406a() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable
    @DoNotCall
    @Deprecated
    /* renamed from: b */
    public void mo11407b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: c */
    public boolean mo11408c(@NullableDecl Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    /* renamed from: d */
    public Set<Table.Cell<R, C, V>> mo11409d() {
        return super.mo11409d();
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: i */
    public Iterator<V> mo11414i() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        throw null;
    }

    @Override // com.google.common.collect.Table
    /* renamed from: t */
    public Map<R, Map<C, V>> mo11417t() {
        ArrayTable<R, C, V>.RowMap rowMap = this.f20858d;
        if (rowMap != null) {
            return rowMap;
        }
        ArrayTable<R, C, V>.RowMap rowMap2 = new RowMap(null);
        this.f20858d = rowMap2;
        return rowMap2;
    }
}
