package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.C3130i;

/* renamed from: com.yandex.metrica.impl.ob.u1 */
/* loaded from: classes2.dex */
class C4327u1 extends AbstractC3381J {
    public C4327u1(Context context, C3659U3 c3659u3, @NonNull C3130i c3130i, C4146n2 c4146n2) {
        this(context, c3659u3, c3130i, c4146n2, new C3407K0(context));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C4327u1(@androidx.annotation.NonNull android.content.Context r16, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3659U3 r17, @androidx.annotation.NonNull com.yandex.metrica.C3130i r18, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4146n2 r19, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3407K0 r20) {
        /*
            r15 = this;
            r0 = r18
            com.yandex.metrica.impl.ob.k2 r5 = new com.yandex.metrica.impl.ob.k2
            com.yandex.metrica.CounterConfiguration r1 = new com.yandex.metrica.CounterConfiguration
            r1.<init>()
            monitor-enter(r1)
            java.lang.String r2 = r0.apiKey     // Catch: java.lang.Throwable -> L9f
            r1.m17757h(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r2 = r0.sessionTimeout     // Catch: java.lang.Throwable -> L9f
            r1.m17762n(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r2 = r0.f42476a     // Catch: java.lang.Throwable -> L9f
            r1.m17756g(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer r2 = r0.f42477b     // Catch: java.lang.Throwable -> L9f
            r1.m17758i(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r2 = r0.logs     // Catch: java.lang.Throwable -> L9f
            boolean r3 = com.yandex.metrica.impl.p023ob.C3658U2.m19212a(r2)     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L3b
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L9f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L9f
            android.content.ContentValues r3 = r1.f42234b     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = "CFG_IS_LOG_ENABLED"
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9f
            goto L3b
        L38:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L3b:
            java.lang.Boolean r2 = r0.statisticsSending     // Catch: java.lang.Throwable -> L9f
            boolean r3 = com.yandex.metrica.impl.p023ob.C3658U2.m19212a(r2)     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L4a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L9f
            r1.m17761m(r2)     // Catch: java.lang.Throwable -> L9f
        L4a:
            java.lang.Integer r2 = r0.maxReportsInDatabaseCount     // Catch: java.lang.Throwable -> L9f
            boolean r3 = com.yandex.metrica.impl.p023ob.C3658U2.m19212a(r2)     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L59
            android.content.ContentValues r3 = r1.f42234b     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = "MAX_REPORTS_IN_DB_COUNT"
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L9f
        L59:
            java.lang.String r2 = r0.apiKey     // Catch: java.lang.Throwable -> L9f
            r1.m17760l(r2)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r0.userProfileID
            r3 = r17
            r5.<init>(r3, r1, r2)
            com.yandex.metrica.impl.ob.Y r1 = com.yandex.metrica.impl.p023ob.C3755Y.m19410g()
            com.yandex.metrica.impl.ob.Hm r7 = r1.m19419j()
            com.yandex.metrica.impl.ob.xh r8 = new com.yandex.metrica.impl.ob.xh
            r8.<init>()
            com.yandex.metrica.impl.ob.wh r9 = new com.yandex.metrica.impl.ob.wh
            r1 = 0
            r9.<init>(r1, r1)
            com.yandex.metrica.impl.ob.F7 r10 = new com.yandex.metrica.impl.ob.F7
            r10.<init>()
            com.yandex.metrica.impl.ob.A7 r11 = new com.yandex.metrica.impl.ob.A7
            r11.<init>()
            com.yandex.metrica.impl.ob.u7 r12 = new com.yandex.metrica.impl.ob.u7
            r12.<init>()
            com.yandex.metrica.impl.ob.s7 r13 = new com.yandex.metrica.impl.ob.s7
            r13.<init>()
            com.yandex.metrica.impl.ob.a7 r14 = new com.yandex.metrica.impl.ob.a7
            r6 = r20
            r14.<init>(r6)
            r1 = r15
            r2 = r16
            r3 = r19
            r4 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L9f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4327u1.<init>(android.content.Context, com.yandex.metrica.impl.ob.U3, com.yandex.metrica.i, com.yandex.metrica.impl.ob.n2, com.yandex.metrica.impl.ob.K0):void");
    }

    @VisibleForTesting
    public C4327u1(Context context, C4146n2 c4146n2, @NonNull C3130i c3130i, C4068k2 c4068k2, @NonNull C3407K0 c3407k0, @NonNull InterfaceC3354Hm interfaceC3354Hm, @NonNull C4421xh c4421xh, @NonNull C4395wh c4395wh, @NonNull C3289F7 c3289f7, @NonNull C3164A7 c3164a7, @NonNull C4333u7 c4333u7, @NonNull C4281s7 c4281s7, @NonNull C3813a7 c3813a7) {
        super(context, c4146n2, c4068k2, c3407k0, interfaceC3354Hm, c4421xh.m21153a(c4146n2.m20431b(), c3130i.apiKey, false), c4395wh, c3289f7, c3164a7, c4333u7, c4281s7, c3813a7);
    }
}
