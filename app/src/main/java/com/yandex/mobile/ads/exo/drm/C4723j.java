package com.yandex.mobile.ads.exo.drm;

import android.media.MediaDrmResetException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.exo.drm.j */
/* loaded from: classes2.dex */
final class C4723j {
    @DoNotInline
    /* renamed from: a */
    public static boolean m22190a(@Nullable Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
