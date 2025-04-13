package com.yandex.metrica.impl.p023ob;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Rm */
/* loaded from: classes2.dex */
public final class C3603Rm {
    @NotNull
    /* renamed from: a */
    public final String m19056a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.m32178g(uuid, "UUID.randomUUID().toString()");
        String m33891Q = StringsKt.m33891Q(uuid, "-", "", false, 4, null);
        Locale locale = Locale.US;
        Intrinsics.m32178g(locale, "Locale.US");
        String lowerCase = m33891Q.toLowerCase(locale);
        Intrinsics.m32178g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
