package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class ConnectionTracker {

    /* renamed from: b */
    public static final Object f15875b = new Object();

    /* renamed from: c */
    @Nullable
    public static volatile ConnectionTracker f15876c;

    /* renamed from: a */
    @NonNull
    @VisibleForTesting
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f15877a = new ConcurrentHashMap<>();

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static ConnectionTracker m8223b() {
        if (f15876c == null) {
            synchronized (f15875b) {
                if (f15876c == null) {
                    f15876c = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = f15876c;
        Objects.requireNonNull(connectionTracker, "null reference");
        return connectionTracker;
    }

    /* renamed from: e */
    public static final boolean m8224e(Context context, Intent intent, ServiceConnection serviceConnection, int i2, @Nullable Executor executor) {
        return (!(Build.VERSION.SDK_INT >= 29) || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean m8225a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i2) {
        return m8227d(context, context.getClass().getName(), intent, serviceConnection, i2, true, null);
    }

    @KeepForSdk
    /* renamed from: c */
    public void m8226c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof zzs)) || !this.f15877a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService(this.f15877a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                this.f15877a.remove(serviceConnection);
            }
        }
    }

    /* renamed from: d */
    public final boolean m8227d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.m8251a(context).m8249a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(!(serviceConnection instanceof zzs))) {
            return m8224e(context, intent, serviceConnection, i2, executor);
        }
        ServiceConnection putIfAbsent = this.f15877a.putIfAbsent(serviceConnection, serviceConnection);
        if (putIfAbsent != null && serviceConnection != putIfAbsent) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean m8224e = m8224e(context, intent, serviceConnection, i2, executor);
            if (m8224e) {
                return m8224e;
            }
            return false;
        } finally {
            this.f15877a.remove(serviceConnection, serviceConnection);
        }
    }
}
