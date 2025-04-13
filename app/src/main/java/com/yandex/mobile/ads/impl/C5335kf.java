package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kf */
/* loaded from: classes3.dex */
public final class C5335kf {

    /* renamed from: a */
    @NotNull
    private final Context f51961a;

    /* renamed from: b */
    @NotNull
    private final ResultReceiver f51962b;

    public C5335kf(@NotNull Context context, @NotNull ResultReceiver receiver) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(receiver, "receiver");
        this.f51961a = context;
        this.f51962b = receiver;
    }

    @NotNull
    /* renamed from: a */
    public final Intent m26117a(@NotNull String browserUrl) {
        Intrinsics.m32179h(browserUrl, "browserUrl");
        Intent intent = new Intent(this.f51961a, (Class<?>) AdActivity.class);
        ResultReceiver m26575a = C5427m6.m26575a(this.f51962b);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_receiver", m26575a);
        intent.putExtra("extra_browser_url", browserUrl);
        if (!(this.f51961a instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
