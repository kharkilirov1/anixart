package com.google.common.collect;

import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {

    /* renamed from: b */
    public final Function<F, ? extends T> f20873b;

    /* renamed from: c */
    public final Ordering<T> f20874c;

    public ByFunctionOrdering(Function<F, ? extends T> function, Ordering<T> ordering) {
        Objects.requireNonNull(function);
        this.f20873b = function;
        this.f20874c = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F f2, F f3) {
        return this.f20874c.compare(this.f20873b.apply(f2), this.f20873b.apply(f3));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.f20873b.equals(byFunctionOrdering.f20873b) && this.f20874c.equals(byFunctionOrdering.f20874c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20873b, this.f20874c});
    }

    public String toString() {
        String valueOf = String.valueOf(this.f20874c);
        String valueOf2 = String.valueOf(this.f20873b);
        return C1008a.m6437d(valueOf2.length() + valueOf.length() + 13, valueOf, ".onResultOf(", valueOf2, ")");
    }
}
