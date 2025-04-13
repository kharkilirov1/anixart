package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ULongRange.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m31884d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {

    /* renamed from: b */
    public final long f63406b;

    /* renamed from: c */
    public boolean f63407c;

    /* renamed from: d */
    public final long f63408d;

    /* renamed from: e */
    public long f63409e;

    public ULongProgressionIterator(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f63406b = j3;
        int m31901b = UnsignedKt.m31901b(j2, j3);
        boolean z = j4 <= 0 ? m31901b >= 0 : m31901b <= 0;
        this.f63407c = z;
        this.f63408d = j4;
        this.f63409e = z ? j2 : j3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63407c;
    }

    @Override // java.util.Iterator
    public ULong next() {
        long j2 = this.f63409e;
        if (j2 != this.f63406b) {
            this.f63409e = this.f63408d + j2;
        } else {
            if (!this.f63407c) {
                throw new NoSuchElementException();
            }
            this.f63407c = false;
        }
        return new ULong(j2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
