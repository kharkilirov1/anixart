package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gh */
/* loaded from: classes3.dex */
public final class C5125gh {

    /* renamed from: a */
    @NotNull
    private final String f50587a;

    /* renamed from: b */
    @NotNull
    private final Map<String, String> f50588b;

    public C5125gh(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String str;
        Intrinsics.m32179h(scheme, "scheme");
        Intrinsics.m32179h(authParams, "authParams");
        this.f50587a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                Intrinsics.m32178g(US, "US");
                str = key.toLowerCase(US);
                Intrinsics.m32178g(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.m32178g(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f50588b = unmodifiableMap;
    }

    @JvmName
    @NotNull
    /* renamed from: a */
    public final Charset m24891a() {
        String str = this.f50588b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.m32178g(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.m32178g(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @JvmName
    @Nullable
    /* renamed from: b */
    public final String m24892b() {
        return this.f50588b.get("realm");
    }

    @JvmName
    @NotNull
    /* renamed from: c */
    public final String m24893c() {
        return this.f50587a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C5125gh) {
            C5125gh c5125gh = (C5125gh) obj;
            if (Intrinsics.m32174c(c5125gh.f50587a, this.f50587a) && Intrinsics.m32174c(c5125gh.f50588b, this.f50588b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50588b.hashCode() + o11.m26984a(this.f50587a, 899, 31);
    }

    @NotNull
    public final String toString() {
        return this.f50587a + " authParams=" + this.f50588b;
    }
}
