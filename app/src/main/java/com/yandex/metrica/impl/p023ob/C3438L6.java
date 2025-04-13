package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3488N6;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.L6 */
/* loaded from: classes2.dex */
public class C3438L6 {

    /* renamed from: a */
    @NonNull
    private final InterfaceExecutorC4297sn f43310a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3338H6 f43311b;

    /* renamed from: com.yandex.metrica.impl.ob.L6$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ b f43312a;

        public a(C3438L6 c3438l6, b bVar) {
            this.f43312a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3463M6 c3463m6;
            try {
                C3488N6.a aVar = (C3488N6.a) this.f43312a;
                c3463m6 = C3488N6.this.f43458c;
                c3463m6.m18571a();
                C3488N6 c3488n6 = C3488N6.this;
                InterfaceC3513O6 interfaceC3513O6 = aVar.f43461a;
                Objects.requireNonNull(c3488n6);
                if (interfaceC3513O6 != null) {
                    interfaceC3513O6.mo17790a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.L6$b */
    public interface b {
    }

    public C3438L6(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3338H6 interfaceC3338H6) {
        this.f43310a = interfaceExecutorC4297sn;
        this.f43311b = interfaceC3338H6;
    }

    /* renamed from: a */
    public void m18477a(long j2, @NonNull b bVar) {
        ((C4271rn) this.f43310a).m20673a(new a(this, bVar), j2);
    }

    /* renamed from: a */
    public void m18478a(long j2, boolean z) {
        this.f43311b.mo17952a(j2, z);
    }

    /* renamed from: a */
    public void m18476a() {
        this.f43311b.mo17951a();
    }
}
