package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* loaded from: classes2.dex */
class SyncTask implements Runnable {

    /* renamed from: b */
    public final long f23115b;

    /* renamed from: c */
    public final PowerManager.WakeLock f23116c;

    /* renamed from: d */
    public final FirebaseInstanceId f23117d;

    /* renamed from: e */
    @VisibleForTesting
    public ExecutorService f23118e = FirebaseIidExecutors.m12519a();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    @VisibleForTesting
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {

        /* renamed from: a */
        @Nullable
        public SyncTask f23119a;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.f23119a = syncTask;
        }

        /* renamed from: a */
        public void m12552a() {
            if (FirebaseInstanceId.m12522i()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f23119a.m12549a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.f23119a;
            if (syncTask != null && syncTask.m12550b()) {
                if (FirebaseInstanceId.m12522i()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                SyncTask syncTask2 = this.f23119a;
                syncTask2.f23117d.m12524d(syncTask2, 0L);
                this.f23119a.m12549a().unregisterReceiver(this);
                this.f23119a = null;
            }
        }
    }

    @VisibleForTesting
    public SyncTask(FirebaseInstanceId firebaseInstanceId, long j2) {
        this.f23117d = firebaseInstanceId;
        this.f23115b = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m12549a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f23116c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: a */
    public Context m12549a() {
        FirebaseApp firebaseApp = this.f23117d.f23059b;
        firebaseApp.m12217a();
        return firebaseApp.f22259a;
    }

    /* renamed from: b */
    public boolean m12550b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m12549a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean m12551c() throws IOException {
        FirebaseInstanceId firebaseInstanceId = this.f23117d;
        boolean z = true;
        if (!this.f23117d.m12532m(firebaseInstanceId.m12528h(Metadata.m12534b(firebaseInstanceId.f23059b), "*"))) {
            return true;
        }
        try {
            if (this.f23117d.m12523b() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
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
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message2 = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
            sb.append("Token retrieval failed: ");
            sb.append(message2);
            sb.append(". Will retry token retrieval");
            Log.w("FirebaseInstanceId", sb.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint
    public void run() {
        if (ServiceStarter.m12540a().m12542c(m12549a())) {
            this.f23116c.acquire();
        }
        try {
            try {
                this.f23117d.m12530k(true);
                if (!this.f23117d.m12529j()) {
                    this.f23117d.m12530k(false);
                    if (!ServiceStarter.m12540a().m12542c(m12549a())) {
                        return;
                    }
                } else if (!ServiceStarter.m12540a().m12541b(m12549a()) || m12550b()) {
                    if (m12551c()) {
                        this.f23117d.m12530k(false);
                    } else {
                        this.f23117d.m12531l(this.f23115b);
                    }
                    if (!ServiceStarter.m12540a().m12542c(m12549a())) {
                        return;
                    }
                } else {
                    new ConnectivityChangeReceiver(this).m12552a();
                    if (!ServiceStarter.m12540a().m12542c(m12549a())) {
                        return;
                    }
                }
            } catch (IOException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseInstanceId", sb.toString());
                this.f23117d.m12530k(false);
                if (!ServiceStarter.m12540a().m12542c(m12549a())) {
                    return;
                }
            }
            this.f23116c.release();
        } catch (Throwable th) {
            if (ServiceStarter.m12540a().m12542c(m12549a())) {
                this.f23116c.release();
            }
            throw th;
        }
    }
}
