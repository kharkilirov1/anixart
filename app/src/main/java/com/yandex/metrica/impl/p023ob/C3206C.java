package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4429y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.C */
/* loaded from: classes2.dex */
public class C3206C implements C4429y.b {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC3757Y1<C4248r0>> f42646a;

    /* renamed from: b */
    @Nullable
    private volatile C4248r0 f42647b;

    /* renamed from: c */
    @NonNull
    private final C4429y f42648c;

    /* renamed from: d */
    @NonNull
    private final InterfaceExecutorC4297sn f42649d;

    /* renamed from: com.yandex.metrica.impl.ob.C$a */
    public class a implements InterfaceC3757Y1<C4248r0> {

        /* renamed from: a */
        public final /* synthetic */ String f42650a;

        public a(C3206C c3206c, String str) {
            this.f42650a = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3757Y1
        /* renamed from: b */
        public void mo17914b(@NonNull C4248r0 c4248r0) {
            c4248r0.m20613b(this.f42650a);
        }
    }

    public C3206C(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(interfaceExecutorC4297sn, C3755Y.m19410g().m19412b());
    }

    /* renamed from: a */
    public void m17911a() {
        this.f42648c.m21170a(this, C4429y.a.CREATED);
    }

    @VisibleForTesting
    public C3206C(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4429y c4429y) {
        this.f42646a = new ArrayList();
        this.f42647b = null;
        this.f42649d = interfaceExecutorC4297sn;
        this.f42648c = c4429y;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[LOOP:0: B:10:0x0016->B:12:0x001c, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m17913a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4248r0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f42647b = r3     // Catch: java.lang.Throwable -> L2a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.f42646a     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r1 = r2.f42646a     // Catch: java.lang.Throwable -> L27
            r1.clear()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.yandex.metrica.impl.ob.Y1 r1 = (com.yandex.metrica.impl.p023ob.InterfaceC3757Y1) r1
            r1.mo17914b(r3)
            goto L16
        L26:
            return
        L27:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3     // Catch: java.lang.Throwable -> L2a
        L2a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3206C.m17913a(com.yandex.metrica.impl.ob.r0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.yandex.metrica.impl.p023ob.C4429y.b
    @androidx.annotation.MainThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo17912a(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4429y.a r4) {
        /*
            r2 = this;
            r4 = 0
            if (r3 == 0) goto L8
            android.content.Intent r3 = r3.getIntent()     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r3 = r4
        L9:
            if (r3 != 0) goto Lc
            goto L10
        Lc:
            java.lang.String r4 = r3.getDataString()
        L10:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L37
            com.yandex.metrica.impl.ob.C$a r3 = new com.yandex.metrica.impl.ob.C$a
            r3.<init>(r2, r4)
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.r0 r4 = r2.f42647b     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L26
            java.util.List<com.yandex.metrica.impl.ob.Y1<com.yandex.metrica.impl.ob.r0>> r4 = r2.f42646a     // Catch: java.lang.Throwable -> L34
            r4.add(r3)     // Catch: java.lang.Throwable -> L34
            goto L32
        L26:
            com.yandex.metrica.impl.ob.sn r0 = r2.f42649d     // Catch: java.lang.Throwable -> L34
            com.yandex.metrica.impl.ob.B r1 = new com.yandex.metrica.impl.ob.B     // Catch: java.lang.Throwable -> L34
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L34
            com.yandex.metrica.impl.ob.rn r0 = (com.yandex.metrica.impl.p023ob.C4271rn) r0     // Catch: java.lang.Throwable -> L34
            r0.execute(r1)     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r2)
            goto L37
        L34:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3206C.mo17912a(android.app.Activity, com.yandex.metrica.impl.ob.y$a):void");
    }
}
