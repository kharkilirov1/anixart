package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class rm0 {

    /* renamed from: e */
    @Nullable
    private static rm0 f54357e;

    /* renamed from: a */
    private final Handler f54358a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<InterfaceC5698b>> f54359b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f54360c = new Object();

    /* renamed from: d */
    @GuardedBy
    private int f54361d = 0;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.rm0$a */
    public static final class C5697a {

        /* renamed from: com.yandex.mobile.ads.impl.rm0$a$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            private final rm0 f54362a;

            public a(rm0 rm0Var) {
                this.f54362a = rm0Var;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                rm0.m27950a(this.f54362a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        /* renamed from: a */
        public static void m27955a(Context context, rm0 rm0Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                Objects.requireNonNull(telephonyManager);
                a aVar = new a(rm0Var);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                rm0.m27950a(rm0Var, 5);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rm0$b */
    public interface InterfaceC5698b {
        /* renamed from: a */
        void mo27956a(int i2);
    }

    /* renamed from: com.yandex.mobile.ads.impl.rm0$c */
    public final class C5699c extends BroadcastReceiver {
        private C5699c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int m27948a = rm0.m27948a(context);
            if (s91.f54530a < 31 || m27948a != 5) {
                rm0.m27950a(rm0.this, m27948a);
            } else {
                C5697a.m27955a(context, rm0.this);
            }
        }

        public /* synthetic */ C5699c(rm0 rm0Var, int i2) {
            this();
        }
    }

    private rm0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C5699c(this, 0), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27949a(InterfaceC5698b interfaceC5698b) {
        interfaceC5698b.mo27956a(m27953a());
    }

    /* renamed from: b */
    public static synchronized rm0 m27952b(Context context) {
        rm0 rm0Var;
        synchronized (rm0.class) {
            if (f54357e == null) {
                f54357e = new rm0(context);
            }
            rm0Var = f54357e;
        }
        return rm0Var;
    }

    /* renamed from: a */
    public final int m27953a() {
        int i2;
        synchronized (this.f54360c) {
            i2 = this.f54361d;
        }
        return i2;
    }

    /* renamed from: b */
    public final void m27954b(InterfaceC5698b interfaceC5698b) {
        Iterator<WeakReference<InterfaceC5698b>> it = this.f54359b.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC5698b> next = it.next();
            if (next.get() == null) {
                this.f54359b.remove(next);
            }
        }
        this.f54359b.add(new WeakReference<>(interfaceC5698b));
        this.f54358a.post(new hn1(this, interfaceC5698b, 26));
    }

    /* renamed from: a */
    public static void m27950a(rm0 rm0Var, int i2) {
        synchronized (rm0Var.f54360c) {
            if (rm0Var.f54361d == i2) {
                return;
            }
            rm0Var.f54361d = i2;
            Iterator<WeakReference<InterfaceC5698b>> it = rm0Var.f54359b.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC5698b> next = it.next();
                InterfaceC5698b interfaceC5698b = next.get();
                if (interfaceC5698b != null) {
                    interfaceC5698b.mo27956a(i2);
                } else {
                    rm0Var.f54359b.remove(next);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m27948a(android.content.Context r6) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
            r0 = 9
            r1 = 6
            r2 = 4
            r3 = 5
            r4 = 1
            if (r6 != 0) goto L11
            goto L4d
        L11:
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4d
            if (r6 == 0) goto L4b
            boolean r5 = r6.isConnected()
            if (r5 != 0) goto L1e
            goto L4b
        L1e:
            int r5 = r6.getType()
            if (r5 == 0) goto L33
            if (r5 == r4) goto L43
            if (r5 == r0) goto L31
            if (r5 == r2) goto L33
            if (r5 == r3) goto L33
            if (r5 == r1) goto L45
            r0 = 8
            goto L4e
        L31:
            r0 = 7
            goto L4e
        L33:
            int r6 = r6.getSubtype()
            switch(r6) {
                case 1: goto L49;
                case 2: goto L49;
                case 3: goto L47;
                case 4: goto L47;
                case 5: goto L47;
                case 6: goto L47;
                case 7: goto L47;
                case 8: goto L47;
                case 9: goto L47;
                case 10: goto L47;
                case 11: goto L47;
                case 12: goto L47;
                case 13: goto L45;
                case 14: goto L47;
                case 15: goto L47;
                case 16: goto L3a;
                case 17: goto L47;
                case 18: goto L43;
                case 19: goto L3a;
                case 20: goto L3c;
                default: goto L3a;
            }
        L3a:
            r0 = 6
            goto L4e
        L3c:
            int r6 = com.yandex.mobile.ads.impl.s91.f54530a
            r1 = 29
            if (r6 < r1) goto L4d
            goto L4e
        L43:
            r0 = 2
            goto L4e
        L45:
            r0 = 5
            goto L4e
        L47:
            r0 = 4
            goto L4e
        L49:
            r0 = 3
            goto L4e
        L4b:
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rm0.m27948a(android.content.Context):int");
    }
}
