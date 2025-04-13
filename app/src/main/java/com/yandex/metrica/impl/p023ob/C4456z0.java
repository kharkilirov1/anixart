package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3635T4;

/* renamed from: com.yandex.metrica.impl.ob.z0 */
/* loaded from: classes2.dex */
public class C4456z0<C extends C3635T4> extends C3559Q2<C> {

    /* renamed from: e */
    @NonNull
    private final C3785Z4 f47046e;

    /* renamed from: f */
    @NonNull
    private final C3365I8 f47047f;

    public C4456z0(@NonNull C c2, @NonNull InterfaceC3799Zi interfaceC3799Zi, @NonNull C3785Z4 c3785z4, @NonNull C3365I8 c3365i8) {
        super(c2, interfaceC3799Zi);
        this.f47046e = c3785z4;
        this.f47047f = c3365i8;
    }

    /* renamed from: a */
    public void m21280a(@NonNull C4066k0 c4066k0) {
        if (this.f43661c) {
            return;
        }
        synchronized (this.f43660b) {
            if (!this.f43661c) {
                mo18779f();
            }
        }
        C3685V4 c3685v4 = new C3685V4((InterfaceC3760Y4) m18778e(), c4066k0, this.f47046e, this.f47047f);
        C3582R1 m18709l = C3532P0.m18696i().m18709l();
        if (m18709l != null) {
            m18709l.m18935b(c3685v4);
        }
    }
}
