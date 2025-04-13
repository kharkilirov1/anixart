package com.yandex.div.core;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div2.DivCustom;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivCustomViewAdapter.kt */
/* renamed from: com.yandex.div.core.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2817d {
    @NotNull
    /* renamed from: a */
    public static DivPreloader.PreloadReference m16615a(@NotNull DivCustom div, @NotNull DivPreloader.Callback callBack) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(callBack, "callBack");
        Objects.requireNonNull(DivPreloader.PreloadReference.f30978a);
        return C2833h.f31282b;
    }

    /* renamed from: b */
    public static void m16616b(StringBuilder sb, String str, String str2, Ticker ticker) {
        sb.append(str);
        sb.append(str2);
        ticker.m16732e(sb.toString());
    }
}
