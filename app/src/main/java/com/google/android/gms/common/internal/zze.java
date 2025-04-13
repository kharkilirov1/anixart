package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zze implements ServiceConnection {

    /* renamed from: b */
    public final int f15800b;

    /* renamed from: c */
    public final /* synthetic */ BaseGmsClient f15801c;

    public zze(BaseGmsClient baseGmsClient, int i2) {
        this.f15801c = baseGmsClient;
        this.f15800b = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.f15801c;
        if (iBinder == null) {
            BaseGmsClient.m8088F(baseGmsClient, 16);
            return;
        }
        synchronized (baseGmsClient.f15663m) {
            BaseGmsClient baseGmsClient2 = this.f15801c;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            baseGmsClient2.f15664n = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new zzac(iBinder) : (IGmsServiceBroker) queryLocalInterface;
        }
        BaseGmsClient baseGmsClient3 = this.f15801c;
        int i2 = this.f15800b;
        Handler handler = baseGmsClient3.f15661k;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new zzg(baseGmsClient3, 0)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient;
        synchronized (this.f15801c.f15663m) {
            baseGmsClient = this.f15801c;
            baseGmsClient.f15664n = null;
        }
        Handler handler = baseGmsClient.f15661k;
        handler.sendMessage(handler.obtainMessage(6, this.f15800b, 1));
    }
}
