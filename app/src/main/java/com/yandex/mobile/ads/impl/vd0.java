package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class vd0 {
    /* renamed from: a */
    public static long m29216a(@NonNull Context context, long j2) {
        long j3;
        long min = Math.min(j2, 52428800L);
        try {
            StatFs statFs = new StatFs(C4819ap.m22577a(context, "").getAbsolutePath());
            j3 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException e2) {
            n60.m26808a(e2, "Unable to calculate available disk space, a default used", new Object[0]);
            j3 = min;
        }
        return Math.max(Math.min((2 * j3) / 100, 52428800L), Math.min(min, (j3 * 50) / 100));
    }
}
