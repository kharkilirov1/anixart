package com.yandex.div.core.util;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseArrays.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/util/SparseArrayIterable;", "T", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SparseArrayIterable<T> implements Iterable<T>, KMappedMarker {

    /* renamed from: b */
    @NotNull
    public final SparseArrayCompat<T> f31469b;

    public SparseArrayIterable(@NotNull SparseArrayCompat<T> sparseArrayCompat) {
        this.f31469b = sparseArrayCompat;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new SparseArrayIterator(this.f31469b);
    }
}
