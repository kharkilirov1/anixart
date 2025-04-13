package com.google.firebase.database.collection;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ArraySortedMap<K, V> extends ImmutableSortedMap<K, V> {

    /* renamed from: b */
    public final K[] f22535b;

    /* renamed from: c */
    public final V[] f22536c;

    /* renamed from: d */
    public final Comparator<K> f22537d;

    public ArraySortedMap(Comparator<K> comparator) {
        this.f22535b = (K[]) new Object[0];
        this.f22536c = (V[]) new Object[0];
        this.f22537d = comparator;
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    /* renamed from: b */
    public Comparator<K> mo12352b() {
        return this.f22537d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.database.collection.ImmutableSortedMap, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return (Iterator<Map.Entry<K, V>>) new Iterator<Map.Entry<Object, Object>>(0, 0 == true ? 1 : 0) { // from class: com.google.firebase.database.collection.ArraySortedMap.1

            /* renamed from: b */
            public int f22538b;

            /* renamed from: c */
            public final /* synthetic */ boolean f22539c;

            {
                this.f22539c = r3;
                this.f22538b = r2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f22539c ? this.f22538b >= ArraySortedMap.this.f22535b.length : this.f22538b < 0;
            }

            @Override // java.util.Iterator
            public Map.Entry<Object, Object> next() {
                ArraySortedMap arraySortedMap = ArraySortedMap.this;
                K[] kArr = arraySortedMap.f22535b;
                int i2 = this.f22538b;
                K k2 = kArr[i2];
                V v = arraySortedMap.f22536c[i2];
                this.f22538b = this.f22539c ? i2 - 1 : i2 + 1;
                return new AbstractMap.SimpleImmutableEntry(k2, v);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap
    public int size() {
        return this.f22535b.length;
    }

    public ArraySortedMap(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f22535b = kArr;
        this.f22536c = vArr;
        this.f22537d = comparator;
    }
}
