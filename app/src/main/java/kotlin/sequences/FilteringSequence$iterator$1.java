package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FilteringSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Iterator<T> f66687b;

    /* renamed from: c */
    public int f66688c = -1;

    /* renamed from: d */
    @Nullable
    public T f66689d;

    /* renamed from: e */
    public final /* synthetic */ FilteringSequence<T> f66690e;

    public FilteringSequence$iterator$1(FilteringSequence<T> filteringSequence) {
        this.f66690e = filteringSequence;
        this.f66687b = filteringSequence.f66684a.iterator();
    }

    /* renamed from: a */
    public final void m33824a() {
        while (this.f66687b.hasNext()) {
            T next = this.f66687b.next();
            if (this.f66690e.f66686c.invoke(next).booleanValue() == this.f66690e.f66685b) {
                this.f66689d = next;
                this.f66688c = 1;
                return;
            }
        }
        this.f66688c = 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f66688c == -1) {
            m33824a();
        }
        return this.f66688c == 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.f66688c == -1) {
            m33824a();
        }
        if (this.f66688c == 0) {
            throw new NoSuchElementException();
        }
        T t = this.f66689d;
        this.f66689d = null;
        this.f66688c = -1;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
