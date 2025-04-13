package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4368vg;

/* loaded from: classes2.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a */
    @NonNull
    public final C4368vg f42226a;

    public AppMetricaInitializerJsInterface(@NonNull C4368vg c4368vg) {
        this.f42226a = c4368vg;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f42226a.m20975c(str);
    }
}
