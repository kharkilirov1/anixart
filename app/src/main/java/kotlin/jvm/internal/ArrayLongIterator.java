package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/jvm/internal/ArrayLongIterator;", "Lkotlin/collections/LongIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ArrayLongIterator extends LongIterator {

    /* renamed from: b */
    @NotNull
    public final long[] f63334b;

    /* renamed from: c */
    public int f63335c;

    @Override // kotlin.collections.LongIterator
    /* renamed from: a */
    public long mo1102a() {
        try {
            long[] jArr = this.f63334b;
            int i2 = this.f63335c;
            this.f63335c = i2 + 1;
            return jArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f63335c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63335c < this.f63334b.length;
    }
}
