package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5461mv;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.kh0;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.v01;
import com.yandex.mobile.ads.impl.w10;
import com.yandex.mobile.ads.impl.zl0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.j */
/* loaded from: classes3.dex */
public final class C6216j {

    /* renamed from: a */
    @NonNull
    private final i71 f57711a = new i71();

    /* renamed from: b */
    @NonNull
    private final sj0 f57712b = new sj0();

    /* renamed from: c */
    @NonNull
    private final C6227o0 f57713c = new C6227o0();

    @NonNull
    /* renamed from: a */
    public final zl0 m30558a(@NonNull kh0 kh0Var, @NonNull eh0 eh0Var) {
        i71 i71Var = this.f57711a;
        ArrayList m24175h = eh0Var.m24175h();
        List<v01> m27741h = kh0Var.m26128c().m27741h();
        Objects.requireNonNull(i71Var);
        ArrayList m25456a = i71.m25456a(m24175h, m27741h);
        i71 i71Var2 = this.f57711a;
        ArrayList m24173f = eh0Var.m24173f();
        List<String> m27739f = kh0Var.m26128c().m27739f();
        Objects.requireNonNull(i71Var2);
        return new zl0(eh0Var.m24163b(), m25456a, i71.m25456a(m24173f, m27739f), eh0Var.m24156a(), eh0Var.m24167c());
    }

    @NonNull
    /* renamed from: a */
    public final C6219k0 m30559a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull w10 w10Var, @NonNull di0 di0Var) {
        C5461mv c5461mv = new C5461mv();
        C6217j0 c6217j0 = new C6217j0(this.f57712b.m28281a(context, kh0Var, w10Var, di0Var, c5461mv));
        return new C6219k0(context, c6217j0, w10Var, this.f57713c.m30601a(context, kh0Var, c6217j0, di0Var, c5461mv));
    }
}
