package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zzs {

    /* renamed from: e */
    @Nullable
    @GuardedBy
    public static zzs f15294e;

    /* renamed from: a */
    public final Context f15295a;

    /* renamed from: b */
    public final ScheduledExecutorService f15296b;

    /* renamed from: c */
    @GuardedBy
    public zzm f15297c = new zzm(this, null);

    /* renamed from: d */
    @GuardedBy
    public int f15298d = 1;

    @VisibleForTesting
    public zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15296b = scheduledExecutorService;
        this.f15295a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized zzs m7907a(Context context) {
        zzs zzsVar;
        synchronized (zzs.class) {
            if (f15294e == null) {
                f15294e = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            zzsVar = f15294e;
        }
        return zzsVar;
    }

    /* renamed from: b */
    public final synchronized <T> Task<T> m7908b(zzp<T> zzpVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(zzpVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f15297c.m7902d(zzpVar)) {
            zzm zzmVar = new zzm(this, null);
            this.f15297c = zzmVar;
            zzmVar.m7902d(zzpVar);
        }
        return zzpVar.f15291b.f17240a;
    }
}
