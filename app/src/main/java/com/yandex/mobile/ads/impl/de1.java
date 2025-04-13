package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class de1 implements InterfaceC6027xh {

    /* renamed from: a */
    @NonNull
    private final sl0 f49641a;

    /* renamed from: b */
    @Nullable
    private final C5083fl f49642b;

    public de1(@NonNull sl0 sl0Var, @Nullable C5083fl c5083fl) {
        this.f49641a = sl0Var;
        this.f49642b = c5083fl;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6027xh
    @SuppressLint
    /* renamed from: a */
    public final void mo23878a(@NonNull a80 a80Var, @NonNull C6077yh c6077yh) {
        ViewOnTouchListenerC5639qh viewOnTouchListenerC5639qh = new ViewOnTouchListenerC5639qh(this.f49641a.getContext(), new ce1(a80Var, c6077yh, this.f49642b));
        this.f49641a.setOnTouchListener(viewOnTouchListenerC5639qh);
        this.f49641a.setOnClickListener(viewOnTouchListenerC5639qh);
    }
}
