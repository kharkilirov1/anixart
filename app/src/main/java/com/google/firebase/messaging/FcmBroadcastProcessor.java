package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.window.layout.ExecutorC0688c;
import com.google.android.exoplayer2.trackselection.C1136a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.WithinAppServiceConnection;
import com.swiftsoft.anixartd.network.Response;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes2.dex */
public class FcmBroadcastProcessor {

    /* renamed from: c */
    public static final Object f23259c = new Object();

    /* renamed from: d */
    @GuardedBy
    public static WithinAppServiceConnection f23260d;

    /* renamed from: a */
    public final Context f23261a;

    /* renamed from: b */
    public final Executor f23262b = ExecutorC0688c.f6814f;

    public FcmBroadcastProcessor(Context context) {
        this.f23261a = context;
    }

    /* renamed from: a */
    public static Task<Integer> m12641a(Context context, Intent intent) {
        WithinAppServiceConnection withinAppServiceConnection;
        zzw<Void> zzwVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f23259c) {
            if (f23260d == null) {
                f23260d = new WithinAppServiceConnection(context, "com.google.firebase.MESSAGING_EVENT");
            }
            withinAppServiceConnection = f23260d;
        }
        synchronized (withinAppServiceConnection) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            WithinAppServiceConnection.BindRequest bindRequest = new WithinAppServiceConnection.BindRequest(intent);
            ScheduledExecutorService scheduledExecutorService = withinAppServiceConnection.f23360d;
            bindRequest.f23365b.f17240a.mo9699d(scheduledExecutorService, new C2170n(scheduledExecutorService.schedule(new RunnableC2168l(bindRequest, 1), 9000L, TimeUnit.MILLISECONDS), 1));
            withinAppServiceConnection.f23361e.add(bindRequest);
            withinAppServiceConnection.m12710b();
            zzwVar = bindRequest.f23365b.f17240a;
        }
        return zzwVar.mo9704i(ExecutorC0688c.f6815g, C1136a.f14048o);
    }

    @KeepForSdk
    /* renamed from: b */
    public Task<Integer> m12642b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f23261a;
        return (!(PlatformVersion.m8244a() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? Tasks.m9721c(this.f23262b, new Callable() { // from class: com.google.firebase.messaging.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i2;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                Object obj = FcmBroadcastProcessor.f23259c;
                ServiceStarter m12680a = ServiceStarter.m12680a();
                Objects.requireNonNull(m12680a);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                m12680a.f23310d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (m12680a) {
                    str = m12680a.f23307a;
                    if (str == null) {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    m12680a.f23307a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    m12680a.f23307a = serviceInfo.name;
                                }
                                str = m12680a.f23307a;
                            }
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            str = null;
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        str = null;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + str);
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (m12680a.m12682c(context2)) {
                        startService = WakeLockHolder.m12707a(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    } else {
                        i2 = -1;
                    }
                } catch (IllegalStateException e2) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
                    i2 = Response.BANNED;
                } catch (SecurityException e3) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e3);
                    i2 = 401;
                }
                return Integer.valueOf(i2);
            }
        }).mo9706k(this.f23262b, new C2167k(context, intent, 1)) : m12641a(context, intent);
    }
}
