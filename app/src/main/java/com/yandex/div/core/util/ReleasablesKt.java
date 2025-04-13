package com.yandex.div.core.util;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.internal.core.ExpressionSubscriber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Releasables.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ReleasablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static final ExpressionSubscriber m16765a(@NotNull View view) {
        Intrinsics.m32179h(view, "<this>");
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        Object tag = view.getTag(C2507R.id.div_releasable_list);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            view.setTag(C2507R.id.div_releasable_list, sparseArrayCompat);
        }
        Object m1129c = sparseArrayCompat.m1129c(0);
        ExpressionSubscriber expressionSubscriber = m1129c instanceof ExpressionSubscriber ? (ExpressionSubscriber) m1129c : null;
        if (expressionSubscriber != null) {
            return expressionSubscriber;
        }
        ExpressionSubscriberImpl expressionSubscriberImpl = new ExpressionSubscriberImpl();
        sparseArrayCompat.m1132f(0, expressionSubscriberImpl);
        return expressionSubscriberImpl;
    }
}
