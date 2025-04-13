package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C6226o;
import com.yandex.mobile.ads.nativeads.C6235s0;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class gl1 implements fj0 {

    /* renamed from: a */
    @NonNull
    private final WeakReference<C6226o> f50665a;

    /* renamed from: b */
    @NonNull
    private final dl1 f50666b = new dl1();

    /* renamed from: c */
    @NonNull
    private final ck1 f50667c;

    /* renamed from: d */
    @NonNull
    private final aj0 f50668d;

    public gl1(@NonNull C6226o c6226o) {
        this.f50665a = new WeakReference<>(c6226o);
        this.f50667c = new ck1(c6226o.m28616d());
        this.f50668d = new aj0(c6226o.m28616d());
    }

    @Override // com.yandex.mobile.ads.impl.fj0
    /* renamed from: a */
    public final void mo24610a(@NonNull Context context, @NonNull AdResponse<qi0> adResponse) {
        C6226o c6226o = this.f50665a.get();
        if (c6226o != null) {
            c6226o.m28617e().m28055b(EnumC5668r3.f54168a);
            bj0 bj0Var = new bj0(adResponse.m21801B());
            this.f50667c.m23304a(context, adResponse, this.f50668d);
            this.f50667c.m23305a(context, adResponse, bj0Var);
            Objects.requireNonNull(this.f50666b);
            C6235s0 c6235s0 = new C6235s0();
            c6226o.m30595a(adResponse, new di0(new zj1(adResponse), new yj1(), c6235s0, new yk1(adResponse), new nl1()), "Yandex");
        }
    }
}
