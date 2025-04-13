package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.sv0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aj0 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f48596a;

    public aj0(@NonNull C5101g2 c5101g2) {
        this.f48596a = c5101g2;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        HashMap hashMap = new HashMap();
        String[] m24789k = this.f48596a.m24789k();
        if (m24789k != null && m24789k.length > 0) {
            hashMap.put("image_sizes", Arrays.asList(m24789k));
        }
        return hashMap;
    }
}
