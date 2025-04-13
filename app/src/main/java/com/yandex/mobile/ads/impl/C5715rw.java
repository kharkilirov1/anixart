package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.AbstractC5368kz;

@SuppressLint
/* renamed from: com.yandex.mobile.ads.impl.rw */
/* loaded from: classes3.dex */
public final class C5715rw extends AbstractC5368kz {

    /* renamed from: n */
    @NonNull
    private final ni1 f54429n;

    public C5715rw(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) throws Throwable {
        super(context, adResponse, c5101g2);
        this.f54429n = new ni1(this);
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    /* renamed from: b */
    public final void mo27991b(Context context) {
        super.mo27991b(context);
        WebSettings settings = getSettings();
        settings.setDatabasePath(getContext().getDatabasePath("com.yandex.mobile.ads.db").getAbsolutePath());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5368kz
    @SuppressLint
    /* renamed from: c */
    public final void mo26108c(@NonNull Context context) {
        addJavascriptInterface(new AbstractC5368kz.a(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    /* renamed from: h */
    public final void mo26109h() {
        this.f54429n.m26917a(m26303i());
    }
}
