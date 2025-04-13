package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class IndexingSequence$iterator$1<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: b */
    public int f66702b;

    public IndexingSequence$iterator$1(IndexingSequence<T> indexingSequence) {
        throw null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i2 = this.f66702b;
        this.f66702b = i2 + 1;
        if (i2 >= 0) {
            throw null;
        }
        CollectionsKt.m32023h0();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
