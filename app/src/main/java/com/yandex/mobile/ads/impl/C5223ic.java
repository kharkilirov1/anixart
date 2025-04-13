package com.yandex.mobile.ads.impl;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.ic */
/* loaded from: classes3.dex */
public final class C5223ic {

    /* renamed from: a */
    @NotNull
    private final fs0 f51277a = new fs0();

    /* renamed from: a */
    public final boolean m25522a() {
        String m24738a = this.f51277a.m24738a();
        if (!(m24738a != null && StringsKt.m33926x(m24738a, ":Metrica", false, 2, null))) {
            return false;
        }
        n60.m26811d(C0000a.m16m("Auxiliary process '", m24738a, "' detected"), new Object[0]);
        return true;
    }
}
