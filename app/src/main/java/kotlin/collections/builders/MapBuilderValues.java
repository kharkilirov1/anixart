package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilderValues;", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MapBuilderValues<V> extends AbstractMutableCollection<V> {

    /* renamed from: b */
    @NotNull
    public final MapBuilder<?, V> f63203b;

    public MapBuilderValues(@NotNull MapBuilder<?, V> mapBuilder) {
        this.f63203b = mapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends V> elements) {
        Intrinsics.m32179h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.AbstractMutableCollection
    /* renamed from: b */
    public int mo31910b() {
        return this.f63203b.f63191i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f63203b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f63203b.m32102j(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f63203b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<V> iterator() {
        MapBuilder<?, V> mapBuilder = this.f63203b;
        Objects.requireNonNull(mapBuilder);
        return new MapBuilder.ValuesItr(mapBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        MapBuilder<?, V> mapBuilder = this.f63203b;
        mapBuilder.m32097c();
        int m32102j = mapBuilder.m32102j(obj);
        if (m32102j < 0) {
            return false;
        }
        mapBuilder.m32106n(m32102j);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        this.f63203b.m32097c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        this.f63203b.m32097c();
        return super.retainAll(elements);
    }
}
