package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.yc */
/* loaded from: classes2.dex */
class C4442yc {

    /* renamed from: a */
    @Nullable
    private C3668Uc f46996a;

    /* renamed from: b */
    @NonNull
    private final C3190B8 f46997b;

    /* renamed from: c */
    @NonNull
    private final C3165A8 f46998c;

    public C4442yc(@Nullable C3668Uc c3668Uc, @NonNull C3190B8 c3190b8, @NonNull C3165A8 c3165a8) {
        this.f46996a = c3668Uc;
        this.f46997b = c3190b8;
        this.f46998c = c3165a8;
    }

    /* renamed from: a */
    public void m21199a() {
        C3668Uc c3668Uc = this.f46996a;
        if (c3668Uc != null) {
            long m20650c = this.f46997b.m20650c();
            int i2 = c3668Uc.f44137f;
            if (m20650c > ((long) i2)) {
                this.f46997b.m20647b((int) (i2 * 0.1f));
            }
            C3668Uc c3668Uc2 = this.f46996a;
            long m20650c2 = this.f46998c.m20650c();
            int i3 = c3668Uc2.f44137f;
            if (m20650c2 > ((long) i3)) {
                this.f46998c.m20647b((int) (i3 * 0.1f));
            }
        }
    }

    /* renamed from: a */
    public void m21200a(@Nullable C3668Uc c3668Uc) {
        this.f46996a = c3668Uc;
    }
}
