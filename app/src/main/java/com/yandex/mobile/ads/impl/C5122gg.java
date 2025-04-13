package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vm0;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.gg */
/* loaded from: classes3.dex */
public final class C5122gg implements w10 {

    /* renamed from: a */
    @NonNull
    private final Context f50569a;

    public C5122gg(@NonNull Context context) {
        this.f50569a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.w10
    @Nullable
    /* renamed from: a */
    public final Bitmap mo24878a(@NonNull z10 z10Var) {
        vm0.InterfaceC5930c m29241b = vm0.m29239c(this.f50569a).m29241b();
        String m30042d = z10Var.m30042d();
        if (m30042d == null) {
            return null;
        }
        Bitmap mo23080a = m29241b.mo23080a(m30042d);
        if (mo23080a == null || mo23080a.getWidth() != 1 || mo23080a.getHeight() != 1) {
            return mo23080a;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(mo23080a, z10Var.m30043e(), z10Var.m30034a(), false);
        m29241b.mo23081a(m30042d, createScaledBitmap);
        return createScaledBitmap;
    }

    @Override // com.yandex.mobile.ads.impl.w10
    /* renamed from: a */
    public final void mo24879a(@NonNull Map<String, Bitmap> map) {
    }
}
