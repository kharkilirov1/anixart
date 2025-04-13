package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class y00 extends AbstractC4861be {

    /* renamed from: a */
    @Nullable
    private final SSLSocketFactory f56617a;

    /* renamed from: b */
    @NotNull
    private final rn0 f56618b;

    public y00(@Nullable f91 f91Var, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f56617a = sSLSocketFactory;
        this.f56618b = new rn0(f91Var);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4861be
    @NotNull
    /* renamed from: a */
    public final p00 mo22665a(@NotNull zv0<?> request, @NotNull Map<String, String> additionalHeaders) throws IOException, C6069yb {
        Intrinsics.m32179h(request, "request");
        Intrinsics.m32179h(additionalHeaders, "additionalHeaders");
        int m30325k = request.m30325k();
        int i2 = nn0.f53052c;
        rw0 m25964b = nn0.m26932a(m30325k, m30325k, this.f56617a).mo26699a(this.f56618b.m27958a(request, additionalHeaders)).m25964b();
        int m27997e = m25964b.m27997e();
        ArrayList m28688a = tm0.m28688a(m25964b.m28000h().m25384c());
        if (!tm0.m28689a(request.m30322g(), m27997e)) {
            return new p00(m27997e, m28688a);
        }
        vw0 m27993a = m25964b.m27993a();
        return new p00(m27997e, m28688a, m27993a != null ? (int) m27993a.mo27787b() : 0, tm0.m28686a(m25964b));
    }
}
