package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.q40;

/* renamed from: com.yandex.mobile.ads.impl.tn */
/* loaded from: classes3.dex */
final class C5810tn {

    /* renamed from: a */
    @NonNull
    private final q40 f55158a;

    public C5810tn(@NonNull cr0 cr0Var) {
        q40.C5619a c5619a = new q40.C5619a();
        float volume = cr0Var.getVolume();
        if (volume == 0.0f) {
            c5619a.m27620a(1.0f);
            c5619a.m27623b(true);
        } else {
            c5619a.m27620a(volume);
            c5619a.m27623b(false);
        }
        this.f55158a = c5619a.m27621a();
    }

    @NonNull
    /* renamed from: a */
    public final q40 m28692a() {
        return this.f55158a;
    }
}
