package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Bc */
/* loaded from: classes2.dex */
public abstract class AbstractC3194Bc<T> implements InterfaceC4416xc<T> {

    /* renamed from: a */
    @NonNull
    private InterfaceExecutorC4297sn f42619a;

    /* renamed from: b */
    @Nullable
    private volatile Runnable f42620b;

    public AbstractC3194Bc(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this.f42619a = interfaceExecutorC4297sn;
    }

    /* renamed from: a */
    public void m17896a(@NonNull Runnable runnable, long j2) {
        ((C4271rn) this.f42619a).m20674a(runnable, j2, TimeUnit.SECONDS);
        this.f42620b = runnable;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4416xc
    /* renamed from: a */
    public void mo17895a() {
        Runnable runnable = this.f42620b;
        if (runnable != null) {
            ((C4271rn) this.f42619a).m20672a(runnable);
            this.f42620b = null;
        }
    }
}
