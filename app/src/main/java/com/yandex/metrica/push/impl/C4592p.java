package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.push.impl.p */
/* loaded from: classes2.dex */
public class C4592p {

    /* renamed from: a */
    @Nullable
    private final String f47439a;

    /* renamed from: b */
    @Nullable
    private final Boolean f47440b;

    /* renamed from: c */
    @Nullable
    private final Map<String, String> f47441c;

    /* renamed from: d */
    @Nullable
    private final a f47442d;

    /* renamed from: e */
    @Nullable
    private final long[] f47443e;

    public C4592p(@NonNull JSONObject jSONObject) {
        this.f47439a = C4605v0.m21739d(jSONObject, "a");
        this.f47440b = C4605v0.m21734a(jSONObject, "b");
        this.f47441c = m21585a(jSONObject);
        this.f47442d = m21587b(jSONObject);
        this.f47443e = m21586a(jSONObject, "e");
    }

    @Nullable
    /* renamed from: a */
    private Map<String, String> m21585a(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("c");
        if (optJSONObject == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap(optJSONObject.length());
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
            return Collections.unmodifiableMap(hashMap);
        } catch (Throwable th) {
            InternalLogger.m21369e(th, "Error parsing lazy push headers", new Object[0]);
            TrackersHub.getInstance().reportError("Error parsing lazy push headers", th);
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    private a m21587b(@NonNull JSONObject jSONObject) {
        if (jSONObject.has("d")) {
            try {
                return new a(jSONObject.getJSONObject("d"));
            } catch (JSONException e2) {
                InternalLogger.m21369e(e2, "Error parsing location for lazy push", new Object[0]);
                TrackersHub.getInstance().reportError("Error parsing location for lazy push", e2);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public long[] m21590c() {
        return this.f47443e;
    }

    @Nullable
    /* renamed from: d */
    public String m21591d() {
        return this.f47439a;
    }

    @Nullable
    /* renamed from: e */
    public Boolean m21592e() {
        return this.f47440b;
    }

    /* renamed from: com.yandex.metrica.push.impl.p$a */
    public static class a {

        /* renamed from: a */
        @Nullable
        private final EnumC7010a f47444a;

        /* renamed from: b */
        @Nullable
        private final Long f47445b;

        /* renamed from: c */
        @Nullable
        private final Long f47446c;

        /* renamed from: d */
        @Nullable
        private final Integer f47447d;

        public a(@NonNull JSONObject jSONObject) {
            this.f47444a = EnumC7010a.m21597a(C4605v0.m21737b(jSONObject, "a"));
            this.f47445b = C4605v0.m21738c(jSONObject, "b");
            this.f47446c = C4605v0.m21738c(jSONObject, "c");
            this.f47447d = C4605v0.m21737b(jSONObject, "d");
        }

        @Nullable
        /* renamed from: a */
        public Integer m21593a() {
            return this.f47447d;
        }

        @Nullable
        /* renamed from: b */
        public Long m21594b() {
            return this.f47446c;
        }

        @Nullable
        /* renamed from: c */
        public EnumC7010a m21595c() {
            return this.f47444a;
        }

        @Nullable
        /* renamed from: d */
        public Long m21596d() {
            return this.f47445b;
        }

        /* renamed from: com.yandex.metrica.push.impl.p$a$a, reason: collision with other inner class name */
        public enum EnumC7010a {
            PASSIVE(0, "passive"),
            NETWORK(1, "network"),
            GPS(2, "gps");


            /* renamed from: a */
            private final int f47452a;

            /* renamed from: b */
            @NonNull
            private final String f47453b;

            EnumC7010a(int i2, @NonNull String str) {
                this.f47452a = i2;
                this.f47453b = str;
            }

            @Nullable
            /* renamed from: a */
            public static EnumC7010a m21597a(@Nullable Integer num) {
                if (num == null) {
                    return null;
                }
                for (EnumC7010a enumC7010a : (EnumC7010a[]) values().clone()) {
                    if (enumC7010a.f47452a == num.intValue()) {
                        return enumC7010a;
                    }
                }
                return null;
            }

            @NonNull
            /* renamed from: a */
            public String m21598a() {
                return this.f47453b;
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public a m21589b() {
        return this.f47442d;
    }

    @Nullable
    /* renamed from: a */
    private static long[] m21586a(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (!jSONObject.has(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            long[] jArr = new long[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public Map<String, String> m21588a() {
        return this.f47441c;
    }
}
