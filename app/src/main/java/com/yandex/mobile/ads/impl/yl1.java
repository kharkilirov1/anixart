package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class yl1 extends AbstractC5843u5 {
    @SuppressLint
    public yl1(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        m28885a(webView);
    }
}
