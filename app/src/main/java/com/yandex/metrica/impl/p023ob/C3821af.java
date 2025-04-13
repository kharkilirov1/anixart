package com.yandex.metrica.impl.p023ob;

/* renamed from: com.yandex.metrica.impl.ob.af */
/* loaded from: classes2.dex */
public class C3821af implements InterfaceC3899df {
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:12:0x0024, B:15:0x0066, B:18:0x0072, B:20:0x007a, B:21:0x007e, B:23:0x0086, B:28:0x0089, B:30:0x008f, B:32:0x0099), top: B:11:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:12:0x0024, B:15:0x0066, B:18:0x0072, B:20:0x007a, B:21:0x007e, B:23:0x0086, B:28:0x0089, B:30:0x008f, B:32:0x0099), top: B:11:0x0024 }] */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3899df
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C3696Vf.b mo18966a(@androidx.annotation.Nullable java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "original_provider"
            java.lang.String r1 = "provider"
            java.lang.String r2 = "lat"
            java.lang.String r3 = "lon"
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L9c
            if (r4 != 0) goto L9c
            com.yandex.metrica.impl.ob.ym$a r4 = new com.yandex.metrica.impl.ob.ym$a     // Catch: java.lang.Throwable -> L9c
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            boolean r8 = r4.m21278d(r3)     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L9c
            boolean r8 = r4.m21278d(r2)     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L9c
            com.yandex.metrica.impl.ob.Vf$b r8 = new com.yandex.metrica.impl.ob.Vf$b     // Catch: java.lang.Throwable -> L9c
            r8.<init>()     // Catch: java.lang.Throwable -> L9c
            double r5 = r4.getDouble(r3)     // Catch: java.lang.Throwable -> L9d
            r8.f44239c = r5     // Catch: java.lang.Throwable -> L9d
            double r2 = r4.getDouble(r2)     // Catch: java.lang.Throwable -> L9d
            r8.f44238b = r2     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "altitude"
            int r2 = r4.optInt(r2)     // Catch: java.lang.Throwable -> L9d
            r8.f44244h = r2     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "direction"
            int r2 = r4.optInt(r2)     // Catch: java.lang.Throwable -> L9d
            r8.f44242f = r2     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "precision"
            int r2 = r4.optInt(r2)     // Catch: java.lang.Throwable -> L9d
            r8.f44241e = r2     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "speed"
            int r2 = r4.optInt(r2)     // Catch: java.lang.Throwable -> L9d
            r8.f44243g = r2     // Catch: java.lang.Throwable -> L9d
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "timestamp"
            long r5 = r4.optLong(r3)     // Catch: java.lang.Throwable -> L9d
            long r2 = r2.toSeconds(r5)     // Catch: java.lang.Throwable -> L9d
            r8.f44240d = r2     // Catch: java.lang.Throwable -> L9d
            boolean r2 = r4.m21278d(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = ""
            if (r2 == 0) goto L89
            boolean r2 = r4.has(r1)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L71
            java.lang.String r1 = r4.getString(r1)     // Catch: java.lang.Throwable -> L71
            goto L72
        L71:
            r1 = r3
        L72:
            java.lang.String r2 = "gps"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L7e
            r1 = 1
            r8.f44245i = r1     // Catch: java.lang.Throwable -> L9d
            goto L89
        L7e:
            java.lang.String r2 = "network"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L89
            r1 = 2
            r8.f44245i = r1     // Catch: java.lang.Throwable -> L9d
        L89:
            boolean r1 = r4.m21278d(r0)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L9d
            boolean r1 = r4.has(r0)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L99
            java.lang.String r3 = r4.getString(r0)     // Catch: java.lang.Throwable -> L99
        L99:
            r8.f44246j = r3     // Catch: java.lang.Throwable -> L9d
            goto L9d
        L9c:
            r8 = 0
        L9d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3821af.mo18966a(java.lang.String):com.yandex.metrica.impl.ob.Vf$b");
    }
}
