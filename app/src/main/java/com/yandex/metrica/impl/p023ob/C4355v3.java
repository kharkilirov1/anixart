package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.billing_interface.C3118d;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.v3 */
/* loaded from: classes2.dex */
public class C4355v3 implements InterfaceC4299t {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4122m4 f46666a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f46667b;

    /* renamed from: com.yandex.metrica.impl.ob.v3$a */
    public class a extends AbstractRunnableC3429Km {

        /* renamed from: a */
        public final /* synthetic */ C3118d f46668a;

        public a(C3118d c3118d) {
            this.f46668a = c3118d;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractRunnableC3429Km
        /* renamed from: a */
        public void mo18463a() throws Exception {
            InterfaceC4122m4 interfaceC4122m4 = C4355v3.this.f46666a;
            C4355v3 c4355v3 = C4355v3.this;
            C3118d c3118d = this.f46668a;
            Objects.requireNonNull(c4355v3);
            interfaceC4122m4.mo19139a(C4066k0.m20175a().mo19067a(new C3185B3(c3118d).m17887a()));
        }
    }

    public C4355v3(@NonNull InterfaceC4122m4 interfaceC4122m4, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this.f46666a = interfaceC4122m4;
        this.f46667b = interfaceExecutorC4297sn;
    }

    /* renamed from: a */
    public void m20913a(@NonNull List<C3118d> list) {
        for (C3118d c3118d : list) {
            ((C4271rn) this.f46667b).execute(new a(c3118d));
        }
    }
}
