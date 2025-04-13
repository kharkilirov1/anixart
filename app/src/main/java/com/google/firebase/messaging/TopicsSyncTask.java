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
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class TopicsSyncTask implements Runnable {

    /* renamed from: g */
    public static final Object f23343g = new Object();

    /* renamed from: h */
    @GuardedBy
    public static Boolean f23344h;

    /* renamed from: i */
    @GuardedBy
    public static Boolean f23345i;

    /* renamed from: b */
    public final Context f23346b;

    /* renamed from: c */
    public final Metadata f23347c;

    /* renamed from: d */
    public final PowerManager.WakeLock f23348d;

    /* renamed from: e */
    public final TopicsSubscriber f23349e;

    /* renamed from: f */
    public final long f23350f;

    @VisibleForTesting
    public class ConnectivityChangeReceiver extends BroadcastReceiver {

        /* renamed from: a */
        @Nullable
        @GuardedBy
        public TopicsSyncTask f23351a;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.f23351a = topicsSyncTask;
        }

        /* renamed from: a */
        public void m12706a() {
            if (TopicsSyncTask.m12701a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            TopicsSyncTask.this.f23346b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            TopicsSyncTask topicsSyncTask = this.f23351a;
            if (topicsSyncTask == null) {
                return;
            }
            Object obj = TopicsSyncTask.f23343g;
            if (topicsSyncTask.m12705e()) {
                if (TopicsSyncTask.m12701a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                TopicsSyncTask topicsSyncTask2 = this.f23351a;
                topicsSyncTask2.f23349e.f23340f.schedule(topicsSyncTask2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f23351a = null;
            }
        }
    }

    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j2) {
        this.f23349e = topicsSubscriber;
        this.f23346b = context;
        this.f23350f = j2;
        this.f23347c = metadata;
        this.f23348d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: a */
    public static boolean m12701a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    public static boolean m12702b(Context context) {
        boolean booleanValue;
        synchronized (f23343g) {
            Boolean bool = f23345i;
            Boolean valueOf = Boolean.valueOf(bool == null ? m12703c(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f23345i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    public static boolean m12703c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m12704d(Context context) {
        boolean booleanValue;
        synchronized (f23343g) {
            Boolean bool = f23344h;
            Boolean valueOf = Boolean.valueOf(bool == null ? m12703c(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f23344h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: e */
    public final synchronized boolean m12705e() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f23346b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isConnected();
        }
        return z;
    }

    @Override // java.lang.Runnable
    @SuppressLint
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m12704d(this.f23346b)) {
            this.f23348d.acquire(Constants.f23254a);
        }
        try {
            try {
                try {
                    this.f23349e.m12697e(true);
                } catch (Throwable th) {
                    if (m12704d(this.f23346b)) {
                        try {
                            this.f23348d.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
                this.f23349e.m12697e(false);
                if (!m12704d(this.f23346b)) {
                    return;
                } else {
                    wakeLock = this.f23348d;
                }
            }
            if (!this.f23347c.m12668d()) {
                this.f23349e.m12697e(false);
                if (m12704d(this.f23346b)) {
                    try {
                        this.f23348d.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (m12702b(this.f23346b) && !m12705e()) {
                new ConnectivityChangeReceiver(this).m12706a();
                if (m12704d(this.f23346b)) {
                    try {
                        this.f23348d.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.f23349e.m12699g()) {
                this.f23349e.m12697e(false);
            } else {
                this.f23349e.m12700h(this.f23350f);
            }
            if (m12704d(this.f23346b)) {
                wakeLock = this.f23348d;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
