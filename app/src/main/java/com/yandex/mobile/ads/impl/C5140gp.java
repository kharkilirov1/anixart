package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.div.core.C2817d;
import com.yandex.div.core.C2833h;
import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivCustom;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gp */
/* loaded from: classes3.dex */
public final class C5140gp implements DivCustomViewAdapter {
    @Override // com.yandex.div.core.DivCustomViewAdapter
    public final void bindView(@NonNull View view, @NonNull DivCustom divCustom, @NonNull Div2View div2View) {
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    @NonNull
    public final View createView(@NonNull DivCustom divCustom, @NonNull Div2View div2View) {
        return new zt0(div2View.getContext());
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    public final boolean isCustomTypeSupported(@NonNull String str) {
        return "rating".equals(str);
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    @NotNull
    public /* bridge */ /* synthetic */ DivPreloader.PreloadReference preload(@NotNull DivCustom divCustom, @NotNull DivPreloader.Callback callback) {
        C2817d.m16615a(divCustom, callback);
        return C2833h.f31282b;
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    public final void release(@NonNull View view, @NonNull DivCustom divCustom) {
    }
}
