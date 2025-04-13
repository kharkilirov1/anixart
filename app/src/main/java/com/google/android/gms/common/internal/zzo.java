package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzo implements ServiceConnection, zzs {

    /* renamed from: b */
    public final Map<ServiceConnection, ServiceConnection> f15814b = new HashMap();

    /* renamed from: c */
    public int f15815c = 2;

    /* renamed from: d */
    public boolean f15816d;

    /* renamed from: e */
    @Nullable
    public IBinder f15817e;

    /* renamed from: f */
    public final zzn f15818f;

    /* renamed from: g */
    public ComponentName f15819g;

    /* renamed from: h */
    public final /* synthetic */ zzr f15820h;

    public zzo(zzr zzrVar, zzn zznVar) {
        this.f15820h = zzrVar;
        this.f15818f = zznVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8201a(java.lang.String r10, @androidx.annotation.Nullable java.util.concurrent.Executor r11) {
        /*
            r9 = this;
            r0 = 3
            r9.f15815c = r0
            com.google.android.gms.common.internal.zzr r0 = r9.f15820h
            com.google.android.gms.common.stats.ConnectionTracker r1 = r0.f15825g
            android.content.Context r2 = r0.f15823e
            com.google.android.gms.common.internal.zzn r0 = r9.f15818f
            java.lang.String r3 = "ConnectionStatusConfig"
            java.lang.String r4 = r0.f15810a
            r5 = 0
            if (r4 == 0) goto L79
            boolean r4 = r0.f15813d
            if (r4 == 0) goto L67
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = r0.f15810a
            java.lang.String r7 = "serviceActionBundleKey"
            r4.putString(r7, r6)
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L2f
            android.net.Uri r7 = com.google.android.gms.common.internal.zzn.f15809e     // Catch: java.lang.IllegalArgumentException -> L2f
            java.lang.String r8 = "serviceIntentCall"
            android.os.Bundle r4 = r6.call(r7, r8, r5, r4)     // Catch: java.lang.IllegalArgumentException -> L2f
            goto L3e
        L2f:
            r4 = move-exception
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "Dynamic intent resolution failed: "
            java.lang.String r4 = r6.concat(r4)
            android.util.Log.w(r3, r4)
            r4 = r5
        L3e:
            if (r4 != 0) goto L41
            goto L4a
        L41:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r4 = r4.getParcelable(r5)
            r5 = r4
            android.content.Intent r5 = (android.content.Intent) r5
        L4a:
            if (r5 != 0) goto L67
            java.lang.String r4 = r0.f15810a
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "Dynamic lookup for intent failed for action: "
            int r7 = r4.length()
            if (r7 == 0) goto L5f
            java.lang.String r4 = r6.concat(r4)
            goto L64
        L5f:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6)
        L64:
            android.util.Log.w(r3, r4)
        L67:
            if (r5 == 0) goto L6a
            goto L82
        L6a:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = r0.f15810a
            r3.<init>(r4)
            java.lang.String r0 = r0.f15811b
            android.content.Intent r0 = r3.setPackage(r0)
            r4 = r0
            goto L83
        L79:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r5 = r0.setComponent(r5)
        L82:
            r4 = r5
        L83:
            com.google.android.gms.common.internal.zzn r0 = r9.f15818f
            int r6 = r0.f15812c
            r7 = 1
            r3 = r10
            r5 = r9
            r8 = r11
            boolean r10 = r1.m8227d(r2, r3, r4, r5, r6, r7, r8)
            r9.f15816d = r10
            if (r10 == 0) goto Laa
            com.google.android.gms.common.internal.zzr r10 = r9.f15820h
            android.os.Handler r10 = r10.f15824f
            com.google.android.gms.common.internal.zzn r11 = r9.f15818f
            r0 = 1
            android.os.Message r10 = r10.obtainMessage(r0, r11)
            com.google.android.gms.common.internal.zzr r11 = r9.f15820h
            android.os.Handler r11 = r11.f15824f
            com.google.android.gms.common.internal.zzr r0 = r9.f15820h
            long r0 = r0.f15827i
            r11.sendMessageDelayed(r10, r0)
            return
        Laa:
            r10 = 2
            r9.f15815c = r10
            com.google.android.gms.common.internal.zzr r10 = r9.f15820h     // Catch: java.lang.IllegalArgumentException -> Lb6
            com.google.android.gms.common.stats.ConnectionTracker r11 = r10.f15825g     // Catch: java.lang.IllegalArgumentException -> Lb6
            android.content.Context r10 = r10.f15823e     // Catch: java.lang.IllegalArgumentException -> Lb6
            r11.m8226c(r10, r9)     // Catch: java.lang.IllegalArgumentException -> Lb6
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzo.m8201a(java.lang.String, java.util.concurrent.Executor):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f15820h.f15822d) {
            this.f15820h.f15824f.removeMessages(1, this.f15818f);
            this.f15817e = iBinder;
            this.f15819g = componentName;
            Iterator<ServiceConnection> it = this.f15814b.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f15815c = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f15820h.f15822d) {
            this.f15820h.f15824f.removeMessages(1, this.f15818f);
            this.f15817e = null;
            this.f15819g = componentName;
            Iterator<ServiceConnection> it = this.f15814b.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f15815c = 2;
        }
    }
}
