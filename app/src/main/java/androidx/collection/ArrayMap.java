package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.MapCollections.EntrySet;
import androidx.collection.MapCollections.KeySet;
import androidx.collection.MapCollections.ValuesCollection;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {

    /* renamed from: i */
    @Nullable
    public MapCollections<K, V> f1797i;

    public ArrayMap() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        MapCollections<K, V> m1067n = m1067n();
        if (m1067n.f1829a == null) {
            m1067n.f1829a = m1067n.new EntrySet();
        }
        return m1067n.f1829a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        MapCollections<K, V> m1067n = m1067n();
        if (m1067n.f1830b == null) {
            m1067n.f1830b = m1067n.new KeySet();
        }
        return m1067n.f1830b;
    }

    /* renamed from: n */
    public final MapCollections<K, V> m1067n() {
        if (this.f1797i == null) {
            this.f1797i = new MapCollections<K, V>() { // from class: androidx.collection.ArrayMap.1
                @Override // androidx.collection.MapCollections
                /* renamed from: a */
                public void mo1069a() {
                    ArrayMap.this.clear();
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: b */
                public Object mo1070b(int i2, int i3) {
                    return ArrayMap.this.f1849c[(i2 << 1) + i3];
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: c */
                public Map<K, V> mo1071c() {
                    return ArrayMap.this;
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: d */
                public int mo1072d() {
                    return ArrayMap.this.f1850d;
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: e */
                public int mo1073e(Object obj) {
                    return ArrayMap.this.m1119f(obj);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: f */
                public int mo1074f(Object obj) {
                    return ArrayMap.this.m1121h(obj);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: g */
                public void mo1075g(K k2, V v) {
                    ArrayMap.this.put(k2, v);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: h */
                public void mo1076h(int i2) {
                    ArrayMap.this.mo1124k(i2);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: i */
                public V mo1077i(int i2, V v) {
                    return ArrayMap.this.mo1125l(i2, v);
                }
            };
        }
        return this.f1797i;
    }

    /* renamed from: o */
    public boolean m1068o(@NonNull Collection<?> collection) {
        return MapCollections.m1112k(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m1117b(map.size() + this.f1850d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        MapCollections<K, V> m1067n = m1067n();
        if (m1067n.f1831c == null) {
            m1067n.f1831c = m1067n.new ValuesCollection();
        }
        return m1067n.f1831c;
    }

    public ArrayMap(int i2) {
        super(i2);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        if (simpleArrayMap != null) {
            mo1123j(simpleArrayMap);
        }
    }
}
