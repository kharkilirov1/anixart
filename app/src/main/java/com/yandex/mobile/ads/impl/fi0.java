package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.AbstractC4967de;

/* loaded from: classes3.dex */
public final class fi0 extends AbstractC5630qd<qi0> {
    public fi0(@NonNull Context context, @NonNull jw0<qi0> jw0Var, @NonNull C5101g2 c5101g2, @NonNull String str, @NonNull String str2, @NonNull AbstractC4967de.a<AdResponse<qi0>> aVar) {
        super(context, c5101g2, str, str2, new mi0(jw0Var), aVar, new pi0());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5630qd
    /* renamed from: b */
    public final boolean mo24606b(@NonNull km0 km0Var, int i2) {
        if (200 == i2) {
            byte[] bArr = km0Var.f52033b;
            if (bArr != null && bArr.length > 0) {
                return true;
            }
        }
        return 204 == i2;
    }
}
