package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract Map.Entry<K, V> mo7455G();

    @Override // java.util.Map.Entry
    public boolean equals(@NullableDecl Object obj) {
        return mo7455G().equals(obj);
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return mo7455G().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return mo7455G().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return mo7455G().hashCode();
    }

    public V setValue(V v) {
        return mo7455G().setValue(v);
    }
}
