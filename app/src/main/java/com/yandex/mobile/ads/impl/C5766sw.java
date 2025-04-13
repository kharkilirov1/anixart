package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.sw */
/* loaded from: classes3.dex */
public final class C5766sw {

    /* renamed from: a */
    private final C6084yo f54865a = new C6084yo();

    @NonNull
    /* renamed from: a */
    public final C5715rw m28363a(@NonNull Context context, @NonNull AdResponse<String> adResponse, @NonNull C5101g2 c5101g2) throws mi1 {
        Context applicationContext = context.getApplicationContext();
        C5715rw c5715rw = new C5715rw(applicationContext, adResponse, c5101g2);
        c5715rw.setId(2);
        C6084yo c6084yo = this.f54865a;
        float m21828r = adResponse.m21828r();
        Objects.requireNonNull(c6084yo);
        int round = Math.round(TypedValue.applyDimension(1, m21828r, applicationContext.getResources().getDisplayMetrics()));
        C6084yo c6084yo2 = this.f54865a;
        float m21814d = adResponse.m21814d();
        Objects.requireNonNull(c6084yo2);
        int round2 = Math.round(TypedValue.applyDimension(1, m21814d, applicationContext.getResources().getDisplayMetrics()));
        if (round > 0 && round2 > 0) {
            c5715rw.layout(0, 0, round, round2);
        }
        return c5715rw;
    }
}
