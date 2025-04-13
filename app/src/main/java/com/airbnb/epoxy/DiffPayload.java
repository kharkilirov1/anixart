package com.airbnb.epoxy;

import androidx.collection.LongSparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class DiffPayload {

    /* renamed from: a */
    public final EpoxyModel<?> f6893a;

    /* renamed from: b */
    public final LongSparseArray<EpoxyModel<?>> f6894b;

    public DiffPayload(EpoxyModel<?> epoxyModel) {
        List<EpoxyModel<?>> singletonList = Collections.singletonList(epoxyModel);
        if (singletonList.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = singletonList.size();
        if (size == 1) {
            this.f6893a = (EpoxyModel) singletonList.get(0);
            this.f6894b = null;
            return;
        }
        this.f6893a = null;
        this.f6894b = new LongSparseArray<>(size);
        for (EpoxyModel<?> epoxyModel2 : singletonList) {
            this.f6894b.m1098m(epoxyModel2.f6925b, epoxyModel2);
        }
    }
}
