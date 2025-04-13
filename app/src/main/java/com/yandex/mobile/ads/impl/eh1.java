package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class eh1 {

    /* renamed from: a */
    @NonNull
    private final to0 f49974a = new to0();

    /* renamed from: b */
    @NonNull
    private final fh1 f49975b = new fh1();

    /* renamed from: a */
    public final int m24176a(@NonNull View view) {
        boolean m28660d = tg1.m28660d(view);
        Rect m24605a = this.f49975b.m24605a(view);
        if (m28660d || m24605a == null) {
            return 0;
        }
        return (m24605a.width() * m24605a.height()) - this.f49974a.m28695a(view, m24605a);
    }
}
