package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.rx */
/* loaded from: classes3.dex */
public final class C5717rx {
    @NotNull
    /* renamed from: a */
    public final String m28028a() {
        byte[] decode = Base64.decode("c2Ftc3VuZw==", 0);
        Intrinsics.m32178g(decode, "decode(\"c2Ftc3VuZw==\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: b */
    public final String m28029b() {
        byte[] decode = Base64.decode("WFQxNjUw", 0);
        Intrinsics.m32178g(decode, "decode(\"WFQxNjUw\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }
}
