package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {

    /* renamed from: j */
    public int f8833j;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.f8833j = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.f8833j == 0) {
            this.f8833j = super.hashCode();
        }
        return this.f8833j;
    }

    @Override // androidx.collection.SimpleArrayMap
    /* renamed from: j */
    public void mo1123j(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f8833j = 0;
        super.mo1123j(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    /* renamed from: k */
    public V mo1124k(int i2) {
        this.f8833j = 0;
        return (V) super.mo1124k(i2);
    }

    @Override // androidx.collection.SimpleArrayMap
    /* renamed from: l */
    public V mo1125l(int i2, V v) {
        this.f8833j = 0;
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1849c;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k2, V v) {
        this.f8833j = 0;
        return (V) super.put(k2, v);
    }
}
