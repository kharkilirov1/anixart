package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.q1 */
/* loaded from: classes2.dex */
public class C4223q1 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3706W0 f46221a;

    public C4223q1() {
        this(C3524Oh.m18679a());
    }

    /* renamed from: a */
    public void m20567a(@Nullable Map<String, Object> map) {
        this.f46221a.reportEvent("login_sdk", map);
    }

    @VisibleForTesting
    public C4223q1(@NonNull InterfaceC3706W0 interfaceC3706W0) {
        this.f46221a = interfaceC3706W0;
    }
}
