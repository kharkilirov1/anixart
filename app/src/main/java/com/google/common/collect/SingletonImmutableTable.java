package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
/* loaded from: classes.dex */
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: e */
    public Set mo11410e() {
        Table.Cell m11693j = ImmutableTable.m11693j(null, null, null);
        int i2 = ImmutableSet.f21087d;
        return new SingletonImmutableSet(m11693j);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* renamed from: f */
    public Collection mo11411f() {
        int i2 = ImmutableSet.f21087d;
        return new SingletonImmutableSet(null);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* renamed from: k */
    public ImmutableSet<Table.Cell<R, C, V>> mo11410e() {
        Table.Cell m11693j = ImmutableTable.m11693j(null, null, null);
        int i2 = ImmutableSet.f21087d;
        return new SingletonImmutableSet(m11693j);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* renamed from: l */
    public ImmutableCollection<V> mo11411f() {
        int i2 = ImmutableSet.f21087d;
        return new SingletonImmutableSet(null);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    /* renamed from: m */
    public ImmutableMap<R, Map<C, V>> mo11417t() {
        return ImmutableMap.m11651m(null, ImmutableMap.m11651m(null, null));
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return 1;
    }
}
