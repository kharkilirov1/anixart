package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Objects;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* renamed from: a */
    public final long f9273a;

    /* renamed from: b */
    public final long f9274b;

    /* renamed from: c */
    public final Set<SchedulerConfig.Flag> f9275c;

    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* renamed from: a */
        public Long f9276a;

        /* renamed from: b */
        public Long f9277b;

        /* renamed from: c */
        public Set<SchedulerConfig.Flag> f9278c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        /* renamed from: a */
        public SchedulerConfig.ConfigValue mo5557a() {
            String str = this.f9276a == null ? " delta" : "";
            if (this.f9277b == null) {
                str = C0000a.m14k(str, " maxAllowedDelay");
            }
            if (this.f9278c == null) {
                str = C0000a.m14k(str, " flags");
            }
            if (str.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f9276a.longValue(), this.f9277b.longValue(), this.f9278c, null);
            }
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        /* renamed from: b */
        public SchedulerConfig.ConfigValue.Builder mo5558b(long j2) {
            this.f9276a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        /* renamed from: c */
        public SchedulerConfig.ConfigValue.Builder mo5559c(Set<SchedulerConfig.Flag> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f9278c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        /* renamed from: d */
        public SchedulerConfig.ConfigValue.Builder mo5560d(long j2) {
            this.f9277b = Long.valueOf(j2);
            return this;
        }
    }

    public AutoValue_SchedulerConfig_ConfigValue(long j2, long j3, Set set, C09141 c09141) {
        this.f9273a = j2;
        this.f9274b = j3;
        this.f9275c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: b */
    public long mo5554b() {
        return this.f9273a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: c */
    public Set<SchedulerConfig.Flag> mo5555c() {
        return this.f9275c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: d */
    public long mo5556d() {
        return this.f9274b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        return this.f9273a == configValue.mo5554b() && this.f9274b == configValue.mo5556d() && this.f9275c.equals(configValue.mo5555c());
    }

    public int hashCode() {
        long j2 = this.f9273a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f9274b;
        return this.f9275c.hashCode() ^ ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ConfigValue{delta=");
        m24u.append(this.f9273a);
        m24u.append(", maxAllowedDelay=");
        m24u.append(this.f9274b);
        m24u.append(", flags=");
        m24u.append(this.f9275c);
        m24u.append("}");
        return m24u.toString();
    }
}
