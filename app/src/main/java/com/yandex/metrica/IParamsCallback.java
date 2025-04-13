package com.yandex.metrica;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3658U2;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IParamsCallback {
    public static final String APP_METRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String YANDEX_MOBILE_METRICA_CLIDS = "yandex_mobile_metrica_clids";
    public static final String YANDEX_MOBILE_METRICA_DEVICE_ID = "yandex_mobile_metrica_device_id";
    public static final String YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED = "yandex_mobile_metrica_lib_ssl_enabled";
    public static final String YANDEX_MOBILE_METRICA_GET_AD_URL = "yandex_mobile_metrica_get_ad_url";
    public static final String YANDEX_MOBILE_METRICA_REPORT_AD_URL = "yandex_mobile_metrica_report_ad_url";
    public static final String YANDEX_MOBILE_METRICA_UUID = "yandex_mobile_metrica_uuid";

    public enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE,
        INCONSISTENT_CLIDS
    }

    public static class Result {

        @Nullable
        private final Map<String, String> clids;

        @Nullable
        private final Map<String, List<String>> customSdkHosts;

        @Nullable
        private final String deviceId;

        @Nullable
        private final String deviceIdHash;

        @NonNull
        private final FeaturesResult features;

        @Nullable
        private final String getUrl;

        @Nullable
        private final String reportUrl;

        @Nullable
        private final String uuid;

        public Result(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Map<String, String> map, @Nullable Map<String, List<String>> map2, @NonNull FeaturesResult featuresResult) {
            this.deviceId = str;
            this.uuid = str2;
            this.reportUrl = str3;
            this.getUrl = str4;
            this.deviceIdHash = str5;
            this.clids = map;
            this.customSdkHosts = map2;
            this.features = featuresResult;
        }

        @Nullable
        public Map<String, String> getClids() {
            return this.clids;
        }

        @Nullable
        public Map<String, List<String>> getCustomSdkHosts() {
            return this.customSdkHosts;
        }

        @Nullable
        public String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public String getDeviceIdHash() {
            return this.deviceIdHash;
        }

        @NonNull
        public FeaturesResult getFeatures() {
            return this.features;
        }

        @Nullable
        public String getGetUrl() {
            return this.getUrl;
        }

        @Nullable
        public String getReportUrl() {
            return this.reportUrl;
        }

        @Nullable
        public String getUuid() {
            return this.uuid;
        }

        public boolean hasClids() {
            return !C3658U2.m19218b(this.clids);
        }

        public boolean hasCustomSdkHosts() {
            return !C3658U2.m19218b(this.customSdkHosts);
        }

        public boolean hasDeviceId() {
            return !TextUtils.isEmpty(this.deviceId);
        }

        public boolean hasDeviceIdHash() {
            return !TextUtils.isEmpty(this.deviceIdHash);
        }

        public boolean hasGetUrl() {
            return !TextUtils.isEmpty(this.getUrl);
        }

        public boolean hasReportUrl() {
            return !TextUtils.isEmpty(this.reportUrl);
        }

        public boolean hasUuid() {
            return !TextUtils.isEmpty(this.uuid);
        }
    }

    void onReceive(Result result);

    void onRequestError(Reason reason, Result result);
}
