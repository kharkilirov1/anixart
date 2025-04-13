package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tv0 {

    /* renamed from: a */
    @NonNull
    private final Map<String, Object> f55246a;

    public tv0(@NonNull Map<String, Object> map) {
        this.f55246a = map;
    }

    /* renamed from: a */
    public final void m28759a(@Nullable List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f55246a.put("active_experiments", list);
    }

    /* renamed from: b */
    public final void m28761b(@Nullable Object obj, @NonNull String str) {
        if (obj == null) {
            m28758a(str);
        } else {
            this.f55246a.put(str, obj);
        }
    }

    /* renamed from: a */
    public final void m28757a(@Nullable Object obj, @NonNull String str) {
        if (obj != null) {
            this.f55246a.put(str, obj);
        }
    }

    /* renamed from: a */
    public final void m28758a(@NonNull String str) {
        this.f55246a.put(str, "undefined");
    }

    /* renamed from: a */
    public final void m28760a(@NonNull Map<String, Object> map) {
        this.f55246a.putAll(map);
    }

    @NonNull
    /* renamed from: a */
    public final Map<String, Object> m28756a() {
        return this.f55246a;
    }
}
