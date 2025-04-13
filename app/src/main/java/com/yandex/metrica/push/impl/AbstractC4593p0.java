package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.p0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4593p0 implements InterfaceC4589n0 {

    /* renamed from: a */
    @NonNull
    private final a f47454a;

    /* renamed from: b */
    @NonNull
    private final String f47455b;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.yandex.metrica.push.impl.p0$a */
    public static final class a {

        /* renamed from: c */
        public static final a f47456c = new a("EVENT_PUSH_TOKEN", 0, 14, "Push token");

        /* renamed from: d */
        public static final a f47457d = new a("EVENT_NOTIFICATION", 1, 15, "Push notification");

        /* renamed from: a */
        private final int f47458a;

        /* renamed from: b */
        @NonNull
        private final String f47459b;

        private a(String str, int i2, int i3, String str2) {
            this.f47458a = i3;
            this.f47459b = str2;
        }

        @NonNull
        /* renamed from: a */
        public String m21602a() {
            return this.f47459b;
        }

        /* renamed from: b */
        public int m21603b() {
            return this.f47458a;
        }
    }

    public AbstractC4593p0(@NonNull a aVar, @NonNull String str) {
        this.f47454a = aVar;
        this.f47455b = str;
    }

    @NonNull
    /* renamed from: b */
    public Map<String, String> m21599b() {
        HashMap hashMap = new HashMap();
        hashMap.put("appmetrica_push_version", String.valueOf(2001001));
        hashMap.put("appmetrica_push_version_name", "2.1.1");
        hashMap.put("appmetrica_push_transport", this.f47455b);
        return hashMap;
    }

    @NonNull
    /* renamed from: c */
    public String m21600c() {
        return this.f47454a.m21602a();
    }

    /* renamed from: d */
    public int m21601d() {
        return this.f47454a.m21603b();
    }
}
