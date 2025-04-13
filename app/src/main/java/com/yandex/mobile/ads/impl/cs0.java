package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cs0 implements g91 {

    /* renamed from: a */
    @NotNull
    private final wv0 f49350a;

    /* renamed from: b */
    @NotNull
    private final m51 f49351b;

    /* renamed from: c */
    private String f49352c;

    public cs0(@NotNull wv0 reporter, @NotNull m51 targetUrlHandler) {
        Intrinsics.m32179h(reporter, "reporter");
        Intrinsics.m32179h(targetUrlHandler, "targetUrlHandler");
        this.f49350a = reporter;
        this.f49351b = targetUrlHandler;
    }

    @Override // com.yandex.mobile.ads.impl.g91
    /* renamed from: a */
    public final void mo22922a(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        this.f49352c = url;
        if (url.length() == 0) {
            n60.m26810c("Tracking url is empty", new Object[0]);
            return;
        }
        m51 m51Var = this.f49351b;
        wv0 wv0Var = this.f49350a;
        String str = this.f49352c;
        if (str != null) {
            m51Var.mo26573a(wv0Var, str);
        } else {
            Intrinsics.m32189r("targetUrl");
            throw null;
        }
    }
}
