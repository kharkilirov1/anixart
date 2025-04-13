package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* renamed from: com.yandex.mobile.ads.impl.ox */
/* loaded from: classes3.dex */
public final class C5557ox {

    /* renamed from: c */
    private static final Pattern f53350c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f53351a = -1;

    /* renamed from: b */
    public int f53352b = -1;

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m27128a(com.yandex.mobile.ads.exo.metadata.Metadata r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r10.m22237c()
            if (r1 >= r2) goto L96
            com.yandex.mobile.ads.exo.metadata.Metadata$Entry r2 = r10.m22234a(r1)
            boolean r3 = r2 instanceof com.yandex.mobile.ads.exo.metadata.id3.CommentFrame
            r4 = 2
            java.lang.String r5 = "iTunSMPB"
            r6 = 16
            r7 = 1
            if (r3 == 0) goto L4d
            com.yandex.mobile.ads.exo.metadata.id3.CommentFrame r2 = (com.yandex.mobile.ads.exo.metadata.id3.CommentFrame) r2
            java.lang.String r3 = r2.f48105c
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L92
            java.lang.String r2 = r2.f48106d
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.C5557ox.f53350c
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.find()
            if (r3 == 0) goto L49
            java.lang.String r3 = r2.group(r7)     // Catch: java.lang.NumberFormatException -> L49
            int r5 = com.yandex.mobile.ads.impl.s91.f54530a     // Catch: java.lang.NumberFormatException -> L49
            int r3 = java.lang.Integer.parseInt(r3, r6)     // Catch: java.lang.NumberFormatException -> L49
            java.lang.String r2 = r2.group(r4)     // Catch: java.lang.NumberFormatException -> L49
            int r2 = java.lang.Integer.parseInt(r2, r6)     // Catch: java.lang.NumberFormatException -> L49
            if (r3 > 0) goto L44
            if (r2 <= 0) goto L49
        L44:
            r9.f53351a = r3     // Catch: java.lang.NumberFormatException -> L49
            r9.f53352b = r2     // Catch: java.lang.NumberFormatException -> L49
            goto L4a
        L49:
            r7 = 0
        L4a:
            if (r7 == 0) goto L92
            return
        L4d:
            boolean r3 = r2 instanceof com.yandex.mobile.ads.exo.metadata.id3.InternalFrame
            if (r3 == 0) goto L92
            com.yandex.mobile.ads.exo.metadata.id3.InternalFrame r2 = (com.yandex.mobile.ads.exo.metadata.id3.InternalFrame) r2
            java.lang.String r3 = r2.f48112b
            java.lang.String r8 = "com.apple.iTunes"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L92
            java.lang.String r3 = r2.f48113c
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L92
            java.lang.String r2 = r2.f48114d
            java.util.regex.Pattern r3 = com.yandex.mobile.ads.impl.C5557ox.f53350c
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.find()
            if (r3 == 0) goto L8e
            java.lang.String r3 = r2.group(r7)     // Catch: java.lang.NumberFormatException -> L8e
            int r5 = com.yandex.mobile.ads.impl.s91.f54530a     // Catch: java.lang.NumberFormatException -> L8e
            int r3 = java.lang.Integer.parseInt(r3, r6)     // Catch: java.lang.NumberFormatException -> L8e
            java.lang.String r2 = r2.group(r4)     // Catch: java.lang.NumberFormatException -> L8e
            int r2 = java.lang.Integer.parseInt(r2, r6)     // Catch: java.lang.NumberFormatException -> L8e
            if (r3 > 0) goto L89
            if (r2 <= 0) goto L8e
        L89:
            r9.f53351a = r3     // Catch: java.lang.NumberFormatException -> L8e
            r9.f53352b = r2     // Catch: java.lang.NumberFormatException -> L8e
            goto L8f
        L8e:
            r7 = 0
        L8f:
            if (r7 == 0) goto L92
            return
        L92:
            int r1 = r1 + 1
            goto L2
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5557ox.m27128a(com.yandex.mobile.ads.exo.metadata.Metadata):void");
    }
}
