package com.yandex.metrica.impl.p023ob;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.fm */
/* loaded from: classes2.dex */
class RunnableC3958fm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WeakReference f45141a;

    /* renamed from: b */
    public final /* synthetic */ List f45142b;

    /* renamed from: c */
    public final /* synthetic */ C3378Il f45143c;

    /* renamed from: d */
    public final /* synthetic */ C3854bm f45144d;

    /* renamed from: e */
    public final /* synthetic */ C3879cl f45145e;

    /* renamed from: f */
    public final /* synthetic */ boolean f45146f;

    /* renamed from: g */
    public final /* synthetic */ C3984gm f45147g;

    public RunnableC3958fm(C3984gm c3984gm, WeakReference weakReference, List list, C3378Il c3378Il, C3854bm c3854bm, C3879cl c3879cl, boolean z) {
        this.f45147g = c3984gm;
        this.f45141a = weakReference;
        this.f45142b = list;
        this.f45143c = c3378Il;
        this.f45144d = c3854bm;
        this.f45145e = c3879cl;
        this.f45146f = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r1 = true;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f45141a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            com.yandex.metrica.impl.ob.gm r1 = r11.f45147g
            com.yandex.metrica.impl.ob.gm$a r1 = com.yandex.metrica.impl.p023ob.C3984gm.m19979b(r1)
            java.util.List r2 = r11.f45142b
            com.yandex.metrica.impl.ob.gm r3 = r11.f45147g
            java.util.List r3 = com.yandex.metrica.impl.p023ob.C3984gm.m19975a(r3)
            com.yandex.metrica.impl.ob.Il r4 = r11.f45143c
            java.util.Objects.requireNonNull(r1)
            java.util.Iterator r1 = r2.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.am r2 = (com.yandex.metrica.impl.p023ob.InterfaceC3828am) r2
            boolean r2 = r2.mo18239a(r4)
            if (r2 == 0) goto L22
            goto L4b
        L35:
            java.util.Iterator r1 = r3.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.am r2 = (com.yandex.metrica.impl.p023ob.InterfaceC3828am) r2
            boolean r2 = r2.mo18239a(r4)
            if (r2 == 0) goto L39
        L4b:
            r1 = 1
            goto L4e
        L4d:
            r1 = 0
        L4e:
            if (r1 == 0) goto L56
            com.yandex.metrica.impl.ob.wl r1 = new com.yandex.metrica.impl.ob.wl
            r1.<init>()
            goto L5b
        L56:
            com.yandex.metrica.impl.ob.Qk r1 = new com.yandex.metrica.impl.ob.Qk
            r1.<init>()
        L5b:
            r7 = r1
            com.yandex.metrica.impl.ob.gm r1 = r11.f45147g
            com.yandex.metrica.impl.ob.Mk r1 = com.yandex.metrica.impl.p023ob.C3984gm.m19980c(r1)
            long r8 = r1.m18597a()
            com.yandex.metrica.impl.ob.gm r1 = r11.f45147g
            com.yandex.metrica.impl.p023ob.C3984gm.m19976a(r1, r0, r8)
            r10 = 0
            com.yandex.metrica.impl.ob.gm r1 = r11.f45147g     // Catch: java.lang.Throwable -> L84
            com.yandex.metrica.impl.ob.Hl r1 = com.yandex.metrica.impl.p023ob.C3984gm.m19981d(r1)     // Catch: java.lang.Throwable -> L84
            com.yandex.metrica.impl.ob.bm r3 = r11.f45144d     // Catch: java.lang.Throwable -> L84
            com.yandex.metrica.impl.ob.cl r2 = r11.f45145e     // Catch: java.lang.Throwable -> L84
            com.yandex.metrica.impl.ob.bl r4 = r2.m19684c()     // Catch: java.lang.Throwable -> L84
            boolean r6 = r11.f45146f     // Catch: java.lang.Throwable -> L84
            r2 = r0
            r5 = r7
            com.yandex.metrica.impl.ob.Gl r1 = r1.m18240a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L84
            r3 = r1
            goto L8f
        L84:
            r1 = move-exception
            com.yandex.metrica.impl.ob.gm r2 = r11.f45147g
            java.util.List r3 = r11.f45142b
            com.yandex.metrica.impl.ob.bm r4 = r11.f45144d
            com.yandex.metrica.impl.p023ob.C3984gm.m19978a(r2, r3, r1, r4)
            r3 = r10
        L8f:
            if (r3 == 0) goto La1
            com.yandex.metrica.impl.ob.gm r1 = r11.f45147g
            java.util.List r2 = r11.f45142b
            java.util.List r4 = r7.mo18925a()
            com.yandex.metrica.impl.ob.Il r6 = r11.f45143c
            com.yandex.metrica.impl.ob.cl r7 = r11.f45145e
            r5 = r0
            com.yandex.metrica.impl.p023ob.C3984gm.m19977a(r1, r2, r3, r4, r5, r6, r7, r8)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.RunnableC3958fm.run():void");
    }
}
