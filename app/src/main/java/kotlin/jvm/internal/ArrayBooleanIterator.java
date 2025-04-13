package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/jvm/internal/ArrayBooleanIterator;", "Lkotlin/collections/BooleanIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ArrayBooleanIterator extends BooleanIterator {

    /* renamed from: b */
    @NotNull
    public final boolean[] f63320b;

    /* renamed from: c */
    public int f63321c;

    @Override // kotlin.collections.BooleanIterator
    /* renamed from: a */
    public boolean mo2036a() {
        try {
            boolean[] zArr = this.f63320b;
            int i2 = this.f63321c;
            this.f63321c = i2 + 1;
            return zArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f63321c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63321c < this.f63320b.length;
    }
}
