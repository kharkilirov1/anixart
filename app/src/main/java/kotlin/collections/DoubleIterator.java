package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: PrimitiveIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0006\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/DoubleIterator;", "", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class DoubleIterator implements Iterator<Double>, KMappedMarker {
    /* renamed from: a */
    public abstract double mo32056a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(mo32056a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
