package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.nr */
/* loaded from: classes3.dex */
public final class C5507nr {

    /* renamed from: a */
    @Nullable
    private String f53076a;

    /* renamed from: b */
    @NonNull
    private List<st0> f53077b = Collections.emptyList();

    /* renamed from: c */
    @NonNull
    private Map<String, String> f53078c = Collections.emptyMap();

    /* renamed from: d */
    @Nullable
    private String f53079d;

    /* renamed from: e */
    @Nullable
    private String f53080e;

    /* renamed from: f */
    @Nullable
    private String f53081f;

    @Nullable
    /* renamed from: a */
    public final String m26941a() {
        return this.f53081f;
    }

    /* renamed from: b */
    public final void m26944b(@Nullable String str) {
        this.f53076a = str;
    }

    @NonNull
    /* renamed from: c */
    public final Map<String, String> m26945c() {
        return this.f53078c;
    }

    /* renamed from: d */
    public final synchronized void m26948d(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f53079d = str;
        }
    }

    @NonNull
    /* renamed from: e */
    public final List<st0> m26949e() {
        return this.f53077b;
    }

    @Nullable
    /* renamed from: f */
    public final synchronized String m26950f() {
        return this.f53079d;
    }

    /* renamed from: a */
    public final void m26942a(@Nullable String str) {
        this.f53081f = str;
    }

    @Nullable
    /* renamed from: b */
    public final String m26943b() {
        return this.f53076a;
    }

    /* renamed from: c */
    public final void m26946c(@NonNull String str) {
        this.f53080e = str;
    }

    @Nullable
    /* renamed from: d */
    public final String m26947d() {
        return this.f53080e;
    }
}
