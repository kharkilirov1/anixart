package com.yandex.mobile.ads.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ok1 {

    /* renamed from: a */
    @NotNull
    private final my0 f53283a;

    public ok1(@NotNull my0 sslSocketFactoryCreator) {
        Intrinsics.m32179h(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f53283a = sslSocketFactoryCreator;
    }

    @NotNull
    /* renamed from: a */
    public final pk1 m27090a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        String m27663a = C5325k8.m26067a().m27663a(context);
        SSLSocketFactory mo26779a = this.f53283a.mo26779a(context);
        cz0 m29824a = xz0.m29823b().m29824a(context);
        return new pk1(m27663a, mo26779a, m29824a != null && m29824a.m23587Z());
    }

    public /* synthetic */ ok1() {
        this(ly0.m26544a());
    }
}
