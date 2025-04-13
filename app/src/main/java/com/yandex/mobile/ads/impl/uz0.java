package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.gz0;
import com.yandex.mobile.ads.impl.wz0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class uz0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ wz0.InterfaceC5998a f55709b;

    /* renamed from: c */
    public final /* synthetic */ wz0 f55710c;

    public uz0(wz0 wz0Var, wz0.InterfaceC5998a interfaceC5998a) {
        this.f55710c = wz0Var;
        this.f55709b = interfaceC5998a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gz0 gz0Var;
        l01 l01Var;
        gz0Var = this.f55710c.f56310h;
        l01Var = this.f55710c.f56312j;
        gz0Var.m25012a(l01Var, new C5894a());
    }

    /* renamed from: com.yandex.mobile.ads.impl.uz0$a */
    public class C5894a implements gz0.InterfaceC5154a {
        public C5894a() {
        }

        @Override // com.yandex.mobile.ads.impl.gz0.InterfaceC5154a
        /* renamed from: a */
        public final void mo25013a() {
            C5548or c5548or;
            C5961w7 c5961w7;
            wz0.m29607h(uz0.this.f55710c);
            c5548or = uz0.this.f55710c.f56314l;
            C5507nr m27101a = c5548or.m27101a();
            we0.m29477a();
            uz0 uz0Var = uz0.this;
            wz0.InterfaceC5998a interfaceC5998a = uz0Var.f55709b;
            c5961w7 = uz0Var.f55710c.f56311i;
            interfaceC5998a.mo26147a(c5961w7, m27101a);
        }

        @Override // com.yandex.mobile.ads.impl.gz0.InterfaceC5154a
        /* renamed from: a */
        public final void mo25014a(@NonNull qh1 qh1Var) {
            C5422m2 c5422m2;
            C5563p2 c5563p2;
            c5422m2 = uz0.this.f55710c.f56313k;
            Objects.requireNonNull(c5422m2);
            if (qh1Var instanceof C5372l2) {
                c5563p2 = C5616q2.m27602a(null, ((C5372l2) qh1Var).m26318a());
            } else {
                c5563p2 = AbstractC5524o4.f53151c;
            }
            uz0.this.f55709b.mo26146a(c5563p2);
        }
    }
}
