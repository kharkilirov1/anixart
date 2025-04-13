package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzbi {

    /* renamed from: a */
    public final zzam f22401a;

    public zzbi(FirebaseApp firebaseApp) {
        firebaseApp.m12217a();
        Context context = firebaseApp.f22259a;
        this.f22401a = new zzam(firebaseApp);
        BackgroundDetector.m7967b((Application) context.getApplicationContext());
        BackgroundDetector.f15389f.m7968a(new zzbh(this));
    }
}
