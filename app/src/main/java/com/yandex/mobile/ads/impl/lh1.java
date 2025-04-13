package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lh1 {

    /* renamed from: a */
    @NonNull
    private final String f52415a;

    /* renamed from: b */
    @NonNull
    private final String f52416b;

    /* renamed from: c */
    @NonNull
    private final String f52417c;

    /* renamed from: d */
    @Nullable
    private final Map<String, String> f52418d;

    /* renamed from: com.yandex.mobile.ads.impl.lh1$a */
    public static final class C5398a {

        /* renamed from: a */
        @NonNull
        private final String f52419a;

        /* renamed from: b */
        @NonNull
        private final String f52420b;

        /* renamed from: c */
        @Nullable
        private Map<String, String> f52421c;

        public C5398a(@NonNull String str, @NonNull String str2) {
            this.f52419a = str;
            this.f52420b = str2;
        }

        @NonNull
        /* renamed from: a */
        public final C5398a m26472a(@Nullable Map<String, String> map) {
            this.f52421c = map;
            return this;
        }
    }

    public /* synthetic */ lh1(C5398a c5398a, int i2) {
        this(c5398a);
    }

    @NonNull
    /* renamed from: a */
    public final String m26465a() {
        return this.f52415a;
    }

    @NonNull
    /* renamed from: b */
    public final String m26466b() {
        return this.f52416b;
    }

    @NonNull
    /* renamed from: c */
    public final String m26467c() {
        return this.f52417c;
    }

    @Nullable
    /* renamed from: d */
    public final Map<String, String> m26468d() {
        return this.f52418d;
    }

    private lh1(@NonNull C5398a c5398a) {
        this.f52415a = "v2";
        this.f52416b = c5398a.f52419a;
        this.f52417c = c5398a.f52420b;
        this.f52418d = c5398a.f52421c;
    }
}
