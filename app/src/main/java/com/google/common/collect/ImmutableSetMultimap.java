package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {

    /* renamed from: h */
    public final transient ImmutableSet<V> f21089h;

    /* renamed from: i */
    @RetainedWith
    @NullableDecl
    @LazyInit
    public transient ImmutableSet<Map.Entry<K, V>> f21090i;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
    }

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: e */
        @Weak
        public final transient ImmutableSetMultimap<K, V> f21091e;

        public EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f21091e = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f21091e.mo11385F(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: s */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f21091e.m11660k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f21091e.f21053g;
        }
    }

    @GwtIncompatible
    public static final class SetFieldSettersHolder {
        static {
            Serialization.m11882a(ImmutableSetMultimap.class, "emptySet");
        }
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i2, @NullableDecl Comparator<? super V> comparator) {
        super(immutableMap, i2);
        int i3 = ImmutableSet.f21087d;
        this.f21089h = RegularImmutableSet.f21445j;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: a */
    public Collection mo11335a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: m */
    public ImmutableCollection mo11335a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> mo11345b() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f21090i;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.f21090i = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<V> get(@NullableDecl K k2) {
        return (ImmutableSet) MoreObjects.m11165a((ImmutableSet) this.f21052f.get(k2), this.f21089h);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: a */
    public Set mo11335a(Object obj) {
        throw new UnsupportedOperationException();
    }
}
