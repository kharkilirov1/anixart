package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Yg */
/* loaded from: classes2.dex */
public class C3772Yg {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3473Mg f44588a;

    /* renamed from: com.yandex.metrica.impl.ob.Yg$a */
    public class a implements InterfaceC3473Mg {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3473Mg
        /* renamed from: a */
        public void mo18595a(@NonNull InterfaceC3747Xg interfaceC3747Xg) throws Throwable {
            throw new IllegalStateException("No class: com.android.installreferrer.api.InstallReferrerClient");
        }
    }

    public C3772Yg(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(m19478a(context, interfaceExecutorC4297sn));
    }

    /* renamed from: a */
    public void m19479a(@NonNull InterfaceC3747Xg interfaceC3747Xg) {
        try {
            this.f44588a.mo18595a(interfaceC3747Xg);
        } catch (Throwable th) {
            interfaceC3747Xg.mo18758a(th);
        }
    }

    @VisibleForTesting
    public C3772Yg(@NonNull InterfaceC3473Mg interfaceC3473Mg) {
        this.f44588a = interfaceC3473Mg;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.yandex.metrica.impl.p023ob.InterfaceC3473Mg m19478a(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.InterfaceExecutorC4297sn r2) {
        /*
            java.lang.String r0 = "com.android.installreferrer.api.InstallReferrerClient"
            boolean r0 = com.yandex.metrica.impl.p023ob.C3184B2.m17879a(r0)
            if (r0 == 0) goto L16
            com.yandex.metrica.impl.ob.Sg r0 = new com.yandex.metrica.impl.ob.Sg     // Catch: java.lang.Throwable -> L16
            com.android.installreferrer.api.InstallReferrerClient$Builder r1 = com.android.installreferrer.api.InstallReferrerClient.newBuilder(r1)     // Catch: java.lang.Throwable -> L16
            com.android.installreferrer.api.InstallReferrerClient r1 = r1.build()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1e
            com.yandex.metrica.impl.ob.Yg$a r0 = new com.yandex.metrica.impl.ob.Yg$a
            r0.<init>()
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3772Yg.m19478a(android.content.Context, com.yandex.metrica.impl.ob.sn):com.yandex.metrica.impl.ob.Mg");
    }
}
