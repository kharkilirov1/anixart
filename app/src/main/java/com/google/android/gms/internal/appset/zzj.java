package com.google.android.gms.internal.appset;

import android.content.Context;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
final class zzj implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzl f15984b;

    @Override // java.lang.Runnable
    public final void run() {
        long m8313b = this.f15984b.m8313b();
        if (m8313b == -1 || System.currentTimeMillis() <= m8313b) {
            return;
        }
        Context context = this.f15984b.f15986a;
        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }
}
