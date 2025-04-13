package com.yandex.mobile.ads.impl;

import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ry */
/* loaded from: classes3.dex */
public final class C5718ry {
    @NotNull
    /* renamed from: a */
    public static FutureTask m28030a(@NotNull String host) {
        Intrinsics.m32179h(host, "host");
        FutureTask futureTask = new FutureTask(new CallableC5892uy(host));
        new Thread(futureTask).start();
        return futureTask;
    }
}
