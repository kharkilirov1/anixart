package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public final class PlatformVersion {
    @KeepForSdk
    /* renamed from: a */
    public static boolean m8244a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m8245b() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
