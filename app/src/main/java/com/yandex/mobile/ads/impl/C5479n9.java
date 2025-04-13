package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IIdentifierCallback;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.n9 */
/* loaded from: classes3.dex */
public final class C5479n9 {

    /* renamed from: a */
    @NotNull
    private final C5529o9 f52880a = new C5529o9();

    @NotNull
    /* renamed from: a */
    public static String m26820a() {
        return "Internal state wasn't completely configured. Connection timeout.";
    }

    @NotNull
    /* renamed from: b */
    public static String m26821b() {
        return "Internal state wasn't completely configured. Incorrect integration.";
    }

    @NotNull
    /* renamed from: c */
    public static String m26822c() {
        return "Internal state wasn't completely configured. Invalid response.";
    }

    @NotNull
    /* renamed from: a */
    public final String m26823a(@NotNull IIdentifierCallback.Reason reason) {
        Intrinsics.m32179h(reason, "reason");
        Objects.requireNonNull(this.f52880a);
        return C0000a.m15l("Internal state wasn't completely configured. ", C5529o9.m27056a(reason), '.');
    }
}
