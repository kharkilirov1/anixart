package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pl */
/* loaded from: classes3.dex */
public final class C5595pl {
    @JvmStatic
    @JvmOverloads
    @NotNull
    /* renamed from: a */
    public static final String m27337a(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        Intrinsics.m32179h(username, "username");
        Intrinsics.m32179h(password, "password");
        Intrinsics.m32179h(charset, "charset");
        return um1.m29049a("Basic ", ByteString.f68753f.m34591c(username + ':' + password, charset).mo34574a());
    }
}
