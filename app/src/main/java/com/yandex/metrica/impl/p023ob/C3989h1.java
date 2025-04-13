package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.h1 */
/* loaded from: classes2.dex */
public class C3989h1 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3529Om f45245a;

    /* renamed from: b */
    @NonNull
    private final C3583R2 f45246b;

    /* renamed from: c */
    @NonNull
    private final C3366I9 f45247c;

    /* renamed from: d */
    private long f45248d;

    /* renamed from: e */
    @Nullable
    private C4474zi f45249e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3706W0 f45250f;

    @VisibleForTesting
    public C3989h1(@NonNull C3366I9 c3366i9, @Nullable C4474zi c4474zi, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3583R2 c3583r2, @NonNull InterfaceC3706W0 interfaceC3706W0) {
        this.f45247c = c3366i9;
        this.f45249e = c4474zi;
        this.f45248d = c3366i9.m18290d(0L);
        this.f45245a = interfaceC3529Om;
        this.f45246b = c3583r2;
        this.f45250f = interfaceC3706W0;
    }

    /* renamed from: a */
    public void m19994a() {
        C4474zi c4474zi = this.f45249e;
        if (c4474zi == null || !this.f45246b.m18938b(this.f45248d, c4474zi.f47131a, "should send EVENT_IDENTITY_LIGHT")) {
            return;
        }
        this.f45250f.mo18350b();
        long mo18644b = this.f45245a.mo18644b();
        this.f45248d = mo18644b;
        this.f45247c.m18301i(mo18644b);
    }

    /* renamed from: a */
    public void m19995a(@Nullable C4474zi c4474zi) {
        this.f45249e = c4474zi;
    }
}
