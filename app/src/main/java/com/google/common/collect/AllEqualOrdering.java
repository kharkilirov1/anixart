package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class AllEqualOrdering extends Ordering<Object> implements Serializable {
    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.Ordering
    /* renamed from: h */
    public <S> Ordering<S> mo11416h() {
        return this;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
