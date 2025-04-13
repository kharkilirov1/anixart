package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class me0 {

    /* renamed from: b */
    @NonNull
    private final ExecutorService f52654b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));

    /* renamed from: a */
    @NonNull
    private final Executor f52653a = new ko1(new Handler(Looper.getMainLooper()), 2);

    @NonNull
    /* renamed from: a */
    public final ExecutorService m26630a() {
        return this.f52654b;
    }

    @NonNull
    /* renamed from: b */
    public final Executor m26631b() {
        return this.f52653a;
    }
}
