package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.core.JsonFactory;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wm1 {
    private wm1() {
    }

    /* renamed from: a */
    public static void m29503a(WebView webView) {
        m29508a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: a */
    public static void m29504a(WebView webView, float f2) {
        m29508a(webView, "setDeviceVolume", Float.valueOf(f2));
    }

    /* renamed from: a */
    public static void m29505a(WebView webView, String str) {
        m29508a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: a */
    public static void m29506a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m29508a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m29508a(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: a */
    public static void m29507a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m29508a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    public static void m29508a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            String m29049a = um1.m29049a("The WebView is null for ", str);
            if (!bm1.f48926a.booleanValue() || TextUtils.isEmpty(m29049a)) {
                return;
            }
            Log.i("OMIDLIB", m29049a);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new vm1(webView, sb2));
        }
    }

    /* renamed from: a */
    public static void m29509a(WebView webView, JSONObject jSONObject) {
        m29508a(webView, "init", jSONObject);
    }

    /* renamed from: b */
    public static void m29510b(WebView webView) {
        m29508a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: b */
    public static void m29511b(WebView webView, String str) {
        m29508a(webView, "setState", str);
    }

    /* renamed from: b */
    public static void m29512b(WebView webView, @NonNull JSONObject jSONObject) {
        m29508a(webView, "publishLoadedEvent", jSONObject);
    }
}
