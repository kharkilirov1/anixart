package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
final class bs0 {

    /* renamed from: a */
    @NonNull
    private final C5999x f48969a = new C5999x();

    /* renamed from: b */
    @NonNull
    private final yr0 f48970b = new yr0();

    /* renamed from: a */
    public final boolean m22930a(@NonNull Context context, @NonNull List<xr0> list) {
        Objects.requireNonNull(this.f48969a);
        int i2 = 0;
        while (context instanceof ContextWrapper) {
            int i3 = i2 + 1;
            if (i2 >= 10) {
                break;
            }
            if (context instanceof Activity) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i2 = i3;
        }
        context = null;
        if (context != null) {
            Iterator<xr0> it = list.iterator();
            while (it.hasNext()) {
                if (m22929a(context, it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m22929a(@NonNull Context context, @NonNull xr0 xr0Var) {
        try {
            Objects.requireNonNull(this.f48970b);
            context.startActivity(yr0.m29967a(xr0Var));
            return true;
        } catch (Exception unused) {
            n60.m26810c("Failed to open preferred package %s", xr0Var.m29804b());
            return false;
        }
    }
}
