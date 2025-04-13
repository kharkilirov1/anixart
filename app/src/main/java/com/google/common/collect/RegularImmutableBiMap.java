package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.RegularImmutableMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: j */
    public static final RegularImmutableBiMap<Object, Object> f21417j = new RegularImmutableBiMap<>();

    /* renamed from: e */
    public final transient Object f21418e;

    /* renamed from: f */
    @VisibleForTesting
    public final transient Object[] f21419f;

    /* renamed from: g */
    public final transient int f21420g;

    /* renamed from: h */
    public final transient int f21421h;

    /* renamed from: i */
    public final transient RegularImmutableBiMap<V, K> f21422i;

    /* JADX WARN: Multi-variable type inference failed */
    public RegularImmutableBiMap() {
        this.f21418e = null;
        this.f21419f = new Object[0];
        this.f21420g = 0;
        this.f21421h = 0;
        this.f21422i = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: c */
    public ImmutableSet<Map.Entry<K, V>> mo11652c() {
        return new RegularImmutableMap.EntrySet(this, this.f21419f, this.f21420g, this.f21421h);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: d */
    public ImmutableSet<K> mo11523d() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.f21419f, this.f21420g, this.f21421h));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        return (V) RegularImmutableMap.m11877r(this.f21418e, this.f21419f, this.f21421h, this.f21420g, obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: i */
    public boolean mo11520i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    /* renamed from: o */
    public ImmutableBiMap<V, K> mo11611o() {
        return this.f21422i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f21421h;
    }

    public RegularImmutableBiMap(Object[] objArr, int i2) {
        this.f21419f = objArr;
        this.f21421h = i2;
        this.f21420g = 0;
        int m11674t = i2 >= 2 ? ImmutableSet.m11674t(i2) : 0;
        this.f21418e = RegularImmutableMap.m11875p(objArr, i2, m11674t, 0);
        this.f21422i = new RegularImmutableBiMap<>(RegularImmutableMap.m11875p(objArr, i2, m11674t, 1), objArr, i2, this);
    }

    public RegularImmutableBiMap(Object obj, Object[] objArr, int i2, RegularImmutableBiMap<V, K> regularImmutableBiMap) {
        this.f21418e = obj;
        this.f21419f = objArr;
        this.f21420g = 1;
        this.f21421h = i2;
        this.f21422i = regularImmutableBiMap;
    }
}
