package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/jvm/internal/ArrayShortIterator;", "Lkotlin/collections/ShortIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ArrayShortIterator extends ShortIterator {

    /* renamed from: b */
    @NotNull
    public final short[] f63336b;

    /* renamed from: c */
    public int f63337c;

    @Override // kotlin.collections.ShortIterator
    /* renamed from: a */
    public short mo32081a() {
        try {
            short[] sArr = this.f63336b;
            int i2 = this.f63337c;
            this.f63337c = i2 + 1;
            return sArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f63337c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63337c < this.f63336b.length;
    }
}
