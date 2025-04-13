package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.he */
/* loaded from: classes3.dex */
public abstract class AbstractC5179he extends WebView {

    /* renamed from: a */
    @Nullable
    public HashMap f50916a;

    public AbstractC5179he(Context context) {
        super(context);
        m25132f();
    }

    /* renamed from: f */
    private void m25132f() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (C5474n6.m26805a(11)) {
            settings.setAllowContentAccess(false);
            if (C5474n6.m26805a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    /* renamed from: a */
    public final void m25133a(String str) {
        StringBuilder m26356a = l60.m26356a(str);
        m26356a.append(mo25134c());
        m26356a.append("<body style='margin:0; padding:0;'>");
        loadDataWithBaseURL("https://yandex.ru", m26356a.toString(), "text/html", "UTF-8", null);
    }

    @Override // android.webkit.WebView
    @SuppressLint
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        if (this.f50916a == null) {
            this.f50916a = new HashMap();
        }
        this.f50916a.put(str, obj);
    }

    /* renamed from: c */
    public String mo25134c() {
        return "";
    }

    @Nullable
    /* renamed from: d */
    public final Object m25135d() {
        HashMap hashMap = this.f50916a;
        if (hashMap != null) {
            return hashMap.get("AdPerformActionsJSI");
        }
        return null;
    }

    /* renamed from: e */
    public void mo25136e() {
        int i2 = tg1.f55120b;
        try {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } catch (Exception unused) {
        }
        try {
            removeAllViews();
        } catch (Exception unused2) {
        }
        HashMap hashMap = this.f50916a;
        if (hashMap != null) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                removeJavascriptInterface((String) it.next());
            }
            this.f50916a.clear();
        }
        destroy();
        n60.m26813f("WebView component <%s> was destroyed", getClass().toString());
    }

    /* renamed from: g */
    public final void m25137g() {
        if (C5474n6.m26805a(11)) {
            getSettings().setDisplayZoomControls(false);
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (C5474n6.m26805a(11)) {
            super.removeJavascriptInterface(str);
        }
    }
}
