package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.sa */
/* loaded from: classes3.dex */
public final class C5733sa {

    /* renamed from: a */
    private static final Map<String, AbstractC5681ra> f54543a = new a();

    /* renamed from: com.yandex.mobile.ads.impl.sa$a */
    public class a extends HashMap<String, AbstractC5681ra> {
        public a() {
            put("image", new a20());
            put("number", new dn0());
            put("close_button", new C5230ii());
            put("media", new oa0());
            put("string", new k41());
        }
    }

    @NonNull
    /* renamed from: a */
    public static AbstractC5681ra m28135a(@NonNull String str) {
        String str2;
        Objects.requireNonNull(str);
        str2 = "media";
        switch (str) {
            case "close_button":
                str2 = "close_button";
                break;
            case "favicon":
            case "icon":
                str2 = "image";
                break;
            case "rating":
            case "review_count":
                str2 = "number";
                break;
            case "media":
                break;
            default:
                str2 = "string";
                break;
        }
        return (AbstractC5681ra) ((HashMap) f54543a).get(str2);
    }
}
