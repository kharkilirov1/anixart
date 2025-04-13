package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.vg */
/* loaded from: classes3.dex */
public final class C5917vg implements k40 {
    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        View m28931c = uiElements.m28931c();
        TextView m28934f = uiElements.m28934f();
        ImageView m28935g = uiElements.m28935g();
        if (m28934f != null && m28934f.getVisibility() == 8) {
            if (!(m28935g != null && m28935g.getVisibility() == 8) || m28931c == null) {
                return;
            }
            m28931c.setBackground(null);
        }
    }
}
