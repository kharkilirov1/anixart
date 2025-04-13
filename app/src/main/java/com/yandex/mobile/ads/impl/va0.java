package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public class va0 extends C5696rm {

    /* renamed from: a */
    @Nullable
    public final String f55790a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public va0(java.lang.IllegalStateException r3, @androidx.annotation.Nullable com.yandex.mobile.ads.impl.wa0 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "Decoder failed: "
            java.lang.StringBuilder r0 = com.yandex.mobile.ads.impl.l60.m26356a(r0)
            r1 = 0
            if (r4 != 0) goto Lb
            r4 = r1
            goto Ld
        Lb:
            java.lang.String r4 = r4.f56065a
        Ld:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4, r3)
            int r4 = com.yandex.mobile.ads.impl.s91.f54530a
            r0 = 21
            if (r4 < r0) goto L21
            java.lang.String r1 = m29201a(r3)
        L21:
            r2.f55790a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.va0.<init>(java.lang.IllegalStateException, com.yandex.mobile.ads.impl.wa0):void");
    }

    @Nullable
    @RequiresApi
    /* renamed from: a */
    private static String m29201a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
