package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.tg1;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.b */
/* loaded from: classes3.dex */
final class C6174b {

    /* renamed from: a */
    private final Context f57539a;

    public C6174b(@NonNull Context context) {
        this.f57539a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: a */
    public final String m30421a(int i2, int i3) {
        Context context = this.f57539a;
        int i4 = tg1.f55120b;
        int round = Math.round(i2 / context.getResources().getDisplayMetrics().density);
        int round2 = Math.round(i3 / this.f57539a.getResources().getDisplayMetrics().density);
        n60.m26809b("width = %s, height = %s, widthDip = %s, heightDip = %s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(round), Integer.valueOf(round2));
        return (round >= 320 || round2 >= 240) ? "large" : (round >= 160 || round2 >= 160) ? "medium" : "small";
    }
}
