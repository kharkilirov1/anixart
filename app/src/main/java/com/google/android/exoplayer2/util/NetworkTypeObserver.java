package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class NetworkTypeObserver {

    /* renamed from: e */
    @Nullable
    public static NetworkTypeObserver f14687e;

    /* renamed from: a */
    public final Handler f14688a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList<WeakReference<Listener>> f14689b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Object f14690c = new Object();

    /* renamed from: d */
    @GuardedBy
    public int f14691d = 0;

    public static final class Config {
    }

    public interface Listener {
        /* renamed from: a */
        void mo7483a(int i2);
    }

    public final class Receiver extends BroadcastReceiver {
        public Receiver(C11731 c11731) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
        
            if (com.google.android.exoplayer2.util.Util.f14736a >= 29) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x006c A[Catch: RuntimeException -> 0x0079, TryCatch #0 {RuntimeException -> 0x0079, blocks: (B:8:0x0055, B:10:0x006c, B:11:0x0075, B:15:0x0070), top: B:7:0x0055 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: RuntimeException -> 0x0079, TryCatch #0 {RuntimeException -> 0x0079, blocks: (B:8:0x0055, B:10:0x006c, B:11:0x0075, B:15:0x0070), top: B:7:0x0055 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r10 = "connectivity"
                java.lang.Object r10 = r9.getSystemService(r10)
                android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
                r0 = 29
                r1 = 9
                r2 = 6
                r3 = 4
                r4 = 0
                r5 = 1
                r6 = 5
                if (r10 != 0) goto L14
                goto L4e
            L14:
                android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
                if (r10 == 0) goto L4c
                boolean r7 = r10.isConnected()
                if (r7 != 0) goto L21
                goto L4c
            L21:
                int r7 = r10.getType()
                if (r7 == 0) goto L36
                if (r7 == r5) goto L44
                if (r7 == r3) goto L36
                if (r7 == r6) goto L36
                if (r7 == r2) goto L46
                if (r7 == r1) goto L34
                r1 = 8
                goto L4f
            L34:
                r1 = 7
                goto L4f
            L36:
                int r10 = r10.getSubtype()
                switch(r10) {
                    case 1: goto L4a;
                    case 2: goto L4a;
                    case 3: goto L48;
                    case 4: goto L48;
                    case 5: goto L48;
                    case 6: goto L48;
                    case 7: goto L48;
                    case 8: goto L48;
                    case 9: goto L48;
                    case 10: goto L48;
                    case 11: goto L48;
                    case 12: goto L48;
                    case 13: goto L46;
                    case 14: goto L48;
                    case 15: goto L48;
                    case 16: goto L3d;
                    case 17: goto L48;
                    case 18: goto L44;
                    case 19: goto L3d;
                    case 20: goto L3f;
                    default: goto L3d;
                }
            L3d:
                r1 = 6
                goto L4f
            L3f:
                int r10 = com.google.android.exoplayer2.util.Util.f14736a
                if (r10 < r0) goto L4e
                goto L4f
            L44:
                r1 = 2
                goto L4f
            L46:
                r1 = 5
                goto L4f
            L48:
                r1 = 4
                goto L4f
            L4a:
                r1 = 3
                goto L4f
            L4c:
                r1 = 1
                goto L4f
            L4e:
                r1 = 0
            L4f:
                int r10 = com.google.android.exoplayer2.util.Util.f14736a
                if (r10 < r0) goto L79
                if (r1 != r6) goto L79
                java.lang.String r0 = "phone"
                java.lang.Object r9 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L79
                android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch: java.lang.RuntimeException -> L79
                java.util.Objects.requireNonNull(r9)     // Catch: java.lang.RuntimeException -> L79
                com.google.android.exoplayer2.util.NetworkTypeObserver$TelephonyManagerListener r0 = new com.google.android.exoplayer2.util.NetworkTypeObserver$TelephonyManagerListener     // Catch: java.lang.RuntimeException -> L79
                com.google.android.exoplayer2.util.NetworkTypeObserver r2 = com.google.android.exoplayer2.util.NetworkTypeObserver.this     // Catch: java.lang.RuntimeException -> L79
                r3 = 0
                r0.<init>(r3)     // Catch: java.lang.RuntimeException -> L79
                r2 = 31
                if (r10 >= r2) goto L70
                r9.listen(r0, r5)     // Catch: java.lang.RuntimeException -> L79
                goto L75
            L70:
                r10 = 1048576(0x100000, float:1.469368E-39)
                r9.listen(r0, r10)     // Catch: java.lang.RuntimeException -> L79
            L75:
                r9.listen(r0, r4)     // Catch: java.lang.RuntimeException -> L79
                return
            L79:
                com.google.android.exoplayer2.util.NetworkTypeObserver r9 = com.google.android.exoplayer2.util.NetworkTypeObserver.this
                com.google.android.exoplayer2.util.NetworkTypeObserver.m7615a(r9, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.NetworkTypeObserver.Receiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public class TelephonyManagerListener extends PhoneStateListener {
        public TelephonyManagerListener(C11731 c11731) {
        }

        @Override // android.telephony.PhoneStateListener
        @RequiresApi
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            NetworkTypeObserver.m7615a(NetworkTypeObserver.this, overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(@Nullable ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            NetworkTypeObserver.m7615a(NetworkTypeObserver.this, serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Receiver(null), intentFilter);
    }

    /* renamed from: a */
    public static void m7615a(NetworkTypeObserver networkTypeObserver, int i2) {
        synchronized (networkTypeObserver.f14690c) {
            if (networkTypeObserver.f14691d == i2) {
                return;
            }
            networkTypeObserver.f14691d = i2;
            Iterator<WeakReference<Listener>> it = networkTypeObserver.f14689b.iterator();
            while (it.hasNext()) {
                WeakReference<Listener> next = it.next();
                Listener listener = next.get();
                if (listener != null) {
                    listener.mo7483a(i2);
                } else {
                    networkTypeObserver.f14689b.remove(next);
                }
            }
        }
    }
}
