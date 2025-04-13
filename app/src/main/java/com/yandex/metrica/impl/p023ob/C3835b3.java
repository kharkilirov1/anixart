package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.b3 */
/* loaded from: classes2.dex */
public class C3835b3 {

    /* renamed from: l */
    @SuppressLint
    private static volatile C3835b3 f44790l;

    /* renamed from: m */
    private static final Object f44791m = new Object();

    /* renamed from: a */
    private final Context f44792a;

    /* renamed from: b */
    @Nullable
    private final WifiManager f44793b;

    /* renamed from: c */
    @NonNull
    private C3950fe f44794c;

    /* renamed from: d */
    @NonNull
    private C4106le f44795d;

    /* renamed from: e */
    @NonNull
    private C3479Mm f44796e;

    /* renamed from: f */
    @Nullable
    private InterfaceC3653Tm<Context, Intent, Void> f44797f;

    /* renamed from: g */
    private C3575Qi f44798g;

    /* renamed from: h */
    private final InterfaceC3976ge f44799h;

    /* renamed from: i */
    private final InterfaceC3976ge f44800i;

    /* renamed from: j */
    @NonNull
    private final C3861c3 f44801j;

    /* renamed from: k */
    @NonNull
    private final C3887d3 f44802k;

    private C3835b3(@NonNull Context context, @Nullable WifiManager wifiManager, @NonNull C4106le c4106le) {
        this(context, wifiManager, c4106le, new C3950fe(c4106le.m20356a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007b, code lost:
    
        if (r4.getIpAddress() == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f A[Catch: all -> 0x007d, TryCatch #7 {all -> 0x007d, blocks: (B:42:0x0059, B:44:0x005f, B:46:0x006b, B:48:0x0077), top: B:41:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.yandex.metrica.impl.p023ob.C3783Z2> m19639c() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3835b3.m19639c():java.util.List");
    }

    /* renamed from: a */
    public static C3835b3 m19636a(Context context) {
        if (f44790l == null) {
            synchronized (f44791m) {
                if (f44790l == null) {
                    Context applicationContext = context.getApplicationContext();
                    f44790l = new C3835b3(applicationContext, (WifiManager) applicationContext.getApplicationContext().getSystemService("wifi"), new C4106le());
                }
            }
        }
        return f44790l;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.yandex.metrica.impl.p023ob.C3783Z2> m19644b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.fe r0 = r2.f44794c     // Catch: java.lang.Throwable -> L33
            android.content.Context r1 = r2.f44792a     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.m19902c(r1)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto Ld
            r0 = 0
            goto L25
        Ld:
            android.net.wifi.WifiManager r0 = r2.f44793b     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L1c
            boolean r0 = r0.isWifiEnabled()     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L20
            goto L21
        L20:
            r1 = r0
        L21:
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
        L25:
            if (r0 != 0) goto L2d
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r2)
            return r0
        L2d:
            java.util.List r0 = r2.m19639c()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r2)
            return r0
        L33:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3835b3.m19644b():java.util.List");
    }

    private C3835b3(@NonNull Context context, @Nullable WifiManager wifiManager, @NonNull C4106le c4106le, @NonNull C3950fe c3950fe) {
        this(context, wifiManager, c4106le, new C3479Mm(), c3950fe, new C3808a2(), new C3861c3(), C3532P0.m18696i().m18707j().m20472d());
    }

    @VisibleForTesting
    public C3835b3(Context context, @Nullable WifiManager wifiManager, @NonNull C4106le c4106le, @NonNull C3479Mm c3479Mm, @NonNull C3950fe c3950fe, @NonNull C3808a2 c3808a2, @NonNull C3861c3 c3861c3, @NonNull C3887d3 c3887d3) {
        this.f44792a = context;
        this.f44793b = wifiManager;
        this.f44795d = c4106le;
        this.f44794c = c3950fe;
        this.f44799h = c3808a2.m19566d(c3950fe);
        this.f44800i = c3808a2.m19567e(c3950fe);
        this.f44796e = c3479Mm;
        this.f44801j = c3861c3;
        this.f44802k = c3887d3;
    }

    /* renamed from: a */
    public void m19641a(@NonNull C3575Qi c3575Qi) {
        this.f44798g = c3575Qi;
        this.f44795d.m20357a(c3575Qi);
        this.f44794c.m19899a(this.f44795d.m20356a());
        if (c3575Qi.m18846d() != null) {
            C3861c3 c3861c3 = this.f44801j;
            C4214pi m18846d = c3575Qi.m18846d();
            c3861c3.f43657a.m18648a(m18846d.f46204b, c3861c3.mo18770a(m18846d));
        }
    }

    /* renamed from: a */
    public void m19642a(boolean z) {
        this.f44795d.m20358a(z);
        this.f44794c.m19899a(this.f44795d.m20356a());
    }

    @SuppressLint
    /* renamed from: a */
    public synchronized boolean m19643a(@NonNull CountDownLatch countDownLatch, @NonNull AbstractC3884d0 abstractC3884d0) {
        Boolean valueOf;
        if (!this.f44800i.mo19401a(this.f44792a)) {
            return false;
        }
        if (this.f44797f == null) {
            this.f44797f = new C3809a3(this, abstractC3884d0, countDownLatch);
        }
        this.f44802k.m19703a(this.f44797f);
        WifiManager wifiManager = this.f44793b;
        if (wifiManager != null) {
            try {
                valueOf = Boolean.valueOf(wifiManager.startScan());
            } catch (Throwable unused) {
            }
            return Boolean.TRUE.equals(valueOf);
        }
        valueOf = null;
        return Boolean.TRUE.equals(valueOf);
    }

    @NonNull
    /* renamed from: a */
    public C3861c3 m19640a() {
        return this.f44801j;
    }
}
