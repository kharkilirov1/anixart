package com.yandex.div.core.view2.animations;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTransitionSelector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTransitions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTransitionsKt {

    /* compiled from: DivTransitions.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivTransitionSelector.values().length];
            DivTransitionSelector divTransitionSelector = DivTransitionSelector.DATA_CHANGE;
            iArr[1] = 1;
            DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.ANY_CHANGE;
            iArr[3] = 2;
            DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
            iArr[2] = 3;
        }
    }

    /* renamed from: a */
    public static final boolean m16888a(@NotNull DivData divData, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        DivTransitionSelector mo17535b = divData.f35455d.mo17535b(resolver);
        Intrinsics.m32179h(mo17535b, "<this>");
        int ordinal = mo17535b.ordinal();
        return ordinal == 1 || ordinal == 3;
    }
}
