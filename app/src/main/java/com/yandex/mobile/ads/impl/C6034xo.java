package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.xo */
/* loaded from: classes3.dex */
public final class C6034xo {

    /* renamed from: a */
    @NonNull
    private final ry0 f56514a = new ry0();

    /* renamed from: b */
    @NonNull
    private final az0 f56515b = new az0();

    @NonNull
    /* renamed from: a */
    public final int m29779a(@NonNull Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point m22664a = this.f56515b.m22664a(context);
        int i2 = m22664a.x;
        int i3 = m22664a.y;
        float f2 = displayMetrics.density;
        float f3 = i2;
        float f4 = i3;
        float min = Math.min(f3 / f2, f4 / f2);
        float f5 = f2 * 160.0f;
        float f6 = f3 / f5;
        float f7 = f4 / f5;
        double sqrt = Math.sqrt((f7 * f7) + (f6 * f6));
        if (m29778a(context, sqrt)) {
            return 3;
        }
        return (sqrt >= 7.0d || min >= 600.0f) ? 2 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m29778a(@androidx.annotation.NonNull android.content.Context r4, double r5) {
        /*
            r3 = this;
            r0 = 13
            boolean r0 = com.yandex.mobile.ads.impl.C5474n6.m26805a(r0)
            if (r0 == 0) goto L1a
            java.lang.String r5 = "uimode"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4
            if (r4 == 0) goto L2d
            int r4 = r4.getCurrentModeType()
            r5 = 4
            if (r4 != r5) goto L2d
            goto L2b
        L1a:
            r0 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L2d
            com.yandex.mobile.ads.impl.ry0 r5 = r3.f56514a
            java.util.Objects.requireNonNull(r5)
            boolean r4 = com.yandex.mobile.ads.impl.ry0.m28031a(r4)
            if (r4 != 0) goto L2d
        L2b:
            r4 = 1
            goto L2e
        L2d:
            r4 = 0
        L2e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6034xo.m29778a(android.content.Context, double):boolean");
    }
}
