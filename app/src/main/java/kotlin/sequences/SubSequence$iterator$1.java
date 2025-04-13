package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SubSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Iterator<T> f66783b;

    /* renamed from: c */
    public int f66784c;

    /* renamed from: d */
    public final /* synthetic */ SubSequence<T> f66785d;

    public SubSequence$iterator$1(SubSequence<T> subSequence) {
        this.f66785d = subSequence;
        this.f66783b = subSequence.f66780a.iterator();
    }

    /* renamed from: a */
    public final void m33861a() {
        while (this.f66784c < this.f66785d.f66781b && this.f66783b.hasNext()) {
            this.f66783b.next();
            this.f66784c++;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        m33861a();
        return this.f66784c < this.f66785d.f66782c && this.f66783b.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        m33861a();
        int i2 = this.f66784c;
        if (i2 >= this.f66785d.f66782c) {
            throw new NoSuchElementException();
        }
        this.f66784c = i2 + 1;
        return this.f66783b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
