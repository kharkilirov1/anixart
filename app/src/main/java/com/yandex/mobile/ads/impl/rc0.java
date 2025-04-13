package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class rc0 {

    /* renamed from: a */
    @NonNull
    private final gc0 f54265a = new gc0();

    /* renamed from: b */
    private final dg0 f54266b = new dg0();

    @NonNull
    /* renamed from: a */
    public final al1 m27905a(@NonNull MediaView mediaView, @NonNull ka0 ka0Var, @NonNull l20 l20Var, @NonNull bm0 bm0Var, @NonNull C5101g2 c5101g2) throws mi1 {
        Context context = mediaView.getContext();
        Objects.requireNonNull(this.f54266b);
        yf0 m23880a = dg0.m23880a(context, ka0Var, l20Var, bm0Var);
        Objects.requireNonNull(this.f54265a);
        mediaView.removeAllViews();
        mediaView.addView(m23880a, new FrameLayout.LayoutParams(-1, -1));
        return new al1(mediaView, new ag0(m23880a), c5101g2);
    }
}
