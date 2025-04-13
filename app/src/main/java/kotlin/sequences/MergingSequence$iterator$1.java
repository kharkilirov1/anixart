package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MergingSequence$iterator$1<V> implements Iterator<V>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Iterator<T1> f66706b;

    /* renamed from: c */
    @NotNull
    public final Iterator<T2> f66707c;

    /* renamed from: d */
    public final /* synthetic */ MergingSequence<T1, T2, V> f66708d;

    public MergingSequence$iterator$1(MergingSequence<T1, T2, V> mergingSequence) {
        this.f66708d = mergingSequence;
        this.f66706b = mergingSequence.f66703a.iterator();
        this.f66707c = mergingSequence.f66704b.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66706b.hasNext() && this.f66707c.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        return this.f66708d.f66705c.invoke(this.f66706b.next(), this.f66707c.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
