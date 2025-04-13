package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.rl */
/* loaded from: classes2.dex */
public class C4269rl {

    /* renamed from: a */
    @NonNull
    private final List<C4269rl> f46312a = new ArrayList();

    /* renamed from: b */
    @NonNull
    private final C3727Wl f46313b;

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    public static class a {

        /* renamed from: a */
        public final int f46314a;

        /* renamed from: b */
        public final int f46315b;

        /* renamed from: c */
        @Nullable
        public final JSONObject f46316c;

        public a(int i2, int i3, @Nullable JSONObject jSONObject) {
            this.f46314a = i2;
            this.f46315b = i3;
            this.f46316c = jSONObject;
        }
    }

    public C4269rl(@NonNull C3727Wl c3727Wl) {
        this.f46313b = c3727Wl;
    }

    /* renamed from: a */
    public void m20668a(@NonNull C4269rl c4269rl) {
        this.f46312a.add(c4269rl);
    }

    @NonNull
    /* renamed from: a */
    public C3727Wl m20666a() {
        return this.f46313b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(9:8|(1:13)|17|18|19|20|(5:25|(5:28|(1:30)|31|(2:34|35)(1:33)|26)|39|36|37)|40|41)|44|(2:10|13)|17|18|19|20|(6:22|25|(1:26)|39|36|37)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r5 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r0 = r7.f46313b.m19367a(r8, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:20:0x003b, B:22:0x004b, B:25:0x0050, B:26:0x0056, B:28:0x005c, B:30:0x006c, B:31:0x006f, B:33:0x0074, B:40:0x0079), top: B:19:0x003b }] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C4269rl.a m20667a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3428Kl r8, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3853bl r9, int r10, int r11) {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r11 + 1
            com.yandex.metrica.impl.ob.Wl r2 = r7.f46313b     // Catch: java.lang.Throwable -> L80
            com.yandex.metrica.impl.ob.Wl$b r2 = r2.mo18016a(r9)     // Catch: java.lang.Throwable -> L80
            boolean r3 = r8.f43290f     // Catch: java.lang.Throwable -> L80
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1e
            com.yandex.metrica.impl.ob.Wl r3 = r7.f46313b     // Catch: java.lang.Throwable -> L80
            boolean r3 = r3.mo18018a()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L1c
            goto L1e
        L1c:
            r3 = 0
            goto L1f
        L1e:
            r3 = 1
        L1f:
            if (r2 == 0) goto L27
            boolean r6 = r8.f43293i     // Catch: java.lang.Throwable -> L80
            if (r6 != 0) goto L26
            goto L27
        L26:
            r5 = 0
        L27:
            if (r3 == 0) goto L31
            if (r5 == 0) goto L31
            com.yandex.metrica.impl.ob.Wl r3 = r7.f46313b     // Catch: java.lang.Throwable -> L80
            org.json.JSONObject r0 = r3.m19367a(r8, r2)     // Catch: java.lang.Throwable -> L80
        L31:
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L80
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L80
            int r2 = r2.length     // Catch: java.lang.Throwable -> L80
            int r2 = r2 + r10
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L81
            r3.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "ch"
            r0.put(r5, r3)     // Catch: java.lang.Throwable -> L81
            int r2 = r2 + 8
            int r5 = r8.f43298n     // Catch: java.lang.Throwable -> L81
            if (r2 > r5) goto L79
            int r5 = r8.f43297m     // Catch: java.lang.Throwable -> L81
            if (r1 <= r5) goto L50
            goto L79
        L50:
            java.util.List<com.yandex.metrica.impl.ob.rl> r4 = r7.f46312a     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L81
        L56:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L81
            com.yandex.metrica.impl.ob.rl r5 = (com.yandex.metrica.impl.p023ob.C4269rl) r5     // Catch: java.lang.Throwable -> L81
            int r6 = r2 + 1
            com.yandex.metrica.impl.ob.rl$a r5 = r5.m20667a(r8, r9, r6, r1)     // Catch: java.lang.Throwable -> L81
            org.json.JSONObject r6 = r5.f46316c     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L6f
            r3.put(r6)     // Catch: java.lang.Throwable -> L81
        L6f:
            int r6 = r5.f46314a     // Catch: java.lang.Throwable -> L81
            if (r6 != 0) goto L74
            goto L81
        L74:
            int r5 = r5.f46315b     // Catch: java.lang.Throwable -> L81
            int r1 = r1 + r5
            int r2 = r2 + r6
            goto L56
        L79:
            com.yandex.metrica.impl.ob.rl$a r8 = new com.yandex.metrica.impl.ob.rl$a     // Catch: java.lang.Throwable -> L81
            r9 = 0
            r8.<init>(r4, r4, r9)     // Catch: java.lang.Throwable -> L81
            return r8
        L80:
            r2 = r10
        L81:
            com.yandex.metrica.impl.ob.rl$a r8 = new com.yandex.metrica.impl.ob.rl$a
            int r2 = r2 - r10
            int r1 = r1 - r11
            r8.<init>(r2, r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4269rl.m20667a(com.yandex.metrica.impl.ob.Kl, com.yandex.metrica.impl.ob.bl, int, int):com.yandex.metrica.impl.ob.rl$a");
    }
}
