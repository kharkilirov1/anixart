package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C6130zm;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.m51;
import com.yandex.mobile.ads.impl.xz0;

/* renamed from: com.yandex.mobile.ads.nativeads.r0 */
/* loaded from: classes3.dex */
public final class C6233r0 {

    /* renamed from: a */
    @Nullable
    private CustomClickHandler f57795a;

    /* renamed from: a */
    public final void m30635a(@Nullable CustomClickHandler customClickHandler) {
        this.f57795a = customClickHandler;
    }

    @NonNull
    /* renamed from: a */
    public final m51 m30634a(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull AdResultReceiver adResultReceiver) {
        cz0 m29824a = xz0.m29823b().m29824a(context);
        boolean z = m29824a != null && m29824a.m23617z();
        CustomClickHandler customClickHandler = this.f57795a;
        return (customClickHandler == null || !z) ? new C6130zm(context, c5101g2, adResultReceiver) : new C6204d(customClickHandler, adResultReceiver);
    }
}
