package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p5 */
/* loaded from: classes3.dex */
public abstract class AbstractC5566p5 {
    /* renamed from: a */
    public static tl1 m27164a(C5620q5 c5620q5, C5670r5 c5670r5) {
        if (jo0.m25917a()) {
            return new tl1(c5620q5, c5670r5);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: a */
    public abstract void mo27165a();

    /* renamed from: a */
    public abstract void mo27166a(View view);

    /* renamed from: a */
    public abstract void mo27167a(View view, EnumC6043xv enumC6043xv, @Nullable String str);

    /* renamed from: b */
    public abstract void mo27168b();
}
