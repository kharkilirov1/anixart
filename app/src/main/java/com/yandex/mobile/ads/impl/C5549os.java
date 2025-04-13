package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.rq0;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.os */
/* loaded from: classes3.dex */
final class C5549os {

    /* renamed from: c */
    private static final long f53320c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    @NonNull
    private final lp0 f53321a = new lp0(false);

    /* renamed from: b */
    @NonNull
    private final rq0.InterfaceC5706b f53322b;

    /* renamed from: com.yandex.mobile.ads.impl.os$a */
    public class a implements mp0 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.mp0
        /* renamed from: a */
        public final void mo24218a() {
            C5549os.this.f53322b.mo23468b(C5043es.m24244a());
        }

        public /* synthetic */ a(C5549os c5549os, int i2) {
            this();
        }
    }

    public C5549os(@NonNull rq0.InterfaceC5706b interfaceC5706b) {
        this.f53322b = interfaceC5706b;
    }

    /* renamed from: b */
    public final void m27105b() {
        this.f53321a.m26513a();
    }

    /* renamed from: a */
    public final void m27104a() {
        this.f53321a.m26514a(f53320c, new a(this, 0));
    }
}
