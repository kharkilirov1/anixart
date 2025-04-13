package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0005"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilderEntries;", "K", "V", "Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MapBuilderEntries<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {

    /* renamed from: b */
    @NotNull
    public final MapBuilder<K, V> f63201b;

    public MapBuilderEntries(@NotNull MapBuilder<K, V> mapBuilder) {
        this.f63201b = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.m32179h(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.m32179h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractMutableSet
    /* renamed from: b */
    public int mo31916b() {
        return this.f63201b.f63191i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f63201b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        return this.f63201b.m32098d(elements);
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    /* renamed from: d */
    public boolean mo32082d(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        return this.f63201b.m32099f(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    /* renamed from: f */
    public boolean mo32083f(@NotNull Map.Entry element) {
        Intrinsics.m32179h(element, "element");
        MapBuilder<K, V> mapBuilder = this.f63201b;
        Objects.requireNonNull(mapBuilder);
        mapBuilder.m32097c();
        int m32101i = mapBuilder.m32101i(element.getKey());
        if (m32101i < 0) {
            return false;
        }
        V[] vArr = mapBuilder.f63185c;
        Intrinsics.m32176e(vArr);
        if (!Intrinsics.m32174c(vArr[m32101i], element.getValue())) {
            return false;
        }
        mapBuilder.m32106n(m32101i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f63201b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        MapBuilder<K, V> mapBuilder = this.f63201b;
        Objects.requireNonNull(mapBuilder);
        return new MapBuilder.EntriesItr(mapBuilder);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        this.f63201b.m32097c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        this.f63201b.m32097c();
        return super.retainAll(elements);
    }
}
