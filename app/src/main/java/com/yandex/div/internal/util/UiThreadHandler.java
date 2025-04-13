package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UiThreadHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/util/UiThreadHandler;", "", "utils_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UiThreadHandler {

    /* renamed from: a */
    @NotNull
    public static final UiThreadHandler f33903a = new UiThreadHandler();

    /* renamed from: b */
    @NotNull
    public static final Handler f33904b = new Handler(Looper.getMainLooper());

    @JvmStatic
    /* renamed from: a */
    public static final boolean m17397a() {
        return Intrinsics.m32174c(Thread.currentThread(), Looper.getMainLooper().getThread());
    }
}
