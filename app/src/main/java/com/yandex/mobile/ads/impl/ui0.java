package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class ui0 {

    /* renamed from: a */
    private final th1 f55507a = jm0.m25910a();

    /* renamed from: b */
    @NonNull
    private final xj0 f55508b;

    public ui0(@NonNull Context context) {
        this.f55508b = new xj0(context);
    }

    @Nullable
    /* renamed from: a */
    public final Object m29006a(@NonNull km0 km0Var) {
        String m28663a = this.f55507a.m28663a(km0Var);
        if (TextUtils.isEmpty(m28663a)) {
            return null;
        }
        return m29005a(m28663a);
    }

    @Nullable
    /* renamed from: a */
    public final qi0 m29005a(@NonNull String str) {
        qi0 qi0Var = null;
        try {
            qi0Var = this.f55508b.m29760a(str);
            qi0Var.m27727a();
            return qi0Var;
        } catch (ni0 | JSONException unused) {
            n60.m26810c("Can't parse native ad response", new Object[0]);
            return qi0Var;
        }
    }
}
