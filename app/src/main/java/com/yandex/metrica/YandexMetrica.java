package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p023ob.C4225q3;
import com.yandex.metrica.impl.p023ob.C4394wg;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import com.yandex.mobile.ads.C4632R;
import java.util.Map;

/* loaded from: classes2.dex */
public final class YandexMetrica {
    public static void activate(@NonNull Context context, @NonNull YandexMetricaConfig yandexMetricaConfig) {
        C4394wg.m21110a().m20952a(context, yandexMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        C4394wg.m21110a().m20951a(context, reporterConfig);
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        C4394wg.m21110a().m20950a(application);
    }

    public static int getLibraryApiLevel() {
        return C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "5.0.0";
    }

    @NonNull
    public static YandexMetricaPlugins getPluginExtension() {
        return C4225q3.m20569a();
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return C4394wg.m21110a().m20948a(context, str);
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        C4394wg.m21110a().m20956a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        C4394wg.m21110a().m20949a(activity);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
        C4394wg.m21110a().m20964a(str, str2);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        C4394wg.m21110a().m20970b(activity);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        C4394wg.m21110a().m20961a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, @Nullable Throwable th) {
        C4394wg.m21110a().m20966a(str, th);
    }

    public static void reportEvent(@NonNull String str) {
        C4394wg.m21110a().m20972b(str);
    }

    @Deprecated
    public static void reportNativeCrash(@NonNull String str) {
        C4394wg.m21110a().m20977d(str);
    }

    public static void reportReferralUrl(@NonNull String str) {
        C4394wg.m21110a().m20978e(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        C4394wg.m21110a().m20960a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th) {
        C4394wg.m21110a().m20968a(th);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        C4394wg.m21110a().m20962a(userProfile);
    }

    public static void requestAppMetricaDeviceID(@NonNull AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        C4394wg.m21110a().m20957a(appMetricaDeviceIDListener);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        C4394wg.m21110a().m20958a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C4394wg.m21110a().m20959a(deferredDeeplinkParametersListener);
    }

    public static void resumeSession(@Nullable Activity activity) {
        C4394wg.m21110a().m20974c(activity);
    }

    public static void sendEventsBuffer() {
        C4394wg.m21110a().m20980i();
    }

    public static void setLocation(@Nullable Location location) {
        C4394wg.m21110a().m20955a(location);
    }

    public static void setLocationTracking(boolean z) {
        C4394wg.m21110a().m20969a(z);
    }

    public static void setStatisticsSending(@NonNull Context context, boolean z) {
        C4394wg.m21110a().m20971b(context, z);
    }

    public static void setUserProfileID(@Nullable String str) {
        C4394wg.m21110a().m20979f(str);
    }

    public static void reportAppOpen(@NonNull String str) {
        C4394wg.m21110a().m20963a(str);
    }

    public static void reportError(@NonNull String str, @Nullable String str2) {
        C4394wg.m21110a().m20965a(str, str2, null);
    }

    public static void reportEvent(@NonNull String str, @Nullable String str2) {
        C4394wg.m21110a().m20973b(str, str2);
    }

    public static void setLocationTracking(@NonNull Context context, boolean z) {
        C4394wg.m21110a().m20953a(context, z);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        C4394wg.m21110a().m20954a(intent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        C4394wg.m21110a().m20965a(str, str2, th);
    }

    public static void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        C4394wg.m21110a().m20967a(str, map);
    }
}
