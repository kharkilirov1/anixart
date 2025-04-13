package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.kz */
/* loaded from: classes3.dex */
public abstract class AbstractC5368kz extends yo0 implements InterfaceC5773sz {

    /* renamed from: k */
    @NonNull
    public final AdResponse f52193k;

    /* renamed from: l */
    @NonNull
    private final gp0 f52194l;

    /* renamed from: m */
    @Nullable
    private HashMap f52195m;

    /* renamed from: com.yandex.mobile.ads.impl.kz$a */
    public class a {
        public a(Context context) {
            new WeakReference(context);
        }

        @JavascriptInterface
        public String getBannerInfo() {
            return "{\"isDelicate\": false}";
        }

        @JavascriptInterface
        public void onAdRender(int i2, String str) {
            AbstractC5368kz.this.f52194l.m24954a(i2, str);
        }
    }

    public AbstractC5368kz(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        super(context);
        this.f52193k = adResponse;
        this.f52194l = new gp0(this, new C5257iz(xz0.m29823b().m29824a(context)));
        mo26108c(context);
    }

    /* renamed from: b */
    public void mo26107b(int i2, String str) {
        if (TextUtils.isEmpty(str) || "undefined".equals(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        this.f52195m = hashMap;
        hashMap.put("test-tag", str);
    }

    @Override // com.yandex.mobile.ads.impl.yo0, com.yandex.mobile.ads.impl.AbstractC5179he
    /* renamed from: c */
    public String mo25134c() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo25134c());
        sb.append(m26304j() ? li1.f52422a : "");
        return sb.toString();
    }

    @SuppressLint
    /* renamed from: c */
    public abstract void mo26108c(@NonNull Context context);

    @Override // com.yandex.mobile.ads.impl.yo0, com.yandex.mobile.ads.impl.AbstractC5179he
    /* renamed from: e */
    public final void mo25136e() {
        this.f52194l.m24953a();
        super.mo25136e();
    }

    @NonNull
    /* renamed from: i */
    public final Map<String, String> m26303i() {
        HashMap hashMap = this.f52195m;
        return hashMap != null ? hashMap : Collections.emptyMap();
    }

    /* renamed from: j */
    public final boolean m26304j() {
        return "partner-code".equals(this.f52193k.m21821k());
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        n60.m26811d("Configuration is changed for web view, new config: %s", configuration);
        Object m25135d = m25135d();
        if (m25135d != null && (m25135d instanceof a)) {
            n60.m26811d("Stop JS activity was called", new Object[0]);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    public void setHtmlWebViewListener(@NonNull InterfaceC5719rz interfaceC5719rz) {
        super.setHtmlWebViewListener(interfaceC5719rz);
        this.f52194l.m24955a(interfaceC5719rz);
    }

    @Override // com.yandex.mobile.ads.impl.yo0, com.yandex.mobile.ads.impl.InterfaceC5610pz
    /* renamed from: a */
    public final void mo26301a() {
        if (m26304j()) {
            this.f52194l.m24956b();
        } else {
            super.mo26301a();
        }
    }

    /* renamed from: a */
    public final void m26302a(int i2, String str) {
        n60.m26811d("onHtmlWebViewRender, height = " + i2 + ", testTag = " + str, new Object[0]);
        mo26107b(i2, str);
        super.mo26301a();
    }
}
