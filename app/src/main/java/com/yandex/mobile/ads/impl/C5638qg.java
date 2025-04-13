package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.qg */
/* loaded from: classes3.dex */
public final class C5638qg {

    /* renamed from: a */
    @NonNull
    private final Handler f54041a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @NonNull
    private final C5498nj f54042b;

    public C5638qg(@NonNull Context context) {
        this.f54042b = C5746sg.m28245a(context);
    }

    /* renamed from: a */
    public final void m27719a(@NonNull TextView textView) {
        this.f54041a.postDelayed(new a41(textView, this.f54042b), 2000L);
    }

    /* renamed from: a */
    public final void m27718a() {
        this.f54041a.removeCallbacksAndMessages(null);
        this.f54042b.cancel();
    }
}
