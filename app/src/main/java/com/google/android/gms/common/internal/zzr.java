package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzr extends GmsClientSupervisor {

    /* renamed from: d */
    @GuardedBy
    public final HashMap<zzn, zzo> f15822d = new HashMap<>();

    /* renamed from: e */
    public final Context f15823e;

    /* renamed from: f */
    public volatile Handler f15824f;

    /* renamed from: g */
    public final ConnectionTracker f15825g;

    /* renamed from: h */
    public final long f15826h;

    /* renamed from: i */
    public final long f15827i;

    public zzr(Context context, Looper looper) {
        zzq zzqVar = new zzq(this);
        this.f15823e = context.getApplicationContext();
        this.f15824f = new com.google.android.gms.internal.common.zzi(looper, zzqVar);
        this.f15825g = ConnectionTracker.m8223b();
        this.f15826h = 5000L;
        this.f15827i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* renamed from: b */
    public final void mo8117b(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.m8132g(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f15822d) {
            zzo zzoVar = this.f15822d.get(zznVar);
            if (zzoVar == null) {
                String zznVar2 = zznVar.toString();
                StringBuilder sb = new StringBuilder(zznVar2.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(zznVar2);
                throw new IllegalStateException(sb.toString());
            }
            if (!zzoVar.f15814b.containsKey(serviceConnection)) {
                String zznVar3 = zznVar.toString();
                StringBuilder sb2 = new StringBuilder(zznVar3.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(zznVar3);
                throw new IllegalStateException(sb2.toString());
            }
            zzoVar.f15814b.remove(serviceConnection);
            if (zzoVar.f15814b.isEmpty()) {
                this.f15824f.sendMessageDelayed(this.f15824f.obtainMessage(0, zznVar), this.f15826h);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* renamed from: c */
    public final boolean mo8118c(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean z;
        synchronized (this.f15822d) {
            zzo zzoVar = this.f15822d.get(zznVar);
            if (zzoVar == null) {
                zzoVar = new zzo(this, zznVar);
                zzoVar.f15814b.put(serviceConnection, serviceConnection);
                zzoVar.m8201a(str, executor);
                this.f15822d.put(zznVar, zzoVar);
            } else {
                this.f15824f.removeMessages(0, zznVar);
                if (zzoVar.f15814b.containsKey(serviceConnection)) {
                    String zznVar2 = zznVar.toString();
                    StringBuilder sb = new StringBuilder(zznVar2.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(zznVar2);
                    throw new IllegalStateException(sb.toString());
                }
                zzoVar.f15814b.put(serviceConnection, serviceConnection);
                int i2 = zzoVar.f15815c;
                if (i2 == 1) {
                    serviceConnection.onServiceConnected(zzoVar.f15819g, zzoVar.f15817e);
                } else if (i2 == 2) {
                    zzoVar.m8201a(str, executor);
                }
            }
            z = zzoVar.f15816d;
        }
        return z;
    }
}
