package com.yandex.div.core;

import android.view.View;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivCustom;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivCustomViewAdapter.kt */
@PublicApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/DivCustomViewAdapter;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivCustomViewAdapter {

    /* compiled from: DivCustomViewAdapter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/DivCustomViewAdapter$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    void bindView(@NotNull View view, @NotNull DivCustom divCustom, @NotNull Div2View div2View);

    @NotNull
    View createView(@NotNull DivCustom divCustom, @NotNull Div2View div2View);

    boolean isCustomTypeSupported(@NotNull String str);

    @NotNull
    DivPreloader.PreloadReference preload(@NotNull DivCustom divCustom, @NotNull DivPreloader.Callback callback);

    void release(@NotNull View view, @NotNull DivCustom divCustom);
}
