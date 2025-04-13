package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum bt0 {
    f48973b("http/1.0"),
    f48974c("http/1.1"),
    f48975d("spdy/3.1"),
    f48976e("h2"),
    f48977f("h2_prior_knowledge"),
    f48978g("quic");


    /* renamed from: a */
    @NotNull
    private final String f48980a;

    /* renamed from: com.yandex.mobile.ads.impl.bt0$a */
    public static final class C4885a {
        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static bt0 m22934a(@NotNull String protocol) throws IOException {
            Intrinsics.m32179h(protocol, "protocol");
            bt0 bt0Var = bt0.f48973b;
            if (!Intrinsics.m32174c(protocol, bt0Var.f48980a)) {
                bt0Var = bt0.f48974c;
                if (!Intrinsics.m32174c(protocol, bt0Var.f48980a)) {
                    bt0Var = bt0.f48977f;
                    if (!Intrinsics.m32174c(protocol, bt0Var.f48980a)) {
                        bt0Var = bt0.f48976e;
                        if (!Intrinsics.m32174c(protocol, bt0Var.f48980a)) {
                            bt0Var = bt0.f48975d;
                            if (!Intrinsics.m32174c(protocol, bt0Var.f48980a)) {
                                bt0Var = bt0.f48978g;
                                if (!Intrinsics.m32174c(protocol, bt0Var.f48980a)) {
                                    throw new IOException(um1.m29049a("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return bt0Var;
        }
    }

    bt0(String str) {
        this.f48980a = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.f48980a;
    }
}
