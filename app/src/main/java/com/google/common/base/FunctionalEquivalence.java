package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    @Override // com.google.common.base.Equivalence
    /* renamed from: a */
    public boolean mo11151a(F f2, F f3) {
        throw null;
    }

    @Override // com.google.common.base.Equivalence
    /* renamed from: b */
    public int mo11152b(F f2) {
        throw null;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        java.util.Objects.requireNonNull((FunctionalEquivalence) obj);
        throw null;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public String toString() {
        return "null.onResultOf(null)";
    }
}
