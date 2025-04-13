package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes3.dex */
final class sf1 {
    @NonNull
    /* renamed from: a */
    public static String m28244a(@NonNull String str, @NonNull Map map) {
        for (Map.Entry entry : map.entrySet()) {
            str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
        }
        return str;
    }
}
