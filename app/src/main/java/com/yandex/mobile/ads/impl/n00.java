package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n00 {
    @JvmStatic
    /* renamed from: a */
    public static final boolean m26783a(@NotNull String method) {
        Intrinsics.m32179h(method, "method");
        return (Intrinsics.m32174c(method, "GET") || Intrinsics.m32174c(method, "HEAD")) ? false : true;
    }

    /* renamed from: b */
    public static boolean m26784b(@NotNull String method) {
        Intrinsics.m32179h(method, "method");
        return !Intrinsics.m32174c(method, "PROPFIND");
    }

    /* renamed from: c */
    public static boolean m26785c(@NotNull String method) {
        Intrinsics.m32179h(method, "method");
        return Intrinsics.m32174c(method, "PROPFIND");
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m26786d(@NotNull String method) {
        Intrinsics.m32179h(method, "method");
        return Intrinsics.m32174c(method, "POST") || Intrinsics.m32174c(method, "PUT") || Intrinsics.m32174c(method, "PATCH") || Intrinsics.m32174c(method, "PROPPATCH") || Intrinsics.m32174c(method, "REPORT");
    }
}
