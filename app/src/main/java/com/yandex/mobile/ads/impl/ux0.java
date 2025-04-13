package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.div2.DivData;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ux0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5896v0 f55699a;

    /* renamed from: b */
    @NonNull
    private final C6086yp f55700b = new C6086yp();

    /* renamed from: c */
    private final int f55701c;

    public ux0(@NonNull InterfaceC5896v0 interfaceC5896v0, int i2) {
        this.f55699a = interfaceC5896v0;
        this.f55701c = i2;
    }

    @Nullable
    /* renamed from: a */
    public final C5812tp m29147a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull C5612q0 c5612q0, @NonNull InterfaceC5541ok interfaceC5541ok, @Nullable C5600pp c5600pp) {
        DivData m25353a;
        try {
            Objects.requireNonNull(this.f55700b);
            if (!C6086yp.m29956a(context) || c5600pp == null || (m25353a = C5195hp.m25353a(c5600pp)) == null) {
                return null;
            }
            return new C5812tp(m25353a, m29146a(context, adResponse, interfaceC6256u, c5612q0, interfaceC5541ok), this.f55699a, this.f55701c);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    /* renamed from: a */
    private C5540oj m29146a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull C5612q0 c5612q0, @NonNull InterfaceC5541ok interfaceC5541ok) {
        rx0 rx0Var = new rx0(context, new C5505np(interfaceC6256u, interfaceC5541ok), interfaceC5541ok);
        C5923vj c5923vj = new C5923vj(rx0Var, new jx0(this.f55699a));
        o61 o61Var = new o61();
        sh0 sh0Var = new sh0();
        zj0 mo30560a = interfaceC6256u.mo30560a();
        return new C5540oj(new sx0(adResponse, c5612q0, rx0Var, sh0Var, mo30560a), new ix0(adResponse, c5612q0, c5923vj, mo30560a), new by0(adResponse, c5612q0, o61Var, mo30560a));
    }
}
