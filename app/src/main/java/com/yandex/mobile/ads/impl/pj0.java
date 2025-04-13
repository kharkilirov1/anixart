package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.C6216j;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.util.List;

/* loaded from: classes3.dex */
final class pj0 implements lh0 {

    /* renamed from: a */
    @NonNull
    private final ei0 f53563a = new ei0();

    @Override // com.yandex.mobile.ads.impl.lh0
    /* renamed from: a */
    public final void mo22365a(@NonNull Context context, @NonNull kh0 kh0Var, @NonNull w10 w10Var, @NonNull C6216j c6216j, @NonNull di0 di0Var, @NonNull th0 th0Var) {
        NativeAd nativeAd;
        List<eh0> m27736d = kh0Var.m26128c().m27736d();
        if (m27736d == null || m27736d.isEmpty()) {
            nativeAd = null;
        } else if (m27736d.size() > 1) {
            nativeAd = c6216j.m30559a(context, kh0Var, w10Var, di0Var);
        } else {
            nativeAd = this.f53563a.m24177a(context, kh0Var, w10Var, c6216j, di0Var, m27736d.get(0));
        }
        if (nativeAd != null) {
            th0Var.mo25216a(nativeAd);
        } else {
            th0Var.mo25215a(AbstractC5524o4.f53149a);
        }
    }
}
