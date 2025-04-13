package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3658U2;
import com.yandex.metrica.impl.p023ob.C4272ro;
import com.yandex.metrica.impl.p023ob.C4376vo;
import com.yandex.metrica.impl.p023ob.InterfaceC4350uo;

/* loaded from: classes2.dex */
public class ReporterConfig {

    @NonNull
    public final String apiKey;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final Boolean statisticsSending;

    @Nullable
    public final String userProfileID;

    public static class Builder {

        /* renamed from: g */
        public static final InterfaceC4350uo<String> f42256g = new C4272ro(new C4376vo());

        /* renamed from: a */
        public final String f42257a;

        /* renamed from: b */
        @Nullable
        public Integer f42258b;

        /* renamed from: c */
        @Nullable
        public Boolean f42259c;

        /* renamed from: d */
        @Nullable
        public Boolean f42260d;

        /* renamed from: e */
        @Nullable
        public Integer f42261e;

        /* renamed from: f */
        @Nullable
        public String f42262f;

        public Builder(@NonNull String str) {
            ((C4272ro) f42256g).mo18360a(str);
            this.f42257a = str;
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        @NonNull
        public Builder withLogs() {
            this.f42259c = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i2) {
            this.f42261e = Integer.valueOf(i2);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i2) {
            this.f42258b = Integer.valueOf(i2);
            return this;
        }

        @NonNull
        public Builder withStatisticsSending(boolean z) {
            this.f42260d = Boolean.valueOf(z);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f42262f = str;
            return this;
        }
    }

    public ReporterConfig(@NonNull Builder builder) {
        this.apiKey = builder.f42257a;
        this.sessionTimeout = builder.f42258b;
        this.logs = builder.f42259c;
        this.statisticsSending = builder.f42260d;
        this.maxReportsInDatabaseCount = builder.f42261e;
        this.userProfileID = builder.f42262f;
    }

    public static Builder createBuilderFromConfig(@NonNull ReporterConfig reporterConfig) {
        Builder newConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (C3658U2.m19212a(reporterConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (C3658U2.m19212a(reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (C3658U2.m19212a(reporterConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (C3658U2.m19212a(reporterConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        if (C3658U2.m19212a((Object) reporterConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(reporterConfig.userProfileID);
        }
        return newConfigBuilder;
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str);
    }

    public ReporterConfig(@NonNull ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }
}
