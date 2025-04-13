package com.google.firebase.installations;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2147a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f23159b;

    /* renamed from: c */
    public final /* synthetic */ FirebaseInstallations f23160c;

    /* renamed from: d */
    public final /* synthetic */ boolean f23161d;

    public /* synthetic */ RunnableC2147a(FirebaseInstallations firebaseInstallations, boolean z, int i2) {
        this.f23159b = i2;
        this.f23160c = firebaseInstallations;
        this.f23161d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            int r0 = r5.f23159b
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            com.google.firebase.installations.FirebaseInstallations r0 = r5.f23160c
            boolean r1 = r5.f23161d
            java.lang.Object r2 = com.google.firebase.installations.FirebaseInstallations.f23129m
            r0.m12561b(r1)
            return
        L10:
            com.google.firebase.installations.FirebaseInstallations r0 = r5.f23160c
            boolean r1 = r5.f23161d
            java.lang.Object r2 = com.google.firebase.installations.FirebaseInstallations.f23129m
            com.google.firebase.installations.local.PersistedInstallationEntry r2 = r0.m12565g()
            boolean r3 = r2.m12603h()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> Lac
            if (r3 != 0) goto L3d
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r2.mo12588f()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> Lac
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> Lac
            if (r3 != r4) goto L2a
            r3 = 1
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 == 0) goto L2e
            goto L3d
        L2e:
            if (r1 != 0) goto L38
            com.google.firebase.installations.Utils r1 = r0.f23134d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> Lac
            boolean r1 = r1.m12581d(r2)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> Lac
            if (r1 == 0) goto Lb0
        L38:
            com.google.firebase.installations.local.PersistedInstallationEntry r1 = r0.m12562c(r2)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> Lac
            goto L41
        L3d:
            com.google.firebase.installations.local.PersistedInstallationEntry r1 = r0.m12570l(r2)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> Lac
        L41:
            r0.m12567i(r1)
            monitor-enter(r0)
            java.util.Set<com.google.firebase.installations.internal.FidListener> r3 = r0.f23141k     // Catch: java.lang.Throwable -> La9
            int r3 = r3.size()     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L75
            java.lang.String r2 = r2.mo12585c()     // Catch: java.lang.Throwable -> La9
            java.lang.String r3 = r1.mo12585c()     // Catch: java.lang.Throwable -> La9
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> La9
            if (r2 != 0) goto L75
            java.util.Set<com.google.firebase.installations.internal.FidListener> r2 = r0.f23141k     // Catch: java.lang.Throwable -> La9
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La9
        L61:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L75
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> La9
            com.google.firebase.installations.internal.FidListener r3 = (com.google.firebase.installations.internal.FidListener) r3     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = r1.mo12585c()     // Catch: java.lang.Throwable -> La9
            r3.m12582a(r4)     // Catch: java.lang.Throwable -> La9
            goto L61
        L75:
            monitor-exit(r0)
            boolean r2 = r1.m12605j()
            if (r2 == 0) goto L83
            java.lang.String r2 = r1.mo12585c()
            r0.m12573o(r2)
        L83:
            boolean r2 = r1.m12603h()
            if (r2 == 0) goto L94
            com.google.firebase.installations.FirebaseInstallationsException r1 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r1.<init>(r2)
            r0.m12571m(r1)
            goto Lb0
        L94:
            boolean r2 = r1.m12604i()
            if (r2 == 0) goto La5
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.m12571m(r1)
            goto Lb0
        La5:
            r0.m12572n(r1)
            goto Lb0
        La9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lac:
            r1 = move-exception
            r0.m12571m(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.RunnableC2147a.run():void");
    }
}
