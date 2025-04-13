package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.C2817d;
import com.yandex.div.core.C2833h;
import com.yandex.div.core.DivCustomViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivCustom;
import com.yandex.mobile.ads.C4632R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.fp */
/* loaded from: classes3.dex */
public final class C5087fp implements DivCustomViewAdapter {
    @Override // com.yandex.div.core.DivCustomViewAdapter
    public final void bindView(@NotNull View view, @NotNull DivCustom div, @NotNull Div2View divView) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    @NotNull
    public final View createView(@NotNull DivCustom div, @NotNull Div2View divView) {
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        String str = null;
        ProgressBar progressBar = new ProgressBar(divView.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = div.f35293h;
        if (jSONObject != null && jSONObject.has("progress_color")) {
            JSONObject jSONObject2 = div.f35293h;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("progress_color");
            }
        } else {
            str = "#000000";
        }
        int m25548a = C5232ij.m25548a(str);
        Drawable drawable = progressBar.getContext().getDrawable(C4632R.drawable.yandex_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(m25548a, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    public final boolean isCustomTypeSupported(@NotNull String type) {
        Intrinsics.m32179h(type, "type");
        return Intrinsics.m32174c(type, "close_progress_view");
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    @NotNull
    public /* bridge */ /* synthetic */ DivPreloader.PreloadReference preload(@NotNull DivCustom divCustom, @NotNull DivPreloader.Callback callback) {
        C2817d.m16615a(divCustom, callback);
        return C2833h.f31282b;
    }

    @Override // com.yandex.div.core.DivCustomViewAdapter
    public final void release(@NotNull View view, @NotNull DivCustom div) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
    }
}
