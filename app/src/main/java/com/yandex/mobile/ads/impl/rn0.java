package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5204hy;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.dw0;
import java.net.URL;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rn0 {

    /* renamed from: a */
    @Nullable
    private final f91 f54365a;

    public rn0(@Nullable f91 f91Var) {
        this.f54365a = f91Var;
    }

    @NotNull
    /* renamed from: a */
    public final aw0 m27958a(@NotNull zv0<?> request, @NotNull Map<String, String> additionalHeaders) {
        Intrinsics.m32179h(request, "request");
        Intrinsics.m32179h(additionalHeaders, "additionalHeaders");
        URL m28687a = tm0.m28687a(request, this.f54365a);
        Map<String, String> mo26305f = request.mo26305f();
        Intrinsics.m32178g(mo26305f, "request.headers");
        Map m32069n = MapsKt.m32069n(MapsKt.m32066k(additionalHeaders, mo26305f));
        if (!m32069n.containsKey("Content-Type")) {
            m32069n.put("Content-Type", zv0.m30308c());
        }
        C5204hy m25393a = C5204hy.b.m25393a(m32069n);
        int m22804a = be0.m22804a(request);
        byte[] mo27672b = request.mo27672b();
        return new aw0.C4827a().m22644a(m28687a).m22641a(m25393a).m22643a(ce0.m23245a(m22804a), mo27672b != null ? dw0.C4991a.m23949b(mo27672b) : null).m22645a();
    }
}
