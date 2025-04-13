package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class jk1 {

    /* renamed from: a */
    @NonNull
    private final l01 f51633a = new l01();

    /* renamed from: b */
    @NonNull
    private final m41 f51634b = new m41();

    @Nullable
    /* renamed from: a */
    public final String m25900a(@NonNull Context context, @NonNull C5961w7 c5961w7, @NonNull C5507nr c5507nr) {
        C5287jj c5287jj = new C5287jj();
        c5287jj.m25893a(c5507nr);
        c5287jj.m25894a(c5961w7);
        String m27470a = C5605pu.m27379a(context, this.f51633a, c5287jj).m27470a();
        Objects.requireNonNull(this.f51634b);
        return m41.m26568a(context, m27470a);
    }
}
