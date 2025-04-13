package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {

    /* renamed from: c */
    public final ImmutableMap<K, V> f21049c;

    /* renamed from: com.google.common.collect.ImmutableMapValues$1 */
    public class C16561 extends UnmodifiableIterator<V> {

        /* renamed from: b */
        public final UnmodifiableIterator<Map.Entry<K, V>> f21050b;

        public C16561(ImmutableMapValues immutableMapValues) {
            this.f21050b = immutableMapValues.f21049c.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21050b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f21050b.next().getValue();
        }
    }

    @GwtIncompatible
    public static class SerializedForm<V> implements Serializable {
    }

    public ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.f21049c = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: b */
    public ImmutableList<V> mo11543b() {
        final ImmutableList<Map.Entry<K, V>> mo11543b = this.f21049c.entrySet().mo11543b();
        return new ImmutableList<V>() { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // java.util.List
            public V get(int i2) {
                return (V) ((Map.Entry) ImmutableList.this.get(i2)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            /* renamed from: r */
            public boolean mo11425r() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return ImmutableList.this.size();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return obj != null && Iterators.m11709d(new C16561(this), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return new C16561(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: s */
    public UnmodifiableIterator<V> iterator() {
        return new C16561(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f21049c.size();
    }
}
