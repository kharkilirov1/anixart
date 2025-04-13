package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ka1 {

    /* renamed from: a */
    @NonNull
    private final th1 f51926a = jm0.m25910a();

    /* renamed from: b */
    @NonNull
    private final ya1 f51927b;

    public ka1(@NonNull Context context) {
        this.f51927b = new ya1(context);
    }

    @Nullable
    /* renamed from: a */
    public final ha1 m26094a(@NonNull km0 km0Var) {
        String m28663a = this.f51926a.m28663a(km0Var);
        if (!TextUtils.isEmpty(m28663a)) {
            try {
                ca1 m29912a = this.f51927b.m29912a(m28663a);
                if (m29912a != null) {
                    Map<String, String> map = km0Var.f52034c;
                    if (!(map != null ? C5150gy.m24997a(map, 32) : false)) {
                        m28663a = null;
                    }
                    return new ha1(m29912a, m28663a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
