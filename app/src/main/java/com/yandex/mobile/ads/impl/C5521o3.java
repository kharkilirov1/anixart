package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.nativeads.C6218k;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.o3 */
/* loaded from: classes3.dex */
public final class C5521o3 implements InterfaceC5315k2 {

    /* renamed from: a */
    @NonNull
    private final AdResultReceiver f53139a;

    /* renamed from: b */
    @NonNull
    private final WeakReference<C6218k> f53140b;

    public C5521o3(@NonNull C6218k c6218k) {
        this.f53140b = new WeakReference<>(c6218k);
        AdResultReceiver adResultReceiver = new AdResultReceiver(new Handler(Looper.getMainLooper()));
        this.f53139a = adResultReceiver;
        adResultReceiver.m21912a(this);
    }

    @NonNull
    /* renamed from: a */
    public final AdResultReceiver m26989a() {
        return this.f53139a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5315k2
    public final void onReceiveResult(int i2, @Nullable Bundle bundle) {
        C6218k c6218k = this.f53140b.get();
        if (c6218k != null) {
            if (i2 == 19) {
                c6218k.m30573g();
            }
            if (i2 == 20) {
                c6218k.m30572f();
                return;
            }
            switch (i2) {
                case 6:
                    c6218k.m30571e();
                    break;
                case 7:
                    c6218k.m30570d();
                    break;
                case 8:
                    c6218k.m30569c();
                    break;
                case 9:
                    c6218k.m30568b();
                    break;
            }
        }
    }
}
