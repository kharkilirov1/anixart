package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6216j;
import java.util.Objects;

/* loaded from: classes3.dex */
final class wh0 {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f56125a;

    /* renamed from: b */
    @NonNull
    private final C6216j f56126b = new C6216j();

    /* renamed from: c */
    @NonNull
    private final mh0 f56127c = new mh0();

    public wh0(@NonNull C5101g2 c5101g2) {
        this.f56125a = c5101g2;
    }

    /* renamed from: a */
    public final void m29483a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull w10 w10Var, @NonNull di0 di0Var, @NonNull th0 th0Var) {
        kk0 m24791m = this.f56125a.m24791m();
        Objects.requireNonNull(this.f56127c);
        lh0 m26674a = mh0.m26674a(m24791m);
        if (m26674a != null) {
            m26674a.mo22365a(context, kh0Var, w10Var, this.f56126b, di0Var, th0Var);
        } else {
            th0Var.mo25215a(AbstractC5524o4.f53149a);
        }
    }
}
