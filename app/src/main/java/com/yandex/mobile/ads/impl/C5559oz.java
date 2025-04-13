package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.oz */
/* loaded from: classes3.dex */
public class C5559oz extends WebViewClient {

    /* renamed from: a */
    @NotNull
    private final InterfaceC5610pz f53355a;

    /* renamed from: b */
    @NotNull
    private final pi1 f53356b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C5559oz(@NotNull InterfaceC5610pz webViewClientListener) {
        this(webViewClientListener, 0);
        Intrinsics.m32179h(webViewClientListener, "webViewClientListener");
    }

    public /* synthetic */ C5559oz(InterfaceC5610pz interfaceC5610pz, int i2) {
        this(interfaceC5610pz, ly0.m26545b());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@NotNull WebView view, @NotNull String url) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(url, "url");
        super.onPageFinished(view, url);
        this.f53355a.mo26301a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@NotNull WebView view, int i2, @NotNull String description, @NotNull String failingUrl) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(description, "description");
        Intrinsics.m32179h(failingUrl, "failingUrl");
        this.f53355a.mo26655a(i2);
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint
    public final void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(handler, "handler");
        Intrinsics.m32179h(error, "error");
        pi1 pi1Var = this.f53356b;
        Context context = view.getContext();
        Intrinsics.m32178g(context, "view.context");
        if (pi1Var.mo27334a(context, error)) {
            handler.proceed();
        } else {
            this.f53355a.mo26655a(-11);
            super.onReceivedSslError(view, handler, error);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(url, "url");
        InterfaceC5610pz interfaceC5610pz = this.f53355a;
        Context context = view.getContext();
        Intrinsics.m32178g(context, "view.context");
        interfaceC5610pz.mo26656a(context, url);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi
    public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @NotNull WebResourceError error) {
        Intrinsics.m32179h(error, "error");
        this.f53355a.mo26655a(error.getErrorCode());
    }

    @JvmOverloads
    public C5559oz(@NotNull InterfaceC5610pz webViewClientListener, @NotNull pi1 webViewSslErrorHandler) {
        Intrinsics.m32179h(webViewClientListener, "webViewClientListener");
        Intrinsics.m32179h(webViewSslErrorHandler, "webViewSslErrorHandler");
        this.f53355a = webViewClientListener;
        this.f53356b = webViewSslErrorHandler;
    }
}
