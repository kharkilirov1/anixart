package com.yandex.mobile.ads.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5315k2;
import com.yandex.mobile.ads.impl.n60;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class AdResultReceiver extends ResultReceiver implements InterfaceC5315k2 {

    /* renamed from: a */
    private WeakReference<InterfaceC5315k2> f47733a;

    public AdResultReceiver(Handler handler) {
        super(handler);
        this.f47733a = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void m21912a(InterfaceC5315k2 interfaceC5315k2) {
        this.f47733a = new WeakReference<>(interfaceC5315k2);
    }

    @Override // android.os.ResultReceiver, com.yandex.mobile.ads.impl.InterfaceC5315k2
    public final void onReceiveResult(int i2, @Nullable Bundle bundle) {
        InterfaceC5315k2 interfaceC5315k2;
        WeakReference<InterfaceC5315k2> weakReference = this.f47733a;
        if (weakReference == null || (interfaceC5315k2 = weakReference.get()) == null) {
            return;
        }
        interfaceC5315k2.onReceiveResult(i2, bundle);
        n60.m26811d("Result was obtained in the receiver, result code: %d", Integer.valueOf(i2));
    }
}
