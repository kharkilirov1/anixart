package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.wm */
/* loaded from: classes3.dex */
final class C5978wm implements InterfaceC5466n<C5927vm> {

    /* renamed from: a */
    private final C6082ym f56158a;

    public C5978wm(@NonNull C6082ym c6082ym) {
        this.f56158a = c6082ym;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5466n
    /* renamed from: a */
    public final void mo22935a(@NonNull View view, @NonNull C5927vm c5927vm) {
        Context context = view.getContext();
        this.f56158a.m29952a(context, c5927vm);
    }
}
