package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressionIterators.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class CharProgressionIterator extends CharIterator {

    /* renamed from: b */
    public final int f63376b;

    /* renamed from: c */
    public final int f63377c;

    /* renamed from: d */
    public boolean f63378d;

    /* renamed from: e */
    public int f63379e;

    public CharProgressionIterator(char c2, char c3, int i2) {
        this.f63376b = i2;
        this.f63377c = c3;
        boolean z = true;
        if (i2 <= 0 ? Intrinsics.m32181j(c2, c3) < 0 : Intrinsics.m32181j(c2, c3) > 0) {
            z = false;
        }
        this.f63378d = z;
        this.f63379e = z ? c2 : c3;
    }

    @Override // kotlin.collections.CharIterator
    /* renamed from: a */
    public char mo31987a() {
        int i2 = this.f63379e;
        if (i2 != this.f63377c) {
            this.f63379e = this.f63376b + i2;
        } else {
            if (!this.f63378d) {
                throw new NoSuchElementException();
            }
            this.f63378d = false;
        }
        return (char) i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f63378d;
    }
}
