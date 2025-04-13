package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.yg */
/* loaded from: classes2.dex */
public class C4446yg extends C3198Bg {

    /* renamed from: i */
    private static final InterfaceC4350uo<YandexMetricaConfig> f47008i = new C4272ro(new C4246qo("Config"));

    /* renamed from: j */
    private static final InterfaceC4350uo<String> f47009j = new C4272ro(new C4220po("Native crash"));

    /* renamed from: k */
    private static final InterfaceC4350uo<Activity> f47010k = new C4272ro(new C4246qo("Activity"));

    /* renamed from: l */
    private static final InterfaceC4350uo<Intent> f47011l = new C4272ro(new C4246qo("Intent"));

    /* renamed from: m */
    private static final InterfaceC4350uo<Application> f47012m = new C4272ro(new C4246qo("Application"));

    /* renamed from: n */
    private static final InterfaceC4350uo<Context> f47013n = new C4272ro(new C4246qo("Context"));

    /* renamed from: o */
    private static final InterfaceC4350uo<Object> f47014o = new C4272ro(new C4246qo("Deeplink listener"));

    /* renamed from: p */
    private static final InterfaceC4350uo<AppMetricaDeviceIDListener> f47015p = new C4272ro(new C4246qo("DeviceID listener"));

    /* renamed from: q */
    private static final InterfaceC4350uo<ReporterConfig> f47016q = new C4272ro(new C4246qo("Reporter Config"));

    /* renamed from: r */
    private static final InterfaceC4350uo<String> f47017r = new C4272ro(new C4220po("Deeplink"));

    /* renamed from: s */
    private static final InterfaceC4350uo<String> f47018s = new C4272ro(new C4220po("Referral url"));

    /* renamed from: t */
    private static final InterfaceC4350uo<String> f47019t = new C4272ro(new C4376vo());

    /* renamed from: u */
    private static final InterfaceC4350uo<String> f47020u = new C4272ro(new C4246qo("Key"));

    /* renamed from: v */
    private static final InterfaceC4350uo<WebView> f47021v = new C4272ro(new C4246qo("WebView"));

    /* renamed from: w */
    private static final InterfaceC4350uo<String> f47022w = new C4220po("value");

    /* renamed from: x */
    private static final InterfaceC4350uo<String> f47023x = new C4220po("name");

    /* renamed from: a */
    public void m21210a(@NonNull Application application) {
        ((C4272ro) f47012m).mo18360a(application);
    }

    /* renamed from: b */
    public void m21221b(@NonNull Context context) {
        ((C4272ro) f47013n).mo18360a(context);
    }

    /* renamed from: c */
    public void m21223c(String str) {
        ((C4272ro) f47009j).mo18360a(str);
    }

    /* renamed from: d */
    public void m21224d(@NonNull String str) {
        ((C4272ro) f47020u).mo18360a(str);
    }

    /* renamed from: e */
    public void m21225e(@NonNull String str) {
        ((C4272ro) f47017r).mo18360a(str);
    }

    /* renamed from: f */
    public boolean m21226f(@Nullable String str) {
        return ((C4220po) f47023x).mo18360a(str).m20772b();
    }

    /* renamed from: g */
    public boolean m21227g(@Nullable String str) {
        return ((C4220po) f47022w).mo18360a(str).m20772b();
    }

    /* renamed from: a */
    public void m21215a(@NonNull Intent intent) {
        ((C4272ro) f47011l).mo18360a(intent);
    }

    /* renamed from: c */
    public void m21222c(@NonNull Activity activity) {
        ((C4272ro) f47010k).mo18360a(activity);
    }

    /* renamed from: a */
    public void m21220a(@NonNull String str) {
        ((C4272ro) f47018s).mo18360a(str);
    }

    /* renamed from: a */
    public void m21211a(@NonNull Context context) {
        ((C4272ro) f47013n).mo18360a(context);
    }

    /* renamed from: a */
    public void m21219a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        ((C4272ro) f47014o).mo18360a(deferredDeeplinkParametersListener);
    }

    /* renamed from: a */
    public void m21218a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        ((C4272ro) f47014o).mo18360a(deferredDeeplinkListener);
    }

    /* renamed from: a */
    public void m21217a(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        ((C4272ro) f47015p).mo18360a(appMetricaDeviceIDListener);
    }

    /* renamed from: a */
    public void m21214a(@NonNull Context context, @NonNull String str) {
        ((C4272ro) f47013n).mo18360a(context);
        ((C4272ro) f47019t).mo18360a(str);
    }

    /* renamed from: a */
    public void m21212a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        ((C4272ro) f47013n).mo18360a(context);
        ((C4272ro) f47016q).mo18360a(reporterConfig);
    }

    /* renamed from: a */
    public void m21213a(@NonNull Context context, @NonNull YandexMetricaConfig yandexMetricaConfig) {
        ((C4272ro) f47013n).mo18360a(context);
        ((C4272ro) f47008i).mo18360a(yandexMetricaConfig);
    }

    /* renamed from: a */
    public void m21216a(@Nullable WebView webView) {
        ((C4272ro) f47021v).mo18360a(webView);
    }
}
