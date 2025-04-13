package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fb */
/* loaded from: classes3.dex */
public final class C5070fb {

    /* renamed from: a */
    @NotNull
    private final List<C5276ja> f50194a;

    /* renamed from: b */
    @Nullable
    private C6264w<?> f50195b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5070fb(@NotNull List<? extends C5276ja> assets) {
        Intrinsics.m32179h(assets, "assets");
        this.f50194a = assets;
    }

    /* renamed from: a */
    public final void m24382a(@Nullable C6264w<?> c6264w) {
        this.f50195b = c6264w;
    }

    @NotNull
    /* renamed from: a */
    public final HashMap m24381a() {
        InterfaceC5330ka m30749a;
        int m26827f;
        HashMap hashMap = new HashMap();
        for (C5276ja c5276ja : this.f50194a) {
            String m25824b = c5276ja.m25824b();
            Intrinsics.m32178g(m25824b, "asset.name");
            C6264w<?> c6264w = this.f50195b;
            if (c6264w != null && (m30749a = c6264w.m30749a(c5276ja)) != null && m30749a.mo23912b()) {
                HashMap hashMap2 = new HashMap();
                jg1 mo23913c = m30749a.mo23913c();
                if (mo23913c != null) {
                    hashMap2.put("width", Integer.valueOf(mo23913c.m25889b()));
                    hashMap2.put("height", Integer.valueOf(mo23913c.m25888a()));
                }
                na0 na0Var = m30749a instanceof na0 ? (na0) m30749a : null;
                if (na0Var != null && (m26827f = na0Var.m26827f()) != 0) {
                    hashMap2.put("value_type", mc0.m26611a(m26827f));
                }
                hashMap.put(m25824b, hashMap2);
            }
        }
        return hashMap;
    }
}
