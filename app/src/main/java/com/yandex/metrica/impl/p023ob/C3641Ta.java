package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ta */
/* loaded from: classes2.dex */
public class C3641Ta implements InterfaceC3766Ya<YandexMetricaConfig> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3354Hm f44069a;

    /* renamed from: b */
    @NonNull
    private final C3921eb f44070b;

    @VisibleForTesting
    public C3641Ta(@NonNull InterfaceC3354Hm interfaceC3354Hm, @NonNull C3921eb c3921eb) {
        this.f44069a = interfaceC3354Hm;
        this.f44070b = c3921eb;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3766Ya
    @NonNull
    /* renamed from: a */
    public JSONObject mo19144a(@Nullable YandexMetricaConfig yandexMetricaConfig) {
        YandexMetricaConfig yandexMetricaConfig2 = yandexMetricaConfig;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (yandexMetricaConfig2 != null) {
                JSONObject putOpt = jSONObject2.put("api_key", yandexMetricaConfig2.apiKey).putOpt("app_version", yandexMetricaConfig2.appVersion).putOpt("session_timeout", yandexMetricaConfig2.sessionTimeout).putOpt("crash_reporting", yandexMetricaConfig2.crashReporting).putOpt("native_crash_reporting", yandexMetricaConfig2.nativeCrashReporting).putOpt("location", m19143a(yandexMetricaConfig2.location)).putOpt("location_tracking", yandexMetricaConfig2.locationTracking).putOpt("logs", yandexMetricaConfig2.logs);
                PreloadInfo preloadInfo = yandexMetricaConfig2.preloadInfo;
                putOpt.putOpt("preload_info", preloadInfo == null ? null : new JSONObject().putOpt("tracking_id", preloadInfo.getTrackingId()).putOpt("additional_parameters", C4452ym.m21271f(preloadInfo.getAdditionalParams()))).putOpt("first_activation_as_update", yandexMetricaConfig2.firstActivationAsUpdate).putOpt("statistics_sending", yandexMetricaConfig2.statisticsSending).putOpt("max_reports_in_database_count", yandexMetricaConfig2.maxReportsInDatabaseCount).putOpt("error_environment", C4452ym.m21271f(yandexMetricaConfig2.errorEnvironment)).putOpt("user_profile_id", yandexMetricaConfig2.userProfileID).putOpt("revenue_auto_tracking_enabled", yandexMetricaConfig2.revenueAutoTrackingEnabled).putOpt("sessions_auto_tracking_enabled", yandexMetricaConfig2.sessionsAutoTrackingEnabled).putOpt("app_open_tracking_enabled", yandexMetricaConfig2.appOpenTrackingEnabled);
                if (yandexMetricaConfig2 instanceof C4483l) {
                    C4483l c4483l = (C4483l) yandexMetricaConfig2;
                    JSONObject putOpt2 = jSONObject2.putOpt("device_type", c4483l.f47167a).putOpt("clids", C4452ym.m21271f(c4483l.f47168b)).putOpt("distribution_referrer", c4483l.f47169c);
                    List<String> list = c4483l.f47170d;
                    JSONObject putOpt3 = putOpt2.putOpt("custom_hosts", list == null ? null : list.isEmpty() ? new JSONArray() : C4452ym.m21257b((List<?>) list)).putOpt("app_build_number", c4483l.f47171e).putOpt("dispatch_period_seconds", c4483l.f47172f).putOpt("max_reports_count", c4483l.f47173g).putOpt("app_environment", C4452ym.m21271f(c4483l.f47174h)).putOpt("preload_info_auto_tracking", c4483l.f47175i).putOpt("permissions_collection", c4483l.f47176j).putOpt("anr_monitoring", c4483l.f47177k);
                    Objects.requireNonNull(this.f44070b);
                    putOpt3.putOpt("pulse_config", null).putOpt("rtm_config", null).put("crash_transformer_set", c4483l.f47178l != null);
                }
            }
            jSONObject.putOpt("config", jSONObject2).putOpt("process_name", ((C3254Dm) this.f44069a).m17984b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Nullable
    /* renamed from: a */
    private JSONObject m19143a(@Nullable Location location) throws JSONException {
        if (location == null) {
            return null;
        }
        return new JSONObject().putOpt("provider", location.getProvider()).put("timestamp", location.getTime()).put("precision", location.getAccuracy()).put("altitude", location.getAltitude()).put("lon", location.getLongitude()).put("lat", location.getLatitude()).put("direction", location.getBearing()).put("speed", location.getSpeed());
    }
}
