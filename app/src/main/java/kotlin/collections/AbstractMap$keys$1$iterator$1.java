package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: AbstractMap.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/collections/AbstractMap$keys$1$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class AbstractMap$keys$1$iterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: b */
    public final /* synthetic */ Iterator<Map.Entry<Object, Object>> f63124b;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractMap$keys$1$iterator$1(Iterator<? extends Map.Entry<Object, Object>> it) {
        this.f63124b = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63124b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f63124b.next().getKey();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
