package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3605S;
import com.yandex.metrica.impl.p023ob.C3734X3;
import com.yandex.metrica.impl.p023ob.C3892d8;
import com.yandex.metrica.impl.p023ob.C4083kh;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.f2 */
/* loaded from: classes2.dex */
public class C3938f2 {

    /* renamed from: a */
    @NonNull
    private final Context f45081a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f45082b;

    /* renamed from: c */
    @NonNull
    private final C3236D4 f45083c;

    /* renamed from: d */
    @NonNull
    private final C3432L0 f45084d;

    /* renamed from: com.yandex.metrica.impl.ob.f2$a */
    public class a implements InterfaceC3678Um<C3339H7> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(C3339H7 c3339h7) {
            C3339H7 c3339h72 = c3339h7;
            C3938f2 c3938f2 = C3938f2.this;
            C3211C4 c3211c4 = new C3211C4(c3339h72.m18190a(), c3339h72.m18195f(), c3339h72.m18196g(), c3339h72.m18197h(), c3339h72.m18198i());
            String m18194e = c3339h72.m18194e();
            byte[] m18192c = c3339h72.m18192c();
            int m18191b = c3339h72.m18191b();
            HashMap<C3605S.a, Integer> m18199j = c3339h72.m18199j();
            String m18193d = c3339h72.m18193d();
            C3379Im m21313b = AbstractC4478zm.m21313b(c3339h72.m18190a());
            List<Integer> list = C3382J0.f43175i;
            C3605S m19066a = new C3605S(m18192c, m18194e, EnumC4067k1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.m20218b(), m21313b).m19066a(m18199j);
            m19066a.f45527h = m18191b;
            c3938f2.m19839a(c3211c4, m19066a.m20200c(m18193d), new C3734X3(new C4083kh.b(null, null, null, null, null, null, false, null), new C3734X3.a(), null));
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.f2$b */
    public class b implements InterfaceC3678Um<String> {

        /* renamed from: a */
        private final C3211C4 f45086a;

        /* renamed from: b */
        private final InterfaceC3703Vm<String, C4066k0> f45087b;

        public b(C3211C4 c3211c4, InterfaceC3703Vm<String, C4066k0> interfaceC3703Vm) {
            this.f45086a = c3211c4;
            this.f45087b = interfaceC3703Vm;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull String str) {
            C3938f2.this.m19839a(this.f45086a, this.f45087b.mo17917a(str), new C3734X3(new C4083kh.b(null, null, null, null, null, null, false, null), new C3734X3.a(), null));
        }
    }

    @VisibleForTesting
    public C3938f2(@NonNull Context context, @NonNull C3236D4 c3236d4, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3432L0 c3432l0) {
        this.f45081a = context;
        this.f45082b = interfaceExecutorC4297sn;
        this.f45083c = c3236d4;
        this.f45084d = c3432l0;
    }

    /* renamed from: a */
    public void m19842a(@NonNull File file) {
        C3364I7 c3364i7 = new C3364I7();
        ((C4271rn) this.f45082b).execute(new RunnableC3839b7(file, c3364i7, c3364i7, new a()));
    }

    /* renamed from: a */
    public void m19839a(@NonNull C3211C4 c3211c4, @NonNull C4066k0 c4066k0, @NonNull C3734X3 c3734x3) {
        this.f45083c.m17949a(c3211c4, c3734x3).mo17811a(c4066k0, c3734x3);
        this.f45083c.m17950a(c3211c4.m17920b(), c3211c4.m17921c().intValue(), c3211c4.m17922d());
    }

    @RequiresApi
    /* renamed from: a */
    public void m19840a(@NonNull C3788Z7 c3788z7, @NonNull InterfaceC3703Vm<String, C4066k0> interfaceC3703Vm) {
        InterfaceExecutorC4297sn interfaceExecutorC4297sn = this.f45082b;
        C3432L0 c3432l0 = this.f45084d;
        String str = c3788z7.f44631a.f44872b;
        Objects.requireNonNull(c3432l0);
        ((C4271rn) interfaceExecutorC4297sn).execute(new RunnableC3839b7(new File(str), new C3564Q7(new C3414K7(EnumC3514O7.CRASHPAD, c3788z7.f44633c.f46063b), new C3539P7(new C4411x7())), new C3892d8.c(c3788z7.f44631a.f44871a), new b(c3788z7.f44632b, interfaceC3703Vm)));
    }

    /* renamed from: a */
    public void m19841a(C4066k0 c4066k0, Bundle bundle) {
        if (EnumC4067k1.EVENT_TYPE_UNDEFINED.m20218b() == c4066k0.f45524e) {
            return;
        }
        ((C4271rn) this.f45082b).execute(new RunnableC3990h2(this.f45081a, c4066k0, bundle, this.f45083c));
    }
}
