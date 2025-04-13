package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.yk */
/* loaded from: classes2.dex */
public class C4450yk extends AbstractC3600Rj {

    /* renamed from: a */
    private int f47031a;

    /* renamed from: b */
    private AbstractC3600Rj f47032b;

    public C4450yk(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context.getApplicationContext(), new C3729Wn(), interfaceExecutorC4297sn);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public synchronized void mo19049a() {
        int i2 = this.f47031a + 1;
        this.f47031a = i2;
        if (i2 == 1) {
            this.f47032b.mo19049a();
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: b */
    public synchronized void mo19054b() {
        int i2 = this.f47031a - 1;
        this.f47031a = i2;
        if (i2 == 0) {
            this.f47032b.mo19054b();
        }
    }

    @VisibleForTesting
    public C4450yk(Context context, @NonNull C3729Wn c3729Wn, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        if (c3729Wn.m19372a(context, "android.hardware.telephony")) {
            this.f47032b = new C4060jk(context, interfaceExecutorC4297sn);
        } else {
            this.f47032b = new C4112lk();
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public synchronized void mo19050a(InterfaceC3202Bk interfaceC3202Bk) {
        this.f47032b.mo19050a(interfaceC3202Bk);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public synchronized void mo19052a(InterfaceC3725Wj interfaceC3725Wj) {
        this.f47032b.mo19052a(interfaceC3725Wj);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public void mo19053a(boolean z) {
        this.f47032b.mo19053a(z);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3600Rj
    /* renamed from: a */
    public void mo19051a(@NonNull C3575Qi c3575Qi) {
        this.f47032b.mo19051a(c3575Qi);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3693Vc
    /* renamed from: a */
    public void mo19274a(@Nullable C3668Uc c3668Uc) {
        this.f47032b.mo19274a(c3668Uc);
    }
}
