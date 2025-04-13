package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;
import p000a.C0000a;

/* loaded from: classes.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* renamed from: b */
    public final long f9342b;

    /* renamed from: c */
    public final int f9343c;

    /* renamed from: d */
    public final int f9344d;

    /* renamed from: e */
    public final long f9345e;

    /* renamed from: f */
    public final int f9346f;

    public static final class Builder extends EventStoreConfig.Builder {

        /* renamed from: a */
        public Long f9347a;

        /* renamed from: b */
        public Integer f9348b;

        /* renamed from: c */
        public Integer f9349c;

        /* renamed from: d */
        public Long f9350d;

        /* renamed from: e */
        public Integer f9351e;
    }

    public AutoValue_EventStoreConfig(long j2, int i2, int i3, long j3, int i4, C09221 c09221) {
        this.f9342b = j2;
        this.f9343c = i2;
        this.f9344d = i3;
        this.f9345e = j3;
        this.f9346f = i4;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: a */
    public int mo5569a() {
        return this.f9344d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: b */
    public long mo5570b() {
        return this.f9345e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: c */
    public int mo5571c() {
        return this.f9343c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: d */
    public int mo5572d() {
        return this.f9346f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: e */
    public long mo5573e() {
        return this.f9342b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        return this.f9342b == eventStoreConfig.mo5573e() && this.f9343c == eventStoreConfig.mo5571c() && this.f9344d == eventStoreConfig.mo5569a() && this.f9345e == eventStoreConfig.mo5570b() && this.f9346f == eventStoreConfig.mo5572d();
    }

    public int hashCode() {
        long j2 = this.f9342b;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f9343c) * 1000003) ^ this.f9344d) * 1000003;
        long j3 = this.f9345e;
        return this.f9346f ^ ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("EventStoreConfig{maxStorageSizeInBytes=");
        m24u.append(this.f9342b);
        m24u.append(", loadBatchSize=");
        m24u.append(this.f9343c);
        m24u.append(", criticalSectionEnterTimeoutMs=");
        m24u.append(this.f9344d);
        m24u.append(", eventCleanUpAge=");
        m24u.append(this.f9345e);
        m24u.append(", maxBlobByteSizePerRow=");
        return C0000a.m18o(m24u, this.f9346f, "}");
    }
}
