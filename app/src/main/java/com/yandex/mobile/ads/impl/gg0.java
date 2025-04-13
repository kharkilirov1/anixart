package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.sv0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class gg0 implements an0 {

    /* renamed from: a */
    @NonNull
    private final Context f50570a;

    /* renamed from: c */
    @NonNull
    private final h71 f50572c;

    /* renamed from: d */
    @NonNull
    private final String f50573d;

    /* renamed from: f */
    @NonNull
    private final p20 f50575f;

    /* renamed from: g */
    @NonNull
    private final C4957d6 f50576g;

    /* renamed from: i */
    @Nullable
    private q20 f50578i;

    /* renamed from: j */
    private boolean f50579j;

    /* renamed from: k */
    private int f50580k;

    /* renamed from: l */
    private boolean f50581l;

    /* renamed from: m */
    private boolean f50582m;

    /* renamed from: b */
    @NonNull
    private final HandlerC5124b f50571b = new HandlerC5124b(Looper.getMainLooper());

    /* renamed from: e */
    @NonNull
    private final ArrayList f50574e = new ArrayList();

    /* renamed from: h */
    @NonNull
    private final xz0 f50577h = xz0.m29823b();

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.gg0$a */
    public static class C5123a {

        /* renamed from: a */
        public String f50583a;

        /* renamed from: b */
        public long f50584b;

        /* renamed from: c */
        public int f50585c;

        /* renamed from: d */
        public Long f50586d;

        public C5123a(int i2, long j2, String str) {
            this.f50583a = str;
            this.f50584b = j2;
            this.f50585c = i2;
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.gg0$b */
    public static class HandlerC5124b extends Handler {
        public HandlerC5124b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            gg0 gg0Var;
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                gg0 gg0Var2 = (gg0) ((WeakReference) pair.first).get();
                if (gg0Var2 != null) {
                    C5123a c5123a = (C5123a) pair.second;
                    n60.m26811d("handleMessage, clazz = %s", gg0Var2.f50573d);
                    aa1 m24880a = gg0.m24880a(gg0Var2, c5123a);
                    gg0.m24882a(gg0Var2, c5123a, m24880a);
                    if (!(m24880a.m22447e() == aa1.EnumC4801a.f48453b)) {
                        c5123a.f50586d = null;
                        gg0Var2.mo22553b();
                        return;
                    } else {
                        gg0Var2.f50574e.remove(c5123a);
                        if (gg0Var2.f50574e.isEmpty()) {
                            gg0Var2.m24887a(m24880a.m22445c());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (i2 == 2 && (gg0Var = (gg0) ((WeakReference) message.obj).get()) != null) {
                n60.m26811d("mNoticeTrackingChecker mNotTrackedNotices.size = %d, clazz = %s", Integer.valueOf(gg0Var.f50574e.size()), gg0Var.f50573d);
                int size = gg0Var.f50574e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C5123a c5123a2 = (C5123a) gg0Var.f50574e.get(i3);
                    aa1 m24880a2 = gg0.m24880a(gg0Var, c5123a2);
                    if (m24880a2.m22447e() == aa1.EnumC4801a.f48453b) {
                        if (c5123a2.f50586d == null) {
                            c5123a2.f50586d = Long.valueOf(SystemClock.elapsedRealtime());
                        }
                        if (SystemClock.elapsedRealtime() - c5123a2.f50586d.longValue() >= c5123a2.f50584b) {
                            gg0Var.f50571b.sendMessage(Message.obtain(gg0Var.f50571b, 1, new Pair(new WeakReference(gg0Var), c5123a2)));
                        }
                        gg0Var.m24888b(m24880a2.m22446d());
                    } else {
                        c5123a2.f50586d = null;
                        gg0Var.m24886a(m24880a2);
                    }
                }
                if (gg0.m24885d(gg0Var)) {
                    gg0Var.f50571b.sendMessageDelayed(Message.obtain(gg0Var.f50571b, 2, new WeakReference(gg0Var)), 200L);
                }
            }
        }
    }

    public gg0(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull p20 p20Var, @NonNull h71 h71Var, @NonNull String str) {
        this.f50570a = context;
        this.f50572c = h71Var;
        this.f50575f = p20Var;
        this.f50573d = str;
        this.f50576g = new C4957d6(context, c5101g2);
    }

    /* renamed from: d */
    public static boolean m24885d(gg0 gg0Var) {
        boolean z;
        synchronized (gg0Var) {
            z = gg0Var.f50574e.size() > 0;
        }
        return z;
    }

    @Override // com.yandex.mobile.ads.impl.an0
    /* renamed from: a */
    public final synchronized void mo22549a() {
        StringBuilder m26356a = l60.m26356a("stopTracking(), clazz = ");
        m26356a.append(this.f50573d);
        n60.m26811d(m26356a.toString(), new Object[0]);
        this.f50571b.removeMessages(2);
        this.f50571b.removeMessages(1);
        Iterator it = this.f50574e.iterator();
        while (it.hasNext()) {
            ((C5123a) it.next()).f50586d = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.an0
    /* renamed from: b */
    public final synchronized void mo22553b() {
        boolean z;
        StringBuilder m26356a = l60.m26356a("startTrackingIfNeeded(), clazz = ");
        m26356a.append(this.f50573d);
        n60.m26811d(m26356a.toString(), new Object[0]);
        if (yp0.m29957a().m29961b(this.f50570a)) {
            Collection[] collectionArr = {this.f50574e};
            for (int i2 = 0; i2 < 1; i2++) {
                Collection collection = collectionArr[i2];
                if (collection != null && !collection.isEmpty()) {
                }
                z = true;
                break;
            }
            z = false;
            if (!z) {
                synchronized (this) {
                    if ((this.f50574e.size() > 0) && !this.f50571b.hasMessages(2)) {
                        HandlerC5124b handlerC5124b = this.f50571b;
                        handlerC5124b.sendMessage(Message.obtain(handlerC5124b, 2, new WeakReference(this)));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    @Override // com.yandex.mobile.ads.impl.an0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo22554c() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gg0.mo22554c():void");
    }

    @Override // com.yandex.mobile.ads.impl.an0
    /* renamed from: a */
    public final synchronized void mo22551a(@NonNull AdResponse adResponse, @NonNull List<v01> list) {
        StringBuilder m26356a = l60.m26356a("updateNotices(), clazz = ");
        m26356a.append(this.f50573d);
        n60.m26811d(m26356a.toString(), new Object[0]);
        this.f50575f.m27147a(adResponse);
        this.f50574e.clear();
        this.f50580k = 0;
        this.f50579j = false;
        this.f50581l = false;
        this.f50582m = false;
        mo22549a();
        synchronized (this) {
            for (v01 v01Var : list) {
                String m29162b = v01Var.m29162b();
                long m29158a = v01Var.m29158a();
                this.f50574e.add(new C5123a(v01Var.m29163c(), m29158a, m29162b));
            }
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public final synchronized void m24888b(@NonNull sv0.EnumC5764b enumC5764b) {
        if (!this.f50581l) {
            this.f50575f.m27150a(enumC5764b);
            n60.m26811d("Ad binding successful", new Object[0]);
            this.f50581l = true;
        }
    }

    /* renamed from: a */
    public static void m24882a(gg0 gg0Var, C5123a c5123a, aa1 aa1Var) {
        synchronized (gg0Var) {
            if (aa1Var.m22447e() == aa1.EnumC4801a.f48453b) {
                gg0Var.f50576g.m23816a(c5123a.f50583a);
            } else {
                gg0Var.m24886a(aa1Var);
            }
        }
    }

    /* renamed from: a */
    public static aa1 m24880a(gg0 gg0Var, C5123a c5123a) {
        aa1 mo24331b = gg0Var.f50572c.mo24331b(c5123a.f50585c);
        n60.m26811d("validateTrackingState(), validationResult = %s", mo24331b.m22447e().m22448a());
        return mo24331b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (r7.equals("android.intent.action.SCREEN_OFF") == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:20:0x005c, B:21:0x0060, B:22:0x0034, B:26:0x003f, B:30:0x004a), top: B:3:0x0002 }] */
    @Override // com.yandex.mobile.ads.impl.an0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo22550a(@androidx.annotation.NonNull android.content.Intent r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L65
            r1 = 0
            r0[r1] = r7     // Catch: java.lang.Throwable -> L65
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L65
            r3 = 1
            r0[r3] = r2     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = r6.f50573d     // Catch: java.lang.Throwable -> L65
            r4 = 2
            r0[r4] = r2     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = "handleIntent(), intent = %s, isAdVisible = %b, clazz = %s"
            com.yandex.mobile.ads.impl.n60.m26811d(r2, r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r7.getAction()     // Catch: java.lang.Throwable -> L65
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L65
            r0 = -1
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L65
            r5 = -2128145023(0xffffffff81271581, float:-3.0688484E-38)
            if (r2 == r5) goto L4a
            r1 = -1454123155(0xffffffffa953d76d, float:-4.7038264E-14)
            if (r2 == r1) goto L3f
            r1 = 823795052(0x311a1d6c, float:2.2426674E-9)
            if (r2 == r1) goto L34
            goto L52
        L34:
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L65
            if (r7 != 0) goto L3d
            goto L52
        L3d:
            r1 = 2
            goto L53
        L3f:
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L65
            if (r7 != 0) goto L48
            goto L52
        L48:
            r1 = 1
            goto L53
        L4a:
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L65
            if (r7 != 0) goto L53
        L52:
            r1 = -1
        L53:
            if (r1 == 0) goto L60
            if (r1 == r3) goto L5a
            if (r1 == r4) goto L5a
            goto L63
        L5a:
            if (r8 == 0) goto L63
            r6.mo22553b()     // Catch: java.lang.Throwable -> L65
            goto L63
        L60:
            r6.mo22549a()     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r6)
            return
        L65:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gg0.mo22550a(android.content.Intent, boolean):void");
    }

    @VisibleForTesting
    /* renamed from: a */
    public final synchronized void m24887a(sv0.EnumC5764b enumC5764b) {
        HashMap hashMap = new HashMap();
        hashMap.put("failure_tracked", Boolean.valueOf(this.f50579j));
        this.f50575f.m27151a(enumC5764b, hashMap);
        q20 q20Var = this.f50578i;
        if (q20Var != null) {
            q20Var.mo26330f();
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public final synchronized void m24886a(aa1 aa1Var) {
        int i2 = this.f50580k + 1;
        this.f50580k = i2;
        if (i2 == 20) {
            this.f50575f.m27152b(aa1Var);
            this.f50579j = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.an0
    /* renamed from: a */
    public final void mo22552a(@NonNull l20 l20Var) {
        this.f50578i = l20Var;
    }
}
