package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s7 */
/* loaded from: classes3.dex */
public final class C5729s7 implements InterfaceC5428m7 {

    /* renamed from: a */
    @NonNull
    private final String f54509a;

    /* renamed from: b */
    @NonNull
    private final Runnable f54510b;

    public C5729s7(@NonNull String str, @NonNull Runnable runnable) {
        this.f54509a = str;
        this.f54510b = runnable;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5428m7
    /* renamed from: a */
    public final boolean mo26584a(@Nullable String str, @Nullable String str2) {
        return "mobileads".equals(str) && this.f54509a.equals(str2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5428m7
    /* renamed from: a */
    public final void mo26583a() {
        this.f54510b.run();
    }
}
