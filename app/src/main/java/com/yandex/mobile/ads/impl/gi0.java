package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.AbstractC4967de;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class gi0 {

    /* renamed from: a */
    @NonNull
    private final Context f50592a;

    /* renamed from: b */
    @NonNull
    private final fu0 f50593b;

    /* renamed from: c */
    @NonNull
    private final AbstractC4967de.a<AdResponse<qi0>> f50594c;

    public gi0(@NonNull Context context, @NonNull AbstractC4967de.a<AdResponse<qi0>> aVar) {
        this.f50592a = context;
        this.f50594c = aVar;
        gu0.m24977a();
        this.f50593b = new fu0();
    }

    @NonNull
    /* renamed from: a */
    public final fi0 m24897a(@NonNull jw0<qi0> jw0Var, @NonNull C5101g2 c5101g2, @NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration, @NonNull String str, @NonNull String str2) {
        Objects.requireNonNull(this.f50593b);
        Objects.requireNonNull(nativeAdRequestConfiguration);
        return new fi0(this.f50592a, jw0Var, c5101g2, str, str2, this.f50594c);
    }
}
