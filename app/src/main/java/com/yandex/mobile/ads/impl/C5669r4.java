package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r4 */
/* loaded from: classes3.dex */
public final class C5669r4 {
    @NotNull
    /* renamed from: a */
    public final String m27827a() {
        byte[] decode = Base64.decode("ZGV2aWNlLWlk", 0);
        Intrinsics.m32178g(decode, "decode(\"ZGV2aWNlLWlk\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: b */
    public final String m27828b() {
        byte[] decode = Base64.decode("ZGV2aWNlX3R5cGU=", 0);
        Intrinsics.m32178g(decode, "decode(\"ZGV2aWNlX3R5cGU=\",\n      Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: c */
    public final String m27829c() {
        byte[] decode = Base64.decode("bWFudWZhY3R1cmVy", 0);
        Intrinsics.m32178g(decode, "decode(\"bWFudWZhY3R1cmVy\",\n      Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: d */
    public final String m27830d() {
        byte[] decode = Base64.decode("bW9kZWw=", 0);
        Intrinsics.m32178g(decode, "decode(\"bW9kZWw=\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: e */
    public final String m27831e() {
        byte[] decode = Base64.decode("b3NfbmFtZQ==", 0);
        Intrinsics.m32178g(decode, "decode(\"b3NfbmFtZQ==\", Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: f */
    public final String m27832f() {
        byte[] decode = Base64.decode("b3NfdmVyc2lvbg==", 0);
        Intrinsics.m32178g(decode, "decode(\"b3NfdmVyc2lvbg==\",\n      Base64.DEFAULT)");
        return new String(decode, Charsets.f66855b);
    }
}
