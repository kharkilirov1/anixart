package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4368vg;

/* loaded from: classes2.dex */
public class AppMetricaJsInterface {

    /* renamed from: a */
    @NonNull
    public final C4368vg f42227a;

    public AppMetricaJsInterface(@NonNull C4368vg c4368vg) {
        this.f42227a = c4368vg;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f42227a.m20976c(str, str2);
    }
}
