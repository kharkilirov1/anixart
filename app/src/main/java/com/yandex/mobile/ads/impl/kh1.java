package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.vh1;

/* loaded from: classes3.dex */
public final class kh1 extends g71<lh1, gh1> {

    /* renamed from: u */
    @NonNull
    private final jh1 f51981u;

    /* renamed from: v */
    @NonNull
    private final th1 f51982v;

    public kh1(@NonNull Context context, @NonNull String str, @NonNull vh1.C5921b c5921b, @NonNull lh1 lh1Var, @NonNull ph1 ph1Var) {
        super(context, 0, str, c5921b, lh1Var, ph1Var);
        this.f51981u = new jh1();
        this.f51982v = jm0.m25910a();
        n60.m26812e("Loading data ... url: %s", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if ((r5 == null || r5.length == 0) == false) goto L14;
     */
    @Override // com.yandex.mobile.ads.impl.g71
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.tw0<com.yandex.mobile.ads.impl.gh1> mo24051a(@androidx.annotation.NonNull com.yandex.mobile.ads.impl.km0 r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 200(0xc8, float:2.8E-43)
            if (r2 != r5) goto L14
            byte[] r5 = r4.f52033b
            if (r5 == 0) goto L10
            int r5 = r5.length
            if (r5 != 0) goto Le
            goto L10
        Le:
            r5 = 0
            goto L11
        L10:
            r5 = 1
        L11:
            if (r5 != 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            r5 = 0
            if (r0 == 0) goto L46
            com.yandex.mobile.ads.impl.th1 r0 = r3.f51982v
            java.lang.String r4 = r0.m28663a(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L3a
            com.yandex.mobile.ads.impl.jh1 r0 = r3.f51981u     // Catch: java.lang.Exception -> L2f
            com.yandex.mobile.ads.impl.gh1 r4 = r0.m25890a(r4)     // Catch: java.lang.Exception -> L2f
            com.yandex.mobile.ads.impl.tw0 r4 = com.yandex.mobile.ads.impl.tw0.m28764a(r4, r5)     // Catch: java.lang.Exception -> L2f
            goto L61
        L2f:
            r4 = move-exception
            com.yandex.mobile.ads.impl.cp0 r5 = new com.yandex.mobile.ads.impl.cp0
            r5.<init>(r4)
            com.yandex.mobile.ads.impl.tw0 r4 = com.yandex.mobile.ads.impl.tw0.m28763a(r5)
            goto L61
        L3a:
            com.yandex.mobile.ads.impl.cp0 r4 = new com.yandex.mobile.ads.impl.cp0
            java.lang.String r5 = "Can't parse VMAP response"
            r4.<init>(r5)
            com.yandex.mobile.ads.impl.tw0 r4 = com.yandex.mobile.ads.impl.tw0.m28763a(r4)
            goto L61
        L46:
            int r0 = com.yandex.mobile.ads.impl.C5372l2.f52212c
            com.yandex.mobile.ads.impl.l2 r4 = com.yandex.mobile.ads.impl.C5372l2.a.m26319a(r4)
            int r4 = r4.m26318a()
            com.yandex.mobile.ads.impl.p2 r4 = com.yandex.mobile.ads.impl.C5616q2.m27602a(r5, r4)
            java.lang.String r4 = r4.m27145b()
            com.yandex.mobile.ads.impl.qh1 r5 = new com.yandex.mobile.ads.impl.qh1
            r5.<init>(r4)
            com.yandex.mobile.ads.impl.tw0 r4 = com.yandex.mobile.ads.impl.tw0.m28763a(r5)
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kh1.mo24051a(com.yandex.mobile.ads.impl.km0, int):com.yandex.mobile.ads.impl.tw0");
    }
}
