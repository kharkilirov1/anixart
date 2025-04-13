package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    public static class EntrySetSerializedForm<K, V> implements Serializable {
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
        @Override // com.google.common.collect.ImmutableMapEntrySet
        /* renamed from: F */
        public ImmutableMap<K, V> mo11657F() {
            return null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        /* renamed from: d */
        public int mo11618d(Object[] objArr, int i2) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: s */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet
        /* renamed from: z */
        public ImmutableList<Map.Entry<K, V>> mo11658z() {
            return null;
        }
    }

    @Override // com.google.common.collect.ImmutableSet
    @GwtIncompatible
    /* renamed from: A */
    public boolean mo11626A() {
        return mo11657F().mo11654h();
    }

    /* renamed from: F */
    public abstract ImmutableMap<K, V> mo11657F();

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v = mo11657F().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return mo11657F().hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return mo11657F().mo11520i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return mo11657F().size();
    }
}
