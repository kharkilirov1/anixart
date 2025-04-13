package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.nativeads.C6218k;
import com.yandex.mobile.ads.nativeads.C6233r0;
import com.yandex.mobile.ads.nativeads.C6264w;

/* renamed from: com.yandex.mobile.ads.impl.d2 */
/* loaded from: classes3.dex */
public final class C4953d2 implements InterfaceC5000e2 {

    /* renamed from: a */
    @NonNull
    private final AdResponse f49542a;

    /* renamed from: b */
    @NonNull
    private final C5101g2 f49543b;

    /* renamed from: c */
    @NonNull
    private final C6218k f49544c;

    /* renamed from: d */
    @NonNull
    private final nh0 f49545d;

    /* renamed from: e */
    @NonNull
    private final s71 f49546e;

    /* renamed from: f */
    @NonNull
    private final C5521o3 f49547f;

    /* renamed from: g */
    @NonNull
    private final C6233r0 f49548g;

    /* renamed from: h */
    @Nullable
    private sv0.InterfaceC5763a f49549h;

    public C4953d2(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2, @NonNull C6218k c6218k, @NonNull C6233r0 c6233r0) {
        this.f49542a = adResponse;
        this.f49543b = c5101g2;
        this.f49544c = c6218k;
        this.f49548g = c6233r0;
        this.f49546e = new s71(new C4957d6(context, c5101g2));
        this.f49547f = new C5521o3(c6218k);
        this.f49545d = new nh0(context, adResponse, c5101g2);
    }

    /* renamed from: a */
    public final void m23791a(@NonNull sv0.InterfaceC5763a interfaceC5763a) {
        this.f49549h = interfaceC5763a;
        this.f49545d.m26913a(interfaceC5763a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5000e2
    /* renamed from: a */
    public final void mo23790a(@NonNull View view, @NonNull C5276ja c5276ja, @NonNull a80 a80Var, @NonNull C6264w c6264w) {
        this.f49544c.m30565a(a80Var);
        Context context = view.getContext();
        C4957d6 c4957d6 = new C4957d6(context, this.f49543b);
        AdResultReceiver m26989a = this.f49547f.m26989a();
        C6123zh m26912a = this.f49545d.m26912a(c5276ja.m25824b(), "url");
        dk0 dk0Var = new dk0(c4957d6, this.f49548g.m30634a(context, this.f49543b, m26989a));
        ck0 m23899a = dk0Var.m23899a(m26912a);
        C5774t c5774t = new C5774t(this.f49543b, this.f49542a, m26912a, dk0Var, c6264w, this.f49544c, this.f49549h);
        this.f49546e.m28077a(a80Var.m22403d());
        c5774t.m28383a(view, a80Var.m22400a());
        String m22404e = a80Var.m22404e();
        if (TextUtils.isEmpty(m22404e)) {
            return;
        }
        m23899a.mo23301a(m22404e);
    }
}
