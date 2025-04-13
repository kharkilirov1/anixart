package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class Asserts {
    public Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m8087a(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
        C0000a.m2C(sb, "checkMainThread: current thread ", valueOf, " IS NOT the main thread ", valueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        throw new IllegalStateException(str);
    }
}
