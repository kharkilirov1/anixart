package com.yandex.div.core.util;

import com.yandex.div2.Div;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTreeWalkKt {
    @NotNull
    /* renamed from: a */
    public static final DivTreeWalk m16757a(@NotNull Div div) {
        Intrinsics.m32179h(div, "<this>");
        return new DivTreeWalk(div);
    }
}
