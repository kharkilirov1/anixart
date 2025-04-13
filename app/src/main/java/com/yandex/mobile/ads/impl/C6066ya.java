package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ya */
/* loaded from: classes3.dex */
public final class C6066ya {

    /* renamed from: a */
    private static final Map<String, InterfaceC6019xa> f56709a = new a();

    /* renamed from: com.yandex.mobile.ads.impl.ya$a */
    public class a extends HashMap<String, InterfaceC6019xa> {
        public a() {
            put("image", new o10());
            put("string", new l41());
            put("media", new pa0());
        }
    }

    @NonNull
    /* renamed from: a */
    public static InterfaceC6019xa m29881a(@NonNull String str) {
        String str2;
        Objects.requireNonNull(str);
        str2 = "media";
        switch (str) {
            case "favicon":
            case "icon":
                str2 = "image";
                break;
            case "media":
                break;
            default:
                str2 = "string";
                break;
        }
        return (InterfaceC6019xa) ((HashMap) f56709a).get(str2);
    }
}
