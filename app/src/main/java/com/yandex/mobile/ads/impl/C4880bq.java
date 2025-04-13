package com.yandex.mobile.ads.impl;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bq */
/* loaded from: classes3.dex */
public final class C4880bq {

    /* renamed from: a */
    @NotNull
    private final g91 f48960a;

    public C4880bq(@NotNull bq0 tracker) {
        Intrinsics.m32179h(tracker, "tracker");
        this.f48960a = tracker;
    }

    /* renamed from: a */
    public final void m22921a(@NotNull Uri uri) {
        Intrinsics.m32179h(uri, "uri");
        String queryParameter = uri.getQueryParameter("trackingUrl");
        if (queryParameter != null) {
            if (queryParameter.length() > 0) {
                this.f48960a.mo22922a(queryParameter);
            }
        }
    }
}
