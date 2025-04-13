package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.y6 */
/* loaded from: classes3.dex */
public final class C6059y6 {

    /* renamed from: a */
    @NonNull
    private final Context f56670a;

    /* renamed from: b */
    @NonNull
    private final InstreamAdRequestConfiguration f56671b;

    /* renamed from: c */
    @NonNull
    private final C4902c4 f56672c = new C4902c4();

    /* renamed from: d */
    @NonNull
    private final xe1 f56673d = new xe1();

    /* renamed from: e */
    @NonNull
    private final C5508ns f56674e = new C5508ns();

    public C6059y6(@NonNull Context context, @NonNull InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f56670a = context.getApplicationContext();
        this.f56671b = instreamAdRequestConfiguration;
    }

    @NonNull
    /* renamed from: a */
    public final j40 m29863a() {
        n80 n80Var = new n80(this.f56670a, this.f56671b);
        C6107z5 c6107z5 = new C6107z5();
        yq0 yq0Var = new yq0();
        je1 m29962a = yq0Var.m29962a();
        C5603ps m29964c = yq0Var.m29964c();
        sr0 sr0Var = new sr0();
        C5003e4 c5003e4 = new C5003e4(new C6058y5(new C5710rt(sr0Var, m29962a)));
        ye1 ye1Var = new ye1();
        C5914ve c5914ve = new C5914ve();
        Objects.requireNonNull(this.f56674e);
        C4794a6 m30057b = c6107z5.m30057b();
        C6104z3 m30058c = c6107z5.m30058c();
        C5603ps m29964c2 = yq0Var.m29964c();
        je1 m29962a2 = yq0Var.m29962a();
        C5054f2 c5054f2 = new C5054f2(c5914ve, c6107z5, yq0Var, c5003e4);
        he1 he1Var = new he1(m30058c, m29962a2, sr0Var, ye1Var);
        xq0 xq0Var = new xq0(m30057b, c5054f2, he1Var, c5003e4);
        qq0 qq0Var = new qq0(m30058c, sr0Var, m29962a2, xq0Var);
        tq0 tq0Var = new tq0(m30057b, c5003e4);
        fq0 fq0Var = new fq0(c5914ve, yq0Var, c6107z5, he1Var, new C5710rt(sr0Var, m29962a2), c5054f2);
        C5457ms c5457ms = new C5457ms(c5914ve, m29964c2, qq0Var, xq0Var, tq0Var, new l61(m30058c, yq0Var, new C4795a7(c5914ve, m30058c, m29962a2, sr0Var), fq0Var), fq0Var);
        C4791a4 c4791a4 = new C4791a4(m29962a);
        Objects.requireNonNull(this.f56672c);
        C4794a6 m30057b2 = c6107z5.m30057b();
        C6104z3 m30058c2 = c6107z5.m30058c();
        je1 m29962a3 = yq0Var.m29962a();
        C5603ps m29964c3 = yq0Var.m29964c();
        ls0 ls0Var = new ls0(new C5267j4(m30057b2, yq0Var));
        m29964c3.m27371a(ls0Var);
        C4937cs c4937cs = new C4937cs(m30057b2, yq0Var, ls0Var, new C5103g4(c6107z5, new C5837u2(m29962a3, m30058c2)), new C5056f4(c6107z5, yq0Var, c5003e4), c5003e4);
        Objects.requireNonNull(this.f56673d);
        C4794a6 m30057b3 = c6107z5.m30057b();
        C5603ps m29964c4 = yq0Var.m29964c();
        ls0 ls0Var2 = new ls0(new ff1(m30057b3, yq0Var, sr0Var));
        m29964c4.m27371a(ls0Var2);
        return new j40(c6107z5, c4791a4, new C5857ue(this.f56670a, c4937cs, new rl1(ls0Var2, yq0Var.m29966e(), ye1Var)), c5914ve, n80Var, yq0Var, new C5144gs(c5914ve, c6107z5, c5003e4, m29964c), sr0Var, c5457ms);
    }
}
