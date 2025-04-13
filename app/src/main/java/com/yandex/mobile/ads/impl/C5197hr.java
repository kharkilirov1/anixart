package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.hr */
/* loaded from: classes3.dex */
public final class C5197hr implements InterfaceC5187hi {
    @Override // com.yandex.mobile.ads.impl.InterfaceC5187hi
    /* renamed from: a */
    public final void mo22525a(@NonNull View view) {
        view.setAlpha(0.4f);
        view.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5187hi
    /* renamed from: b */
    public final void mo22526b(@NonNull View view) {
        view.animate().alpha(1.0f).setDuration(200L);
        view.setEnabled(true);
    }
}
