package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            Objects.requireNonNull((ImmutableEnumMap) obj);
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: i */
    public boolean mo11520i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: j */
    public UnmodifiableIterator<K> mo11625j() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    /* renamed from: o */
    public UnmodifiableIterator<Map.Entry<K, V>> mo11524o() {
        throw null;
    }

    @Override // java.util.Map
    public int size() {
        throw null;
    }
}
