package com.yandex.metrica.push.impl;

/* renamed from: com.yandex.metrica.push.impl.l */
/* loaded from: classes2.dex */
public abstract class AbstractC4584l {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if ((com.yandex.metrica.push.impl.C4530J0.m21447a(17) ? com.yandex.metrica.push.impl.AbstractC4586m.m21555a(r5) : java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis() - r5.getTime())) <= java.util.concurrent.TimeUnit.SECONDS.toNanos(r6.longValue())) goto L10;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m21554a(@androidx.annotation.Nullable android.location.Location r5, @androidx.annotation.Nullable java.lang.Long r6, int r7) {
        /*
            if (r5 == 0) goto L37
            if (r6 == 0) goto L2e
            r0 = 17
            boolean r0 = com.yandex.metrica.push.impl.C4530J0.m21447a(r0)
            if (r0 == 0) goto L11
            long r0 = com.yandex.metrica.push.impl.AbstractC4586m.m21555a(r5)
            goto L20
        L11:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r5.getTime()
            long r1 = r1 - r3
            long r0 = r0.toNanos(r1)
        L20:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r6.longValue()
            long r2 = r2.toNanos(r3)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L37
        L2e:
            float r5 = r5.getAccuracy()
            int r5 = (int) r5
            if (r5 > r7) goto L37
            r5 = 1
            goto L38
        L37:
            r5 = 0
        L38:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.push.impl.AbstractC4584l.m21554a(android.location.Location, java.lang.Long, int):boolean");
    }
}
