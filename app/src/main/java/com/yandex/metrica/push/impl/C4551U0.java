package com.yandex.metrica.push.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.push.impl.U0 */
/* loaded from: classes2.dex */
public class C4551U0 {

    /* renamed from: a */
    @NonNull
    private final HandlerThread f47314a;

    /* renamed from: b */
    @NonNull
    private final Handler f47315b;

    public C4551U0(@NonNull String str) {
        this(m21475a(str));
    }

    @NonNull
    /* renamed from: a */
    public Looper m21476a() {
        return this.f47314a.getLooper();
    }

    private C4551U0(@NonNull HandlerThread handlerThread) {
        this(handlerThread, new Handler(handlerThread.getLooper()));
    }

    /* renamed from: a */
    public void m21477a(@NonNull Runnable runnable) {
        this.f47315b.post(runnable);
    }

    @VisibleForTesting
    public C4551U0(@NonNull HandlerThread handlerThread, @NonNull Handler handler) {
        this.f47314a = handlerThread;
        this.f47315b = handler;
    }

    @NonNull
    /* renamed from: a */
    private static HandlerThread m21475a(@NonNull String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread;
    }
}
