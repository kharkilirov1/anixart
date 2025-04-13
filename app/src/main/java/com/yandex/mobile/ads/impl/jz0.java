package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jz0 {

    /* renamed from: a */
    @NotNull
    private final C5299jr f51781a = new C5299jr();

    @NotNull
    /* renamed from: a */
    public final String m25999a(@NotNull Context context, @NotNull l01 sensitiveModeChecker, @NotNull C5961w7 advertisingConfiguration, @NotNull C5507nr environmentConfiguration) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(environmentConfiguration, "environmentConfiguration");
        Intrinsics.m32179h(advertisingConfiguration, "advertisingConfiguration");
        Intrinsics.m32179h(sensitiveModeChecker, "sensitiveModeChecker");
        String m27470a = C5605pu.m27380a(l01.m26311c(context)).m27483e(environmentConfiguration.m26950f()).m27480d(environmentConfiguration.m26947d()).m27464a(advertisingConfiguration.m29394a(), advertisingConfiguration.m29399c()).m27463a(advertisingConfiguration.m29397b()).m27475c().m27491j(context).m27471b().m27468a(l01.m26309a(context)).m27458a(context, environmentConfiguration.m26943b()).m27455a(context).m27484f().m27486g().m27470a();
        Intrinsics.m32178g(m27470a, "builder(sensitiveModeEna…nt()\n            .build()");
        List<st0> m26949e = environmentConfiguration.m26949e();
        Intrinsics.m32178g(m26949e, "environmentConfiguration.queryParams");
        String[] strArr = {m27470a, CollectionsKt.m31989B(m26949e, "&", null, null, 0, null, iz0.f51469a, 30, null)};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            if (!StringsKt.m33879E(str)) {
                arrayList.add(str);
            }
        }
        return this.f51781a.m25933a(context, CollectionsKt.m31989B(arrayList, "&", null, null, 0, null, null, 62, null));
    }
}
