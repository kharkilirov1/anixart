package com.google.android.exoplayer2.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class RepeatModeUtil {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    /* renamed from: a */
    public static int m7674a(int i2, int i3) {
        for (int i4 = 1; i4 <= 2; i4++) {
            int i5 = (i2 + i4) % 3;
            boolean z = false;
            if (i5 == 0 || (i5 == 1 ? (i3 & 1) != 0 : !(i5 != 2 || (i3 & 2) == 0))) {
                z = true;
            }
            if (z) {
                return i5;
            }
        }
        return i2;
    }
}
