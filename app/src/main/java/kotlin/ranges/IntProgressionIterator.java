package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* compiled from: ProgressionIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class IntProgressionIterator extends IntIterator {

    /* renamed from: b */
    public final int f63383b;

    /* renamed from: c */
    public final int f63384c;

    /* renamed from: d */
    public boolean f63385d;

    /* renamed from: e */
    public int f63386e;

    public IntProgressionIterator(int i2, int i3, int i4) {
        this.f63383b = i4;
        this.f63384c = i3;
        boolean z = i4 <= 0 ? i2 >= i3 : i2 <= i3;
        this.f63385d = z;
        this.f63386e = z ? i2 : i3;
    }

    @Override // kotlin.collections.IntIterator
    /* renamed from: a */
    public int mo1135a() {
        int i2 = this.f63386e;
        if (i2 != this.f63384c) {
            this.f63386e = this.f63383b + i2;
        } else {
            if (!this.f63385d) {
                throw new NoSuchElementException();
            }
            this.f63385d = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63385d;
    }
}
