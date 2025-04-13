package com.yandex.mobile.ads.impl;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ck0 implements mo0 {

    /* renamed from: a */
    @NotNull
    private final C4957d6 f49290a;

    /* renamed from: b */
    @NotNull
    private final m51 f49291b;

    /* renamed from: c */
    @NotNull
    private final wv0 f49292c;

    public ck0(@NotNull C4957d6 adTracker, @NotNull m51 targetUrlHandler, @NotNull wv0 reporter) {
        Intrinsics.m32179h(adTracker, "adTracker");
        Intrinsics.m32179h(targetUrlHandler, "targetUrlHandler");
        Intrinsics.m32179h(reporter, "reporter");
        this.f49290a = adTracker;
        this.f49291b = targetUrlHandler;
        this.f49292c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    /* renamed from: a */
    public final void mo23301a(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        C4957d6 c4957d6 = this.f49290a;
        m51 m51Var = this.f49291b;
        wv0 wv0Var = this.f49292c;
        Objects.requireNonNull(c4957d6);
        C4957d6.m23815a(url, m51Var, wv0Var);
    }
}
