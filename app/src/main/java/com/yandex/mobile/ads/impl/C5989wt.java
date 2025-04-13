package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.google.android.exoplayer2.audio.RunnableC0977d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wt */
/* loaded from: classes3.dex */
public final class C5989wt {

    /* renamed from: a */
    @NotNull
    private final g90 f56266a;

    public C5989wt(@NotNull g90 mainThreadHandler) {
        Intrinsics.m32179h(mainThreadHandler, "mainThreadHandler");
        this.f56266a = mainThreadHandler;
    }

    /* renamed from: a */
    public final void m29565a(@NotNull Function0<Unit> successCallback) {
        Intrinsics.m32179h(successCallback, "successCallback");
        this.f56266a.m24830a(new RunnableC0977d(SystemClock.elapsedRealtime(), successCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m29563a(long j2, Function0 successCallback) {
        Intrinsics.m32179h(successCallback, "$successCallback");
        if (SystemClock.elapsedRealtime() - j2 <= 5000) {
            successCallback.invoke();
        }
    }
}
