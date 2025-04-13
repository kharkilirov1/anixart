package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class cg0 implements InterfaceC5719rz {

    /* renamed from: a */
    @NonNull
    private final yf0 f49235a;

    /* renamed from: b */
    @NonNull
    private final nf0 f49236b;

    /* renamed from: d */
    @NonNull
    private final ni1 f49238d;

    /* renamed from: f */
    @Nullable
    private InterfaceC5972wh f49240f;

    /* renamed from: c */
    @NonNull
    private final ke1 f49237c = new ke1();

    /* renamed from: e */
    @NonNull
    private final lf0 f49239e = new lf0();

    public cg0(@NonNull yf0 yf0Var, @NonNull nf0 nf0Var) {
        this.f49235a = yf0Var;
        this.f49236b = nf0Var;
        this.f49238d = new ni1(yf0Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23253a(@NonNull C5563p2 c5563p2) {
    }

    /* renamed from: a */
    public final void m23254a(@NonNull InterfaceC5972wh interfaceC5972wh) {
        this.f49240f = interfaceC5972wh;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23255a(@Nullable yo0 yo0Var, @Nullable Map map) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23257a(boolean z) {
    }

    /* renamed from: b */
    public final void m23258b(@NonNull String str) {
        Objects.requireNonNull(this.f49239e);
        boolean m26444a = lf0.m26444a(str);
        Objects.requireNonNull(C5516nz.m26965a());
        InterfaceC5465mz m26964a = C5516nz.m26964a(m26444a);
        yf0 yf0Var = this.f49235a;
        ke1 ke1Var = this.f49237c;
        nf0 nf0Var = this.f49236b;
        m26964a.mo22469a(yf0Var, this, ke1Var, nf0Var, nf0Var, nf0Var).mo26546a(str);
    }

    /* renamed from: a */
    public final void m23252a() {
        this.f49238d.m26917a(Collections.emptyMap());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5719rz
    /* renamed from: a */
    public final void mo23256a(@NonNull String str) {
        InterfaceC5972wh interfaceC5972wh = this.f49240f;
        if (interfaceC5972wh != null) {
            ((hf0) interfaceC5972wh).m25149a(this.f49235a, str);
        }
    }
}
