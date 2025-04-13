package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* loaded from: classes3.dex */
final class vm1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ WebView f55841b;

    /* renamed from: c */
    public final /* synthetic */ String f55842c;

    public vm1(WebView webView, String str) {
        this.f55841b = webView;
        this.f55842c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f55841b.loadUrl(this.f55842c);
    }
}
