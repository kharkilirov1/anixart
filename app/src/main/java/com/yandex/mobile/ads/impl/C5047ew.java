package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.ew */
/* loaded from: classes3.dex */
final class C5047ew implements q71, m91 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5750sk f50069a;

    /* renamed from: b */
    @Nullable
    private Map<String, String> f50070b;

    /* renamed from: c */
    private boolean f50071c;

    public C5047ew(@NonNull InterfaceC5750sk interfaceC5750sk) {
        this.f50069a = interfaceC5750sk;
    }

    @Override // com.yandex.mobile.ads.impl.m91
    /* renamed from: a */
    public final void mo24274a(boolean z) {
        this.f50071c = z;
        this.f50069a.mo24745a(z);
    }

    @Override // com.yandex.mobile.ads.impl.q71
    /* renamed from: a */
    public final void mo24273a(@Nullable Map<String, String> map) {
        this.f50070b = map;
    }

    @NonNull
    /* renamed from: a */
    public final C4990dw m24272a() {
        return new C4990dw(this.f50071c, this.f50070b);
    }
}
