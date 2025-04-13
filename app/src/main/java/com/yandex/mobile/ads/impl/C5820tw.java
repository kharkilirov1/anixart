package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.tw */
/* loaded from: classes3.dex */
public final class C5820tw {
    @NotNull
    /* renamed from: a */
    public static Intent m28762a(@NotNull Context context, long j2, @NotNull ResultReceiver receiver) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(receiver, "receiver");
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        ResultReceiver m26575a = C5427m6.m26575a(receiver);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("extra_receiver", m26575a);
        intent.putExtra("data_identifier", j2);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
