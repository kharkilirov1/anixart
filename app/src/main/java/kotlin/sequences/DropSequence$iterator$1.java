package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class DropSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Iterator<T> f66681b;

    /* renamed from: c */
    public int f66682c;

    public DropSequence$iterator$1(DropSequence<T> dropSequence) {
        this.f66681b = dropSequence.f66679a.iterator();
        this.f66682c = dropSequence.f66680b;
    }

    /* renamed from: a */
    public final void m33823a() {
        while (this.f66682c > 0 && this.f66681b.hasNext()) {
            this.f66681b.next();
            this.f66682c--;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        m33823a();
        return this.f66681b.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        m33823a();
        return this.f66681b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
