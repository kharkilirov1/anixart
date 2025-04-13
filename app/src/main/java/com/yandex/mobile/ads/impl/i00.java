package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i00 {

    /* renamed from: a */
    private final HashMap f51175a = new HashMap();

    /* renamed from: b */
    @Nullable
    private Map<String, String> f51176b;

    /* renamed from: a */
    public final synchronized Map<String, String> m25421a() {
        if (this.f51176b == null) {
            this.f51176b = Collections.unmodifiableMap(new HashMap(this.f51175a));
        }
        return this.f51176b;
    }
}
