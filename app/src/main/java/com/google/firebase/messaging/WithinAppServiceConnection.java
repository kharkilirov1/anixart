package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p000a.C0000a;

/* loaded from: classes2.dex */
class WithinAppServiceConnection implements ServiceConnection {

    /* renamed from: b */
    public final Context f23358b;

    /* renamed from: c */
    public final Intent f23359c;

    /* renamed from: d */
    public final ScheduledExecutorService f23360d;

    /* renamed from: e */
    public final Queue<BindRequest> f23361e;

    /* renamed from: f */
    @Nullable
    public WithinAppServiceBinder f23362f;

    /* renamed from: g */
    @GuardedBy
    public boolean f23363g;

    public static class BindRequest {

        /* renamed from: a */
        public final Intent f23364a;

        /* renamed from: b */
        public final TaskCompletionSource<Void> f23365b = new TaskCompletionSource<>();

        public BindRequest(Intent intent) {
            this.f23364a = intent;
        }

        /* renamed from: a */
        public void m12712a() {
            this.f23365b.m9718d(null);
        }
    }

    public WithinAppServiceConnection(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f23361e = new ArrayDeque();
        this.f23363g = false;
        Context applicationContext = context.getApplicationContext();
        this.f23358b = applicationContext;
        this.f23359c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f23360d = scheduledThreadPoolExecutor;
    }

    @GuardedBy
    /* renamed from: a */
    public final void m12709a() {
        while (!this.f23361e.isEmpty()) {
            this.f23361e.poll().m12712a();
        }
    }

    /* renamed from: b */
    public final synchronized void m12710b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f23361e.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            WithinAppServiceBinder withinAppServiceBinder = this.f23362f;
            if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                m12711c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f23362f.m12708a(this.f23361e.poll());
        }
    }

    @GuardedBy
    /* renamed from: c */
    public final void m12711c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder m24u = C0000a.m24u("binder is dead. start connection? ");
            m24u.append(!this.f23363g);
            Log.d("FirebaseMessaging", m24u.toString());
        }
        if (this.f23363g) {
            return;
        }
        this.f23363g = true;
        try {
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e2);
        }
        if (ConnectionTracker.m8223b().m8225a(this.f23358b, this.f23359c, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f23363g = false;
        m12709a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f23363g = false;
        if (iBinder instanceof WithinAppServiceBinder) {
            this.f23362f = (WithinAppServiceBinder) iBinder;
            m12710b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        m12709a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m12710b();
    }
}
