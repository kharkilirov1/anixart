package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6200b;
import com.yandex.mobile.ads.nativeads.C6264w;

/* renamed from: com.yandex.mobile.ads.impl.k6 */
/* loaded from: classes3.dex */
public final class C5319k6 implements gg1 {

    /* renamed from: a */
    @NonNull
    private final C6264w f51845a;

    /* renamed from: b */
    @NonNull
    private final C6200b f51846b;

    public C5319k6(@NonNull C6264w c6264w, @NonNull C6200b c6200b) {
        this.f51845a = c6264w;
        this.f51846b = c6200b;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    /* renamed from: a */
    public final void mo24889a(@NonNull View view, @NonNull C5276ja c5276ja) {
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    /* renamed from: a */
    public final void mo24890a(@NonNull C5276ja c5276ja, @NonNull InterfaceC6027xh interfaceC6027xh) {
        this.f51846b.m30500a(c5276ja, c5276ja.m25823a(), this.f51845a, interfaceC6027xh);
    }
}
