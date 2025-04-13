package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s6 */
/* loaded from: classes3.dex */
public final class C5728s6 {
    @Nullable
    /* renamed from: a */
    public static String m28072a(@Nullable List list) {
        Object obj;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C5617q3) obj).m27608a() == EnumC5668r3.f54168a) {
                break;
            }
        }
        C5617q3 c5617q3 = (C5617q3) obj;
        if (c5617q3 == null) {
            return null;
        }
        Map<String, Object> m27609b = c5617q3.m27609b();
        Intrinsics.m32178g(m27609b, "adapterLoadingPhase.reportParameters");
        Object obj2 = m27609b.get("adapter_loading_duration");
        if (obj2 != null) {
            return obj2.toString();
        }
        return null;
    }
}
