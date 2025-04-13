package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.mr */
/* loaded from: classes3.dex */
public final class C5456mr {

    /* renamed from: a */
    @NotNull
    private final C6084yo f52788a = new C6084yo();

    /* renamed from: a */
    public final boolean m26758a(@NotNull View view, int i2, int i3, int i4, int i5) {
        Intrinsics.m32179h(view, "view");
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        C6084yo c6084yo = this.f52788a;
        Context context = view.getContext();
        Objects.requireNonNull(c6084yo);
        int m29954a = C6084yo.m29954a(context, 144.0f);
        C6084yo c6084yo2 = this.f52788a;
        Context context2 = view.getContext();
        Objects.requireNonNull(c6084yo2);
        return i6 >= m29954a && i7 >= C6084yo.m29954a(context2, 96.0f);
    }
}
