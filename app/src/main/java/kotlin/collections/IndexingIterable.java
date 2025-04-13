package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Iterables.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/IndexingIterable;", "T", "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class IndexingIterable<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Function0<Iterator<T>> f63149b;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterable(@NotNull Function0<? extends Iterator<? extends T>> function0) {
        this.f63149b = function0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<IndexedValue<T>> iterator() {
        return new IndexingIterator(this.f63149b.invoke());
    }
}
