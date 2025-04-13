package com.yandex.mobile.ads.impl;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes3.dex */
final class yr0 {
    @NonNull
    /* renamed from: a */
    public static Intent m29967a(@NonNull xr0 xr0Var) {
        String m29805c = xr0Var.m29805c();
        String m29804b = xr0Var.m29804b();
        Map<String, Object> m29803a = xr0Var.m29803a();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(m29805c));
        intent.addFlags(1342177280);
        intent.setPackage(m29804b);
        if (m29803a != null) {
            for (Map.Entry<String, Object> entry : m29803a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(key, (Boolean) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, (Integer) value);
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                }
            }
        }
        return intent;
    }
}
