package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C5371l1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.m1 */
/* loaded from: classes3.dex */
public final class C5421m1 {

    /* renamed from: a */
    @NotNull
    private final C5313k1 f52559a;

    public C5421m1(@NotNull Context context, @NotNull C5313k1 adBlockerStateStorage) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBlockerStateStorage, "adBlockerStateStorage");
        this.f52559a = adBlockerStateStorage;
    }

    /* renamed from: a */
    public final void m26555a(@Nullable Boolean bool) {
        if (bool != null) {
            this.f52559a.m26006a(new C5158h1(System.currentTimeMillis(), bool.booleanValue()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5421m1(Context context) {
        this(context, C5371l1.a.m26316a(context).m26315c());
        int i2 = C5371l1.f52206d;
    }
}
