package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class be0 {
    @NotNull
    /* renamed from: a */
    public static int m22804a(@NotNull zv0 request) {
        Intrinsics.m32179h(request, "request");
        if (request.m30322g() != -1) {
            switch (request.m30322g()) {
                case 0:
                    break;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                default:
                    throw new IllegalStateException("Unknown method type.".toString());
            }
        }
        return 1;
    }
}
