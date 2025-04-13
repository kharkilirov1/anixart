package com.yandex.mobile.ads.impl;

import java.io.File;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@JvmName
/* renamed from: com.yandex.mobile.ads.impl.ru */
/* loaded from: classes3.dex */
public final class C5712ru {
    /* renamed from: a */
    public static final void m27985a(@NotNull File file) {
        Intrinsics.m32179h(file, "<this>");
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
