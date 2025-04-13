package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbn {

    /* renamed from: b */
    @Nullable
    public static zbn f15245b;

    /* renamed from: a */
    @VisibleForTesting
    public final Storage f15246a;

    public zbn(Context context) {
        Storage m7866a = Storage.m7866a(context);
        this.f15246a = m7866a;
        m7866a.m7868b();
        m7866a.m7869c();
    }

    /* renamed from: a */
    public static synchronized zbn m7887a(@NonNull Context context) {
        zbn zbnVar;
        synchronized (zbn.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (zbn.class) {
                zbnVar = f15245b;
                if (zbnVar == null) {
                    zbnVar = new zbn(applicationContext);
                    f15245b = zbnVar;
                }
            }
            return zbnVar;
        }
        return zbnVar;
    }

    /* renamed from: b */
    public final synchronized void m7888b() {
        Storage storage = this.f15246a;
        storage.f15233a.lock();
        try {
            storage.f15234b.edit().clear().apply();
        } finally {
            storage.f15233a.unlock();
        }
    }
}
