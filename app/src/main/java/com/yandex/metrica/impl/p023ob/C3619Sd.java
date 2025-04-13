package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Sd */
/* loaded from: classes2.dex */
public class C3619Sd implements InterfaceC3669Ud {

    /* renamed from: a */
    private long f43994a;

    /* renamed from: b */
    private int f43995b;

    /* renamed from: c */
    @NonNull
    private final C3644Td f43996c;

    /* renamed from: d */
    @Nullable
    private final C3225Ci f43997d;

    /* renamed from: e */
    @NonNull
    private final C3583R2 f43998e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3529Om f43999f;

    public C3619Sd(@NonNull C3644Td c3644Td, @Nullable C3225Ci c3225Ci) {
        this(c3644Td, c3225Ci, new C3583R2(), new C3504Nm());
    }

    /* renamed from: b */
    private void m19084b() {
        this.f43995b = this.f43996c.m19162b();
        this.f43994a = this.f43996c.m19159a();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3669Ud
    /* renamed from: a */
    public boolean mo18965a() {
        C3225Ci c3225Ci = this.f43997d;
        if (c3225Ci != null) {
            long j2 = this.f43994a;
            if (j2 != 0) {
                C3583R2 c3583r2 = this.f43998e;
                int i2 = ((1 << (this.f43995b - 1)) - 1) * c3225Ci.f42678b;
                int i3 = c3225Ci.f42677a;
                if (i2 > i3) {
                    i2 = i3;
                }
                return c3583r2.m18938b(j2, i2, "last send attempt");
            }
        }
        return true;
    }

    /* renamed from: c */
    public void m19085c() {
        this.f43995b = 1;
        this.f43994a = 0L;
        this.f43996c.m19160a(1);
        this.f43996c.m19161a(this.f43994a);
    }

    /* renamed from: d */
    public void m19086d() {
        long mo18644b = this.f43999f.mo18644b();
        this.f43994a = mo18644b;
        this.f43995b++;
        this.f43996c.m19161a(mo18644b);
        this.f43996c.m19160a(this.f43995b);
    }

    @VisibleForTesting
    public C3619Sd(@NonNull C3644Td c3644Td, @Nullable C3225Ci c3225Ci, @NonNull C3583R2 c3583r2, @NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f43997d = c3225Ci;
        this.f43996c = c3644Td;
        this.f43998e = c3583r2;
        this.f43999f = interfaceC3529Om;
        m19084b();
    }
}
