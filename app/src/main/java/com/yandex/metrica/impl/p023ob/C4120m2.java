package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3940f4;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.m2 */
/* loaded from: classes2.dex */
public class C4120m2<C extends C3940f4> extends C3559Q2<C> {

    /* renamed from: e */
    private Runnable f45931e;

    /* renamed from: f */
    private final InterfaceExecutorC4297sn f45932f;

    /* renamed from: com.yandex.metrica.impl.ob.m2$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4120m2.this.m18777d();
        }
    }

    public C4120m2(@NonNull C c2, @NonNull InterfaceC3799Zi interfaceC3799Zi, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        super(c2, interfaceC3799Zi);
        this.f45931e = new a();
        this.f45932f = interfaceExecutorC4297sn;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3559Q2
    /* renamed from: c */
    public void mo18776c() {
        ((C4271rn) this.f45932f).m20672a(this.f45931e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.p023ob.C3559Q2
    /* renamed from: f */
    public void mo18779f() {
        super.mo18779f();
        C4057jh m19882m = ((C3940f4) m18778e()).m19882m();
        if (m19882m.m20101G()) {
            String m20097C = m19882m.m20097C();
            if ((TextUtils.isEmpty(m20097C) || "-1".equals(m20097C)) ? false : true) {
                try {
                    C4042j2 c4042j2 = new C4042j2((C3940f4) m18778e());
                    C3582R1 m18709l = C3532P0.m18696i().m18709l();
                    if (m18709l != null) {
                        m18709l.m18935b(c4042j2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public void m20392g() {
        synchronized (this.f43660b) {
            if (!this.f43661c) {
                mo18776c();
                if (((C3940f4) m18778e()).m19882m().m20102H() > 0) {
                    ((C4271rn) this.f45932f).m20673a(this.f45931e, TimeUnit.SECONDS.toMillis(((C3940f4) m18778e()).m19882m().m20102H()));
                }
            }
        }
    }
}
