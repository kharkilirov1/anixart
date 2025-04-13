package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: LongSparseArray.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"androidx/core/util/LongSparseArrayKt$valueIterator$1", "", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LongSparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: b */
    public int f3551b;

    @Override // java.util.Iterator
    @SuppressLint
    public boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    @SuppressLint
    public Object next() {
        this.f3551b++;
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
