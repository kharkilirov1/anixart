package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@GwtCompatible
/* loaded from: classes.dex */
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    public final class Column extends ImmutableArrayMap<R, V> {

        /* renamed from: f */
        public final /* synthetic */ DenseImmutableTable f20944f = null;

        public Column(DenseImmutableTable denseImmutableTable, int i2) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: i */
        public boolean mo11520i() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: p */
        public V mo11521p(int i2) {
            Objects.requireNonNull(this.f20944f);
            throw null;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: q */
        public ImmutableMap<R, Integer> mo11522q() {
            Objects.requireNonNull(this.f20944f);
            return null;
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: i */
        public boolean mo11520i() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: p */
        public Object mo11521p(int i2) {
            new Column(null, i2);
            throw null;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: q */
        public ImmutableMap<C, Integer> mo11522q() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

        /* renamed from: e */
        public final int f20945e;

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        /* renamed from: d */
        public ImmutableSet<K> mo11523d() {
            return this.f20945e == mo11522q().size() ? mo11522q().keySet() : new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            Integer num = mo11522q().get(obj);
            if (num == null) {
                return null;
            }
            return mo11521p(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        /* renamed from: o */
        public UnmodifiableIterator<Map.Entry<K, V>> mo11524o() {
            return new AbstractIterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1

                /* renamed from: d */
                public int f20946d = -1;

                /* renamed from: e */
                public final int f20947e;

                {
                    this.f20947e = ImmutableArrayMap.this.mo11522q().size();
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public Object mo11332a() {
                    Object mo11521p;
                    do {
                        int i2 = this.f20946d + 1;
                        this.f20946d = i2;
                        if (i2 >= this.f20947e) {
                            m11333b();
                            return null;
                        }
                        mo11521p = ImmutableArrayMap.this.mo11521p(i2);
                    } while (mo11521p == null);
                    ImmutableArrayMap immutableArrayMap = ImmutableArrayMap.this;
                    return new ImmutableEntry(immutableArrayMap.mo11522q().keySet().mo11543b().get(this.f20946d), mo11521p);
                }
            };
        }

        @NullableDecl
        /* renamed from: p */
        public abstract V mo11521p(int i2);

        /* renamed from: q */
        public abstract ImmutableMap<K, Integer> mo11522q();

        @Override // java.util.Map
        public int size() {
            return this.f20945e;
        }
    }

    public final class Row extends ImmutableArrayMap<C, V> {

        /* renamed from: f */
        public final /* synthetic */ DenseImmutableTable f20949f = null;

        public Row(DenseImmutableTable denseImmutableTable, int i2) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: i */
        public boolean mo11520i() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: p */
        public V mo11521p(int i2) {
            Objects.requireNonNull(this.f20949f);
            throw null;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: q */
        public ImmutableMap<C, Integer> mo11522q() {
            Objects.requireNonNull(this.f20949f);
            return null;
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        @Override // com.google.common.collect.ImmutableMap
        /* renamed from: i */
        public boolean mo11520i() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: p */
        public Object mo11521p(int i2) {
            new Row(null, i2);
            throw null;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* renamed from: q */
        public ImmutableMap<R, Integer> mo11522q() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @Override // com.google.common.collect.AbstractTable
    /* renamed from: g */
    public V mo11412g(@NullableDecl Object obj, @NullableDecl Object obj2) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableTable
    /* renamed from: m */
    public ImmutableMap<R, Map<C, V>> mo11417t() {
        return ImmutableMap.m11649b(null);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    /* renamed from: n */
    public Table.Cell<R, C, V> mo11518n(int i2) {
        throw null;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    /* renamed from: o */
    public V mo11519o(int i2) {
        throw null;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        throw null;
    }
}
