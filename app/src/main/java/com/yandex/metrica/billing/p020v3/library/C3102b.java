package com.yandex.metrica.billing.p020v3.library;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.billing.v3.library.b */
/* loaded from: classes2.dex */
class C3102b {

    /* renamed from: a */
    @NonNull
    public final Handler f42337a;

    /* renamed from: b */
    @NonNull
    public final BillingClient f42338b;

    /* renamed from: c */
    public final Set<Object> f42339c;

    public C3102b(@NonNull BillingClient billingClient) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f42338b = billingClient;
        this.f42339c = new HashSet();
        this.f42337a = handler;
    }

    @WorkerThread
    /* renamed from: a */
    public void m17780a(@NonNull Object obj) {
        this.f42339c.remove(obj);
        if (this.f42339c.size() == 0) {
            this.f42337a.post(new C3101a(this));
        }
    }
}
