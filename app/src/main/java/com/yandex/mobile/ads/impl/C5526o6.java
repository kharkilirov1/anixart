package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.SizeInfo;

/* renamed from: com.yandex.mobile.ads.impl.o6 */
/* loaded from: classes3.dex */
public final class C5526o6 {
    /* renamed from: a */
    public static boolean m27006a(@NonNull Context context, @NonNull SizeInfo sizeInfo, @NonNull SizeInfo sizeInfo2) {
        if (m27008b(context, sizeInfo, sizeInfo2)) {
            if (sizeInfo.m21916c(context) <= tg1.m28658c(context) && sizeInfo.m21913a(context) <= tg1.m28656b(context)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r6 != 3) goto L15;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m27008b(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.yandex.mobile.ads.base.SizeInfo r6, @androidx.annotation.NonNull com.yandex.mobile.ads.base.SizeInfo r7) {
        /*
            int r0 = r7.m21916c(r5)
            int r1 = r7.m21913a(r5)
            int r2 = r6.m21916c(r5)
            int r5 = r6.m21913a(r5)
            int r6 = r7.m21917d()
            int r6 = com.yandex.mobile.ads.impl.C5782t5.m28463a(r6)
            r7 = 1
            r3 = 0
            if (r6 == 0) goto L30
            if (r6 == r7) goto L25
            r4 = 2
            if (r6 == r4) goto L36
            r4 = 3
            if (r6 == r4) goto L25
            goto L2e
        L25:
            if (r2 > r0) goto L2e
            if (r0 <= 0) goto L2e
            if (r5 <= r1) goto L36
            if (r1 != 0) goto L2e
            goto L36
        L2e:
            r7 = 0
            goto L36
        L30:
            if (r2 > r0) goto L2e
            if (r0 <= 0) goto L2e
            if (r5 > r1) goto L2e
        L36:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5526o6.m27008b(android.content.Context, com.yandex.mobile.ads.base.SizeInfo, com.yandex.mobile.ads.base.SizeInfo):boolean");
    }

    /* renamed from: a */
    public static boolean m27005a(@NonNull Context context, @Nullable SizeInfo sizeInfo) {
        int m28656b = tg1.m28656b(context);
        int m28658c = tg1.m28658c(context);
        if (sizeInfo != null) {
            int m21916c = sizeInfo.m21916c(context);
            int m21913a = sizeInfo.m21913a(context);
            if (m21916c <= m28656b && m21913a <= m28658c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m27007b(@NonNull Context context, @Nullable SizeInfo sizeInfo) {
        int m28658c = tg1.m28658c(context);
        int m28656b = tg1.m28656b(context);
        if (sizeInfo != null) {
            int m21916c = sizeInfo.m21916c(context);
            int m21913a = sizeInfo.m21913a(context);
            if (m21916c <= m28658c && m21913a <= m28656b) {
                return true;
            }
        }
        return false;
    }
}
