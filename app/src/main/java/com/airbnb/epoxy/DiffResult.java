package com.airbnb.epoxy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

/* loaded from: classes.dex */
public class DiffResult {

    /* renamed from: a */
    @NonNull
    public final List<? extends EpoxyModel<?>> f6895a;

    /* renamed from: b */
    @NonNull
    public final List<? extends EpoxyModel<?>> f6896b;

    /* renamed from: c */
    @Nullable
    public final DiffUtil.DiffResult f6897c;

    public DiffResult(@NonNull List<? extends EpoxyModel<?>> list, @NonNull List<? extends EpoxyModel<?>> list2, @Nullable DiffUtil.DiffResult diffResult) {
        this.f6895a = list;
        this.f6896b = list2;
        this.f6897c = diffResult;
    }
}
