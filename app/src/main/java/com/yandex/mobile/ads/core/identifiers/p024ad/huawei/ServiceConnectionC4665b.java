package com.yandex.mobile.ads.core.identifiers.p024ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.core.identifiers.p024ad.huawei.OpenDeviceIdentifierService;
import com.yandex.mobile.ads.impl.n60;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.huawei.b */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4665b implements ServiceConnection {

    /* renamed from: a */
    @NonNull
    private final LinkedBlockingQueue f47812a = new LinkedBlockingQueue();

    @Nullable
    /* renamed from: a */
    public final OpenDeviceIdentifierService m21975a() throws InterruptedException {
        return (OpenDeviceIdentifierService) this.f47812a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        try {
            this.f47812a.put(OpenDeviceIdentifierService.Stub.asInterface(iBinder));
        } catch (Exception e2) {
            n60.m26808a(e2, "Exception during put into queue", new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        try {
            this.f47812a.clear();
        } catch (UnsupportedOperationException e2) {
            n60.m26808a(e2, "Exception during queue clear", new Object[0]);
        }
    }
}
