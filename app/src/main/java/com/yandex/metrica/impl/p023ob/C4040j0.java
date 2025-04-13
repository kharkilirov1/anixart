package com.yandex.metrica.impl.p023ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.j0 */
/* loaded from: classes2.dex */
public class C4040j0 {

    /* renamed from: a */
    @Nullable
    private final BroadcastReceiver f45364a;

    /* renamed from: b */
    private boolean f45365b = false;

    /* renamed from: com.yandex.metrica.impl.ob.j0$a */
    public static class a {
        @NonNull
        /* renamed from: a */
        public C4040j0 m20075a(@Nullable BroadcastReceiver broadcastReceiver) {
            return new C4040j0(broadcastReceiver);
        }
    }

    public C4040j0(@Nullable BroadcastReceiver broadcastReceiver) {
        this.f45364a = broadcastReceiver;
    }

    @Nullable
    /* renamed from: a */
    public synchronized Intent m20073a(@NonNull Context context, @NonNull IntentFilter intentFilter) {
        Intent intent;
        try {
            intent = context.registerReceiver(this.f45364a, intentFilter);
            try {
                this.f45365b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intent = null;
        }
        return intent;
    }

    /* renamed from: a */
    public synchronized void m20074a(@NonNull Context context) {
        if (this.f45365b) {
            try {
                context.unregisterReceiver(this.f45364a);
                this.f45365b = false;
            } catch (Throwable unused) {
            }
        }
    }
}
