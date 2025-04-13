package com.yandex.metrica.impl.p023ob;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.x2 */
/* loaded from: classes2.dex */
public class C4406x2 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x001f), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0003, B:7:0x0011, B:9:0x001f), top: B:2:0x0003 }] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C4380w2 m21138a(@androidx.annotation.NonNull android.content.Context r10) {
        /*
            r9 = this;
            r0 = 30
            r1 = 0
            boolean r0 = com.yandex.metrica.impl.p023ob.C3658U2.m19211a(r0)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            android.view.Display r0 = r10.getDisplay()     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 != 0) goto L1d
            java.lang.String r0 = "window"
            java.lang.Object r0 = r10.getSystemService(r0)     // Catch: java.lang.Throwable -> L24
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch: java.lang.Throwable -> L24
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Throwable -> L24
        L1d:
            if (r0 == 0) goto L24
            android.graphics.Point r0 = r9.m21137a(r0)     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L28
            return r1
        L28:
            int r1 = r0.x
            int r2 = r0.y
            int r4 = java.lang.Math.max(r1, r2)
            int r1 = r0.x
            int r2 = r0.y
            int r5 = java.lang.Math.min(r1, r2)
            r1 = 0
            r2 = 0
            android.content.res.Resources r3 = r10.getResources()     // Catch: java.lang.Throwable -> L49
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Throwable -> L49
            int r1 = r3.densityDpi     // Catch: java.lang.Throwable -> L49
            float r2 = r3.density     // Catch: java.lang.Throwable -> L49
            r6 = r1
            r7 = r2
            goto L4b
        L49:
            r6 = r1
            r7 = 0
        L4b:
            com.yandex.metrica.impl.ob.w2 r1 = new com.yandex.metrica.impl.ob.w2
            com.yandex.metrica.e r8 = com.yandex.metrica.impl.p023ob.C3834b2.m19629a(r10, r0)
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4406x2.m21138a(android.content.Context):com.yandex.metrica.impl.ob.w2");
    }

    @Nullable
    @AnyThread
    /* renamed from: a */
    private Point m21137a(@NonNull Display display) {
        if (display != null) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
