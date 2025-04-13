package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p023ob.C3672Ug;
import com.yandex.metrica.impl.p023ob.C3734X3;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.o4 */
/* loaded from: classes2.dex */
public class C4174o4 extends C3940f4 implements InterfaceC3423Kg, InterfaceC3398Jg {

    /* renamed from: A */
    @NonNull
    private final C3697Vg f46053A;

    /* renamed from: B */
    @NonNull
    private final C3459M2 f46054B;

    /* renamed from: C */
    @NonNull
    private final InterfaceC3464M7<File> f46055C;

    /* renamed from: D */
    @NonNull
    private final C4433y3 f46056D;

    /* renamed from: z */
    @NonNull
    private final C3672Ug f46057z;

    /* renamed from: com.yandex.metrica.impl.ob.o4$a */
    public class a implements InterfaceC3678Um<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull File file) {
            C4174o4.m20501a(C4174o4.this, file);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o4$b */
    public class b implements C3672Ug.a {
        public b() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C3672Ug.a
        /* renamed from: a */
        public void mo19249a(@Nullable C3298Fg c3298Fg) {
            if (c3298Fg == null) {
                return;
            }
            C4174o4.this.mo19139a(new C4066k0().mo19067a(c3298Fg.m18103a()).m20189a(EnumC4067k1.EVENT_TYPE_SEND_REFERRER.m20218b()));
        }
    }

    public C4174o4(@NonNull Context context, @NonNull C3575Qi c3575Qi, @NonNull C3862c4 c3862c4, @NonNull C3734X3.a aVar, @NonNull C3672Ug c3672Ug, @NonNull C3459M2 c3459m2, @NonNull AbstractC3724Wi abstractC3724Wi) {
        this(context, c3862c4, c3575Qi, aVar, new C3684V3(), new C3583R2(), new C3432L0(), new C4200p4(context, c3862c4, aVar, abstractC3724Wi, c3575Qi, new C4148n4(c3459m2), C3532P0.m18696i().m18716s().m21320e(), C3658U2.m19216b(context, c3862c4.m19669b()), C3532P0.m18696i().m18716s(), C3532P0.m18696i().m18707j()), c3672Ug, c3459m2);
    }

    /* renamed from: a */
    private void m20500a(@NonNull Context context, @NonNull C3432L0 c3432l0) {
        File m18469a = c3432l0.m18469a(context, "YandexMetricaNativeCrashes");
        if (m18469a != null) {
            new C3314G7(m18469a, new a()).m18130a();
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.C3940f4
    /* renamed from: F */
    public void mo19867F() {
        this.f46057z.m19247a(this.f46053A);
    }

    @Override // com.yandex.metrica.impl.p023ob.C3940f4
    @NonNull
    /* renamed from: s */
    public CounterConfiguration.EnumC3079b mo19350s() {
        return CounterConfiguration.EnumC3079b.MAIN;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3398Jg
    /* renamed from: a */
    public void mo18412a() {
        m19891w().m18260c(true);
    }

    @Override // com.yandex.metrica.impl.p023ob.C3940f4, com.yandex.metrica.impl.p023ob.InterfaceC4122m4
    /* renamed from: a */
    public synchronized void mo19138a(@NonNull C3734X3.a aVar) {
        super.mo19138a(aVar);
        this.f46054B.m18562a(aVar.f44455l);
    }

    @Override // com.yandex.metrica.impl.p023ob.C3940f4, com.yandex.metrica.impl.p023ob.InterfaceC3450Li
    /* renamed from: a */
    public void mo18513a(@NonNull C3575Qi c3575Qi) {
        super.mo18513a(c3575Qi);
        this.f46056D.m21180a(c3575Qi);
    }

    @VisibleForTesting
    public C4174o4(@NonNull Context context, @NonNull C3862c4 c3862c4, @NonNull C3575Qi c3575Qi, @NonNull C3734X3.a aVar, @NonNull C3684V3 c3684v3, @NonNull C3583R2 c3583r2, @NonNull C3432L0 c3432l0, @NonNull C4200p4 c4200p4, @NonNull C3672Ug c3672Ug, @NonNull C3459M2 c3459m2) {
        super(context, c3862c4, c3684v3, c3583r2, c4200p4);
        this.f46057z = c3672Ug;
        C3889d5 m19880k = m19880k();
        m19880k.m19709a(EnumC4067k1.EVENT_TYPE_REGULAR, new C3711W5(m19880k.m19710b()));
        this.f46053A = c4200p4.m20526c(this);
        this.f46054B = c3459m2;
        C3688V7 m20523a = c4200p4.m20523a(c4200p4.m20527e(), c4200p4.m20525b(this), m19875f());
        this.f46055C = m20523a;
        m20523a.mo18573a();
        m20500a(context, c3432l0);
        C4433y3 m20524a = c4200p4.m20524a(this);
        this.f46056D = m20524a;
        m20524a.m21181a(c3575Qi, aVar.f44460q);
    }

    /* renamed from: a */
    public static void m20501a(C4174o4 c4174o4, File file) {
        c4174o4.f46055C.mo18574a(file);
    }
}
