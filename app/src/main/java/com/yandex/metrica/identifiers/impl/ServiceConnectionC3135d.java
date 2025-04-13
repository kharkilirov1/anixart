package com.yandex.metrica.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.identifiers.impl.d */
/* loaded from: classes2.dex */
public class ServiceConnectionC3135d implements ServiceConnection {

    /* renamed from: b */
    @NonNull
    public final Intent f42486b;

    /* renamed from: c */
    @Nullable
    public IBinder f42487c;

    /* renamed from: d */
    public final Object f42488d = new Object();

    public ServiceConnectionC3135d(@NonNull Intent intent, @NonNull String str) {
        this.f42486b = intent;
        String.format("[AdServiceConnection-%s]", str);
    }

    /* renamed from: a */
    public void m17797a(@NonNull Context context) {
        synchronized (this.f42488d) {
            this.f42487c = null;
            this.f42488d.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        synchronized (this.f42488d) {
            this.f42487c = null;
            this.f42488d.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        synchronized (this.f42488d) {
            this.f42488d.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f42488d) {
            this.f42487c = iBinder;
            this.f42488d.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f42488d) {
            this.f42487c = null;
            this.f42488d.notifyAll();
        }
    }
}
