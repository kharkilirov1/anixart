package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {

    /* renamed from: com.google.common.collect.TreeBasedTable$2 */
    public class C17892 extends AbstractIterator<C> {

        /* renamed from: d */
        @NullableDecl
        public C f21578d;

        /* renamed from: e */
        public final /* synthetic */ Iterator f21579e;

        /* renamed from: f */
        public final /* synthetic */ Comparator f21580f;

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public C mo11332a() {
            while (this.f21579e.hasNext()) {
                C c2 = (C) this.f21579e.next();
                C c3 = this.f21578d;
                if (!(c3 != null && this.f21580f.compare(c2, c3) == 0)) {
                    this.f21578d = c2;
                    return c2;
                }
            }
            this.f21578d = null;
            m11333b();
            return null;
        }
    }

    public static class Factory<C, V> implements Supplier<TreeMap<C, V>>, Serializable {
        @Override // com.google.common.base.Supplier
        public Object get() {
            return new TreeMap((Comparator) null);
        }
    }

    public class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {

        /* renamed from: e */
        @NullableDecl
        public final C f21581e;

        /* renamed from: f */
        @NullableDecl
        public final C f21582f;

        /* renamed from: g */
        @NullableDecl
        public transient SortedMap<C, V> f21583g;

        /* JADX WARN: Multi-variable type inference failed */
        public TreeRow(R r, @NullableDecl C c2, @NullableDecl C c3) {
            super(r);
            this.f21581e = c2;
            this.f21582f = c3;
            Preconditions.m11178b(c2 == 0 || c3 == 0 || comparator().compare(c2, c3) <= 0);
        }

        @Override // com.google.common.collect.StandardTable.Row
        /* renamed from: c */
        public Map mo11910c() {
            SortedMap<C, V> m11935i = m11935i();
            if (m11935i == null) {
                return null;
            }
            C c2 = this.f21581e;
            if (c2 != null) {
                m11935i = m11935i.tailMap(c2);
            }
            C c3 = this.f21582f;
            return c3 != null ? m11935i.headMap(c3) : m11935i;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            Objects.requireNonNull(TreeBasedTable.this);
            return null;
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return m11934h(obj) && super.containsKey(obj);
        }

        @Override // com.google.common.collect.StandardTable.Row
        /* renamed from: d */
        public void mo11911d() {
            if (m11935i() == null || !this.f21583g.isEmpty()) {
                return;
            }
            TreeBasedTable.this.f21510d.remove(this.f21534b);
            this.f21583g = null;
            this.f21535c = null;
        }

        @Override // com.google.common.collect.StandardTable.Row
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> mo11909b() {
            return (SortedMap) super.mo11909b();
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            if (mo11909b() != null) {
                return mo11909b().firstKey();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: g */
        public int m11933g(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        /* renamed from: h */
        public boolean m11934h(@NullableDecl Object obj) {
            C c2;
            C c3;
            return obj != null && ((c2 = this.f21581e) == null || m11933g(c2, obj) <= 0) && ((c3 = this.f21582f) == null || m11933g(c3, obj) > 0);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c2) {
            Objects.requireNonNull(c2);
            Preconditions.m11178b(m11934h(c2));
            return new TreeRow(this.f21534b, this.f21581e, c2);
        }

        /* renamed from: i */
        public SortedMap<C, V> m11935i() {
            SortedMap<C, V> sortedMap = this.f21583g;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.f21510d.containsKey(this.f21534b))) {
                this.f21583g = (SortedMap) TreeBasedTable.this.f21510d.get(this.f21534b);
            }
            return this.f21583g;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set keySet() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            if (mo11909b() != null) {
                return mo11909b().lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public V put(C c2, V v) {
            Objects.requireNonNull(c2);
            Preconditions.m11178b(m11934h(c2));
            return (V) super.put(c2, v);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c2, C c3) {
            boolean z;
            Objects.requireNonNull(c2);
            if (m11934h(c2)) {
                Objects.requireNonNull(c3);
                if (m11934h(c3)) {
                    z = true;
                    Preconditions.m11178b(z);
                    return new TreeRow(this.f21534b, c2, c3);
                }
            }
            z = false;
            Preconditions.m11178b(z);
            return new TreeRow(this.f21534b, c2, c3);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c2) {
            Objects.requireNonNull(c2);
            Preconditions.m11178b(m11934h(c2));
            return new TreeRow(this.f21534b, c2, this.f21582f);
        }
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: o */
    public Iterator<C> mo11904o() {
        Iterables.m11705j(this.f21510d.values(), new Function<Map<C, V>, Iterator<C>>() { // from class: com.google.common.collect.TreeBasedTable.1
            @Override // com.google.common.base.Function
            public Object apply(Object obj) {
                return ((Map) obj).keySet().iterator();
            }
        });
        Preconditions.m11187k(null, "comparator");
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    /* renamed from: s */
    public Map mo11906s(Object obj) {
        return new TreeRow(obj, null, null);
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    /* renamed from: t */
    public Map mo11417t() {
        return super.mo11417t();
    }

    @Override // com.google.common.collect.StandardRowSortedTable
    /* renamed from: u */
    public SortedMap<R, Map<C, V>> mo11417t() {
        return super.mo11417t();
    }
}
