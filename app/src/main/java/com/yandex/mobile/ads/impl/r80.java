package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r80 {

    /* renamed from: a */
    @NotNull
    private static final LinkedHashMap f54226a = new LinkedHashMap();

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final p80 m27863a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        return m27864a(context, "YadPreferenceFile");
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final p80 m27864a(@NotNull Context context, @NotNull String filename) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(filename, "filename");
        LinkedHashMap linkedHashMap = f54226a;
        p80 p80Var = (p80) linkedHashMap.get(filename);
        if (p80Var != null) {
            return p80Var;
        }
        q80 q80Var = new q80(context, filename);
        linkedHashMap.put(filename, q80Var);
        return q80Var;
    }
}
