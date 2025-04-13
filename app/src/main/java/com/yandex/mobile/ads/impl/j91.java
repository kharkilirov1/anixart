package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j91 {
    @NotNull
    /* renamed from: a */
    public static Intent m25822a(@NotNull Context context, @NotNull String url) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }
}
