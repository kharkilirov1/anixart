package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.tk */
/* loaded from: classes3.dex */
public final class C5806tk {

    /* renamed from: a */
    @NonNull
    private final C5399li f55133a = new C5399li();

    @NonNull
    /* renamed from: a */
    public final InterfaceC5750sk m28670a(@NonNull FrameLayout frameLayout, @NonNull AdResponse adResponse, @NonNull InterfaceC5449mm interfaceC5449mm, boolean z, boolean z2) {
        Objects.requireNonNull(this.f55133a);
        InterfaceC5338ki m26473a = C5399li.m26473a(frameLayout, adResponse, interfaceC5449mm, z);
        return z2 ? new C5094fw(m26473a) : new C6092yu(m26473a);
    }
}
