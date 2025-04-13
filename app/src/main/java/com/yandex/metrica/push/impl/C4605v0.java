package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.PublicLogger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.v0 */
/* loaded from: classes2.dex */
public class C4605v0 {
    /* renamed from: a */
    public static boolean m21736a(@Nullable JSONObject jSONObject, @NonNull String str, boolean z) {
        return jSONObject == null ? z : jSONObject.optBoolean(str, z);
    }

    @Nullable
    /* renamed from: b */
    public static Integer m21737b(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static Long m21738c(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static String m21739d(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @Nullable
    /* renamed from: a */
    public static Boolean m21734a(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static JSONObject m21735a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        try {
            if (jSONObject2 == null) {
                return new JSONObject(jSONObject.toString());
            }
            if (jSONObject == null) {
                return new JSONObject(jSONObject2.toString());
            }
            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject2.opt(next);
                if (opt instanceof JSONObject) {
                    JSONObject optJSONObject = jSONObject3.optJSONObject(next);
                    JSONObject m21735a = m21735a(optJSONObject, (JSONObject) opt);
                    if (m21735a != null) {
                        jSONObject3.put(next, m21735a);
                    } else {
                        throw new JSONException(String.format("Failed to marge json %s with %s for key '%s'", next, optJSONObject, opt));
                    }
                } else {
                    jSONObject3.put(next, opt);
                }
            }
            return jSONObject3;
        } catch (Throwable th) {
            PublicLogger.m21384e(th, "Failed to merge json %s with %s", jSONObject, jSONObject2);
            return null;
        }
    }
}
