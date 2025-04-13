package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleIndicatorDrawer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface SingleIndicatorDrawer {
    /* renamed from: a */
    void mo17443a(@NotNull Canvas canvas, @NotNull RectF rectF);

    /* renamed from: b */
    void mo17444b(@NotNull Canvas canvas, float f2, float f3, @NotNull IndicatorParams.ItemSize itemSize, int i2, float f4, int i3);
}
