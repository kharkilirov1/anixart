package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class TakeWhileSequence$iterator$1<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final Iterator<T> f66789b;

    /* renamed from: c */
    public int f66790c = -1;

    /* renamed from: d */
    @Nullable
    public T f66791d;

    /* renamed from: e */
    public final /* synthetic */ TakeWhileSequence<T> f66792e;

    public TakeWhileSequence$iterator$1(TakeWhileSequence<T> takeWhileSequence) {
        this.f66792e = takeWhileSequence;
        this.f66789b = takeWhileSequence.f66787a.iterator();
    }

    /* renamed from: a */
    public final void m33862a() {
        if (this.f66789b.hasNext()) {
            T next = this.f66789b.next();
            if (this.f66792e.f66788b.invoke(next).booleanValue()) {
                this.f66790c = 1;
                this.f66791d = next;
                return;
            }
        }
        this.f66790c = 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f66790c == -1) {
            m33862a();
        }
        return this.f66790c == 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.f66790c == -1) {
            m33862a();
        }
        if (this.f66790c == 0) {
            throw new NoSuchElementException();
        }
        T t = this.f66791d;
        this.f66791d = null;
        this.f66790c = -1;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
