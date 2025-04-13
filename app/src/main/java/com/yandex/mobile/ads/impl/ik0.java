package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C6235s0;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ik0 {

    /* renamed from: a */
    @NonNull
    private final Context f51321a;

    /* renamed from: b */
    @NonNull
    private final hk0 f51322b;

    /* renamed from: c */
    @NonNull
    private final uh0 f51323c;

    /* renamed from: com.yandex.mobile.ads.impl.ik0$b */
    public interface InterfaceC5236b {
        /* renamed from: a */
        void mo24207a(@NonNull C5563p2 c5563p2);

        /* renamed from: a */
        void mo24208a(@NonNull NativeAd nativeAd);
    }

    public ik0(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull C5724s3 c5724s3) {
        Context applicationContext = context.getApplicationContext();
        this.f51321a = applicationContext;
        c5101g2.m24769a(kk0.f51997b);
        this.f51322b = new hk0(context);
        this.f51323c = new uh0(applicationContext, c5101g2, c5724s3);
    }

    /* renamed from: a */
    public final void m25556a(@NonNull AdResponse<String> adResponse, @NonNull InterfaceC5236b interfaceC5236b, @NonNull zw0 zw0Var) {
        this.f51322b.m25231a(adResponse, new C5235a(adResponse, interfaceC5236b, zw0Var));
    }

    /* renamed from: com.yandex.mobile.ads.impl.ik0$a */
    public class C5235a implements zw0 {

        /* renamed from: a */
        @NonNull
        private final AdResponse<String> f51324a;

        /* renamed from: b */
        @NonNull
        private final InterfaceC5236b f51325b;

        /* renamed from: c */
        @NonNull
        private final zw0 f51326c;

        /* renamed from: d */
        @NonNull
        private final dl1 f51327d = new dl1();

        public C5235a(AdResponse<String> adResponse, @NonNull InterfaceC5236b interfaceC5236b, @NonNull zw0 zw0Var) {
            this.f51324a = adResponse;
            this.f51325b = interfaceC5236b;
            this.f51326c = zw0Var;
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24203a() {
            C5563p2 c5563p2 = AbstractC5524o4.f53152d;
            this.f51326c.mo24203a();
            this.f51325b.mo24207a(c5563p2);
        }

        @Override // com.yandex.mobile.ads.impl.zw0
        /* renamed from: a */
        public final void mo24204a(@NonNull qi0 qi0Var) {
            this.f51326c.mo24204a(qi0Var);
            AdResponse<String> adResponse = this.f51324a;
            InterfaceC5236b interfaceC5236b = this.f51325b;
            Objects.requireNonNull(this.f51327d);
            C6235s0 c6235s0 = new C6235s0();
            ik0.this.f51323c.m28999a(ik0.this.f51321a, adResponse, qi0Var, new di0(new zj1(adResponse), new yj1(), c6235s0, new yk1(adResponse), new nl1()), new hj0(interfaceC5236b));
        }
    }

    /* renamed from: a */
    public final void m25555a() {
        this.f51323c.m28998a();
    }
}
