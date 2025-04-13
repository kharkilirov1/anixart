package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    /* renamed from: d */
    @GwtTransient
    public final Map<R, Map<C, V>> f21510d;

    /* renamed from: e */
    @GwtTransient
    public final Supplier<? extends Map<C, V>> f21511e;

    /* renamed from: f */
    @NullableDecl
    public transient Set<C> f21512f;

    /* renamed from: g */
    @NullableDecl
    public transient Map<R, Map<C, V>> f21513g;

    public class CellIterator implements Iterator<Table.Cell<R, C, V>> {

        /* renamed from: b */
        public final Iterator<Map.Entry<R, Map<C, V>>> f21514b;

        /* renamed from: c */
        @NullableDecl
        public Map.Entry<R, Map<C, V>> f21515c;

        /* renamed from: d */
        public Iterator<Map.Entry<C, V>> f21516d = Iterators.EmptyModifiableIterator.INSTANCE;

        public CellIterator(StandardTable standardTable, C17731 c17731) {
            this.f21514b = standardTable.f21510d.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21514b.hasNext() || this.f21516d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f21516d.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f21514b.next();
                this.f21515c = next;
                this.f21516d = next.getValue().entrySet().iterator();
            }
            Map.Entry<C, V> next2 = this.f21516d.next();
            return new Tables.ImmutableCell(this.f21515c.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f21516d.remove();
            if (this.f21515c.getValue().isEmpty()) {
                this.f21514b.remove();
                this.f21515c = null;
            }
        }
    }

    public class Column extends Maps.ViewCachingAbstractMap<R, V> {

        /* renamed from: e */
        public final C f21517e;

        public class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            public EntrySet(C17731 c17731) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                Column.this.m11907d(Predicates.m11197b());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                StandardTable standardTable = StandardTable.this;
                Object key = entry.getKey();
                C c2 = Column.this.f21517e;
                Object value = entry.getValue();
                Objects.requireNonNull(standardTable);
                return value != null && value.equals(standardTable.mo11412g(key, c2));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                Column column = Column.this;
                return !StandardTable.this.mo11580m(column.f21517e);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return Column.this.new EntrySetIterator(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                StandardTable standardTable = StandardTable.this;
                Object key = entry.getKey();
                C c2 = Column.this.f21517e;
                Object value = entry.getValue();
                Objects.requireNonNull(standardTable);
                if (!(value != null && value.equals(standardTable.mo11412g(key, c2)))) {
                    return false;
                }
                standardTable.mo11582r(key, c2);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return Column.this.m11907d(Predicates.m11203h(Predicates.m11201f(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = StandardTable.this.f21510d.values().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(Column.this.f21517e)) {
                        i2++;
                    }
                }
                return i2;
            }
        }

        public class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {

            /* renamed from: d */
            public final Iterator<Map.Entry<R, Map<C, V>>> f21520d;

            public EntrySetIterator(C17731 c17731) {
                this.f21520d = StandardTable.this.f21510d.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                while (this.f21520d.hasNext()) {
                    final Map.Entry<R, Map<C, V>> next = this.f21520d.next();
                    if (next.getValue().containsKey(Column.this.f21517e)) {
                        return new AbstractMapEntry<Object, Object>() { // from class: com.google.common.collect.StandardTable.Column.EntrySetIterator.1EntryImpl
                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public Object getKey() {
                                return next.getKey();
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public Object getValue() {
                                return ((Map) next.getValue()).get(Column.this.f21517e);
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public Object setValue(Object obj) {
                                Map map = (Map) next.getValue();
                                C c2 = Column.this.f21517e;
                                Objects.requireNonNull(obj);
                                return map.put(c2, obj);
                            }
                        };
                    }
                }
                m11333b();
                return null;
            }
        }

        public class KeySet extends Maps.KeySet<R, V> {
            public KeySet() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                Column column = Column.this;
                return StandardTable.this.mo11579l(obj, column.f21517e);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                Column column = Column.this;
                return StandardTable.this.mo11582r(obj, column.f21517e) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return Column.this.m11907d(Predicates.m11199d(Predicates.m11203h(Predicates.m11201f(collection)), Maps.EntryFunction.KEY));
            }
        }

        public class Values extends Maps.Values<R, V> {
            public Values() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && Column.this.m11907d(Predicates.m11199d(Predicates.m11200e(obj), Maps.EntryFunction.VALUE));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return Column.this.m11907d(Predicates.m11199d(Predicates.m11201f(collection), Maps.EntryFunction.VALUE));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return Column.this.m11907d(Predicates.m11199d(Predicates.m11203h(Predicates.m11201f(collection)), Maps.EntryFunction.VALUE));
            }
        }

        public Column(C c2) {
            Objects.requireNonNull(c2);
            this.f21517e = c2;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<R, V>> mo11357a() {
            return new EntrySet(null);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: b */
        public Set<R> mo11360b() {
            return new KeySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: c */
        public Collection<V> mo11551c() {
            return new Values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.mo11579l(obj, this.f21517e);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public boolean m11907d(Predicate<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.f21510d.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.f21517e);
                if (v != null && predicate.apply(new ImmutableEntry(next.getKey(), v))) {
                    value.remove(this.f21517e);
                    z = true;
                    if (value.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return (V) StandardTable.this.mo11412g(obj, this.f21517e);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r, V v) {
            return (V) StandardTable.this.m11905q(r, this.f21517e, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) StandardTable.this.mo11582r(obj, this.f21517e);
        }
    }

    public class ColumnKeyIterator extends AbstractIterator<C> {

        /* renamed from: d */
        public final Map<C, V> f21526d;

        /* renamed from: e */
        public final Iterator<Map<C, V>> f21527e;

        /* renamed from: f */
        public Iterator<Map.Entry<C, V>> f21528f = Iterators.ArrayItr.f21133f;

        public ColumnKeyIterator(StandardTable standardTable, C17731 c17731) {
            this.f21526d = standardTable.f21511e.get();
            this.f21527e = standardTable.f21510d.values().iterator();
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public C mo11332a() {
            while (true) {
                if (this.f21528f.hasNext()) {
                    Map.Entry<C, V> next = this.f21528f.next();
                    if (!this.f21526d.containsKey(next.getKey())) {
                        this.f21526d.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.f21527e.hasNext()) {
                        m11333b();
                        return null;
                    }
                    this.f21528f = this.f21527e.next().entrySet().iterator();
                }
            }
        }
    }

    public class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        public ColumnKeySet(C17731 c17731) {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return StandardTable.this.mo11580m(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return StandardTable.this.mo11904o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.f21510d.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            boolean z = false;
            Iterator<Map<C, V>> it = StandardTable.this.f21510d.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (Iterators.m11717l(next.keySet().iterator(), collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            boolean z = false;
            Iterator<Map<C, V>> it = StandardTable.this.f21510d.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.m11719n(iterator());
        }
    }

    public class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {

        /* renamed from: e */
        public final /* synthetic */ StandardTable f21530e;

        public class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            public ColumnMapEntrySet() {
                super(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!ColumnMap.this.f21530e.mo11580m(entry.getKey())) {
                    return false;
                }
                return ColumnMap.this.get(entry.getKey()).equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                Set<C> m11903k = ColumnMap.this.f21530e.m11903k();
                return new Maps.C17103(m11903k.iterator(), new Function<C, Map<R, V>>() { // from class: com.google.common.collect.StandardTable.ColumnMap.ColumnMapEntrySet.1
                    @Override // com.google.common.base.Function
                    public Object apply(Object obj) {
                        StandardTable standardTable = ColumnMap.this.f21530e;
                        Objects.requireNonNull(standardTable);
                        return new Column(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                StandardTable.m11902j(ColumnMap.this.f21530e, ((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                Objects.requireNonNull(collection);
                return Sets.m11892j(this, collection.iterator());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                Objects.requireNonNull(collection);
                boolean z = false;
                Iterator it = Lists.m11736c(ColumnMap.this.f21530e.m11903k().iterator()).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    StandardTable standardTable = ColumnMap.this.f21530e;
                    Objects.requireNonNull(standardTable);
                    if (!collection.contains(new ImmutableEntry(next, new Column(next)))) {
                        StandardTable.m11902j(ColumnMap.this.f21530e, next);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ColumnMap.this.f21530e.m11903k().size();
            }
        }

        public class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            public ColumnMapValues() {
                super(ColumnMap.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : ColumnMap.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        StandardTable.m11902j(ColumnMap.this.f21530e, entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                Objects.requireNonNull(collection);
                boolean z = false;
                Iterator it = Lists.m11736c(ColumnMap.this.f21530e.m11903k().iterator()).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    StandardTable standardTable = ColumnMap.this.f21530e;
                    Objects.requireNonNull(standardTable);
                    if (collection.contains(new Column(next))) {
                        StandardTable.m11902j(ColumnMap.this.f21530e, next);
                        z = true;
                    }
                }
                return z;
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                Objects.requireNonNull(collection);
                boolean z = false;
                Iterator it = Lists.m11736c(ColumnMap.this.f21530e.m11903k().iterator()).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    StandardTable standardTable = ColumnMap.this.f21530e;
                    Objects.requireNonNull(standardTable);
                    if (!collection.contains(new Column(next))) {
                        StandardTable.m11902j(ColumnMap.this.f21530e, next);
                        z = true;
                    }
                }
                return z;
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<C, Map<R, V>>> mo11357a() {
            return new ColumnMapEntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: c */
        public Collection<Map<R, V>> mo11551c() {
            return new ColumnMapValues();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f21530e.mo11580m(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(Object obj) {
            if (!this.f21530e.mo11580m(obj)) {
                return null;
            }
            StandardTable standardTable = this.f21530e;
            Objects.requireNonNull(standardTable);
            return new Column(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<C> mo11362g() {
            return this.f21530e.m11903k();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (this.f21530e.mo11580m(obj)) {
                return StandardTable.m11902j(this.f21530e, obj);
            }
            return null;
        }
    }

    public class Row extends Maps.IteratorBasedAbstractMap<C, V> {

        /* renamed from: b */
        public final R f21534b;

        /* renamed from: c */
        @NullableDecl
        public Map<C, V> f21535c;

        public Row(R r) {
            Objects.requireNonNull(r);
            this.f21534b = r;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        /* renamed from: a */
        public Iterator<Map.Entry<C, V>> mo11420a() {
            Map<C, V> mo11909b = mo11909b();
            if (mo11909b == null) {
                return Iterators.EmptyModifiableIterator.INSTANCE;
            }
            final Iterator<Map.Entry<C, V>> it = mo11909b.entrySet().iterator();
            return new Iterator<Map.Entry<C, V>>() { // from class: com.google.common.collect.StandardTable.Row.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Object next() {
                    Row row = Row.this;
                    final Map.Entry entry = (Map.Entry) it.next();
                    Objects.requireNonNull(row);
                    return new ForwardingMapEntry<Object, Object>() { // from class: com.google.common.collect.StandardTable.Row.2
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* renamed from: G */
                        public Object mo7455G() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry
                        /* renamed from: H */
                        public Map.Entry<Object, Object> mo7455G() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public boolean equals(Object obj) {
                            if (!(obj instanceof Map.Entry)) {
                                return false;
                            }
                            Map.Entry entry2 = (Map.Entry) obj;
                            return com.google.common.base.Objects.m11173a(getKey(), entry2.getKey()) && com.google.common.base.Objects.m11173a(getValue(), entry2.getValue());
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public Object setValue(Object obj) {
                            Objects.requireNonNull(obj);
                            return mo7455G().setValue(obj);
                        }
                    };
                }

                @Override // java.util.Iterator
                public void remove() {
                    it.remove();
                    Row.this.mo11911d();
                }
            };
        }

        /* renamed from: b */
        public Map<C, V> mo11909b() {
            Map<C, V> map = this.f21535c;
            if (map != null && (!map.isEmpty() || !StandardTable.this.f21510d.containsKey(this.f21534b))) {
                return this.f21535c;
            }
            Map<C, V> mo11910c = mo11910c();
            this.f21535c = mo11910c;
            return mo11910c;
        }

        /* renamed from: c */
        public Map<C, V> mo11910c() {
            return StandardTable.this.f21510d.get(this.f21534b);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            Map<C, V> mo11909b = mo11909b();
            if (mo11909b != null) {
                mo11909b.clear();
            }
            mo11911d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            boolean z;
            Map<C, V> mo11909b = mo11909b();
            if (obj == null || mo11909b == null) {
                return false;
            }
            try {
                z = mo11909b.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        /* renamed from: d */
        public void mo11911d() {
            if (mo11909b() == null || !this.f21535c.isEmpty()) {
                return;
            }
            StandardTable.this.f21510d.remove(this.f21534b);
            this.f21535c = null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map<C, V> mo11909b = mo11909b();
            if (obj == null || mo11909b == null) {
                return null;
            }
            try {
                return mo11909b.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c2, V v) {
            Objects.requireNonNull(c2);
            Objects.requireNonNull(v);
            Map<C, V> map = this.f21535c;
            return (map == null || map.isEmpty()) ? (V) StandardTable.this.m11905q(this.f21534b, c2, v) : this.f21535c.put(c2, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            Map<C, V> mo11909b = mo11909b();
            V v = null;
            if (mo11909b == null) {
                return null;
            }
            try {
                v = mo11909b.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            mo11911d();
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            Map<C, V> mo11909b = mo11909b();
            if (mo11909b == null) {
                return 0;
            }
            return mo11909b.size();
        }
    }

    public class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {

        public class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            public EntrySet() {
                super(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && Collections2.m11434e(StandardTable.this.f21510d.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.m11786c(StandardTable.this.f21510d.keySet(), new Function<R, Map<C, V>>() { // from class: com.google.common.collect.StandardTable.RowMap.EntrySet.1
                    @Override // com.google.common.base.Function
                    public Object apply(Object obj) {
                        return StandardTable.this.mo11906s(obj);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.f21510d.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.f21510d.size();
            }
        }

        public RowMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* renamed from: a */
        public Set<Map.Entry<R, Map<C, V>>> mo11357a() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.mo11581n(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            if (StandardTable.this.mo11581n(obj)) {
                return StandardTable.this.mo11906s(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.f21510d.remove(obj);
        }
    }

    public abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        public TableSet(C17731 c17731) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            StandardTable.this.f21510d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return StandardTable.this.f21510d.isEmpty();
        }
    }

    public StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        this.f21510d = map;
        this.f21511e = supplier;
    }

    /* renamed from: j */
    public static Map m11902j(StandardTable standardTable, Object obj) {
        Objects.requireNonNull(standardTable);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = standardTable.f21510d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V remove = next.getValue().remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: a */
    public Iterator<Table.Cell<R, C, V>> mo11406a() {
        return new CellIterator(this, null);
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: b */
    public void mo11407b() {
        this.f21510d.clear();
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: c */
    public boolean mo11408c(@NullableDecl Object obj) {
        return obj != null && super.mo11408c(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    /* renamed from: d */
    public Set<Table.Cell<R, C, V>> mo11409d() {
        return super.mo11409d();
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: g */
    public V mo11412g(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.mo11412g(obj, obj2);
    }

    /* renamed from: k */
    public Set<C> m11903k() {
        Set<C> set = this.f21512f;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet(null);
        this.f21512f = columnKeySet;
        return columnKeySet;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo11579l(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L20
            if (r5 == 0) goto L20
            java.util.Map r2 = r3.mo11417t()
            java.lang.Object r4 = com.google.common.collect.Maps.m11793j(r2, r4)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L1c
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r4 = 0
        L18:
            if (r4 == 0) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            if (r4 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.StandardTable.mo11579l(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: m */
    public boolean mo11580m(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.f21510d.values().iterator();
        while (it.hasNext()) {
            if (Maps.m11792i(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo11581n(@NullableDecl Object obj) {
        return obj != null && Maps.m11792i(this.f21510d, obj);
    }

    /* renamed from: o */
    public Iterator<C> mo11904o() {
        return new ColumnKeyIterator(this, null);
    }

    /* renamed from: p */
    public Map<R, Map<C, V>> mo11900p() {
        return new RowMap();
    }

    @CanIgnoreReturnValue
    /* renamed from: q */
    public V m11905q(R r, C c2, V v) {
        Objects.requireNonNull(r);
        Objects.requireNonNull(c2);
        Objects.requireNonNull(v);
        Map<C, V> map = this.f21510d.get(r);
        if (map == null) {
            map = this.f21511e.get();
            this.f21510d.put(r, map);
        }
        return map.put(c2, v);
    }

    @CanIgnoreReturnValue
    /* renamed from: r */
    public V mo11582r(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.m11793j(this.f21510d, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.f21510d.remove(obj);
        }
        return v;
    }

    /* renamed from: s */
    public Map<C, V> mo11906s(R r) {
        return new Row(r);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        Iterator<Map<C, V>> it = this.f21510d.values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().size();
        }
        return i2;
    }

    @Override // com.google.common.collect.Table
    /* renamed from: t */
    public Map<R, Map<C, V>> mo11417t() {
        Map<R, Map<C, V>> map = this.f21513g;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mo11900p = mo11900p();
        this.f21513g = mo11900p;
        return mo11900p;
    }
}
