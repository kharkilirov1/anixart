package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@Immutable
@GwtCompatible
/* loaded from: classes.dex */
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* renamed from: d */
    public final ImmutableMap<R, ImmutableMap<C, V>> f21505d;

    /* renamed from: e */
    public final ImmutableMap<C, ImmutableMap<R, V>> f21506e;

    /* renamed from: f */
    public final int[] f21507f;

    /* renamed from: g */
    public final int[] f21508g;

    static {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList<Object> immutableList = RegularImmutableList.f21423f;
        int i2 = ImmutableSet.f21087d;
        RegularImmutableSet<Object> regularImmutableSet = RegularImmutableSet.f21445j;
        new SparseImmutableTable(immutableList, regularImmutableSet, regularImmutableSet);
    }

    public SparseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(immutableSet.size());
        Iterator<R> it = immutableSet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            builder.mo11614c(it.next(), Integer.valueOf(i2));
            i2++;
        }
        ImmutableMap mo11613a = builder.mo11613a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UnmodifiableIterator<R> it2 = immutableSet.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        UnmodifiableIterator<C> it3 = immutableSet2.iterator();
        while (it3.hasNext()) {
            linkedHashMap2.put(it3.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            Table.Cell<R, C, V> cell = immutableList.get(i3);
            R mo11419b = cell.mo11419b();
            C mo11418a = cell.mo11418a();
            V value = cell.getValue();
            iArr[i3] = ((Integer) ((RegularImmutableMap) mo11613a).get(mo11419b)).intValue();
            Map map = (Map) linkedHashMap.get(mo11419b);
            iArr2[i3] = map.size();
            Object put = map.put(mo11418a, value);
            if (!(put == null)) {
                throw new IllegalArgumentException(Strings.m11218b("Duplicate key: (row=%s, column=%s), values: [%s, %s].", mo11419b, mo11418a, value, put));
            }
            ((Map) linkedHashMap2.get(mo11418a)).put(mo11419b, value);
        }
        this.f21507f = iArr;
        this.f21508g = iArr2;
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builder2.mo11614c(entry.getKey(), ImmutableMap.m11649b((Map) entry.getValue()));
        }
        this.f21505d = builder2.mo11613a();
        ImmutableMap.Builder builder3 = new ImmutableMap.Builder(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            builder3.mo11614c(entry2.getKey(), ImmutableMap.m11649b((Map) entry2.getValue()));
        }
        this.f21506e = builder3.mo11613a();
    }

    @Override // com.google.common.collect.ImmutableTable
    /* renamed from: m */
    public ImmutableMap<R, Map<C, V>> mo11417t() {
        return ImmutableMap.m11649b(this.f21505d);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    /* renamed from: n */
    public Table.Cell<R, C, V> mo11518n(int i2) {
        Map.Entry<R, ImmutableMap<C, V>> entry = this.f21505d.entrySet().mo11543b().get(this.f21507f[i2]);
        ImmutableMap<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().mo11543b().get(this.f21508g[i2]);
        return ImmutableTable.m11693j(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    /* renamed from: o */
    public V mo11519o(int i2) {
        ImmutableMap<C, V> immutableMap = this.f21505d.values().mo11543b().get(this.f21507f[i2]);
        return immutableMap.values().mo11543b().get(this.f21508g[i2]);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.f21507f.length;
    }
}
