package com.google.firebase.auth.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzax {

    /* renamed from: c */
    public static zzax f22388c;

    /* renamed from: a */
    public boolean f22389a = false;

    /* renamed from: b */
    public BroadcastReceiver f22390b;

    @VisibleForTesting
    /* renamed from: a */
    public static void m12302a(Context context) {
        zzax zzaxVar = f22388c;
        zzaxVar.f22389a = false;
        if (zzaxVar.f22390b != null) {
            LocalBroadcastManager.m3279a(context).m3281c(f22388c.f22390b);
        }
        f22388c.f22390b = null;
    }
}
