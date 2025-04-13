package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class TakeSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    public int f66786b = 0;

    public TakeSequence$iterator$1(TakeSequence<T> takeSequence) {
        throw null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f66786b <= 0) {
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public T next() {
        int i2 = this.f66786b;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f66786b = i2 - 1;
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
