package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@AutoValue
/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    public static class Builder {

        /* renamed from: a */
        public Clock f9283a;

        /* renamed from: b */
        public Map<Priority, ConfigValue> f9284b = new HashMap();
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            /* renamed from: a */
            public abstract ConfigValue mo5557a();

            /* renamed from: b */
            public abstract Builder mo5558b(long j2);

            /* renamed from: c */
            public abstract Builder mo5559c(Set<Flag> set);

            /* renamed from: d */
            public abstract Builder mo5560d(long j2);
        }

        /* renamed from: a */
        public static Builder m5563a() {
            AutoValue_SchedulerConfig_ConfigValue.Builder builder = new AutoValue_SchedulerConfig_ConfigValue.Builder();
            Set<Flag> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            builder.f9278c = emptySet;
            return builder;
        }

        /* renamed from: b */
        public abstract long mo5554b();

        /* renamed from: c */
        public abstract Set<Flag> mo5555c();

        /* renamed from: d */
        public abstract long mo5556d();
    }

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static SchedulerConfig m5561b(Clock clock) {
        Builder builder = new Builder();
        Priority priority = Priority.DEFAULT;
        ConfigValue.Builder m5563a = ConfigValue.m5563a();
        m5563a.mo5558b(30000L);
        m5563a.mo5560d(86400000L);
        builder.f9284b.put(priority, m5563a.mo5557a());
        Priority priority2 = Priority.HIGHEST;
        ConfigValue.Builder m5563a2 = ConfigValue.m5563a();
        m5563a2.mo5558b(1000L);
        m5563a2.mo5560d(86400000L);
        builder.f9284b.put(priority2, m5563a2.mo5557a());
        Priority priority3 = Priority.VERY_LOW;
        ConfigValue.Builder m5563a3 = ConfigValue.m5563a();
        m5563a3.mo5558b(86400000L);
        m5563a3.mo5560d(86400000L);
        m5563a3.mo5559c(Collections.unmodifiableSet(new HashSet(Arrays.asList(Flag.NETWORK_UNMETERED, Flag.DEVICE_IDLE))));
        builder.f9284b.put(priority3, m5563a3.mo5557a());
        builder.f9283a = clock;
        Objects.requireNonNull(clock, "missing required property: clock");
        if (builder.f9284b.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        Map<Priority, ConfigValue> map = builder.f9284b;
        builder.f9284b = new HashMap();
        return new AutoValue_SchedulerConfig(builder.f9283a, map);
    }

    /* renamed from: a */
    public abstract Clock mo5552a();

    /* renamed from: c */
    public long m5562c(Priority priority, long j2, int i2) {
        long mo5600a = j2 - mo5552a().mo5600a();
        ConfigValue configValue = mo5553d().get(priority);
        long mo5554b = configValue.mo5554b();
        return Math.min(Math.max((long) (Math.pow(3.0d, i2 - 1) * mo5554b * Math.max(1.0d, Math.log(10000.0d) / Math.log((mo5554b > 1 ? mo5554b : 2L) * r12))), mo5600a), configValue.mo5556d());
    }

    /* renamed from: d */
    public abstract Map<Priority, ConfigValue> mo5553d();
}
