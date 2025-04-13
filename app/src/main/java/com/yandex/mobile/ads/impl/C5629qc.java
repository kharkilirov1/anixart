package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.qc */
/* loaded from: classes3.dex */
public final class C5629qc<T extends View> implements InterfaceC4962d9<T> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC4962d9
    /* renamed from: a */
    public final void mo23834a(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4962d9
    public final void cancel() {
    }
}
