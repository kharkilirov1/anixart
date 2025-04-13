package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {

    /* renamed from: b */
    @NullableDecl
    public final K f21031b;

    /* renamed from: c */
    @NullableDecl
    public final V f21032c;

    public ImmutableEntry(@NullableDecl K k2, @NullableDecl V v) {
        this.f21031b = k2;
        this.f21032c = v;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f21031b;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f21032c;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
