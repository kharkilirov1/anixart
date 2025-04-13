package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: IteratorsJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class CollectionsKt__IteratorsJVMKt$iterator$1 implements Iterator<Object>, KMappedMarker {

    /* renamed from: b */
    public final /* synthetic */ Enumeration<Object> f63139b;

    public CollectionsKt__IteratorsJVMKt$iterator$1(Enumeration<Object> enumeration) {
        this.f63139b = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63139b.hasMoreElements();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f63139b.nextElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
