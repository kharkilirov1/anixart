package com.yandex.mobile.ads.exo.drm;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.exo.drm.h */
/* loaded from: classes2.dex */
final class C4721h {
    @DoNotInline
    /* renamed from: a */
    public static boolean m22186a(@Nullable Throwable th) {
        return th instanceof DeniedByServerException;
    }

    @DoNotInline
    /* renamed from: b */
    public static boolean m22187b(@Nullable Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
