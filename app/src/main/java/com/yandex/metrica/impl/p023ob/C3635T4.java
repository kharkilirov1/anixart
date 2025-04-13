package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p023ob.C3734X3;
import com.yandex.metrica.impl.p023ob.C3735X4;

/* renamed from: com.yandex.metrica.impl.ob.T4 */
/* loaded from: classes2.dex */
public class C3635T4 implements InterfaceC4044j4, InterfaceC3760Y4, InterfaceC4070k4 {

    /* renamed from: a */
    @NonNull
    private final C3862c4 f44060a;

    /* renamed from: b */
    @NonNull
    private final C4456z0 f44061b;

    /* renamed from: c */
    @NonNull
    private C3660U4 f44062c;

    /* renamed from: d */
    @NonNull
    private C4460z4 f44063d;

    /* renamed from: com.yandex.metrica.impl.ob.T4$a */
    public static class a {
        /* renamed from: a */
        public C3660U4 m19141a(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3575Qi c3575Qi, @NonNull C3735X4.a aVar) {
            return new C3660U4(new C3735X4.b(context, c3862c4.m19669b()), c3575Qi, aVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.T4$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        private final C4171o1 f44064a;

        public b() {
            this(C3532P0.m18696i().m18707j());
        }

        /* renamed from: a */
        public C4456z0<C3635T4> m19142a(@NonNull C3635T4 c3635t4, @NonNull AbstractC3724Wi abstractC3724Wi, @NonNull C3785Z4 c3785z4, @NonNull C3365I8 c3365i8) {
            C4456z0<C3635T4> c4456z0 = new C4456z0<>(c3635t4, abstractC3724Wi.mo19363a(), c3785z4, c3365i8);
            this.f44064a.m20469a(c4456z0);
            return c4456z0;
        }

        @VisibleForTesting
        public b(@NonNull C4171o1 c4171o1) {
            this.f44064a = c4171o1;
        }
    }

    public C3635T4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3575Qi c3575Qi, @NonNull AbstractC3724Wi abstractC3724Wi, @NonNull CounterConfiguration.EnumC3079b enumC3079b) {
        this(context, c3862c4, aVar, c3575Qi, abstractC3724Wi, enumC3079b, new C3785Z4(), new b(), new a(), new C4460z4(context, c3862c4), C3532P0.m18696i().m18722y().m18441a(c3862c4.m19668a()));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public void mo18512a(@NonNull EnumC3350Hi enumC3350Hi, @Nullable C3575Qi c3575Qi) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4122m4
    /* renamed from: a */
    public void mo19138a(@NonNull C3734X3.a aVar) {
        this.f44062c.m19909a((C3660U4) aVar);
    }

    /* renamed from: b */
    public void m19140b() {
        if (this.f44063d.m21290a(this.f44062c.m19910b().m19385E())) {
            this.f44061b.m21280a(C3382J0.m18362a());
            this.f44063d.m21288a();
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4122m4
    /* renamed from: a */
    public void mo19139a(@NonNull C4066k0 c4066k0) {
        this.f44061b.m21280a(c4066k0);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public synchronized void mo18513a(@Nullable C3575Qi c3575Qi) {
        this.f44062c.m19907a(c3575Qi);
        this.f44063d.m21289a(c3575Qi.m18835P());
    }

    public C3635T4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3575Qi c3575Qi, @NonNull AbstractC3724Wi abstractC3724Wi, @NonNull CounterConfiguration.EnumC3079b enumC3079b, @NonNull C3785Z4 c3785z4, @NonNull b bVar, @NonNull a aVar2, @NonNull C4460z4 c4460z4, @NonNull C3365I8 c3365i8) {
        this.f44060a = c3862c4;
        this.f44063d = c4460z4;
        this.f44061b = bVar.m19142a(this, abstractC3724Wi, c3785z4, c3365i8);
        synchronized (this) {
            this.f44063d.m21289a(c3575Qi.m18835P());
            this.f44062c = aVar2.m19141a(context, c3862c4, c3575Qi, new C3735X4.a(aVar));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3760Y4
    @NonNull
    /* renamed from: a */
    public C3735X4 mo19137a() {
        return this.f44062c.m19910b();
    }
}
