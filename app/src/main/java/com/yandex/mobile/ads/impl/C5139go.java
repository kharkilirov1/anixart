package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C4632R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.go */
/* loaded from: classes3.dex */
public final class C5139go implements InterfaceC5037en {

    /* renamed from: a */
    @NotNull
    private final Context f50687a;

    public C5139go(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f50687a = context;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5037en
    @NotNull
    /* renamed from: a */
    public final C5276ja<?> mo24214a() {
        CharSequence text = this.f50687a.getResources().getText(C4632R.string.yandex_ads_internal_instream_sponsored_yandex);
        Intrinsics.m32178g(text, "context.resources.getTex…nstream_sponsored_yandex)");
        return new C5276ja<>("sponsored", "string", text, null, false, true);
    }
}
