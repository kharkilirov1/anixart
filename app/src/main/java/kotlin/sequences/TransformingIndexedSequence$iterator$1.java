package kotlin.sequences;

import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class TransformingIndexedSequence$iterator$1<R> implements Iterator<R>, KMappedMarker {

    /* renamed from: b */
    public int f66793b;

    /* renamed from: c */
    public final /* synthetic */ TransformingIndexedSequence<T, R> f66794c;

    public TransformingIndexedSequence$iterator$1(TransformingIndexedSequence<T, R> transformingIndexedSequence) {
        this.f66794c = transformingIndexedSequence;
        throw null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public R next() {
        Objects.requireNonNull(this.f66794c);
        int i2 = this.f66793b;
        this.f66793b = i2 + 1;
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
