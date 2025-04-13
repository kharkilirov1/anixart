package com.yandex.div.core.tooltip;

import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div2.Div;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DivTooltipController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/tooltip/TooltipData;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TooltipData {

    /* renamed from: a */
    @NotNull
    public final SafePopupWindow f31433a;

    /* renamed from: b */
    @Nullable
    public DivPreloader.Ticket f31434b;

    /* renamed from: c */
    public boolean f31435c;

    public TooltipData(SafePopupWindow popupWindow, Div div, DivPreloader.Ticket ticket, boolean z, int i2) {
        z = (i2 & 8) != 0 ? false : z;
        Intrinsics.m32179h(popupWindow, "popupWindow");
        this.f31433a = popupWindow;
        this.f31434b = null;
        this.f31435c = z;
    }
}
