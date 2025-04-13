package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C4632R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.in */
/* loaded from: classes3.dex */
public final class C5240in implements InterfaceC5037en {

    /* renamed from: a */
    @NotNull
    private final Context f51347a;

    public C5240in(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f51347a = context;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5037en
    @NotNull
    /* renamed from: a */
    public final C5276ja<?> mo24214a() {
        CharSequence text = this.f51347a.getResources().getText(C4632R.string.yandex_ads_internal_instream_call_to_action);
        Intrinsics.m32178g(text, "context.resources.getTex…_instream_call_to_action)");
        return new C5276ja<>("call_to_action", "string", text, null, true, true);
    }
}
