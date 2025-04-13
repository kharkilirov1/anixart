package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {

    public static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: A */
    public boolean mo11626A() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof ImmutableEnumSet) {
            Objects.requireNonNull((ImmutableEnumSet) collection);
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumSet) {
            Objects.requireNonNull((ImmutableEnumSet) obj);
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        throw null;
    }
}
