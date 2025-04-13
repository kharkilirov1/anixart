package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* loaded from: classes2.dex */
class SyncTask implements Runnable {

    /* renamed from: b */
    public final long f23321b;

    /* renamed from: c */
    public final PowerManager.WakeLock f23322c;

    /* renamed from: d */
    public final FirebaseMessaging f23323d;

    @VisibleForTesting
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {

        /* renamed from: a */
        @Nullable
        public SyncTask f23324a;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.f23324a = syncTask;
        }

        /* renamed from: a */
        public void m12691a() {
            if (SyncTask.m12688a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f23324a.f23323d.f23271d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.f23324a;
            if (syncTask != null && syncTask.m12689b()) {
                if (SyncTask.m12688a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                SyncTask syncTask2 = this.f23324a;
                syncTask2.f23323d.m12646b(syncTask2, 0L);
                this.f23324a.f23323d.f23271d.unregisterReceiver(this);
                this.f23324a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint
    public SyncTask(FirebaseMessaging firebaseMessaging, long j2) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f23323d = firebaseMessaging;
        this.f23321b = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f23271d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f23322c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public static boolean m12688a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    public boolean m12689b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f23323d.f23271d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean m12690c() throws IOException {
        boolean z = true;
        try {
            if (this.f23323d.m12645a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (!z) {
                if (e2.getMessage() != null) {
                    throw e2;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            StringBuilder m24u = C0000a.m24u("Token retrieval failed: ");
            m24u.append(e2.getMessage());
            m24u.append(". Will retry token retrieval");
            Log.w("FirebaseMessaging", m24u.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint
    public void run() {
        if (ServiceStarter.m12680a().m12682c(this.f23323d.f23271d)) {
            this.f23322c.acquire();
        }
        try {
            try {
                this.f23323d.m12650g(true);
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.f23323d.m12650g(false);
                if (!ServiceStarter.m12680a().m12682c(this.f23323d.f23271d)) {
                    return;
                }
            }
            if (!this.f23323d.f23279l.m12668d()) {
                this.f23323d.m12650g(false);
                if (ServiceStarter.m12680a().m12682c(this.f23323d.f23271d)) {
                    this.f23322c.release();
                    return;
                }
                return;
            }
            if (ServiceStarter.m12680a().m12681b(this.f23323d.f23271d) && !m12689b()) {
                new ConnectivityChangeReceiver(this).m12691a();
                if (ServiceStarter.m12680a().m12682c(this.f23323d.f23271d)) {
                    this.f23322c.release();
                    return;
                }
                return;
            }
            if (m12690c()) {
                this.f23323d.m12650g(false);
            } else {
                this.f23323d.m12652i(this.f23321b);
            }
            if (!ServiceStarter.m12680a().m12682c(this.f23323d.f23271d)) {
                return;
            }
            this.f23322c.release();
        } catch (Throwable th) {
            if (ServiceStarter.m12680a().m12682c(this.f23323d.f23271d)) {
                this.f23322c.release();
            }
            throw th;
        }
    }
}
