package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class lm0 {

    /* renamed from: b */
    @NonNull
    private final gu0 f52458b = gu0.m24977a();

    /* renamed from: a */
    @NonNull
    private final eu0 f52457a = new eu0();

    @Nullable
    /* renamed from: a */
    public final km0 m26498a(@NonNull zv0<?> zv0Var) {
        String m24978a = this.f52458b.m24978a(zv0Var);
        if (m24978a != null) {
            try {
                du0 m24267a = this.f52457a.m24267a(m24978a);
                return new km0(m24267a.m23940a().getBytes(), m24267a.m23941b());
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
