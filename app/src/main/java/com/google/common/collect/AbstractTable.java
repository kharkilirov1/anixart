package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {

    /* renamed from: b */
    @NullableDecl
    @LazyInit
    public transient Set<Table.Cell<R, C, V>> f20853b;

    /* renamed from: c */
    @NullableDecl
    @LazyInit
    public transient Collection<V> f20854c;

    public class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        public CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractTable.this.mo11407b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.m11793j(AbstractTable.this.mo11417t(), cell.mo11419b());
            return map != null && Collections2.m11434e(map.entrySet(), new ImmutableEntry(cell.mo11418a(), cell.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Table.Cell<R, C, V>> iterator() {
            return AbstractTable.this.mo11406a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            boolean z;
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.m11793j(AbstractTable.this.mo11417t(), cell.mo11419b());
            if (map == null) {
                return false;
            }
            Set entrySet = map.entrySet();
            ImmutableEntry immutableEntry = new ImmutableEntry(cell.mo11418a(), cell.getValue());
            Objects.requireNonNull(entrySet);
            try {
                z = entrySet.remove(immutableEntry);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractTable.this.size();
        }
    }

    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractTable.this.mo11407b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractTable.this.mo11408c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractTable.this.mo11414i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractTable.this.size();
        }
    }

    /* renamed from: a */
    public abstract Iterator<Table.Cell<R, C, V>> mo11406a();

    /* renamed from: b */
    public void mo11407b() {
        Iterators.m11707b(mo11409d().iterator());
    }

    /* renamed from: c */
    public boolean mo11408c(@NullableDecl Object obj) {
        Iterator<Map<C, V>> it = mo11417t().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Table
    /* renamed from: d */
    public Set<Table.Cell<R, C, V>> mo11409d() {
        Set<Table.Cell<R, C, V>> set = this.f20853b;
        if (set != null) {
            return set;
        }
        Set<Table.Cell<R, C, V>> mo11410e = mo11410e();
        this.f20853b = mo11410e;
        return mo11410e;
    }

    /* renamed from: e */
    public Set<Table.Cell<R, C, V>> mo11410e() {
        return new CellSet();
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Table) {
            return mo11409d().equals(((Table) obj).mo11409d());
        }
        return false;
    }

    /* renamed from: f */
    public Collection<V> mo11411f() {
        return new Values();
    }

    /* renamed from: g */
    public V mo11412g(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map = (Map) Maps.m11793j(mo11417t(), obj);
        if (map == null) {
            return null;
        }
        try {
            return (V) map.get(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public Collection<V> m11413h() {
        Collection<V> collection = this.f20854c;
        if (collection != null) {
            return collection;
        }
        Collection<V> mo11411f = mo11411f();
        this.f20854c = mo11411f;
        return mo11411f;
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return mo11409d().hashCode();
    }

    /* renamed from: i */
    public Iterator<V> mo11414i() {
        return new TransformedIterator<Table.Cell<R, C, V>, V>(mo11409d().iterator()) { // from class: com.google.common.collect.AbstractTable.1
            @Override // com.google.common.collect.TransformedIterator
            /* renamed from: a */
            public Object mo11415a(Object obj) {
                return ((Table.Cell) obj).getValue();
            }
        };
    }

    public String toString() {
        return mo11417t().toString();
    }
}
