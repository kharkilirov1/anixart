package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ft0 implements InterfaceC5607pw {

    /* renamed from: a */
    @Nullable
    private InterfaceC5607pw f50440a;

    /* renamed from: a */
    public final void m24741a(@NotNull InterfaceC5607pw showEventListener) {
        Intrinsics.m32179h(showEventListener, "showEventListener");
        this.f50440a = showEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdClicked() {
        InterfaceC5607pw interfaceC5607pw = this.f50440a;
        if (interfaceC5607pw != null) {
            interfaceC5607pw.onAdClicked();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdDismissed() {
        InterfaceC5607pw interfaceC5607pw = this.f50440a;
        if (interfaceC5607pw != null) {
            interfaceC5607pw.onAdDismissed();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdShown() {
        InterfaceC5607pw interfaceC5607pw = this.f50440a;
        if (interfaceC5607pw != null) {
            interfaceC5607pw.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onImpression(@Nullable ImpressionData impressionData) {
        InterfaceC5607pw interfaceC5607pw = this.f50440a;
        if (interfaceC5607pw != null) {
            interfaceC5607pw.onImpression(impressionData);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    /* renamed from: a */
    public final void mo24263a() {
        InterfaceC5607pw interfaceC5607pw = this.f50440a;
        if (interfaceC5607pw != null) {
            interfaceC5607pw.mo24263a();
        }
    }
}
