package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.J6 */
/* loaded from: classes2.dex */
public class C3388J6 {

    /* renamed from: a */
    @NonNull
    private final InterfaceExecutorC4297sn f43188a;

    /* renamed from: com.yandex.metrica.impl.ob.J6$a */
    public static class a implements Runnable {

        /* renamed from: a */
        @NonNull
        private final AbstractC3538P6 f43189a;

        /* renamed from: b */
        @Nullable
        private final Bundle f43190b;

        /* renamed from: c */
        @Nullable
        private final InterfaceC3513O6 f43191c;

        public a(@NonNull AbstractC3538P6 abstractC3538P6, @Nullable Bundle bundle, @Nullable InterfaceC3513O6 interfaceC3513O6) {
            this.f43189a = abstractC3538P6;
            this.f43190b = bundle;
            this.f43191c = interfaceC3513O6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f43189a.mo18730a(this.f43190b, this.f43191c);
            } catch (Throwable unused) {
                InterfaceC3513O6 interfaceC3513O6 = this.f43191c;
                if (interfaceC3513O6 != null) {
                    interfaceC3513O6.mo17790a();
                }
            }
        }
    }

    public C3388J6() {
        this(C3532P0.m18696i().m18716s().m21314a());
    }

    /* renamed from: a */
    public void m18388a(@NonNull AbstractC3538P6 abstractC3538P6, @Nullable Bundle bundle) {
        ((C4271rn) this.f43188a).execute(new a(abstractC3538P6, bundle, null));
    }

    @VisibleForTesting
    public C3388J6(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this.f43188a = interfaceExecutorC4297sn;
    }

    /* renamed from: a */
    public void m18389a(@NonNull AbstractC3538P6 abstractC3538P6, @Nullable Bundle bundle, @Nullable InterfaceC3513O6 interfaceC3513O6) {
        ((C4271rn) this.f43188a).execute(new a(abstractC3538P6, bundle, interfaceC3513O6));
    }

    @NonNull
    /* renamed from: a */
    public InterfaceExecutorC4297sn m18387a() {
        return this.f43188a;
    }
}
