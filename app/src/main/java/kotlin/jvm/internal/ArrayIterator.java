package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/jvm/internal/ArrayIterator;", "T", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ArrayIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final T[] f63332b;

    /* renamed from: c */
    public int f63333c;

    public ArrayIterator(@NotNull T[] tArr) {
        this.f63332b = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63333c < this.f63332b.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f63332b;
            int i2 = this.f63333c;
            this.f63333c = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f63333c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
