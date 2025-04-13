package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.w00;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x00 {
    @NotNull
    /* renamed from: a */
    public static AbstractC4861be m29613a(@NotNull Context context, @Nullable w00.InterfaceC5951b interfaceC5951b, @Nullable SSLSocketFactory sSLSocketFactory) {
        Intrinsics.m32179h(context, "context");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return m29824a != null && m29824a.m23587Z() ? new y00(interfaceC5951b, sSLSocketFactory) : new w00(interfaceC5951b, sSLSocketFactory);
    }
}
