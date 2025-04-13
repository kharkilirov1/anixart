package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sp0 implements w10 {

    /* renamed from: a */
    private Map<String, Bitmap> f54796a;

    @Override // com.yandex.mobile.ads.impl.w10
    /* renamed from: a */
    public final void mo24879a(@NonNull Map<String, Bitmap> map) {
        this.f54796a = map;
    }

    @Override // com.yandex.mobile.ads.impl.w10
    @Nullable
    /* renamed from: a */
    public final Bitmap mo24878a(@NonNull z10 z10Var) {
        String m30042d = z10Var.m30042d();
        Map<String, Bitmap> map = this.f54796a;
        if (map != null) {
            return map.get(m30042d);
        }
        return null;
    }
}
