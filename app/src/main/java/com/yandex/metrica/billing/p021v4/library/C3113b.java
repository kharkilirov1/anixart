package com.yandex.metrica.billing.p021v4.library;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.billing.v4.library.b */
/* loaded from: classes2.dex */
public final class C3113b {

    /* renamed from: a */
    public final Set<Object> f42380a;

    /* renamed from: b */
    public final BillingClient f42381b;

    /* renamed from: c */
    public final Handler f42382c;

    public C3113b(BillingClient billingClient, Handler handler, int i2) {
        Handler mainHandler = (i2 & 2) != 0 ? new Handler(Looper.getMainLooper()) : null;
        Intrinsics.m32179h(mainHandler, "mainHandler");
        this.f42381b = billingClient;
        this.f42382c = mainHandler;
        this.f42380a = new LinkedHashSet();
    }

    @WorkerThread
    /* renamed from: a */
    public final void m17788a(@NotNull Object listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f42380a.remove(listener);
        if (this.f42380a.size() == 0) {
            this.f42382c.post(new C3112a(this));
        }
    }
}
