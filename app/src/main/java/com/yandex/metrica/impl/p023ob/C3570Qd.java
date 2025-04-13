package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Qd */
/* loaded from: classes2.dex */
public class C3570Qd {

    /* renamed from: a */
    private final b f43704a;

    /* renamed from: com.yandex.metrica.impl.ob.Qd$a */
    public interface a {
        /* renamed from: a */
        void mo17834a();

        /* renamed from: a */
        void mo17835a(@NonNull String str, @NonNull byte[] bArr);

        @Nullable
        /* renamed from: b */
        String mo17836b();

        /* renamed from: c */
        void mo17837c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.Qd$b */
    public static class b {
    }

    public C3570Qd() {
        this(new b());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0063
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18815a(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3570Qd.a r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.yandex.metrica.impl.ob.Qd$b r2 = r4.f43704a     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r6.mo17836b()     // Catch: java.lang.Throwable -> L63
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L63
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.p023ob.C3532P0.m18696i()     // Catch: java.lang.Throwable -> L36
            com.yandex.metrica.impl.ob.Zd r2 = r2.m18721x()     // Catch: java.lang.Throwable -> L36
            javax.net.ssl.HttpsURLConnection r5 = r2.m19508a(r5)     // Catch: java.lang.Throwable -> L36
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L22
            java.lang.String r2 = "If-None-Match"
            r5.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L36
        L22:
            r5.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "GET"
            r5.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = com.yandex.metrica.impl.p023ob.AbstractC3694Vd.a.f44229a     // Catch: java.lang.Throwable -> L36
            r5.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L36
            r5.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L36
            r5.connect()     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r5 = 0
        L37:
            if (r5 == 0) goto L63
            int r2 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L63
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L4a
            r5 = 304(0x130, float:4.26E-43)
            if (r2 == r5) goto L46
            goto L63
        L46:
            r6.mo17834a()     // Catch: java.lang.Throwable -> L63
            goto L64
        L4a:
            java.lang.String r2 = "ETag"
            java.lang.String r2 = r5.getHeaderField(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = com.yandex.metrica.impl.p023ob.C3509O2.m18657b(r2)     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r5 = r5.getInputStream()
            r3 = 2147483647(0x7fffffff, float:NaN)
            byte[] r5 = com.yandex.metrica.impl.p023ob.C3681V0.m19265a(r5, r3)
            r6.mo17835a(r2, r5)
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 != 0) goto L69
            r6.mo17837c()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3570Qd.m18815a(java.lang.String, com.yandex.metrica.impl.ob.Qd$a):void");
    }

    @VisibleForTesting
    public C3570Qd(@NonNull b bVar) {
        this.f43704a = bVar;
    }
}
