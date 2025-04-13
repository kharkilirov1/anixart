package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.exo.offline.C4778c;
import com.yandex.mobile.ads.exo.scheduler.Requirements;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ow0 {

    /* renamed from: a */
    private final Context f53340a;

    /* renamed from: b */
    private final InterfaceC5555b f53341b;

    /* renamed from: c */
    private final Requirements f53342c;

    /* renamed from: d */
    private final Handler f53343d;

    /* renamed from: e */
    private int f53344e;

    /* renamed from: f */
    @Nullable
    private C5556c f53345f;

    /* renamed from: com.yandex.mobile.ads.impl.ow0$a */
    public class C5554a extends BroadcastReceiver {
        private C5554a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            ow0.m27117a(ow0.this);
        }

        public /* synthetic */ C5554a(ow0 ow0Var, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ow0$b */
    public interface InterfaceC5555b {
        /* renamed from: a */
        void mo15595a(ow0 ow0Var, int i2);
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.ow0$c */
    public final class C5556c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        private boolean f53347a;

        /* renamed from: b */
        private boolean f53348b;

        private C5556c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m27122a() {
            if (ow0.this.f53345f != null) {
                ow0.m27117a(ow0.this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m27124b() {
            if (ow0.this.f53345f != null) {
                ow0.m27120d(ow0.this);
            }
        }

        /* renamed from: c */
        private void m27126c() {
            ow0.this.f53343d.post(new op1(this, 1));
        }

        /* renamed from: d */
        private void m27127d() {
            ow0.this.f53343d.post(new op1(this, 0));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            m27126c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            m27127d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.f53347a && this.f53348b == hasCapability) {
                if (hasCapability) {
                    m27127d();
                }
            } else {
                this.f53347a = true;
                this.f53348b = hasCapability;
                m27126c();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            m27126c();
        }

        public /* synthetic */ C5556c(ow0 ow0Var, int i2) {
            this();
        }
    }

    public ow0(Context context, InterfaceC5555b interfaceC5555b) {
        Requirements requirements = C4778c.f48211j;
        this.f53340a = context.getApplicationContext();
        this.f53341b = interfaceC5555b;
        this.f53342c = requirements;
        this.f53343d = s91.m28120b();
    }

    /* renamed from: d */
    public static void m27120d(ow0 ow0Var) {
        int m22323a;
        if ((ow0Var.f53344e & 3) == 0 || ow0Var.f53344e == (m22323a = ow0Var.f53342c.m22323a(ow0Var.f53340a))) {
            return;
        }
        ow0Var.f53344e = m22323a;
        ow0Var.f53341b.mo15595a(ow0Var, m22323a);
    }

    /* renamed from: a */
    public final int m27121a() {
        this.f53344e = this.f53342c.m22323a(this.f53340a);
        IntentFilter intentFilter = new IntentFilter();
        int i2 = 0;
        if (this.f53342c.m22326e()) {
            if (s91.f54530a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f53340a.getSystemService("connectivity");
                Objects.requireNonNull(connectivityManager);
                C5556c c5556c = new C5556c(this, i2);
                this.f53345f = c5556c;
                connectivityManager.registerDefaultNetworkCallback(c5556c);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f53342c.m22324c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f53342c.m22325d()) {
            if (s91.f54530a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f53342c.m22327f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f53340a.registerReceiver(new C5554a(this, i2), intentFilter, null, this.f53343d);
        return this.f53344e;
    }

    /* renamed from: a */
    public static void m27117a(ow0 ow0Var) {
        int m22323a = ow0Var.f53342c.m22323a(ow0Var.f53340a);
        if (ow0Var.f53344e != m22323a) {
            ow0Var.f53344e = m22323a;
            ow0Var.f53341b.mo15595a(ow0Var, m22323a);
        }
    }
}
