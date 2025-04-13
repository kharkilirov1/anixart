package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.ConnectivityMonitor;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class DefaultConnectivityMonitor implements ConnectivityMonitor {

    /* renamed from: b */
    public final Context f8655b;

    /* renamed from: c */
    public final ConnectivityMonitor.ConnectivityListener f8656c;

    /* renamed from: d */
    public boolean f8657d;

    /* renamed from: e */
    public boolean f8658e;

    /* renamed from: f */
    public final BroadcastReceiver f8659f = new BroadcastReceiver() { // from class: com.bumptech.glide.manager.DefaultConnectivityMonitor.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, Intent intent) {
            DefaultConnectivityMonitor defaultConnectivityMonitor = DefaultConnectivityMonitor.this;
            boolean z = defaultConnectivityMonitor.f8657d;
            defaultConnectivityMonitor.f8657d = defaultConnectivityMonitor.m5223e(context);
            if (z != DefaultConnectivityMonitor.this.f8657d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder m24u = C0000a.m24u("connectivity changed, isConnected: ");
                    m24u.append(DefaultConnectivityMonitor.this.f8657d);
                    Log.d("ConnectivityMonitor", m24u.toString());
                }
                DefaultConnectivityMonitor defaultConnectivityMonitor2 = DefaultConnectivityMonitor.this;
                defaultConnectivityMonitor2.f8656c.mo4905a(defaultConnectivityMonitor2.f8657d);
            }
        }
    };

    public DefaultConnectivityMonitor(@NonNull Context context, @NonNull ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f8655b = context.getApplicationContext();
        this.f8656c = connectivityListener;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public void mo4894b() {
        if (this.f8658e) {
            return;
        }
        this.f8657d = m5223e(this.f8655b);
        try {
            this.f8655b.registerReceiver(this.f8659f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f8658e = true;
        } catch (SecurityException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e2);
            }
        }
    }

    @SuppressLint
    /* renamed from: e */
    public boolean m5223e(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: g */
    public void mo4896g() {
        if (this.f8658e) {
            this.f8655b.unregisterReceiver(this.f8659f);
            this.f8658e = false;
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }
}
