package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.t0 */
/* loaded from: classes3.dex */
public final class C5775t0 implements InterfaceC5420m0 {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.longValue() == (-1)) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5420m0
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.InterfaceC5370l0 mo25752a(@androidx.annotation.NonNull android.content.Context r16, @androidx.annotation.NonNull android.widget.RelativeLayout r17, @androidx.annotation.NonNull com.yandex.mobile.ads.impl.C4788a1 r18, @androidx.annotation.NonNull com.yandex.mobile.ads.impl.C5612q0 r19, @androidx.annotation.NonNull android.content.Intent r20, @androidx.annotation.NonNull android.view.Window r21) {
        /*
            r15 = this;
            r0 = r20
            java.lang.String r1 = "data_identifier"
            r2 = 0
            boolean r3 = r0.hasExtra(r1)     // Catch: java.lang.Exception -> L1f
            if (r3 == 0) goto L1d
            r3 = -1
            long r0 = r0.getLongExtra(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L1f
            long r5 = r0.longValue()     // Catch: java.lang.Exception -> L20
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
        L1d:
            r0 = r2
            goto L28
        L1f:
            r0 = r2
        L20:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "Failed to get data identifier from intent's extras"
            com.yandex.mobile.ads.impl.n60.m26810c(r3, r1)
        L28:
            if (r0 == 0) goto L37
            com.yandex.mobile.ads.impl.p0 r1 = com.yandex.mobile.ads.impl.C5561p0.m27132a()
            long r3 = r0.longValue()
            com.yandex.mobile.ads.impl.o0 r0 = r1.m27133a(r3)
            goto L38
        L37:
            r0 = r2
        L38:
            if (r0 == 0) goto L89
            com.yandex.mobile.ads.base.AdResponse r8 = r0.m26967a()
            com.yandex.mobile.ads.nativeads.NativeAd r1 = r0.m26968b()
            com.yandex.mobile.ads.impl.sk1 r3 = r0.m26970d()
            java.lang.Object r4 = r8.m21801B()
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L6e
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L6e
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L89
            com.yandex.mobile.ads.impl.jw r14 = new com.yandex.mobile.ads.impl.jw
            r14.<init>(r8, r3)
            com.yandex.mobile.ads.impl.s0 r2 = new com.yandex.mobile.ads.impl.s0
            r9 = r2
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r21
            r9.<init>(r10, r11, r12, r13, r14)
            goto L89
        L6e:
            boolean r3 = r1 instanceof com.yandex.mobile.ads.nativeads.InterfaceC6256u
            if (r3 == 0) goto L89
            r7 = r1
            com.yandex.mobile.ads.nativeads.u r7 = (com.yandex.mobile.ads.nativeads.InterfaceC6256u) r7
            int r11 = r0.m26969c()
            com.yandex.mobile.ads.impl.w0 r2 = new com.yandex.mobile.ads.impl.w0
            r3 = r2
            r4 = r16
            r5 = r17
            r6 = r21
            r9 = r18
            r10 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5775t0.mo25752a(android.content.Context, android.widget.RelativeLayout, com.yandex.mobile.ads.impl.a1, com.yandex.mobile.ads.impl.q0, android.content.Intent, android.view.Window):com.yandex.mobile.ads.impl.l0");
    }
}
