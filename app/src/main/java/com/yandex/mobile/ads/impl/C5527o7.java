package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;

@SuppressLint
/* renamed from: com.yandex.mobile.ads.impl.o7 */
/* loaded from: classes3.dex */
public final class C5527o7 extends yo0 {

    /* renamed from: k */
    @NonNull
    private final C5568p7 f53177k;

    public C5527o7(@NonNull Context context) throws Throwable {
        this(context, new u90());
    }

    @Override // com.yandex.mobile.ads.impl.yo0, com.yandex.mobile.ads.impl.InterfaceC5610pz
    /* renamed from: a */
    public final void mo26656a(@NonNull Context context, @NonNull String str) {
        this.f53177k.m27181a(str);
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    /* renamed from: h */
    public final void mo26109h() {
    }

    public void setAdtuneWebViewListener(@NonNull InterfaceC5676r7 interfaceC5676r7) {
        this.f53177k.m27180a(interfaceC5676r7);
    }

    public C5527o7(@NonNull Context context, @NonNull u90 u90Var) {
        super(context);
        C5568p7 c5568p7 = new C5568p7();
        this.f53177k = c5568p7;
        if (u90Var.m28915a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(c5568p7);
    }
}
