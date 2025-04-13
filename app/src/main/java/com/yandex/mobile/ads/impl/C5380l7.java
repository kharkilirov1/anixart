package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.l7 */
/* loaded from: classes3.dex */
public final class C5380l7 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5880ur f52272a;

    /* renamed from: b */
    @NonNull
    private final mo0 f52273b;

    /* renamed from: c */
    @NonNull
    private final C6048y f52274c = new C6048y();

    public C5380l7(@NonNull InterfaceC5880ur interfaceC5880ur, @NonNull mo0 mo0Var) {
        this.f52272a = interfaceC5880ur;
        this.f52273b = mo0Var;
    }

    /* renamed from: a */
    public final void m26358a(@NonNull View view, @NonNull C4958d7 c4958d7) {
        Objects.requireNonNull(this.f52274c);
        Context m29837a = C6048y.m29837a(view);
        if (m29837a == null || !C5427m6.m26578a(m29837a)) {
            return;
        }
        C5527o7 c5527o7 = null;
        try {
            c5527o7 = new C5527o7(m29837a);
        } catch (Throwable unused) {
        }
        if (c5527o7 != null) {
            new C5169h7(new C5273j7(m29837a, c5527o7).m25812a(), c5527o7, this.f52272a, this.f52273b).m25073a(c4958d7.m23820b());
        }
    }
}
