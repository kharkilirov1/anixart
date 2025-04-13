package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.lf */
/* loaded from: classes3.dex */
public final class C5395lf {

    /* renamed from: a */
    @NotNull
    private final Context f52377a;

    /* renamed from: b */
    @NotNull
    private final C5335kf f52378b;

    public C5395lf(@NotNull Context context, @NotNull C5335kf intentCreator) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(intentCreator, "intentCreator");
        this.f52377a = context;
        this.f52378b = intentCreator;
    }

    /* renamed from: a */
    public final void m26443a(@NotNull String browserUrl) {
        Intrinsics.m32179h(browserUrl, "browserUrl");
        try {
            this.f52377a.startActivity(this.f52378b.m26117a(browserUrl));
        } catch (Exception e2) {
            n60.m26810c("Failed to show Browser. Exception: " + e2, new Object[0]);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5395lf(@NotNull Context context, @NotNull ResultReceiver receiver) {
        this(context, new C5335kf(context, receiver));
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(receiver, "receiver");
    }
}
