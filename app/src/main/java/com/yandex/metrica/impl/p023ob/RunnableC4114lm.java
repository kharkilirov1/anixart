package com.yandex.metrica.impl.p023ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yandex.metrica.impl.ob.lm */
/* loaded from: classes2.dex */
class RunnableC4114lm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4166nm f45921a;

    /* renamed from: b */
    public final /* synthetic */ WebView f45922b;

    /* renamed from: c */
    public final /* synthetic */ CountDownLatch f45923c;

    public RunnableC4114lm(C4140mm c4140mm, C4166nm c4166nm, WebView webView, CountDownLatch countDownLatch) {
        this.f45921a = c4166nm;
        this.f45922b = webView;
        this.f45923c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f45921a.f46022h = this.f45922b.getUrl();
            this.f45921a.f46023i = this.f45922b.getOriginalUrl();
            this.f45923c.countDown();
        } catch (Throwable unused) {
        }
    }
}
