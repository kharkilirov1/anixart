package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.p */
/* loaded from: classes2.dex */
public final class C3147p {

    /* renamed from: a */
    public static final Intent f42506a;

    static {
        Intent intent = new Intent("com.yandex.android.advid.IDENTIFIER_SERVICE").setPackage("com.yandex.android.advid");
        Intrinsics.m32178g(intent, "Intent(\"com.yandex.andro…om.yandex.android.advid\")");
        f42506a = intent;
    }
}
