package com.yandex.metrica.push.impl;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.push.impl.N */
/* loaded from: classes2.dex */
public class C4537N extends RuntimeException {

    /* renamed from: a */
    @Nullable
    private final String f47303a;

    /* renamed from: b */
    @Nullable
    private final String f47304b;

    public C4537N(@Nullable String str, @Nullable String str2) {
        super(String.format("Transform failure for category '%s' with details '%s'", str, str2));
        this.f47303a = str;
        this.f47304b = str2;
    }

    @Nullable
    /* renamed from: a */
    public String m21460a() {
        return this.f47303a;
    }

    @Nullable
    /* renamed from: b */
    public String m21461b() {
        return this.f47304b;
    }
}
