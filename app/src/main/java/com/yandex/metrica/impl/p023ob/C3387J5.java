package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.J5 */
/* loaded from: classes2.dex */
public class C3387J5 extends AbstractC4279s5 {

    /* renamed from: b */
    @NonNull
    private final C3860c2 f43187b;

    public C3387J5(@NonNull C3940f4 c3940f4) {
        this(c3940f4, C3532P0.m18696i().m18710m());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:19:0x0061 BREAK  A[LOOP:0: B:13:0x004e->B:16:0x005e], SYNTHETIC] */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo17815a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4066k0 r14) {
        /*
            r13 = this;
            java.lang.String r14 = r14.m20214p()
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L11
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L11
            java.lang.String r14 = "preloadInfo"
            org.json.JSONObject r14 = r1.optJSONObject(r14)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r14 = r0
        L12:
            com.yandex.metrica.impl.ob.c2 r1 = r13.f43187b
            com.yandex.metrica.impl.ob.Le r8 = new com.yandex.metrica.impl.ob.Le
            java.lang.String r2 = "trackingId"
            java.lang.String r3 = com.yandex.metrica.impl.p023ob.C4452ym.m21267e(r14, r2)
            java.lang.String r2 = "additionalParams"
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            if (r14 == 0) goto L30
            boolean r5 = r14.has(r2)
            if (r5 == 0) goto L30
            org.json.JSONObject r2 = r14.getJSONObject(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r2 = r0
        L31:
            if (r2 != 0) goto L34
            goto L35
        L34:
            r4 = r2
        L35:
            java.lang.String r2 = "wasSet"
            r9 = 0
            boolean r5 = com.yandex.metrica.impl.p023ob.C4452ym.m21249a(r14, r2, r9)
            java.lang.String r2 = "autoTracking"
            boolean r6 = com.yandex.metrica.impl.p023ob.C4452ym.m21249a(r14, r2, r9)
            java.lang.String r2 = "source"
            java.lang.String r14 = com.yandex.metrica.impl.p023ob.C4452ym.m21267e(r14, r2)
            com.yandex.metrica.impl.ob.E0[] r2 = com.yandex.metrica.impl.p023ob.EnumC3257E0.values()
            r7 = 4
            r10 = 0
        L4e:
            if (r10 >= r7) goto L61
            r11 = r2[r10]
            java.lang.String r12 = r11.m17995a()
            boolean r12 = kotlin.jvm.internal.Intrinsics.m32174c(r12, r14)
            if (r12 == 0) goto L5e
            r0 = r11
            goto L61
        L5e:
            int r10 = r10 + 1
            goto L4e
        L61:
            if (r0 == 0) goto L65
            r7 = r0
            goto L68
        L65:
            com.yandex.metrica.impl.ob.E0 r14 = com.yandex.metrica.impl.p023ob.EnumC3257E0.UNDEFINED
            r7 = r14
        L68:
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.m17847b(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3387J5.mo17815a(com.yandex.metrica.impl.ob.k0):boolean");
    }

    @VisibleForTesting
    public C3387J5(@NonNull C3940f4 c3940f4, @NonNull C3860c2 c3860c2) {
        super(c3940f4);
        this.f43187b = c3860c2;
    }
}
