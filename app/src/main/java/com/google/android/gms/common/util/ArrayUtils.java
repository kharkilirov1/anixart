package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public final class ArrayUtils {
    @KeepForSdk
    /* renamed from: a */
    public static boolean m8234a(@NonNull int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    /* renamed from: b */
    public static <T> void m8235b(@NonNull StringBuilder sb, @NonNull T[] tArr) {
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(tArr[i2]);
        }
    }
}
