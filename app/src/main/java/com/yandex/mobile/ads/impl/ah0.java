package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ah0 implements xg0 {

    /* renamed from: a */
    @NonNull
    private final View f48589a;

    public ah0(@NonNull View view) {
        this.f48589a = view;
    }

    @Override // com.yandex.mobile.ads.impl.xg0
    public final void setMuted(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.xg0
    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f48589a.setOnClickListener(onClickListener);
    }
}
