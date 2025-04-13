package com.yandex.div.core.view2;

import com.yandex.div2.DivVisibilityAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositeLogId.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CompositeLogIdKt {
    @NotNull
    /* renamed from: a */
    public static final CompositeLogId m16799a(@NotNull Div2View scope, @NotNull DivVisibilityAction action) {
        Intrinsics.m32179h(scope, "scope");
        Intrinsics.m32179h(action, "action");
        String logId = scope.getLogId();
        String str = action.f40948b;
        String id2 = scope.getDataTag().f30859a;
        Intrinsics.m32178g(id2, "id");
        return new CompositeLogId(logId, id2, str);
    }
}
