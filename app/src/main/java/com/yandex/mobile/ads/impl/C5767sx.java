package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.sx */
/* loaded from: classes3.dex */
public final class C5767sx {

    /* renamed from: b */
    @NotNull
    private static final Object f54869b = new Object();

    /* renamed from: a */
    @NotNull
    private final p80 f54870a;

    public C5767sx(@NotNull p80 localStorage) {
        Intrinsics.m32179h(localStorage, "localStorage");
        this.f54870a = localStorage;
    }

    /* renamed from: a */
    public final boolean m28367a(@Nullable C6061y7 c6061y7) {
        String m29866a;
        boolean z = false;
        if (c6061y7 == null || (m29866a = c6061y7.m29866a()) == null) {
            return false;
        }
        synchronized (f54869b) {
            String mo27190b = this.f54870a.mo27190b("google_advertising_id_key");
            if (mo27190b != null) {
                if (!Intrinsics.m32174c(m29866a, mo27190b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void m28368b(@Nullable C6061y7 c6061y7) {
        String mo27190b = this.f54870a.mo27190b("google_advertising_id_key");
        String m29866a = c6061y7 != null ? c6061y7.m29866a() : null;
        if (mo27190b != null || m29866a == null) {
            return;
        }
        this.f54870a.putString("google_advertising_id_key", m29866a);
    }
}
