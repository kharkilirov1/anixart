package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class RequirementsWatcher {

    /* renamed from: a */
    public final Context f12216a;

    /* renamed from: b */
    public final Listener f12217b;

    /* renamed from: c */
    public final Requirements f12218c;

    /* renamed from: d */
    public final Handler f12219d;

    /* renamed from: e */
    public int f12220e;

    /* renamed from: f */
    @Nullable
    public NetworkCallback f12221f;

    public class DeviceStatusChangeReceiver extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ RequirementsWatcher f12222a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher requirementsWatcher = this.f12222a;
            int m6758a = requirementsWatcher.f12218c.m6758a(requirementsWatcher.f12216a);
            if (requirementsWatcher.f12220e != m6758a) {
                requirementsWatcher.f12220e = m6758a;
                requirementsWatcher.f12217b.m6763a(requirementsWatcher, m6758a);
            }
        }
    }

    public interface Listener {
        /* renamed from: a */
        void m6763a(RequirementsWatcher requirementsWatcher, int i2);
    }

    @RequiresApi
    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        public boolean f12223a;

        /* renamed from: b */
        public boolean f12224b;

        /* renamed from: c */
        public final /* synthetic */ RequirementsWatcher f12225c;

        /* renamed from: a */
        public final void m6764a() {
            this.f12225c.f12219d.post(new RunnableC1084a(this, 1));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            m6764a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            this.f12225c.f12219d.post(new RunnableC1084a(this, 0));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.f12223a && this.f12224b == hasCapability) {
                if (hasCapability) {
                    this.f12225c.f12219d.post(new RunnableC1084a(this, 0));
                }
            } else {
                this.f12223a = true;
                this.f12224b = hasCapability;
                m6764a();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            m6764a();
        }
    }
}
