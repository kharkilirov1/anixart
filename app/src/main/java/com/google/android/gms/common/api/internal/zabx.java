package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a */
    @Nullable
    public Context f15548a;

    /* renamed from: b */
    public final zabw f15549b;

    public zabx(zabw zabwVar) {
        this.f15549b = zabwVar;
    }

    /* renamed from: a */
    public final synchronized void m8068a() {
        Context context = this.f15548a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f15548a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f15549b.mo8037a();
            m8068a();
        }
    }
}
