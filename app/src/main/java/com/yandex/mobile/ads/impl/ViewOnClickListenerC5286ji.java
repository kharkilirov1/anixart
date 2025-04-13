package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ji */
/* loaded from: classes3.dex */
final class ViewOnClickListenerC5286ji implements View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final C4889bw f51617a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5362kw f51618b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC5449mm f51619c;

    public ViewOnClickListenerC5286ji(@NonNull C4889bw c4889bw, @NonNull InterfaceC5362kw interfaceC5362kw, @NonNull InterfaceC5449mm interfaceC5449mm) {
        this.f51617a = c4889bw;
        this.f51618b = interfaceC5362kw;
        this.f51619c = interfaceC5449mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f51618b.mo26289a();
        this.f51617a.mo22867c();
        this.f51619c.mo26690a(EnumC5404lm.f52452b);
    }
}
