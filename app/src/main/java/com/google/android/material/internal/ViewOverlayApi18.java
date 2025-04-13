package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewOverlayApi18 implements ViewOverlayImpl {

    /* renamed from: a */
    public final ViewOverlay f18368a;

    public ViewOverlayApi18(@NonNull View view) {
        this.f18368a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    /* renamed from: a */
    public void mo10162a(@NonNull Drawable drawable) {
        this.f18368a.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    /* renamed from: b */
    public void mo10163b(@NonNull Drawable drawable) {
        this.f18368a.remove(drawable);
    }
}
