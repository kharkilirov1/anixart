package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class gf0 {

    /* renamed from: a */
    private final yo0 f50568a;

    public gf0(@NonNull yo0 yo0Var) {
        this.f50568a = yo0Var;
    }

    /* renamed from: a */
    public final void m24874a(@NonNull int i2, @NonNull String str) {
        StringBuilder m26356a = l60.m26356a("notifyErrorEvent(");
        m26356a.append(JSONObject.quote(sf0.m28243a(i2)));
        m26356a.append(", ");
        m26356a.append(JSONObject.quote(str));
        m26356a.append(")");
        m24871a(m26356a.toString());
    }

    /* renamed from: b */
    public final void m24876b(String str) {
        this.f50568a.m25133a(str);
    }

    /* renamed from: a */
    public final void m24873a(@NonNull int i2) {
        StringBuilder m26356a = l60.m26356a("nativeCallComplete(");
        m26356a.append(JSONObject.quote(sf0.m28243a(i2)));
        m26356a.append(")");
        m24871a(m26356a.toString());
    }

    /* renamed from: a */
    public final void m24872a() {
        m24871a("notifyReadyEvent();");
    }

    /* renamed from: a */
    public final void m24875a(@NonNull e70... e70VarArr) {
        if (e70VarArr.length > 0) {
            StringBuilder sb = new StringBuilder("fireChangeEvent({");
            int length = e70VarArr.length;
            int i2 = 0;
            String str = "";
            while (i2 < length) {
                e70 e70Var = e70VarArr[i2];
                sb.append(str);
                sb.append(e70Var.mo23814a());
                i2++;
                str = ", ";
            }
            sb.append("})");
            m24871a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m24871a(@NonNull String str) {
        String format = String.format("window.mraidbridge.%s", str);
        this.f50568a.loadUrl("javascript: " + format);
        n60.m26812e("Injecting Javascript into MRAID WebView:\n\t%s", format);
    }
}
