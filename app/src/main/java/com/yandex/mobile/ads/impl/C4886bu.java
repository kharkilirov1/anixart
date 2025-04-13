package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.bu */
/* loaded from: classes3.dex */
final class C4886bu implements InterfaceC5466n<C4824au> {

    /* renamed from: a */
    @NonNull
    private final C5359ku f48981a;

    public C4886bu(@NonNull C5359ku c5359ku) {
        this.f48981a = c5359ku;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5466n
    /* renamed from: a */
    public final void mo22935a(@NonNull View view, @NonNull C4824au c4824au) {
        Context context = view.getContext();
        this.f48981a.m26256a(context, c4824au);
    }
}
