package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
final class zzm implements ServiceConnection {

    /* renamed from: d */
    public zzn f15284d;

    /* renamed from: g */
    public final /* synthetic */ zzs f15287g;

    /* renamed from: b */
    @GuardedBy
    public int f15282b = 0;

    /* renamed from: c */
    public final Messenger f15283c = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzf
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            zzm zzmVar = zzm.this;
            int i2 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i2);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (zzmVar) {
                zzp<?> zzpVar = zzmVar.f15286f.get(i2);
                if (zzpVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i2);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                zzmVar.f15286f.remove(i2);
                zzmVar.m7901c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzpVar.m7905c(new zzq("Not supported by GmsCore", null));
                    return true;
                }
                zzpVar.mo7903a(data);
                return true;
            }
        }
    }));

    /* renamed from: e */
    @GuardedBy
    public final Queue<zzp<?>> f15285e = new ArrayDeque();

    /* renamed from: f */
    @GuardedBy
    public final SparseArray<zzp<?>> f15286f = new SparseArray<>();

    public /* synthetic */ zzm(zzs zzsVar, zzl zzlVar) {
        this.f15287g = zzsVar;
    }

    /* renamed from: a */
    public final synchronized void m7899a(int i2, @Nullable String str) {
        m7900b(i2, str, null);
    }

    /* renamed from: b */
    public final synchronized void m7900b(int i2, @Nullable String str, @Nullable Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.f15282b;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return;
            }
            this.f15282b = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f15282b = 4;
        ConnectionTracker.m8223b().m8226c(this.f15287g.f15295a, this);
        zzq zzqVar = new zzq(str, th);
        Iterator<zzp<?>> it = this.f15285e.iterator();
        while (it.hasNext()) {
            it.next().m7905c(zzqVar);
        }
        this.f15285e.clear();
        for (int i4 = 0; i4 < this.f15286f.size(); i4++) {
            this.f15286f.valueAt(i4).m7905c(zzqVar);
        }
        this.f15286f.clear();
    }

    /* renamed from: c */
    public final synchronized void m7901c() {
        if (this.f15282b == 2 && this.f15285e.isEmpty() && this.f15286f.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f15282b = 3;
            ConnectionTracker.m8223b().m8226c(this.f15287g.f15295a, this);
        }
    }

    /* renamed from: d */
    public final synchronized boolean m7902d(zzp<?> zzpVar) {
        int i2 = this.f15282b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f15285e.add(zzpVar);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            this.f15285e.add(zzpVar);
            this.f15287g.f15296b.execute(new zzh(this));
            return true;
        }
        this.f15285e.add(zzpVar);
        Preconditions.m8133h(this.f15282b == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f15282b = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.m8223b().m8225a(this.f15287g.f15295a, intent, this, 1)) {
                this.f15287g.f15296b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzm zzmVar = zzm.this;
                        synchronized (zzmVar) {
                            if (zzmVar.f15282b == 1) {
                                zzmVar.m7899a(1, "Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m7899a(0, "Unable to bind to service");
            }
        } catch (SecurityException e2) {
            m7900b(0, "Unable to bind to service", e2);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f15287g.f15296b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzm zzmVar = zzm.this;
                IBinder iBinder2 = iBinder;
                synchronized (zzmVar) {
                    try {
                        if (iBinder2 == null) {
                            zzmVar.m7899a(0, "Null service connection");
                            return;
                        }
                        try {
                            zzmVar.f15284d = new zzn(iBinder2);
                            zzmVar.f15282b = 2;
                            zzmVar.f15287g.f15296b.execute(new zzh(zzmVar));
                        } catch (RemoteException e2) {
                            zzmVar.m7899a(0, e2.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f15287g.f15296b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzm.this.m7899a(2, "Service disconnected");
            }
        });
    }
}
