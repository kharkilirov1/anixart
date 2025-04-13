package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.ce */
/* loaded from: classes2.dex */
public final class C3872ce {
    @JvmStatic
    /* renamed from: a */
    public static final boolean m19676a(@NotNull Context context, @NotNull String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
