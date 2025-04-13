package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.hu */
/* loaded from: classes3.dex */
public final class C5200hu {

    /* renamed from: a */
    @NonNull
    private final Context f51136a;

    public C5200hu(@NonNull Context context) {
        this.f51136a = context;
    }

    @NonNull
    /* renamed from: a */
    public final FrameLayout m25372a() {
        FrameLayout frameLayout = new FrameLayout(this.f51136a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
