package com.yandex.mobile.ads.core.identifiers.p024ad.gms.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.n60;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.gms.service.c */
/* loaded from: classes2.dex */
final class ServiceConnectionC4660c implements ServiceConnection {

    /* renamed from: a */
    @NonNull
    private final LinkedBlockingQueue f47800a = new LinkedBlockingQueue();

    @Nullable
    /* renamed from: a */
    public final IBinder m21970a() throws InterruptedException {
        return (IBinder) this.f47800a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        try {
            this.f47800a.put(iBinder);
        } catch (InterruptedException e2) {
            n60.m26808a(e2, "Exception during put into queue", new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        try {
            this.f47800a.clear();
        } catch (UnsupportedOperationException e2) {
            n60.m26808a(e2, "Exception during queue clear", new Object[0]);
        }
    }
}
