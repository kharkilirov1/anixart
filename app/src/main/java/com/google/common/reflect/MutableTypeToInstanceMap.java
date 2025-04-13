package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.ObjectArrays;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Beta
/* loaded from: classes2.dex */
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* renamed from: b */
    public final Map<TypeToken<? extends B>, B> f21986b = new HashMap();

    public static final class UnmodifiableEntry<K, V> extends ForwardingMapEntry<K, V> {

        /* renamed from: b */
        public final Map.Entry<K, V> f21987b;

        public UnmodifiableEntry(Map.Entry entry, C19191 c19191) {
            Objects.requireNonNull(entry);
            this.f21987b = entry;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f21987b;
        }

        @Override // com.google.common.collect.ForwardingMapEntry
        /* renamed from: H */
        public Map.Entry<K, V> mo7455G() {
            return this.f21987b;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: G */
    public Object mo7455G() {
        return this.f21986b;
    }

    @Override // com.google.common.collect.ForwardingMap
    /* renamed from: H */
    public Map<TypeToken<? extends B>, B> mo11329H() {
        return this.f21986b;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        final Set entrySet = super.entrySet();
        return new ForwardingSet<Map.Entry<Object, Object>>() { // from class: com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.1
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            /* renamed from: G */
            public Object mo7455G() {
                return entrySet;
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            /* renamed from: H */
            public Collection mo11329H() {
                return entrySet;
            }

            @Override // com.google.common.collect.ForwardingSet
            /* renamed from: K */
            public Set<Map.Entry<Object, Object>> mo7455G() {
                return entrySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Object>> iterator() {
                return Iterators.m11720o(super.iterator(), new Function<Map.Entry<Object, Object>, Map.Entry<Object, Object>>() { // from class: com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.2
                    @Override // com.google.common.base.Function
                    public Map.Entry<Object, Object> apply(Map.Entry<Object, Object> entry) {
                        return new UnmodifiableEntry(entry, null);
                    }
                });
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return m11559I();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) ObjectArrays.m11830d(this, tArr);
            }
        };
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @DoNotCall
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }
}
