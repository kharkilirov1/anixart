package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public enum u40 {
    f55387b("design_v1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("design_v2");


    /* renamed from: a */
    @NotNull
    private final String f55389a;

    /* renamed from: com.yandex.mobile.ads.impl.u40$a */
    public static final class C5842a {
        @Nullable
        /* renamed from: a */
        public static u40 m28883a(@NotNull String value) {
            Intrinsics.m32179h(value, "value");
            for (u40 u40Var : u40.values()) {
                if (Intrinsics.m32174c(u40Var.m28882a(), value)) {
                    return u40Var;
                }
            }
            return null;
        }
    }

    u40(String str) {
        this.f55389a = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m28882a() {
        return this.f55389a;
    }
}
