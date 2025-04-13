package com.yandex.metrica.impl.p023ob;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.yandex.metrica.impl.p023ob.C3298Fg;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Sg */
/* loaded from: classes2.dex */
public class C3622Sg implements InterfaceC3473Mg {

    /* renamed from: a */
    @NonNull
    private final InstallReferrerClient f44001a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f44002b;

    /* renamed from: com.yandex.metrica.impl.ob.Sg$a */
    public class a implements InstallReferrerStateListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3747Xg f44003a;

        /* renamed from: com.yandex.metrica.impl.ob.Sg$a$a, reason: collision with other inner class name */
        public class RunnableC6998a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C3298Fg f44005a;

            public RunnableC6998a(C3298Fg c3298Fg) {
                this.f44005a = c3298Fg;
            }

            @Override // java.lang.Runnable
            @WorkerThread
            public void run() {
                a.this.f44003a.mo18757a(this.f44005a);
            }
        }

        public a(InterfaceC3747Xg interfaceC3747Xg) {
            this.f44003a = interfaceC3747Xg;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        @MainThread
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        @MainThread
        public void onInstallReferrerSetupFinished(int i2) {
            if (i2 == 0) {
                try {
                    ReferrerDetails installReferrer = C3622Sg.this.f44001a.getInstallReferrer();
                    C3298Fg c3298Fg = new C3298Fg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), C3298Fg.a.GP);
                    ((C4271rn) C3622Sg.this.f44002b).execute(new RunnableC6998a(c3298Fg));
                } catch (Throwable th) {
                    C3622Sg.m19090a(C3622Sg.this, this.f44003a, th);
                }
            } else {
                C3622Sg.m19090a(C3622Sg.this, this.f44003a, new IllegalStateException(C0000a.m7d("Referrer check failed with error ", i2)));
            }
            try {
                C3622Sg.this.f44001a.endConnection();
            } catch (Throwable unused) {
            }
        }
    }

    @VisibleForTesting
    public C3622Sg(@NonNull InstallReferrerClient installReferrerClient, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this.f44001a = installReferrerClient;
        this.f44002b = interfaceExecutorC4297sn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3473Mg
    /* renamed from: a */
    public void mo18595a(@NonNull InterfaceC3747Xg interfaceC3747Xg) throws Throwable {
        this.f44001a.startConnection(new a(interfaceC3747Xg));
    }

    /* renamed from: a */
    public static void m19090a(C3622Sg c3622Sg, InterfaceC3747Xg interfaceC3747Xg, Throwable th) {
        ((C4271rn) c3622Sg.f44002b).execute(new RunnableC3647Tg(c3622Sg, interfaceC3747Xg, th));
    }
}
