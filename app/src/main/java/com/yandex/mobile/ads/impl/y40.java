package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class y40 {

    /* renamed from: a */
    @NonNull
    private final C6098z f56667a;

    /* renamed from: com.yandex.mobile.ads.impl.y40$a */
    public static class C6057a implements InterfaceC4832b0 {
        private C6057a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4832b0
        public final void onReturnedToApplication() {
        }

        public /* synthetic */ C6057a(int i2) {
            this();
        }
    }

    public y40(@NonNull Context context, @NonNull C5083fl c5083fl) {
        C5101g2 c5101g2 = new C5101g2(EnumC5007e6.f49821g);
        C5238il m26148a = C5343kl.m26148a(c5083fl);
        this.f56667a = new C6098z(context, c5101g2, new C6057a(0), m26148a != null ? m26148a.m25557a() : null);
    }

    /* renamed from: a */
    public final void m29861a() {
        this.f56667a.m30006e();
    }
}
