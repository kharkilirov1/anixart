package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.g7 */
/* loaded from: classes3.dex */
public final class C5107g7 {

    /* renamed from: a */
    @NonNull
    private final C5527o7 f50513a;

    /* renamed from: b */
    @NonNull
    private final Context f50514b;

    /* renamed from: c */
    @NonNull
    private final C5475n7 f50515c = new C5475n7();

    /* renamed from: d */
    @NonNull
    private final C5324k7 f50516d;

    public C5107g7(@NonNull Context context, @NonNull C5527o7 c5527o7) {
        this.f50514b = context;
        this.f50513a = c5527o7;
        this.f50516d = new C5324k7(context);
    }

    @NonNull
    @SuppressLint
    /* renamed from: a */
    public final ViewGroup m24809a() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f50514b).inflate(C4632R.layout.yandex_ads_internal_adtune_container, (ViewGroup) null);
        Objects.requireNonNull(this.f50515c);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(C4632R.id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f50516d);
        }
        Objects.requireNonNull(this.f50515c);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C4632R.id.adtune_webview_container);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f50513a);
        }
        return viewGroup;
    }
}
