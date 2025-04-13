package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: UIntRange.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m31884d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {

    /* renamed from: b */
    public final int f63399b;

    /* renamed from: c */
    public boolean f63400c;

    /* renamed from: d */
    public final int f63401d;

    /* renamed from: e */
    public int f63402e;

    public UIntProgressionIterator(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f63399b = i3;
        int m31900a = UnsignedKt.m31900a(i2, i3);
        boolean z = i4 <= 0 ? m31900a >= 0 : m31900a <= 0;
        this.f63400c = z;
        this.f63401d = i4;
        this.f63402e = z ? i2 : i3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63400c;
    }

    @Override // java.util.Iterator
    public UInt next() {
        int i2 = this.f63402e;
        if (i2 != this.f63399b) {
            this.f63402e = this.f63401d + i2;
        } else {
            if (!this.f63400c) {
                throw new NoSuchElementException();
            }
            this.f63400c = false;
        }
        return new UInt(i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
