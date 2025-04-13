package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.o1 */
/* loaded from: classes3.dex */
public final class C5519o1 implements qf1 {

    /* renamed from: a */
    @NonNull
    private final C5958w5 f53127a;

    /* renamed from: b */
    @Nullable
    private final String f53128b;

    /* renamed from: c */
    @NonNull
    private final e61 f53129c;

    /* renamed from: d */
    @NonNull
    private final List<String> f53130d;

    /* renamed from: e */
    @NonNull
    private final Map<String, List<String>> f53131e;

    /* renamed from: f */
    @Nullable
    private AdBreakParameters f53132f;

    public C5519o1(@NonNull C5958w5 c5958w5, @Nullable String str, @NonNull e61 e61Var, @NonNull List list, @NonNull HashMap hashMap) {
        this.f53127a = c5958w5;
        this.f53128b = str;
        this.f53130d = list;
        this.f53129c = e61Var;
        this.f53131e = hashMap;
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    @NonNull
    /* renamed from: a */
    public final Map<String, List<String>> mo22451a() {
        return this.f53131e;
    }

    @NonNull
    /* renamed from: b */
    public final C5958w5 m26979b() {
        return this.f53127a;
    }

    @Nullable
    /* renamed from: c */
    public final String m26980c() {
        return this.f53128b;
    }

    @NonNull
    /* renamed from: d */
    public final List<String> m26981d() {
        return this.f53130d;
    }

    @Nullable
    /* renamed from: e */
    public final AdBreakParameters m26982e() {
        return this.f53132f;
    }

    @NonNull
    /* renamed from: f */
    public final e61 m26983f() {
        return this.f53129c;
    }

    /* renamed from: a */
    public final void m26978a(@NonNull AdBreakParameters adBreakParameters) {
        this.f53132f = adBreakParameters;
    }
}
