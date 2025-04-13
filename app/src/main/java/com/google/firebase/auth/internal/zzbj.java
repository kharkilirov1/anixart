package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzbj implements Executor {

    /* renamed from: c */
    public static final zzbj f22402c = new zzbj();

    /* renamed from: b */
    public final Handler f22403b = new com.google.android.gms.internal.p041firebaseauthapi.zzg(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22403b.post(runnable);
    }
}
