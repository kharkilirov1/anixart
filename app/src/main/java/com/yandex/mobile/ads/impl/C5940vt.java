package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;

/* renamed from: com.yandex.mobile.ads.impl.vt */
/* loaded from: classes3.dex */
final class C5940vt {

    /* renamed from: a */
    @NonNull
    private final C4957d6 f55876a;

    /* renamed from: b */
    @NonNull
    private final FalseClick f55877b;

    public C5940vt(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull FalseClick falseClick) {
        this.f55876a = new C4957d6(context, c5101g2);
        this.f55877b = falseClick;
    }

    /* renamed from: a */
    public final void m29262a(long j2) {
        if (j2 <= this.f55877b.m21939c()) {
            this.f55876a.m23816a(this.f55877b.m21940d());
        }
    }
}
