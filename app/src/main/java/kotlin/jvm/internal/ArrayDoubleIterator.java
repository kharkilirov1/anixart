package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.DoubleIterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/jvm/internal/ArrayDoubleIterator;", "Lkotlin/collections/DoubleIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ArrayDoubleIterator extends DoubleIterator {

    /* renamed from: b */
    @NotNull
    public final double[] f63326b;

    /* renamed from: c */
    public int f63327c;

    @Override // kotlin.collections.DoubleIterator
    /* renamed from: a */
    public double mo32056a() {
        try {
            double[] dArr = this.f63326b;
            int i2 = this.f63327c;
            this.f63327c = i2 + 1;
            return dArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f63327c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63327c < this.f63326b.length;
    }
}
