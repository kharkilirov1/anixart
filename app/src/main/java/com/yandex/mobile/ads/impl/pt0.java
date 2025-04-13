package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class pt0 implements qt0 {
    /* renamed from: a */
    public final void m27374a(int i2, @NotNull Buffer source) throws IOException {
        Intrinsics.m32179h(source, "source");
        source.skip(i2);
    }

    /* renamed from: a */
    public final void m27375a(@NotNull EnumC5708rr errorCode) {
        Intrinsics.m32179h(errorCode, "errorCode");
    }

    /* renamed from: a */
    public final void m27376a(@NotNull List responseHeaders) {
        Intrinsics.m32179h(responseHeaders, "responseHeaders");
    }

    /* renamed from: b */
    public final void m27377b(@NotNull List requestHeaders) {
        Intrinsics.m32179h(requestHeaders, "requestHeaders");
    }
}
