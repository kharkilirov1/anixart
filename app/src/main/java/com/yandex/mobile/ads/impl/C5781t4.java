package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.t4 */
/* loaded from: classes3.dex */
public final class C5781t4 {
    @Nullable
    /* renamed from: a */
    public static HashMap m28459a(@Nullable Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append("&");
            sb.append(Uri.encode((String) entry.getKey()));
            sb.append("=");
            sb.append(Uri.encode((String) entry.getValue()));
            if (sb.length() > 61440) {
                ot0.m27110f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return hashMap;
            }
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: a */
    public static String m28458a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            ot0.m27110f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", Integer.valueOf(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE), Integer.valueOf(length));
            return null;
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
            return null;
        }
    }
}
