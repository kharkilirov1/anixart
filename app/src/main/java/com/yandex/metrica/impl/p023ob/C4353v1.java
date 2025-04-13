package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.v1 */
/* loaded from: classes2.dex */
public class C4353v1 {
    /* renamed from: b */
    private Location m20908b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Location location = new Location(jSONObject.has("provider") ? jSONObject.optString("provider") : null);
            location.setLongitude(jSONObject.getDouble("lng"));
            location.setLatitude(jSONObject.getDouble("lat"));
            location.setTime(jSONObject.optLong("time"));
            location.setAccuracy((float) jSONObject.optDouble("accuracy"));
            location.setAltitude((float) jSONObject.optDouble("alt"));
            return location;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private PreloadInfo m20909c(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        PreloadInfo.Builder newBuilder = PreloadInfo.newBuilder(jSONObject.has("trackid") ? jSONObject.optString("trackid") : null);
        HashMap<String, String> m21265d = C4452ym.m21265d(jSONObject.optString("params"));
        if (m21265d != null && m21265d.size() > 0) {
            for (Map.Entry<String, String> entry : m21265d.entrySet()) {
                newBuilder.setAdditionalParams(entry.getKey(), entry.getValue());
            }
        }
        return newBuilder.build();
    }

    /* renamed from: a */
    public String m20911a(YandexMetricaConfig yandexMetricaConfig) {
        String jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apikey", yandexMetricaConfig.apiKey);
            jSONObject2.put("app_version", yandexMetricaConfig.appVersion);
            jSONObject2.put("session_timeout", yandexMetricaConfig.sessionTimeout);
            jSONObject2.put("location", m20907a(yandexMetricaConfig.location));
            PreloadInfo preloadInfo = yandexMetricaConfig.preloadInfo;
            if (preloadInfo != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    jSONObject3.put("params", C4452ym.m21269e(preloadInfo.getAdditionalParams()));
                    jSONObject = jSONObject3.toString();
                } catch (Throwable unused) {
                }
                jSONObject2.put("preload_info", jSONObject);
                jSONObject2.put("logs", yandexMetricaConfig.logs);
                jSONObject2.put("crash_enabled", yandexMetricaConfig.crashReporting);
                jSONObject2.put("crash_native_enabled", yandexMetricaConfig.nativeCrashReporting);
                jSONObject2.put("location_enabled", yandexMetricaConfig.locationTracking);
                jSONObject2.put("max_reports_in_db_count", yandexMetricaConfig.maxReportsInDatabaseCount);
                jSONObject2.put("error_environment", C4452ym.m21269e(yandexMetricaConfig.errorEnvironment));
                jSONObject2.put("first_activation_as_update", yandexMetricaConfig.firstActivationAsUpdate);
                jSONObject2.put("statistics_sending", yandexMetricaConfig.statisticsSending);
                jSONObject2.put("user_profile_id", yandexMetricaConfig.userProfileID);
                jSONObject2.put("revenue_auto_tracking_enabled", yandexMetricaConfig.revenueAutoTrackingEnabled);
                jSONObject2.put("sessions_auto_tracking_enabled", yandexMetricaConfig.sessionsAutoTrackingEnabled);
                jSONObject2.put("app_open_tracking_enabled", yandexMetricaConfig.appOpenTrackingEnabled);
                return jSONObject2.toString();
            }
            jSONObject = null;
            jSONObject2.put("preload_info", jSONObject);
            jSONObject2.put("logs", yandexMetricaConfig.logs);
            jSONObject2.put("crash_enabled", yandexMetricaConfig.crashReporting);
            jSONObject2.put("crash_native_enabled", yandexMetricaConfig.nativeCrashReporting);
            jSONObject2.put("location_enabled", yandexMetricaConfig.locationTracking);
            jSONObject2.put("max_reports_in_db_count", yandexMetricaConfig.maxReportsInDatabaseCount);
            jSONObject2.put("error_environment", C4452ym.m21269e(yandexMetricaConfig.errorEnvironment));
            jSONObject2.put("first_activation_as_update", yandexMetricaConfig.firstActivationAsUpdate);
            jSONObject2.put("statistics_sending", yandexMetricaConfig.statisticsSending);
            jSONObject2.put("user_profile_id", yandexMetricaConfig.userProfileID);
            jSONObject2.put("revenue_auto_tracking_enabled", yandexMetricaConfig.revenueAutoTrackingEnabled);
            jSONObject2.put("sessions_auto_tracking_enabled", yandexMetricaConfig.sessionsAutoTrackingEnabled);
            jSONObject2.put("app_open_tracking_enabled", yandexMetricaConfig.appOpenTrackingEnabled);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: a */
    public YandexMetricaConfig m20910a(String str) {
        YandexMetricaConfig yandexMetricaConfig;
        HashMap<String, String> m21265d;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                YandexMetricaConfig.Builder newConfigBuilder = YandexMetricaConfig.newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    newConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    newConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                newConfigBuilder.withLocation(m20908b(jSONObject.optString("location")));
                newConfigBuilder.withPreloadInfo(m20909c(jSONObject.optString("preload_info")));
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    newConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    newConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    newConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    newConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    newConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                if (jSONObject.has("error_environment") && (m21265d = C4452ym.m21265d(jSONObject.optString("error_environment"))) != null) {
                    for (Map.Entry<String, String> entry : m21265d.entrySet()) {
                        newConfigBuilder.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
                    }
                }
                if (jSONObject.has("first_activation_as_update")) {
                    newConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
                }
                if (jSONObject.has("statistics_sending")) {
                    newConfigBuilder.withStatisticsSending(jSONObject.optBoolean("statistics_sending"));
                }
                if (jSONObject.has("user_profile_id")) {
                    yandexMetricaConfig = null;
                    try {
                        newConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
                    } catch (Throwable unused) {
                    }
                } else {
                    yandexMetricaConfig = null;
                }
                if (jSONObject.has("revenue_auto_tracking_enabled")) {
                    newConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (jSONObject.has("sessions_auto_tracking_enabled")) {
                    newConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
                }
                if (jSONObject.has("app_open_tracking_enabled")) {
                    newConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
                }
                return newConfigBuilder.build();
            } catch (Throwable unused2) {
            }
        }
        yandexMetricaConfig = null;
        return yandexMetricaConfig;
    }

    /* renamed from: a */
    private String m20907a(Location location) {
        if (location == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("provider", location.getProvider());
            jSONObject.put("time", location.getTime());
            jSONObject.put("accuracy", location.getAccuracy());
            jSONObject.put("alt", location.getAltitude());
            jSONObject.put("lng", location.getLongitude());
            jSONObject.put("lat", location.getLatitude());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
