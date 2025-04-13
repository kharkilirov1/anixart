package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MapWithDefault.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/MapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MapWithDefault;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class MapWithDefaultImpl<K, V> implements MapWithDefault<K, V> {
    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        throw null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        throw null;
    }

    @Override // kotlin.collections.MapWithDefault
    /* renamed from: e */
    public V mo32058e(K k2) {
        throw null;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        throw null;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        throw null;
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        throw null;
    }

    @Override // java.util.Map
    public int hashCode() {
        throw null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw null;
    }

    @Override // java.util.Map
    public V put(K k2, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        throw null;
    }

    @NotNull
    public String toString() {
        throw null;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        throw null;
    }
}
