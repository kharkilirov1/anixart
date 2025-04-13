package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzar implements ServiceConnection {

    /* renamed from: b */
    public final /* synthetic */ zzas f20105b;

    public /* synthetic */ zzar(zzas zzasVar) {
        this.f20105b = zzasVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20105b.f20108b.m10837d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f20105b.m10841a().post(new zzao(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f20105b.f20108b.m10837d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f20105b.m10841a().post(new zzap(this));
    }
}
