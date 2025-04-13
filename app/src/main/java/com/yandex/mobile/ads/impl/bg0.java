package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;

/* loaded from: classes3.dex */
final class bg0 extends C5559oz {

    /* renamed from: c */
    @Nullable
    private String f48867c;

    public bg0(@NonNull InterfaceC5610pz interfaceC5610pz) {
        super(interfaceC5610pz);
    }

    /* renamed from: a */
    public final void m22814a(@NonNull String str) {
        this.f48867c = str;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(@NonNull WebView webView, @NonNull String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi
    public final WebResourceResponse shouldInterceptRequest(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        Uri url;
        return (TextUtils.isEmpty(this.f48867c) || (url = webResourceRequest.getUrl()) == null || !"mraid.js".equals(url.getLastPathSegment())) ? super.shouldInterceptRequest(webView, webResourceRequest) : new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(this.f48867c.getBytes()));
    }
}
