package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class WifiLockManager {

    /* renamed from: a */
    @Nullable
    public final WifiManager f10092a;

    /* renamed from: b */
    @Nullable
    public WifiManager.WifiLock f10093b;

    /* renamed from: c */
    public boolean f10094c;

    /* renamed from: d */
    public boolean f10095d;

    public WifiLockManager(Context context) {
        this.f10092a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    public final void m6010a() {
        WifiManager.WifiLock wifiLock = this.f10093b;
        if (wifiLock == null) {
            return;
        }
        if (this.f10094c && this.f10095d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
