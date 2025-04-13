package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum q61 {
    f53947b("TLSv1.3"),
    f53948c("TLSv1.2"),
    f53949d("TLSv1.1"),
    f53950e("TLSv1"),
    f53951f("SSLv3");


    /* renamed from: a */
    @NotNull
    private final String f53953a;

    /* renamed from: com.yandex.mobile.ads.impl.q61$a */
    public static final class C5622a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static q61 m27647a(@NotNull String javaName) {
            Intrinsics.m32179h(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return q61.f53949d;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return q61.f53948c;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return q61.f53947b;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return q61.f53950e;
                }
            } else if (javaName.equals("SSLv3")) {
                return q61.f53951f;
            }
            throw new IllegalArgumentException(um1.m29049a("Unexpected TLS version: ", javaName));
        }
    }

    q61(String str) {
        this.f53953a = str;
    }

    @JvmName
    @NotNull
    /* renamed from: a */
    public final String m27646a() {
        return this.f53953a;
    }
}
