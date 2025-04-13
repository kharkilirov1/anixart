package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.ga0;

/* renamed from: com.yandex.mobile.ads.impl.tj */
/* loaded from: classes3.dex */
public final class C5805tj implements ga0 {

    /* renamed from: a */
    @NonNull
    private final ga0.C5115a f55131a = new ga0.C5115a();

    /* renamed from: b */
    @NonNull
    private final ga0[] f55132b;

    public C5805tj(@NonNull ga0... ga0VarArr) {
        this.f55132b = ga0VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.ga0
    @NonNull
    /* renamed from: a */
    public final ga0.C5115a mo22622a(int i2, int i3) {
        ga0[] ga0VarArr = this.f55132b;
        int length = ga0VarArr.length;
        int i4 = 0;
        while (i4 < length) {
            ga0.C5115a mo22622a = ga0VarArr[i4].mo22622a(i2, i3);
            int i5 = mo22622a.f50538a;
            i4++;
            i3 = mo22622a.f50539b;
            i2 = i5;
        }
        ga0.C5115a c5115a = this.f55131a;
        c5115a.f50538a = i2;
        c5115a.f50539b = i3;
        return c5115a;
    }
}
