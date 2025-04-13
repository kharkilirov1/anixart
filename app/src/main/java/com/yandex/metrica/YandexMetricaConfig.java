package com.yandex.metrica;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3658U2;
import com.yandex.metrica.impl.p023ob.C4272ro;
import com.yandex.metrica.impl.p023ob.C4353v1;
import com.yandex.metrica.impl.p023ob.C4376vo;
import com.yandex.metrica.impl.p023ob.InterfaceC4350uo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class YandexMetricaConfig {

    @NonNull
    public final String apiKey;

    @Nullable
    public final Boolean appOpenTrackingEnabled;

    @Nullable
    public final String appVersion;

    @Nullable
    public final Boolean crashReporting;

    @Nullable
    public final Map<String, String> errorEnvironment;

    @Nullable
    public final Boolean firstActivationAsUpdate;

    @Nullable
    public final Location location;

    @Nullable
    public final Boolean locationTracking;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Boolean nativeCrashReporting;

    @Nullable
    public final PreloadInfo preloadInfo;

    @Nullable
    public final Boolean revenueAutoTrackingEnabled;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;

    @Nullable
    public final Boolean statisticsSending;

    @Nullable
    public final String userProfileID;

    public static class Builder {

        /* renamed from: r */
        public static final InterfaceC4350uo<String> f42273r = new C4272ro(new C4376vo());

        /* renamed from: a */
        @NonNull
        public final String f42274a;

        /* renamed from: b */
        @Nullable
        public String f42275b;

        /* renamed from: c */
        @Nullable
        public Integer f42276c;

        /* renamed from: d */
        @Nullable
        public Boolean f42277d;

        /* renamed from: e */
        @Nullable
        public Boolean f42278e;

        /* renamed from: f */
        @Nullable
        public Location f42279f;

        /* renamed from: g */
        @Nullable
        public Boolean f42280g;

        /* renamed from: h */
        @Nullable
        public Boolean f42281h;

        /* renamed from: i */
        @Nullable
        public PreloadInfo f42282i;

        /* renamed from: j */
        @Nullable
        public Boolean f42283j;

        /* renamed from: k */
        @Nullable
        public Boolean f42284k;

        /* renamed from: l */
        @Nullable
        public Integer f42285l;

        /* renamed from: m */
        @NonNull
        public LinkedHashMap<String, String> f42286m = new LinkedHashMap<>();

        /* renamed from: n */
        @Nullable
        public String f42287n;

        /* renamed from: o */
        @Nullable
        public Boolean f42288o;

        /* renamed from: p */
        @Nullable
        public Boolean f42289p;

        /* renamed from: q */
        @Nullable
        public Boolean f42290q;

        public Builder(@NonNull String str) {
            ((C4272ro) f42273r).mo18360a(str);
            this.f42274a = str;
        }

        @NonNull
        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.f42283j = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.f42290q = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String str) {
            this.f42275b = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z) {
            this.f42277d = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f42286m.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.f42279f = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z) {
            this.f42280g = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f42281h = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i2) {
            this.f42285l = Integer.valueOf(i2);
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z) {
            this.f42278e = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.f42282i = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.f42288o = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i2) {
            this.f42276c = Integer.valueOf(i2);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.f42289p = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withStatisticsSending(boolean z) {
            this.f42284k = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f42287n = str;
            return this;
        }
    }

    public YandexMetricaConfig(@NonNull Builder builder) {
        this.apiKey = builder.f42274a;
        this.appVersion = builder.f42275b;
        this.sessionTimeout = builder.f42276c;
        this.crashReporting = builder.f42277d;
        this.nativeCrashReporting = builder.f42278e;
        this.location = builder.f42279f;
        this.locationTracking = builder.f42280g;
        this.logs = builder.f42281h;
        this.preloadInfo = builder.f42282i;
        this.firstActivationAsUpdate = builder.f42283j;
        this.statisticsSending = builder.f42284k;
        this.maxReportsInDatabaseCount = builder.f42285l;
        this.errorEnvironment = Collections.unmodifiableMap(builder.f42286m);
        this.userProfileID = builder.f42287n;
        this.revenueAutoTrackingEnabled = builder.f42288o;
        this.sessionsAutoTrackingEnabled = builder.f42289p;
        this.appOpenTrackingEnabled = builder.f42290q;
    }

    @NonNull
    public static Builder createBuilderFromConfig(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        Builder newConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (C3658U2.m19212a((Object) yandexMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.location)) {
            newConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C3658U2.m19212a(yandexMetricaConfig.preloadInfo)) {
            newConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C3658U2.m19212a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (C3658U2.m19212a((Object) yandexMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        return newConfigBuilder;
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C4353v1().m20910a(str);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str);
    }

    public String toJson() {
        return new C4353v1().m20911a(this);
    }

    public YandexMetricaConfig(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }
}
