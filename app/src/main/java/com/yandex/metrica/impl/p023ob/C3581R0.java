package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.R0 */
/* loaded from: classes2.dex */
public class C3581R0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceExecutorC4297sn f43779a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3631T0 f43780b;

    /* renamed from: c */
    @NonNull
    private final d f43781c;

    /* renamed from: d */
    @NonNull
    private final Runnable f43782d = new a();

    /* renamed from: e */
    @NonNull
    private final Runnable f43783e = new b();

    /* renamed from: com.yandex.metrica.impl.ob.R0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3581R0.this.f43780b.mo18161a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC3534P2) C3581R0.this.f43781c).mo18727b()) {
                C3581R0.this.f43782d.run();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$c */
    public static class c {
        @NonNull
        /* renamed from: a */
        public C3581R0 m18933a(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3631T0 interfaceC3631T0, @NonNull d dVar) {
            return new C3581R0(interfaceExecutorC4297sn, interfaceC3631T0, dVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$d */
    public interface d {
    }

    public C3581R0(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3631T0 interfaceC3631T0, @NonNull d dVar) {
        this.f43779a = interfaceExecutorC4297sn;
        this.f43780b = interfaceC3631T0;
        this.f43781c = dVar;
    }

    /* renamed from: a */
    public void m18930a() {
        ((C4271rn) this.f43779a).m20672a(this.f43782d);
        ((C4271rn) this.f43779a).m20674a(this.f43782d, 90L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public void m18931b() {
        ((C4271rn) this.f43779a).execute(this.f43783e);
    }

    /* renamed from: c */
    public void m18932c() {
        ((C4271rn) this.f43779a).m20672a(this.f43782d);
        ((C4271rn) this.f43779a).m20672a(this.f43783e);
    }
}
