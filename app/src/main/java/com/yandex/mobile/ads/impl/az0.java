package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
final class az0 {

    /* renamed from: a */
    @NonNull
    private final j51 f48701a = new j51();

    /* renamed from: a */
    public static Point m22663a(az0 az0Var, Display display) {
        Objects.requireNonNull(az0Var);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @androidx.annotation.NonNull
    @android.annotation.TargetApi
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Point m22664a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            com.yandex.mobile.ads.impl.j51 r0 = r6.f48701a
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "Exception while "
            r1 = 0
            java.lang.String r2 = " is null."
            r3 = 0
            if (r7 == 0) goto L27
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Throwable -> L1a
            goto L33
        L1a:
            r7 = move-exception
            java.lang.String r4 = "getting display"
            java.lang.String r4 = com.yandex.mobile.ads.impl.um1.m29049a(r0, r4)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.yandex.mobile.ads.impl.n60.m26808a(r7, r4, r5)
            goto L32
        L27:
            java.lang.String r7 = "WindowManager"
            java.lang.String r7 = com.yandex.mobile.ads.impl.um1.m29049a(r7, r2)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.yandex.mobile.ads.impl.n60.m26813f(r7, r4)
        L32:
            r7 = r1
        L33:
            com.yandex.mobile.ads.impl.j51 r4 = r6.f48701a
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>(r3, r3)
            java.util.Objects.requireNonNull(r4)
            if (r7 == 0) goto L51
            android.graphics.Point r1 = m22663a(r6, r7)     // Catch: java.lang.Throwable -> L44
            goto L5c
        L44:
            r7 = move-exception
            java.lang.String r2 = "getting display metrics"
            java.lang.String r0 = com.yandex.mobile.ads.impl.um1.m29049a(r0, r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.yandex.mobile.ads.impl.n60.m26808a(r7, r0, r2)
            goto L5c
        L51:
            java.lang.String r7 = "Display"
            java.lang.String r7 = com.yandex.mobile.ads.impl.um1.m29049a(r7, r2)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.yandex.mobile.ads.impl.n60.m26813f(r7, r0)
        L5c:
            if (r1 != 0) goto L5f
            goto L60
        L5f:
            r5 = r1
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.az0.m22664a(android.content.Context):android.graphics.Point");
    }
}
