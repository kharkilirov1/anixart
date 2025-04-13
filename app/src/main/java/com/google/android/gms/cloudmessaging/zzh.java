package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzh implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzm f15276b;

    public /* synthetic */ zzh(zzm zzmVar) {
        this.f15276b = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final zzm zzmVar = this.f15276b;
        while (true) {
            synchronized (zzmVar) {
                if (zzmVar.f15282b != 2) {
                    return;
                }
                if (zzmVar.f15285e.isEmpty()) {
                    zzmVar.m7901c();
                    return;
                }
                final zzp<?> poll = zzmVar.f15285e.poll();
                zzmVar.f15286f.put(poll.f15290a, poll);
                zzmVar.f15287g.f15296b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzm zzmVar2 = zzm.this;
                        int i2 = poll.f15290a;
                        synchronized (zzmVar2) {
                            zzp<?> zzpVar = zzmVar2.f15286f.get(i2);
                            if (zzpVar != null) {
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("Timing out request: ");
                                sb.append(i2);
                                Log.w("MessengerIpcClient", sb.toString());
                                zzmVar2.f15286f.remove(i2);
                                zzpVar.m7905c(new zzq("Timed out waiting for response", null));
                                zzmVar2.m7901c();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String valueOf = String.valueOf(poll);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                    sb.append("Sending ");
                    sb.append(valueOf);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                Context context = zzmVar.f15287g.f15295a;
                Messenger messenger = zzmVar.f15283c;
                Message obtain = Message.obtain();
                obtain.what = poll.f15292c;
                obtain.arg1 = poll.f15290a;
                obtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", poll.mo7904b());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", poll.f15293d);
                obtain.setData(bundle);
                try {
                    zzn zznVar = zzmVar.f15284d;
                    Messenger messenger2 = zznVar.f15288a;
                    if (messenger2 != null) {
                        messenger2.send(obtain);
                    } else {
                        zzd zzdVar = zznVar.f15289b;
                        if (zzdVar == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        Messenger messenger3 = zzdVar.f15268b;
                        Objects.requireNonNull(messenger3);
                        messenger3.send(obtain);
                    }
                } catch (RemoteException e2) {
                    zzmVar.m7899a(2, e2.getMessage());
                }
            }
        }
    }
}
