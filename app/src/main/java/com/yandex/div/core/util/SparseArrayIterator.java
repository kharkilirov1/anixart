package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseArrays.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/util/SparseArrayIterator;", "T", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class SparseArrayIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final SparseArrayCompat<T> f31470b;

    /* renamed from: c */
    public int f31471c;

    public SparseArrayIterator(@NotNull SparseArrayCompat<T> array) {
        Intrinsics.m32179h(array, "array");
        this.f31470b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f31470b.m1133g() > this.f31471c;
    }

    @Override // java.util.Iterator
    public T next() {
        SparseArrayCompat<T> sparseArrayCompat = this.f31470b;
        int i2 = this.f31471c;
        this.f31471c = i2 + 1;
        return sparseArrayCompat.m1134h(i2);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
