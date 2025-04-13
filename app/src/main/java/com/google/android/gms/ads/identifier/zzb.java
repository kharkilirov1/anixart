package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@VisibleForTesting
/* loaded from: classes.dex */
final class zzb extends Thread {

    /* renamed from: b */
    public final WeakReference<AdvertisingIdClient> f15006b;

    /* renamed from: c */
    public final long f15007c;

    /* renamed from: d */
    public final CountDownLatch f15008d = new CountDownLatch(1);

    /* renamed from: e */
    public boolean f15009e = false;

    public zzb(AdvertisingIdClient advertisingIdClient, long j2) {
        this.f15006b = new WeakReference<>(advertisingIdClient);
        this.f15007c = j2;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        try {
            if (this.f15008d.await(this.f15007c, TimeUnit.MILLISECONDS) || (advertisingIdClient = this.f15006b.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f15009e = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = this.f15006b.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f15009e = true;
            }
        }
    }
}
