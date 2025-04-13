package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.p023ob.C3658U2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.l */
/* loaded from: classes2.dex */
public class C4483l extends YandexMetricaConfig {

    /* renamed from: a */
    @Nullable
    public final String f47167a;

    /* renamed from: b */
    @Nullable
    public final Map<String, String> f47168b;

    /* renamed from: c */
    @Nullable
    public final String f47169c;

    /* renamed from: d */
    @Nullable
    public final List<String> f47170d;

    /* renamed from: e */
    @Nullable
    public final Integer f47171e;

    /* renamed from: f */
    @Nullable
    public final Integer f47172f;

    /* renamed from: g */
    @Nullable
    public final Integer f47173g;

    /* renamed from: h */
    @Nullable
    public final Map<String, String> f47174h;

    /* renamed from: i */
    @Nullable
    public final Boolean f47175i;

    /* renamed from: j */
    @Nullable
    public final Boolean f47176j;

    /* renamed from: k */
    @Nullable
    public final Boolean f47177k;

    /* renamed from: l */
    @Nullable
    public final InterfaceC3125f f47178l;

    /* renamed from: com.yandex.metrica.l$b */
    public static final class b {

        /* renamed from: a */
        @NonNull
        public YandexMetricaConfig.Builder f47179a;

        /* renamed from: b */
        @Nullable
        public String f47180b;

        /* renamed from: c */
        @Nullable
        public List<String> f47181c;

        /* renamed from: d */
        @Nullable
        public Integer f47182d;

        /* renamed from: e */
        @Nullable
        public Map<String, String> f47183e;

        /* renamed from: f */
        @Nullable
        public String f47184f;

        /* renamed from: g */
        @Nullable
        public Integer f47185g;

        /* renamed from: h */
        @Nullable
        public Integer f47186h;

        /* renamed from: i */
        @NonNull
        public LinkedHashMap<String, String> f47187i = new LinkedHashMap<>();

        /* renamed from: j */
        @Nullable
        public Boolean f47188j;

        /* renamed from: k */
        @Nullable
        public Boolean f47189k;

        /* renamed from: l */
        @Nullable
        public Boolean f47190l;

        /* renamed from: m */
        @Nullable
        public InterfaceC3125f f47191m;

        public b(@NonNull String str) {
            this.f47179a = YandexMetricaConfig.newConfigBuilder(str);
        }

        @NonNull
        /* renamed from: a */
        public b m21341a(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f47182d = Integer.valueOf(i2);
            return this;
        }

        @NonNull
        /* renamed from: b */
        public C4483l m21342b() {
            return new C4483l(this, null);
        }
    }

    public C4483l(b bVar, a aVar) {
        super(bVar.f47179a);
        this.f47171e = bVar.f47182d;
        List<String> list = bVar.f47181c;
        this.f47170d = list == null ? null : Collections.unmodifiableList(list);
        this.f47167a = bVar.f47180b;
        Map<String, String> map = bVar.f47183e;
        this.f47168b = map != null ? Collections.unmodifiableMap(map) : null;
        this.f47173g = bVar.f47186h;
        this.f47172f = bVar.f47185g;
        this.f47169c = bVar.f47184f;
        this.f47174h = Collections.unmodifiableMap(bVar.f47187i);
        this.f47175i = bVar.f47188j;
        this.f47176j = bVar.f47189k;
        this.f47177k = bVar.f47190l;
        this.f47178l = bVar.f47191m;
    }

    @NonNull
    /* renamed from: a */
    public static b m21340a(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        b bVar = new b(yandexMetricaConfig.apiKey);
        if (C3658U2.m19212a((Object) yandexMetricaConfig.appVersion)) {
            bVar.f47179a.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.sessionTimeout)) {
            bVar.f47179a.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.crashReporting)) {
            bVar.f47179a.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.nativeCrashReporting)) {
            bVar.f47179a.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.location)) {
            bVar.f47179a.withLocation(yandexMetricaConfig.location);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.locationTracking)) {
            bVar.f47179a.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            bVar.f47179a.withLogs();
        }
        if (C3658U2.m19212a(yandexMetricaConfig.preloadInfo)) {
            bVar.f47179a.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.firstActivationAsUpdate)) {
            bVar.f47179a.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.statisticsSending)) {
            bVar.f47179a.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            bVar.f47179a.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C3658U2.m19212a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                bVar.f47179a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (C3658U2.m19212a((Object) yandexMetricaConfig.userProfileID)) {
            bVar.f47179a.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (C3658U2.m19212a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            bVar.f47179a.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            bVar.f47179a.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (C3658U2.m19212a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            bVar.f47179a.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof C4483l) {
            C4483l c4483l = (C4483l) yandexMetricaConfig;
            if (C3658U2.m19212a((Object) c4483l.f47170d)) {
                bVar.f47181c = c4483l.f47170d;
            }
            if (C3658U2.m19212a(c4483l.f47178l)) {
                bVar.f47191m = c4483l.f47178l;
            }
            C3658U2.m19212a((Object) null);
        }
        return bVar;
    }

    public C4483l(@NonNull YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f47167a = null;
        this.f47168b = null;
        this.f47171e = null;
        this.f47172f = null;
        this.f47173g = null;
        this.f47169c = null;
        this.f47174h = null;
        this.f47175i = null;
        this.f47176j = null;
        this.f47170d = null;
        this.f47177k = null;
        this.f47178l = null;
    }
}
