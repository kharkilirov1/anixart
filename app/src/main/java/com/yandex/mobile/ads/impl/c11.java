package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class c11 extends C5284jg {

    /* renamed from: g */
    private static final Pattern f49065g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h */
    private static final Pattern f49066h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i */
    private static final Pattern f49067i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: j */
    public static final /* synthetic */ int f49068j = 0;

    private c11(String str, long j2, long j3, long j4, @Nullable File file) {
        super(str, j2, j3, j4, file);
    }

    /* renamed from: a */
    public static c11 m23003a(String str, long j2) {
        return new c11(str, j2, -1L, -9223372036854775807L, null);
    }

    /* renamed from: a */
    public static c11 m23004a(String str, long j2, long j3) {
        return new c11(str, j2, j3, -9223372036854775807L, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x008e, code lost:
    
        if (r17.renameTo(r3) == false) goto L15;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.c11 m23002a(java.io.File r17, long r18, long r20, com.yandex.mobile.ads.impl.C5493ng r22) {
        /*
            r0 = r22
            java.lang.String r1 = r17.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r3 = r1.endsWith(r2)
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L9b
            java.lang.String r1 = r17.getName()
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.c11.f49066h
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r8 = r3.matches()
            if (r8 == 0) goto L2e
            java.lang.String r1 = r3.group(r6)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = com.yandex.mobile.ads.impl.s91.m28133e(r1)
            goto L43
        L2e:
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.c11.f49065g
            java.util.regex.Matcher r3 = r3.matcher(r1)
            boolean r1 = r3.matches()
            if (r1 == 0) goto L42
            java.lang.String r1 = r3.group(r6)
            java.util.Objects.requireNonNull(r1)
            goto L43
        L42:
            r1 = r7
        L43:
            if (r1 != 0) goto L46
            goto L90
        L46:
            java.io.File r8 = r17.getParentFile()
            java.lang.Object r8 = com.yandex.mobile.ads.impl.C5220ia.m25474b(r8)
            java.io.File r8 = (java.io.File) r8
            com.yandex.mobile.ads.impl.mg r1 = r0.m26891b(r1)
            int r1 = r1.f52678a
            java.lang.String r9 = r3.group(r5)
            java.util.Objects.requireNonNull(r9)
            long r9 = java.lang.Long.parseLong(r9)
            java.lang.String r3 = r3.group(r4)
            java.util.Objects.requireNonNull(r3)
            long r11 = java.lang.Long.parseLong(r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            java.lang.String r1 = "."
            r13.append(r1)
            r13.append(r9)
            r13.append(r1)
            java.lang.String r1 = p000a.C0000a.m19p(r13, r11, r2)
            r3.<init>(r8, r1)
            r2 = r17
            boolean r1 = r2.renameTo(r3)
            if (r1 != 0) goto L91
        L90:
            r3 = r7
        L91:
            if (r3 != 0) goto L94
            return r7
        L94:
            java.lang.String r1 = r3.getName()
            r16 = r3
            goto L9f
        L9b:
            r2 = r17
            r16 = r2
        L9f:
            java.util.regex.Pattern r2 = com.yandex.mobile.ads.impl.c11.f49067i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto Lac
            return r7
        Lac:
            java.lang.String r2 = r1.group(r6)
            java.util.Objects.requireNonNull(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r9 = r0.m26887a(r2)
            if (r9 != 0) goto Lbe
            return r7
        Lbe:
            r2 = -1
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 != 0) goto Lca
            long r2 = r16.length()
            r12 = r2
            goto Lcc
        Lca:
            r12 = r18
        Lcc:
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto Ld3
            return r7
        Ld3:
            java.lang.String r0 = r1.group(r5)
            java.util.Objects.requireNonNull(r0)
            long r10 = java.lang.Long.parseLong(r0)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r0 != 0) goto Lf4
            java.lang.String r0 = r1.group(r4)
            java.util.Objects.requireNonNull(r0)
            long r0 = java.lang.Long.parseLong(r0)
            r14 = r0
            goto Lf6
        Lf4:
            r14 = r20
        Lf6:
            com.yandex.mobile.ads.impl.c11 r0 = new com.yandex.mobile.ads.impl.c11
            r8 = r0
            r8.<init>(r9, r10, r12, r14, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.c11.m23002a(java.io.File, long, long, com.yandex.mobile.ads.impl.ng):com.yandex.mobile.ads.impl.c11");
    }

    /* renamed from: a */
    public final c11 m23005a(File file, long j2) {
        C5220ia.m25476b(this.f51600d);
        return new c11(this.f51597a, this.f51598b, this.f51599c, j2, file);
    }
}
