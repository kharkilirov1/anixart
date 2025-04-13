package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.google.auto.value.AutoValue;
import com.yandex.metrica.YandexMetricaDefaultValues;
import p000a.C0000a;

@AutoValue
/* loaded from: classes.dex */
abstract class EventStoreConfig {

    /* renamed from: a */
    public static final EventStoreConfig f9355a;

    @AutoValue.Builder
    public static abstract class Builder {
    }

    static {
        AutoValue_EventStoreConfig.Builder builder = new AutoValue_EventStoreConfig.Builder();
        builder.f9347a = 10485760L;
        builder.f9348b = Integer.valueOf(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER);
        builder.f9349c = Integer.valueOf(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
        builder.f9350d = 604800000L;
        builder.f9351e = 81920;
        String str = builder.f9347a == null ? " maxStorageSizeInBytes" : "";
        if (builder.f9348b == null) {
            str = C0000a.m14k(str, " loadBatchSize");
        }
        if (builder.f9349c == null) {
            str = C0000a.m14k(str, " criticalSectionEnterTimeoutMs");
        }
        if (builder.f9350d == null) {
            str = C0000a.m14k(str, " eventCleanUpAge");
        }
        if (builder.f9351e == null) {
            str = C0000a.m14k(str, " maxBlobByteSizePerRow");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }
        f9355a = new AutoValue_EventStoreConfig(builder.f9347a.longValue(), builder.f9348b.intValue(), builder.f9349c.intValue(), builder.f9350d.longValue(), builder.f9351e.intValue(), null);
    }

    /* renamed from: a */
    public abstract int mo5569a();

    /* renamed from: b */
    public abstract long mo5570b();

    /* renamed from: c */
    public abstract int mo5571c();

    /* renamed from: d */
    public abstract int mo5572d();

    /* renamed from: e */
    public abstract long mo5573e();
}
