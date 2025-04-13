package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.c2 */
/* loaded from: classes3.dex */
public final class C4900c2 extends AbstractC5179he {

    /* renamed from: com.yandex.mobile.ads.impl.c2$a */
    public final class a extends WebChromeClient {

        /* renamed from: a */
        private final WeakReference<Context> f49069a;

        public a(Context context) {
            this.f49069a = new WeakReference<>(context);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i2) {
            C4900c2 c4900c2 = C4900c2.this;
            WeakReference<Context> weakReference = this.f49069a;
            Objects.requireNonNull(c4900c2);
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.mo23007a(webView, i2);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c2$b */
    public final class b extends WebViewClient {

        /* renamed from: a */
        private final WeakReference<Context> f49071a;

        /* renamed from: b */
        private final qi1 f49072b = ly0.m26545b();

        /* renamed from: c */
        @NonNull
        private final k91 f49073c = new k91();

        public b(Context context) {
            this.f49071a = new WeakReference<>(context);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C4900c2 c4900c2 = C4900c2.this;
            WeakReference<Context> weakReference = this.f49071a;
            Objects.requireNonNull(c4900c2);
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.mo23008c();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C4900c2 c4900c2 = C4900c2.this;
            WeakReference<Context> weakReference = this.f49071a;
            Objects.requireNonNull(c4900c2);
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.mo23009h();
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (this.f49072b.mo27334a(webView.getContext(), sslError)) {
                sslErrorHandler.proceed();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (i91.m25467b(str) || !URLUtil.isNetworkUrl(str)) {
                return this.f49073c.m26091a(webView.getContext(), str);
            }
            return false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.c2$c */
    public interface c {
        /* renamed from: a */
        void mo23007a(WebView webView, int i2);

        /* renamed from: c */
        void mo23008c();

        /* renamed from: h */
        void mo23009h();
    }

    public C4900c2(Context context) throws Throwable {
        super(context);
        m23006a(context);
    }

    @SuppressLint
    /* renamed from: a */
    public final void m23006a(Context context) {
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        m25137g();
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new a(context));
        setWebViewClient(new b(context));
    }
}
