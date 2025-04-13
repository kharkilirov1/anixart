package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzam {

    /* renamed from: f */
    public static final Logger f22368f = new Logger("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    @VisibleForTesting
    public volatile long f22369a;

    /* renamed from: b */
    @VisibleForTesting
    public volatile long f22370b;

    /* renamed from: c */
    @VisibleForTesting
    public final long f22371c;

    /* renamed from: d */
    @VisibleForTesting
    public final Handler f22372d;

    /* renamed from: e */
    @VisibleForTesting
    public final Runnable f22373e;

    public zzam(FirebaseApp firebaseApp) {
        f22368f.m8207d("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f22372d = new com.google.android.gms.internal.p041firebaseauthapi.zzg(handlerThread.getLooper());
        firebaseApp.m12217a();
        this.f22373e = new zzal(this, firebaseApp.f22260b);
        this.f22371c = 300000L;
    }
}
