package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class gd0 {

    /* renamed from: a */
    @NonNull
    public final C5101g2 f50549a;

    public gd0(@NonNull C5101g2 c5101g2) {
        this.f50549a = c5101g2;
    }

    @NonNull
    /* renamed from: a */
    public HashMap mo24843a(@NonNull Context context) {
        HashMap hashMap = new HashMap();
        AdRequest m24765a = this.f50549a.m24765a();
        if (m24765a != null) {
            Map<String, String> parameters = m24765a.getParameters();
            if (parameters != null) {
                hashMap.putAll(parameters);
            }
            hashMap.put("age", m24765a.getAge());
            hashMap.put("context_tags", m24765a.getContextTags());
            hashMap.put("gender", m24765a.getGender());
            Boolean m29831d = xz0.m29823b().m29831d();
            if (m29831d != null) {
                hashMap.put("age_restricted_user", m29831d);
            }
            cz0 m29824a = xz0.m29823b().m29824a(context);
            Boolean m23577P = m29824a != null ? m29824a.m23577P() : null;
            if (m23577P != null) {
                hashMap.put("user_consent", m23577P);
            }
        }
        return hashMap;
    }
}
