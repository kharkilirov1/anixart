package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public final class zzl implements AppSetIdClient {

    /* renamed from: e */
    @Nullable
    @GuardedBy
    public static AppSetIdClient f15985e;

    /* renamed from: a */
    public final Context f15986a;

    /* renamed from: b */
    public boolean f15987b;

    /* renamed from: c */
    public final ScheduledExecutorService f15988c;

    /* renamed from: d */
    public final ExecutorService f15989d;

    public zzl(Context context) {
        this.f15987b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f15988c = newSingleThreadScheduledExecutor;
        this.f15989d = Executors.newSingleThreadExecutor();
        this.f15986a = context;
        if (this.f15987b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new zzj(this), 0L, 86400L, TimeUnit.SECONDS);
        this.f15987b = true;
    }

    /* renamed from: c */
    public static final SharedPreferences m8311c(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: d */
    public static final void m8312d(Context context) throws zzk {
        if (context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    /* renamed from: a */
    public final Task<AppSetIdInfo> mo7830a() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f15989d.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzl zzlVar = zzl.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                String string = zzl.m8311c(zzlVar.f15986a).getString("app_set_id", null);
                long m8313b = zzlVar.m8313b();
                if (string == null || System.currentTimeMillis() > m8313b) {
                    string = UUID.randomUUID().toString();
                    try {
                        Context context = zzlVar.f15986a;
                        if (!zzl.m8311c(context).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new zzk("Failed to store the app set ID.");
                        }
                        zzl.m8312d(context);
                        Context context2 = zzlVar.f15986a;
                        if (!zzl.m8311c(context2).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new zzk("Failed to store the app set ID creation time.");
                        }
                    } catch (zzk e2) {
                        taskCompletionSource2.m9715a(e2);
                        return;
                    }
                } else {
                    try {
                        zzl.m8312d(zzlVar.f15986a);
                    } catch (zzk e3) {
                        taskCompletionSource2.m9715a(e3);
                        return;
                    }
                }
                taskCompletionSource2.m9716b(new AppSetIdInfo(string, 1));
            }
        });
        return taskCompletionSource.f17240a;
    }

    @VisibleForTesting
    /* renamed from: b */
    public final long m8313b() {
        long j2 = m8311c(this.f15986a).getLong("app_set_id_last_used_time", -1L);
        if (j2 != -1) {
            return j2 + 33696000000L;
        }
        return -1L;
    }
}
