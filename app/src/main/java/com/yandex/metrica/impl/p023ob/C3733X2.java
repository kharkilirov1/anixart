package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.AppMetricaInitializerJsInterface;
import com.yandex.metrica.AppMetricaJsInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.X2 */
/* loaded from: classes2.dex */
public class C3733X2 {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC3678Um<C3379Im>> f44438a = new ArrayList();

    /* renamed from: b */
    @Nullable
    private C3379Im f44439b;

    /* renamed from: com.yandex.metrica.impl.ob.X2$a */
    public class a implements InterfaceC3678Um<C3379Im> {

        /* renamed from: a */
        public final /* synthetic */ String f44440a;

        public a(C3733X2 c3733x2, String str) {
            this.f44440a = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(C3379Im c3379Im) {
            C3379Im c3379Im2 = c3379Im;
            if (c3379Im2.m21337c()) {
                c3379Im2.m21335c(this.f44440a);
            }
        }
    }

    @SuppressLint
    /* renamed from: a */
    public void m19379a(@NonNull WebView webView, @NonNull C4368vg c4368vg) {
        if (!C3658U2.m19211a(17)) {
            m19378a("WebView interface is not available on Android < 17.");
            return;
        }
        try {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                m19378a("WebView interface setup failed because javascript is disabled for the WebView.");
                return;
            }
            webView.addJavascriptInterface(new AppMetricaJsInterface(c4368vg), "AppMetrica");
            webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(c4368vg), "AppMetricaInitializer");
            C3708W2 c3708w2 = new C3708W2(this, "WebView interface setup is successful.");
            synchronized (this) {
                C3379Im c3379Im = this.f44439b;
                if (c3379Im == null) {
                    this.f44438a.add(c3708w2);
                } else {
                    c3708w2.mo17875b(c3379Im);
                }
            }
        } catch (Throwable th) {
            C3758Y2 c3758y2 = new C3758Y2(this, th, "WebView interface setup failed because of an exception.");
            synchronized (this) {
                C3379Im c3379Im2 = this.f44439b;
                if (c3379Im2 == null) {
                    this.f44438a.add(c3758y2);
                } else {
                    c3758y2.mo17875b(c3379Im2);
                }
            }
        }
    }

    /* renamed from: a */
    public void m19380a(@NonNull C3379Im c3379Im) {
        synchronized (this) {
            this.f44439b = c3379Im;
        }
        Iterator<InterfaceC3678Um<C3379Im>> it = this.f44438a.iterator();
        while (it.hasNext()) {
            it.next().mo17875b(c3379Im);
        }
        this.f44438a.clear();
    }

    /* renamed from: a */
    private void m19378a(@NonNull String str) {
        a aVar = new a(this, str);
        synchronized (this) {
            C3379Im c3379Im = this.f44439b;
            if (c3379Im == null) {
                this.f44438a.add(aVar);
            } else {
                aVar.mo17875b(c3379Im);
            }
        }
    }
}
