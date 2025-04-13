package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C4953d2;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.C6077yh;
import com.yandex.mobile.ads.impl.InterfaceC5000e2;
import com.yandex.mobile.ads.impl.InterfaceC5512nv;
import com.yandex.mobile.ads.impl.InterfaceC6027xh;
import com.yandex.mobile.ads.impl.a80;
import com.yandex.mobile.ads.impl.bv0;
import com.yandex.mobile.ads.impl.l20;

/* renamed from: com.yandex.mobile.ads.nativeads.b */
/* loaded from: classes3.dex */
public final class C6200b {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5000e2 f57666a;

    /* renamed from: b */
    @NonNull
    private bv0 f57667b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5512nv f57668c;

    public C6200b(@NonNull C4953d2 c4953d2, @NonNull bv0 bv0Var, @NonNull l20 l20Var) {
        this.f57666a = c4953d2;
        this.f57667b = bv0Var;
        this.f57668c = l20Var;
    }

    /* renamed from: a */
    public final void m30500a(@NonNull C5276ja c5276ja, @Nullable a80 a80Var, @NonNull C6264w c6264w, @NonNull InterfaceC6027xh interfaceC6027xh) {
        if (!c5276ja.m25827e() || a80Var == null) {
            return;
        }
        interfaceC6027xh.mo23878a(a80Var, new C6077yh(c5276ja, this.f57666a, c6264w, this.f57667b, this.f57668c));
    }
}
