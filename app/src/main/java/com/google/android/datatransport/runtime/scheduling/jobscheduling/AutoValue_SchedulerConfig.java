package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* renamed from: a */
    public final Clock f9271a;

    /* renamed from: b */
    public final Map<Priority, SchedulerConfig.ConfigValue> f9272b;

    public AutoValue_SchedulerConfig(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        Objects.requireNonNull(clock, "Null clock");
        this.f9271a = clock;
        Objects.requireNonNull(map, "Null values");
        this.f9272b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: a */
    public Clock mo5552a() {
        return this.f9271a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: d */
    public Map<Priority, SchedulerConfig.ConfigValue> mo5553d() {
        return this.f9272b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f9271a.equals(schedulerConfig.mo5552a()) && this.f9272b.equals(schedulerConfig.mo5553d());
    }

    public int hashCode() {
        return ((this.f9271a.hashCode() ^ 1000003) * 1000003) ^ this.f9272b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SchedulerConfig{clock=");
        m24u.append(this.f9271a);
        m24u.append(", values=");
        m24u.append(this.f9272b);
        m24u.append("}");
        return m24u.toString();
    }
}
