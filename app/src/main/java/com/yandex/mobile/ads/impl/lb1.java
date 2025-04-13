package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lb1 {

    /* renamed from: a */
    @NotNull
    private final String f52356a;

    /* renamed from: b */
    private final int f52357b;

    public lb1(@NotNull String versionName) {
        Integer m33910j0;
        Integer m33910j02;
        Intrinsics.m32179h(versionName, "versionName");
        this.f52356a = versionName;
        List m33893S = StringsKt.m33893S(versionName, new String[]{"."}, false, 0, 6, null);
        int i2 = 0;
        String str = (String) CollectionsKt.m32048y(m33893S, 0);
        if (str != null && (m33910j02 = StringsKt.m33910j0(str)) != null) {
            i2 = m33910j02.intValue();
        }
        this.f52357b = i2;
        String str2 = (String) CollectionsKt.m32048y(m33893S, 1);
        if (str2 != null && (m33910j0 = StringsKt.m33910j0(str2)) != null) {
            m33910j0.intValue();
        }
        String str3 = (String) CollectionsKt.m32048y(m33893S, 2);
        m26424a(str3 == null ? "" : str3);
    }

    /* renamed from: a */
    public final int m26425a() {
        return this.f52357b;
    }

    @NotNull
    public final String toString() {
        return this.f52356a;
    }

    /* renamed from: a */
    private static void m26424a(String str) {
        if (StringsKt.m33922t(str, "-", false, 2, null)) {
            Integer m33910j0 = StringsKt.m33910j0(StringsKt.m33905e0(str, "-", null, 2, null));
            if (m33910j0 != null) {
                m33910j0.intValue();
                return;
            }
            return;
        }
        Integer m33910j02 = StringsKt.m33910j0(str);
        if (m33910j02 != null) {
            m33910j02.intValue();
        }
    }
}
