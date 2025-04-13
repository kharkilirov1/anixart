package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.impl.C4916cd;
import com.yandex.mobile.ads.impl.EnumC5224id;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.xz0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.banner.k */
/* loaded from: classes2.dex */
public final class C4643k {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final AdSize m21799a(@NotNull Context context, int i2) {
        Intrinsics.m32179h(context, "context");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        EnumC5224id m25525a = EnumC5224id.a.m25525a(m29824a != null ? m29824a.m23596e() : null);
        if (m25525a != null) {
            return new AdSize(i2, C4916cd.m23224a(m25525a).mo22626a(context, i2), 4);
        }
        AdSize stickySize = AdSize.stickySize(i2);
        Intrinsics.m32178g(stickySize, "stickySize(width)");
        return stickySize;
    }
}
