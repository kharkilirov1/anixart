package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C5371l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.j1 */
/* loaded from: classes3.dex */
public final class C5260j1 {

    /* renamed from: a */
    @NotNull
    private final C5313k1 f51475a;

    public C5260j1(@NotNull Context context, @NotNull C5313k1 adBlockerStateStorage) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBlockerStateStorage, "adBlockerStateStorage");
        this.f51475a = adBlockerStateStorage;
    }

    @NotNull
    /* renamed from: a */
    public final C5158h1 m25757a() {
        return this.f51475a.m26005a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5260j1(Context context) {
        this(context, C5371l1.a.m26316a(context).m26315c());
        int i2 = C5371l1.f52206d;
    }
}
