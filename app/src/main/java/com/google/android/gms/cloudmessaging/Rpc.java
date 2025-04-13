package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public class Rpc {

    /* renamed from: h */
    public static int f15257h;

    /* renamed from: i */
    public static PendingIntent f15258i;

    /* renamed from: j */
    public static final Pattern f15259j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    public final Context f15261b;

    /* renamed from: c */
    public final zzt f15262c;

    /* renamed from: d */
    public final ScheduledExecutorService f15263d;

    /* renamed from: f */
    public Messenger f15265f;

    /* renamed from: g */
    public zzd f15266g;

    /* renamed from: a */
    @GuardedBy
    public final SimpleArrayMap<String, TaskCompletionSource<Bundle>> f15260a = new SimpleArrayMap<>();

    /* renamed from: e */
    public Messenger f15264e = new Messenger(new zzaa(this, Looper.getMainLooper()));

    public Rpc(@NonNull Context context) {
        this.f15261b = context;
        this.f15262c = new zzt(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15263d = scheduledThreadPoolExecutor;
    }

    @NonNull
    /* renamed from: a */
    public Task<Bundle> m7895a(@NonNull final Bundle bundle) {
        int i2;
        int i3;
        PackageInfo packageInfo;
        zzt zztVar = this.f15262c;
        synchronized (zztVar) {
            if (zztVar.f15300b == 0) {
                try {
                    packageInfo = Wrappers.m8251a(zztVar.f15299a).f15914a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("Failed to find package ");
                    sb.append(valueOf);
                    Log.w("Metadata", sb.toString());
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    zztVar.f15300b = packageInfo.versionCode;
                }
            }
            i2 = zztVar.f15300b;
        }
        if (i2 < 12000000) {
            return this.f15262c.m7909a() != 0 ? m7896b(bundle).mo9706k(zzz.f15310b, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzu
                @Override // com.google.android.gms.tasks.Continuation
                /* renamed from: e */
                public final Object mo7340e(Task task) {
                    Rpc rpc = Rpc.this;
                    Bundle bundle2 = bundle;
                    Objects.requireNonNull(rpc);
                    if (!task.mo9712q()) {
                        return task;
                    }
                    Bundle bundle3 = (Bundle) task.mo9708m();
                    return !(bundle3 != null && bundle3.containsKey("google.messenger")) ? task : rpc.m7896b(bundle2).mo9714s(zzz.f15310b, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        /* renamed from: a */
                        public final Task mo7910a(Object obj) {
                            Bundle bundle4 = (Bundle) obj;
                            int i4 = Rpc.f15257h;
                            return bundle4 != null && bundle4.containsKey("google.messenger") ? Tasks.m9723e(null) : Tasks.m9723e(bundle4);
                        }
                    });
                }
            }) : Tasks.m9722d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        zzs m7907a = zzs.m7907a(this.f15261b);
        synchronized (m7907a) {
            i3 = m7907a.f15298d;
            m7907a.f15298d = i3 + 1;
        }
        return m7907a.m7908b(new zzr(i3, bundle)).mo9704i(zzz.f15310b, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzv
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: e */
            public final Object mo7340e(Task task) {
                if (task.mo9712q()) {
                    return (Bundle) task.mo9708m();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(task.mo9707l());
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 22);
                    sb2.append("Error making request: ");
                    sb2.append(valueOf2);
                    Log.d("Rpc", sb2.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.mo9707l());
            }
        });
    }

    @AnyThread
    /* renamed from: b */
    public final Task<Bundle> m7896b(Bundle bundle) {
        final String num;
        synchronized (Rpc.class) {
            int i2 = f15257h;
            f15257h = i2 + 1;
            num = Integer.toString(i2);
        }
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f15260a) {
            this.f15260a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f15262c.m7909a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f15261b;
        synchronized (Rpc.class) {
            if (f15258i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f15258i = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.f16233a);
            }
            intent.putExtra("app", f15258i);
        }
        intent.putExtra("kid", C0000a.m21r(new StringBuilder(String.valueOf(num).length() + 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append("Sending ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        intent.putExtra("google.messenger", this.f15264e);
        if (this.f15265f != null || this.f15266g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f15265f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f15266g.f15268b;
                    Objects.requireNonNull(messenger2);
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f15263d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    if (TaskCompletionSource.this.m9717c(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            taskCompletionSource.f17240a.mo9699d(zzz.f15310b, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    Rpc rpc = Rpc.this;
                    String str = num;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (rpc.f15260a) {
                        rpc.f15260a.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return taskCompletionSource.f17240a;
        }
        if (this.f15262c.m7909a() == 2) {
            this.f15261b.sendBroadcast(intent);
        } else {
            this.f15261b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f15263d.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
            @Override // java.lang.Runnable
            public final void run() {
                if (TaskCompletionSource.this.m9717c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.f17240a.mo9699d(zzz.f15310b, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Rpc rpc = Rpc.this;
                String str = num;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (rpc.f15260a) {
                    rpc.f15260a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.f17240a;
    }

    /* renamed from: c */
    public final void m7897c(String str, @Nullable Bundle bundle) {
        synchronized (this.f15260a) {
            TaskCompletionSource<Bundle> remove = this.f15260a.remove(str);
            if (remove != null) {
                remove.m9716b(bundle);
            } else {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
            }
        }
    }
}
