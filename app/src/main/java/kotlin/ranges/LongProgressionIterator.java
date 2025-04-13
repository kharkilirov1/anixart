package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* compiled from: ProgressionIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class LongProgressionIterator extends LongIterator {

    /* renamed from: b */
    public final long f63392b;

    /* renamed from: c */
    public final long f63393c;

    /* renamed from: d */
    public boolean f63394d;

    /* renamed from: e */
    public long f63395e;

    public LongProgressionIterator(long j2, long j3, long j4) {
        this.f63392b = j4;
        this.f63393c = j3;
        boolean z = j4 <= 0 ? j2 >= j3 : j2 <= j3;
        this.f63394d = z;
        this.f63395e = z ? j2 : j3;
    }

    @Override // kotlin.collections.LongIterator
    /* renamed from: a */
    public long mo1102a() {
        long j2 = this.f63395e;
        if (j2 != this.f63393c) {
            this.f63395e = this.f63392b + j2;
        } else {
            if (!this.f63394d) {
                throw new NoSuchElementException();
            }
            this.f63394d = false;
        }
        return j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63394d;
    }
}
