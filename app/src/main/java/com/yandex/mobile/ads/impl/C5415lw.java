package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.lw */
/* loaded from: classes3.dex */
public final class C5415lw implements InterfaceC5719rz {

    /* renamed from: a */
    @NonNull
    private final AdResponse<String> f52542a;

    /* renamed from: b */
    @NonNull
    private final C5205hz f52543b;

    /* renamed from: c */
    @NonNull
    private final C6099z0 f52544c;

    /* renamed from: d */
    @Nullable
    private InterfaceC5693rk f52545d;

    /* renamed from: e */
    @Nullable
    private q71 f52546e;

    public C5415lw(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull AdResponse<String> adResponse, @NonNull AdResultReceiver adResultReceiver) {
        this.f52542a = adResponse;
        boolean m24796r = c5101g2.m24796r();
        this.f52543b = new C5205hz(context, c5101g2);
        this.f52544c = new C6099z0(context, m24796r, adResultReceiver);
    }

    /* renamed from: a */
    public final void m26540a(@Nullable InterfaceC5693rk interfaceC5693rk) {
        this.f52545d = interfaceC5693rk;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23257a(boolean z) {
    }

    /* renamed from: a */
    public final void m26539a(@Nullable q71 q71Var) {
        this.f52546e = q71Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23255a(@NonNull yo0 yo0Var, @Nullable Map map) {
        q71 q71Var = this.f52546e;
        if (q71Var != null) {
            q71Var.mo24273a(map);
        }
        InterfaceC5693rk interfaceC5693rk = this.f52545d;
        if (interfaceC5693rk != null) {
            interfaceC5693rk.mo27937a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23253a(@NonNull C5563p2 c5563p2) {
        InterfaceC5693rk interfaceC5693rk = this.f52545d;
        if (interfaceC5693rk != null) {
            interfaceC5693rk.mo27938a(c5563p2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23256a(@NonNull String str) {
        this.f52543b.m25400a(str, this.f52542a, this.f52544c);
    }
}
