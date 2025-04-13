package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.m0 */
/* loaded from: classes2.dex */
public class C4587m0 {

    /* renamed from: a */
    @Nullable
    public final String f47397a;

    /* renamed from: b */
    public final long f47398b;

    @VisibleForTesting
    public C4587m0(@Nullable String str, long j2) {
        this.f47397a = str;
        this.f47398b = j2;
    }

    @Nullable
    /* renamed from: a */
    public static Map<String, C4587m0> m21556a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                hashMap.put(next, new C4587m0(jSONObject2.has(FirebaseMessagingService.EXTRA_TOKEN) ? jSONObject2.getString(FirebaseMessagingService.EXTRA_TOKEN) : null, jSONObject2.getLong("lastUpdateTime")));
            }
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }
}
