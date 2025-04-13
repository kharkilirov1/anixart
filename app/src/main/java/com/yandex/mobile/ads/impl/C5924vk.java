package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.vk */
/* loaded from: classes3.dex */
public final class C5924vk {

    /* renamed from: a */
    private static final Map<String, EnumC5870uk> f55827a = new a();

    /* renamed from: com.yandex.mobile.ads.impl.vk$a */
    public class a extends HashMap<String, EnumC5870uk> {
        public a() {
            put("html", EnumC5870uk.f55548a);
            put(PluginErrorDetails.Platform.NATIVE, EnumC5870uk.f55549b);
        }
    }

    @Nullable
    /* renamed from: a */
    public static EnumC5870uk m29231a(@NonNull Map map) {
        return (EnumC5870uk) ((HashMap) f55827a).get((String) map.get(j00.m25754b(18)));
    }
}
