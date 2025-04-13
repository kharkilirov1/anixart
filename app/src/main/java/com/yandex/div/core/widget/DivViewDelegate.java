package com.yandex.div.core.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.div.core.annotations.PublicApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewDelegate.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/widget/DivViewDelegate;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivViewDelegate {
    /* renamed from: a */
    void m17134a(@Nullable Drawable drawable);

    /* renamed from: b */
    boolean m17135b(@NotNull View view, int i2);

    /* renamed from: c */
    void m17136c(boolean z);

    @NotNull
    Drawable invalidateDrawable(@NotNull Drawable drawable);

    void onAttachedToWindow();

    void onDetachedFromWindow();
}
