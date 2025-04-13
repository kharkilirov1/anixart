package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5214i6;
import com.yandex.mobile.ads.impl.C5272j6;
import com.yandex.mobile.ads.impl.C5461mv;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.kh0;
import com.yandex.mobile.ads.impl.xz0;
import com.yandex.mobile.ads.impl.zl0;

/* renamed from: com.yandex.mobile.ads.nativeads.o0 */
/* loaded from: classes3.dex */
public final class C6227o0 {

    /* renamed from: a */
    @NonNull
    private final C5272j6 f57774a = new C5272j6();

    @NonNull
    /* renamed from: a */
    public final C6198a m30601a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull C6217j0 c6217j0, @NonNull di0 di0Var, @NonNull C5461mv c5461mv) {
        zl0 m25804a = this.f57774a.m25804a(kh0Var);
        cj0 m23293a = cj0.m23293a();
        C6225n0 c6225n0 = new C6225n0(m25804a.m30212b(), m23293a);
        return new C6198a(kh0Var, new C6229p0(c6217j0, c6225n0, xz0.m29823b(), kh0Var.m26127b()), m25804a, new C6231q0(m25804a.m30212b()), di0Var, new C5214i6(c5461mv), new C6205d0(context, c6225n0, m23293a), null);
    }
}
