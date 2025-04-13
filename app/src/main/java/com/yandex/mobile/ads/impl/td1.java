package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class td1 {

    /* renamed from: a */
    @NonNull
    private final Context f55089a;

    /* renamed from: b */
    @NonNull
    private final xz0 f55090b = xz0.m29823b();

    public td1(@NonNull Context context) {
        this.f55089a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public final Map m28634a(@NonNull HashMap hashMap, @Nullable wg1 wg1Var) {
        cz0 m29824a = this.f55090b.m29824a(this.f55089a);
        if (m29824a != null ? m29824a.m23572K() : false) {
            return hashMap;
        }
        HashMap hashMap2 = new HashMap(hashMap);
        List<String> m29482a = wg1Var != null ? wg1Var.m29482a() : null;
        List list = (List) hashMap2.get("impression");
        if (m29482a != null) {
            hashMap2.put("impression", m29482a);
        } else {
            hashMap2.remove("impression");
        }
        if (list != null) {
            hashMap2.put("render_impression", list);
        } else {
            hashMap2.remove("render_impression");
        }
        return hashMap2;
    }
}
