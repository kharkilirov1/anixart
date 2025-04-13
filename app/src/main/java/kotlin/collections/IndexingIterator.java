package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Iterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Iterator<T> f63150b;

    /* renamed from: c */
    public int f63151c;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterator(@NotNull Iterator<? extends T> iterator) {
        Intrinsics.m32179h(iterator, "iterator");
        this.f63150b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63150b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        int i2 = this.f63151c;
        this.f63151c = i2 + 1;
        if (i2 >= 0) {
            return new IndexedValue(i2, this.f63150b.next());
        }
        CollectionsKt.m32023h0();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
