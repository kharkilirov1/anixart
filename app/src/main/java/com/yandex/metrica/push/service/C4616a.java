package com.yandex.metrica.push.service;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.TrackersHub;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.push.service.a */
/* loaded from: classes2.dex */
class C4616a {
    /* renamed from: a */
    public static void m21746a(@Nullable String str, long j2, @Nullable String str2, @NonNull String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("service_type", str3);
        if (j2 != -1) {
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - j2));
        }
        if (str2 != null) {
            hashMap.put("push_id", str2);
        }
        TrackersHub.getInstance().reportEvent("ActionDuration", hashMap);
    }
}
