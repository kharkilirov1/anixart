package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s00 extends AbstractC4861be {

    /* renamed from: a */
    @NonNull
    private final AbstractC4861be f54472a;

    /* renamed from: b */
    @NonNull
    private final q91 f54473b = C5325k8.m26067a();

    /* renamed from: c */
    @Nullable
    private final Context f54474c;

    public s00(@Nullable Context context, @NonNull ne0 ne0Var) {
        this.f54472a = ne0Var;
        this.f54474c = context != null ? context.getApplicationContext() : null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4861be
    /* renamed from: a */
    public final p00 mo22665a(@NonNull zv0<?> zv0Var, @NonNull Map<String, String> map) throws IOException, C6069yb {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(j00.m25754b(44), this.f54473b.m27663a(this.f54474c));
        return this.f54472a.mo22665a(zv0Var, hashMap);
    }
}
