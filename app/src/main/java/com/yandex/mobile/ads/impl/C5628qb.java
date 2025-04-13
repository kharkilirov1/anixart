package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.qb */
/* loaded from: classes3.dex */
public final class C5628qb {
    @NotNull
    /* renamed from: a */
    public final String m27666a() {
        byte[] decode = Base64.decode("QW1hem9u", 0);
        Intrinsics.m32178g(decode, "decode(\"QW1hem9u\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: b */
    public final String m27667b() {
        byte[] decode = Base64.decode("ZnVndQ==", 0);
        Intrinsics.m32178g(decode, "decode(\"ZnVndQ==\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: c */
    public final String m27668c() {
        byte[] decode = Base64.decode("WGlhb21p", 0);
        Intrinsics.m32178g(decode, "decode(\"WGlhb21p\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }
}
