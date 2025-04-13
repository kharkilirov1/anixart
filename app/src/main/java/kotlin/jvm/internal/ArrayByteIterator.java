package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ByteIterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/jvm/internal/ArrayByteIterator;", "Lkotlin/collections/ByteIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ArrayByteIterator extends ByteIterator {

    /* renamed from: b */
    @NotNull
    public final byte[] f63322b;

    /* renamed from: c */
    public int f63323c;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63323c < this.f63322b.length;
    }

    @Override // kotlin.collections.ByteIterator
    public byte nextByte() {
        try {
            byte[] bArr = this.f63322b;
            int i2 = this.f63323c;
            this.f63323c = i2 + 1;
            return bArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f63323c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
