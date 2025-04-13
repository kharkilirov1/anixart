package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class mh0 {

    /* renamed from: a */
    private static final Map<kk0, lh0> f52686a = new C5444a();

    /* renamed from: com.yandex.mobile.ads.impl.mh0$a */
    public class C5444a extends HashMap<kk0, lh0> {
        public C5444a() {
            put(kk0.f51997b, new pj0());
            put(kk0.f51998c, new ej0());
            put(kk0.f51999d, new a21());
        }
    }

    @Nullable
    /* renamed from: a */
    public static lh0 m26674a(@Nullable kk0 kk0Var) {
        return (lh0) ((HashMap) f52686a).get(kk0Var);
    }
}
