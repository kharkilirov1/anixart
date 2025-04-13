package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.om */
/* loaded from: classes3.dex */
public final class C5543om {

    /* renamed from: a */
    @NotNull
    private final C5502nm f53292a;

    public C5543om(@NotNull Context context, @NotNull Map<String, ? extends Object> debugParams) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(debugParams, "debugParams");
        this.f53292a = new C5502nm(C5730s8.m28078a(context), debugParams);
    }

    @NotNull
    /* renamed from: a */
    public final C5502nm m27091a() {
        return this.f53292a;
    }
}
