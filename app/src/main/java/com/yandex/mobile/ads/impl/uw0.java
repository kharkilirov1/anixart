package com.yandex.mobile.ads.impl;

import okio.Buffer;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uw0 extends vw0 {

    /* renamed from: a */
    public final /* synthetic */ hc0 f55694a;

    /* renamed from: b */
    public final /* synthetic */ long f55695b;

    /* renamed from: c */
    public final /* synthetic */ BufferedSource f55696c;

    public uw0(long j2, hc0 hc0Var, Buffer buffer) {
        this.f55694a = hc0Var;
        this.f55695b = j2;
        this.f55696c = buffer;
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    /* renamed from: b */
    public final long mo27787b() {
        return this.f55695b;
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    @Nullable
    /* renamed from: c */
    public final hc0 mo27788c() {
        return this.f55694a;
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    @NotNull
    /* renamed from: d */
    public final BufferedSource mo27789d() {
        return this.f55696c;
    }
}
