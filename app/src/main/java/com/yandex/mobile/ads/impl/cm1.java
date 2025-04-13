package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cm1 extends AbstractC5843u5 {

    /* renamed from: f */
    private WebView f49301f;

    /* renamed from: g */
    private Long f49302g = null;

    /* renamed from: h */
    private final Map<String, gb1> f49303h;

    /* renamed from: i */
    private final String f49304i;

    /* renamed from: com.yandex.mobile.ads.impl.cm1$a */
    public class RunnableC4931a implements Runnable {

        /* renamed from: b */
        private final WebView f49305b;

        public RunnableC4931a(cm1 cm1Var) {
            this.f49305b = cm1Var.f49301f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f49305b.destroy();
        }
    }

    public cm1(String str, Map map) {
        this.f49303h = map;
        this.f49304i = str;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5843u5
    /* renamed from: a */
    public final void mo23315a() {
        WebView webView = new WebView(qm1.m27750a().m27752b());
        this.f49301f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        m28885a(this.f49301f);
        WebView webView2 = this.f49301f;
        String str = this.f49304i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String str2 : this.f49303h.keySet()) {
            String externalForm = this.f49303h.get(str2).m24837a().toExternalForm();
            WebView webView3 = this.f49301f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f49302g = Long.valueOf(System.nanoTime());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5843u5
    /* renamed from: a */
    public final void mo23316a(tl1 tl1Var, C5670r5 c5670r5) {
        JSONObject jSONObject = new JSONObject();
        Map<String, gb1> m27838d = c5670r5.m27838d();
        for (String str : m27838d.keySet()) {
            gm1.m24946a(jSONObject, str, m27838d.get(str));
        }
        m28889a(tl1Var, c5670r5, jSONObject);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5843u5
    /* renamed from: b */
    public final void mo23317b() {
        super.mo23317b();
        new Handler().postDelayed(new RunnableC4931a(this), Math.max(4000 - (this.f49302g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f49302g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f49301f = null;
    }
}
