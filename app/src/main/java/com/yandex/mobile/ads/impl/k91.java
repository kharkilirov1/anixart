package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k91 {

    /* renamed from: a */
    @NotNull
    private final j91 f51923a;

    public k91(@NotNull j91 intentCreator) {
        Intrinsics.m32179h(intentCreator, "intentCreator");
        this.f51923a = intentCreator;
    }

    /* renamed from: a */
    public final boolean m26091a(@NotNull Context context, @NotNull String url) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(url, "url");
        try {
            Objects.requireNonNull(this.f51923a);
            context.startActivity(j91.m25822a(context, url));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public k91() {
        this(new j91());
    }
}
